package org.onvif.client;

import de.onvif.soap.OnvifDevice;
import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.soap.SOAPException;
import org.apache.commons.io.FileUtils;
import org.apache.cxf.wsn.client.Consumer;
import org.apache.cxf.wsn.client.NotificationBroker;
import org.apache.cxf.wsn.client.Publisher;
import org.apache.cxf.wsn.client.Subscription;
import org.oasis_open.docs.wsn.b_2.FilterType;
import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;
import org.oasis_open.docs.wsn.b_2.TopicExpressionType;
import org.oasis_open.docs.wsn.bw_2.InvalidFilterFault;
import org.oasis_open.docs.wsn.bw_2.InvalidMessageContentExpressionFault;
import org.oasis_open.docs.wsn.bw_2.InvalidProducerPropertiesExpressionFault;
import org.oasis_open.docs.wsn.bw_2.InvalidTopicExpressionFault;
import org.oasis_open.docs.wsn.bw_2.NotifyMessageNotSupportedFault;
import org.oasis_open.docs.wsn.bw_2.SubscribeCreationFailedFault;
import org.oasis_open.docs.wsn.bw_2.TopicExpressionDialectUnknownFault;
import org.oasis_open.docs.wsn.bw_2.TopicNotSupportedFault;
import org.oasis_open.docs.wsn.bw_2.UnacceptableInitialTerminationTimeFault;
import org.oasis_open.docs.wsn.bw_2.UnrecognizedPolicyRequestFault;
import org.oasis_open.docs.wsn.bw_2.UnsupportedPolicyRequestFault;
import org.oasis_open.docs.wsrf.rw_2.ResourceUnknownFault;
import org.onvif.ver10.events.wsdl.CreatePullPointSubscription;
import org.onvif.ver10.events.wsdl.CreatePullPointSubscription.SubscriptionPolicy;
import org.onvif.ver10.events.wsdl.CreatePullPointSubscriptionResponse;
import org.onvif.ver10.events.wsdl.EventPortType;
import org.onvif.ver10.events.wsdl.GetEventProperties;
import org.onvif.ver10.events.wsdl.GetEventPropertiesResponse;
import org.onvif.ver10.schema.Capabilities;
import org.onvif.ver10.schema.CapabilityCategory;
import org.onvif.ver10.schema.MediaUri;
import org.onvif.ver10.schema.Profile;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WsNotificationTest {

  // This is a work in progress class...any help is welcome ;)
  // A good idea could be to follow this guide:
  // https://access.redhat.com/documentation/en-us/red_hat_jboss_a-mq/6.1/html-single/ws-notification_guide/index#WSNTutorial

  public static void main(String[] args) throws IOException {
    OnvifCredentials creds = GetTestDevice.getOnvifCredentials(args);
    System.out.println("Connect to camera, please wait ...");

    OnvifDevice cam = null;
    try {
      cam = new OnvifDevice(creds.getHost(), creds.getUser(), creds.getPassword());
    } catch (ConnectException | SOAPException e1) {
      System.err.println("No connection to device with ip " + creds + ", please try again.");
      System.exit(0);
    } catch (URISyntaxException e) {
        System.err.println(e.getClass().getName() + ": " + e.getMessage());
    }
      System.out.println("Connected to device " + cam.getDeviceInfo());

    // get device capabilities
    Capabilities cap = cam.getDevice().getCapabilities(Arrays.asList(CapabilityCategory.ALL));
    System.out.println(cap.getDevice().toString());
    // print profiles
    printProfiles(cam);
    // takeScreenShot(profileToken, cam);
    // presets
    // List<PTZPreset> presets = cam.getPtz().getPresets(profileToken);
    // presets.forEach(x->System.out.println(x.getName()));

    EventPortType eventWs = cam.getEvents();
    GetEventProperties getEventProperties = new GetEventProperties();
    GetEventPropertiesResponse getEventPropertiesResp =
        eventWs.getEventProperties(getEventProperties);
    getEventPropertiesResp.getMessageContentFilterDialect().forEach(x -> System.out.println(x));
    getEventPropertiesResp.getTopicExpressionDialect().forEach(x -> System.out.println(x));
    for (Object object : getEventPropertiesResp.getTopicSet().getAny()) {
      Element e = (Element) object;
      printTree(e, e.getNodeName());
    }

    org.oasis_open.docs.wsn.b_2.ObjectFactory objectFactory =
        new org.oasis_open.docs.wsn.b_2.ObjectFactory();
    CreatePullPointSubscription pullPointSubscription = new CreatePullPointSubscription();
    FilterType filter = new FilterType();
    TopicExpressionType topicExp = new TopicExpressionType();
    topicExp.getContent().add("tns1:RuleEngine//."); // every event in that
    // topic
    topicExp.setDialect("http://www.onvif.org/ver10/tev/topicExpression/ConcreteSet");
    JAXBElement<?> topicExpElem = objectFactory.createTopicExpression(topicExp);
    filter.getAny().add(topicExpElem);
    pullPointSubscription.setFilter(filter);
    org.onvif.ver10.events.wsdl.ObjectFactory eventObjFactory =
        new org.onvif.ver10.events.wsdl.ObjectFactory();
    SubscriptionPolicy subcriptionPolicy =
        eventObjFactory.createCreatePullPointSubscriptionSubscriptionPolicy();
    pullPointSubscription.setSubscriptionPolicy(subcriptionPolicy);
    String timespan = "PT10S"; // every 10 seconds
    // String timespan = "PT1M";//every 1 minute
    pullPointSubscription.setInitialTerminationTime(
        objectFactory.createSubscribeInitialTerminationTime(timespan));

    try {
      CreatePullPointSubscriptionResponse resp =
          eventWs.createPullPointSubscription(pullPointSubscription);

      // Start a consumer that will listen for notification messages
      // We'll just print the text content out for now.
      String eventConsumerAddress = "http://localhost:9001/MyConsumer";
      Consumer consumer =
          new Consumer(
              new Consumer.Callback() {
                public void notify(NotificationMessageHolderType message) {
                  Object o = message.getMessage().getAny();
                  System.out.println(message.getMessage().getAny());
                  if (o instanceof Element) {
                    System.out.println(((Element) o).getTextContent());
                  }
                }
              },
              eventConsumerAddress);

      String queuePort = "8182";
      String brokerPort = "8181";
      String brokerAddress = "http://localhost:" + brokerPort + "/wsn/NotificationBroker";



      // Create a subscription for a Topic on the broker
      NotificationBroker notificationBroker = new NotificationBroker(brokerAddress);
      // PublisherCallback publisherCallback = new PublisherCallback();
      // Publisher publisher = new Publisher(publisherCallback,
      // "http://localhost:" + port2 + "/test/publisher");
      Subscription subscription = notificationBroker.subscribe(consumer, "tns1:RuleEngine");

      // Device
      // Trigger/Relay
      // OperationMode/ShutdownInitiated
      // OperationMode/UploadInitiated
      // HardwareFailure/FanFailure
      // HardwareFailure/PowerSupplyFailure
      // HardwareFailure/StorageFailure
      // HardwareFailure/TemperatureCritical
      // VideoSource
      // tns1:VideoSource/CameraRedirected
      // tns1:VideoSource/SignalLoss
      // tns1:VideoSource/MotionAlarm
      // VideoEncoder
      // VideoAnalytics
      // RuleEngine
      // LineDetector/Crossed
      // FieldDetector/ObjectsInside
      // PTZController
      // PTZPresets/Invoked
      // PTZPresets/Reached
      // PTZPresets/Aborted
      // PTZPresets/Left
      // AudioSource
      // AudioEncoder
      // UserAlarm
      // MediaControl
      // RecordingConfig
      // RecordingHistory
      // VideoOutput
      // AudioOutput
      // VideoDecoder
      // AudioDecoder
      // Receiver
      // MediaConfiguration
      // VideoSourceConfiguration
      // AudioSourceConfiguration
      // VideoEncoderConfiguration
      // AudioEncoderConfiguration
      // VideoAnalyticsConfiguration
      // PTZConfiguration
      // MetaDataConfiguration

      // Wait for some messages to accumulate in the pull point
      Thread.sleep(50_000);

      // Cleanup and exit
      subscription.unsubscribe();
      consumer.stop();

    } catch (TopicNotSupportedFault
        | TopicExpressionDialectUnknownFault
        | InvalidTopicExpressionFault
        | InvalidMessageContentExpressionFault
        | InvalidProducerPropertiesExpressionFault
        | UnacceptableInitialTerminationTimeFault
        | NotifyMessageNotSupportedFault
        | ResourceUnknownFault
        | UnsupportedPolicyRequestFault
        | InvalidFilterFault
        | SubscribeCreationFailedFault
        | UnrecognizedPolicyRequestFault e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void printTree(Node node, String name) {
    if (node.hasChildNodes()) {
      NodeList nodes = node.getChildNodes();
      for (int i = 0; i < nodes.getLength(); i++) {
        Node n = nodes.item(i);
        printTree(n, name + " - " + n.getNodeName());
      }
    } else System.out.println(name + " - " + node.getNodeName());
  }

  private static void takeScreenShot(String profileToken, OnvifDevice cam) {
    try {
      MediaUri sceenshotUri = cam.getMedia().getSnapshotUri(profileToken);
      File tempFile = File.createTempFile("bosc", ".jpg");
      // tempFile.deleteOnExit();
      FileUtils.copyURLToFile(new URL(sceenshotUri.getUri()), tempFile);
      Runtime.getRuntime().exec("nautilus " + tempFile.getAbsolutePath());
      Thread.sleep(10000);
    } catch (ConnectException e) {
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  private static void printProfiles(OnvifDevice cam) {

    List<Profile> profiles = cam.getMedia().getProfiles();
    for (Profile p : profiles) {
      System.out.printf(
          "Profile: [token=%s,name=%s,snapshotUri=%s]%n",
          p.getToken(), p.getName(), cam.getMedia().getSnapshotUri(p.getToken()).getUri());
    }
  }

  public static class PublisherCallback implements Publisher.Callback {
    final CountDownLatch subscribed = new CountDownLatch(1);
    final CountDownLatch unsubscribed = new CountDownLatch(1);

    public void subscribe(TopicExpressionType topic) {
      subscribed.countDown();
    }

    public void unsubscribe(TopicExpressionType topic) {
      unsubscribed.countDown();
    }
  }
}
