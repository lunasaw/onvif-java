package org.onvif.ver10.events.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/events/wsdl", name = "EventPortType")
@XmlSeeAlso({org.oasis_open.docs.wsrf.r_2.ObjectFactory.class, ObjectFactory.class, org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class, org.oasis_open.docs.wsn.b_2.ObjectFactory.class, org.oasis_open.docs.wsn.t_1.ObjectFactory.class})
public interface EventPortType {

    /**
     * The WS-BaseNotification specification defines a set of OPTIONAL WS-ResouceProperties.
     *                 This specification does not require the implementation of the WS-ResourceProperty interface.
     *                 Instead, the subsequent direct interface shall be implemented by an ONVIF compliant device
     *                 in order to provide information about the FilterDialects, Schema files and topics supported by
     *                 the device.
     */
    @WebMethod(operationName = "GetEventProperties", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetEventPropertiesRequest")
    @Action(input = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetEventPropertiesRequest", output = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetEventPropertiesResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetEventPropertiesResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", partName = "parameters")
    public GetEventPropertiesResponse getEventProperties(

        @WebParam(partName = "parameters", name = "GetEventProperties", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
        GetEventProperties parameters
    );

    /**
     * This method returns a PullPointSubscription that can be polled using PullMessages.
     *                 This message contains the same elements as the SubscriptionRequest of the WS-BaseNotification without the ConsumerReference.
     *                 If no Filter is specified the pullpoint notifies all occurring events to the client.
     *                 This method is mandatory.
     */
    @WebMethod(operationName = "CreatePullPointSubscription", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/CreatePullPointSubscriptionRequest")
    @Action(input = "http://www.onvif.org/ver10/events/wsdl/EventPortType/CreatePullPointSubscriptionRequest", output = "http://www.onvif.org/ver10/events/wsdl/EventPortType/CreatePullPointSubscriptionResponse", fault = {})
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "CreatePullPointSubscriptionResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", partName = "parameters")
    public CreatePullPointSubscriptionResponse createPullPointSubscription(

        @WebParam(partName = "parameters", name = "CreatePullPointSubscription", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
        CreatePullPointSubscription parameters
    ) throws org.oasis_open.docs.wsn.bw_2.TopicNotSupportedFault, org.oasis_open.docs.wsn.bw_2.TopicExpressionDialectUnknownFault, org.oasis_open.docs.wsn.bw_2.InvalidTopicExpressionFault, org.oasis_open.docs.wsn.bw_2.InvalidMessageContentExpressionFault, org.oasis_open.docs.wsn.bw_2.InvalidProducerPropertiesExpressionFault, org.oasis_open.docs.wsn.bw_2.UnacceptableInitialTerminationTimeFault, org.oasis_open.docs.wsn.bw_2.NotifyMessageNotSupportedFault, org.oasis_open.docs.wsrf.rw_2.ResourceUnknownFault, org.oasis_open.docs.wsn.bw_2.UnsupportedPolicyRequestFault, org.oasis_open.docs.wsn.bw_2.InvalidFilterFault, org.oasis_open.docs.wsn.bw_2.SubscribeCreationFailedFault, org.oasis_open.docs.wsn.bw_2.UnrecognizedPolicyRequestFault;

    /**
     * The AddEventBroker command allows an ONVIF client to add an event broker configuration to device to enable ONVIF events to be transferred to an event broker. If an existing event broker configuration already exists with the same Address, the existing configuration shall be modified.
     */
    @WebMethod(operationName = "AddEventBroker", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/AddEventBrokerRequest")
    @RequestWrapper(localName = "AddEventBroker", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.AddEventBroker")
    @ResponseWrapper(localName = "AddEventBrokerResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.AddEventBrokerResponse")
    public void addEventBroker(

        @WebParam(name = "EventBroker", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
        org.onvif.ver10.events.wsdl.EventBrokerConfig eventBroker
    );

    /**
     * The DeleteEventBroker allows an ONVIF client to delete an event broker configuration from an ONVIF device.
     */
    @WebMethod(operationName = "DeleteEventBroker", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/DeleteEventBrokerRequest")
    @RequestWrapper(localName = "DeleteEventBroker", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.DeleteEventBroker")
    @ResponseWrapper(localName = "DeleteEventBrokerResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.DeleteEventBrokerResponse")
    public void deleteEventBroker(

        @WebParam(name = "Address", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
        java.lang.String address
    );

    /**
     * The GetEventBrokers command lets a client retrieve event broker configurations from the device.
     */
    @WebMethod(operationName = "GetEventBrokers", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetEventBrokersRequest")
    @RequestWrapper(localName = "GetEventBrokers", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.GetEventBrokers")
    @ResponseWrapper(localName = "GetEventBrokersResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.GetEventBrokersResponse")
    @WebResult(name = "EventBroker", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
    public java.util.List<org.onvif.ver10.events.wsdl.EventBrokerConfig> getEventBrokers(

        @WebParam(name = "Address", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
        java.lang.String address
    );

    /**
     * Returns the capabilities of the event service. The result is returned in a typed answer.
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetServiceCapabilitiesRequest")
    @Action(input = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetServiceCapabilitiesRequest", output = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetServiceCapabilitiesResponse")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
    public org.onvif.ver10.events.wsdl.Capabilities getServiceCapabilities()
;
}
