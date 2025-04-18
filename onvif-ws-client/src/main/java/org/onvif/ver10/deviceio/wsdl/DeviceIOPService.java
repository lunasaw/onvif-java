package org.onvif.ver10.deviceio.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 *
 */
@WebServiceClient(name = "DeviceIOPService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver10/deviceIO/wsdl")
public class DeviceIOPService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "DeviceIOPService");
    public static final QName DeviceIOPort = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "DeviceIOPort");
    static {
        WSDL_LOCATION = null;
    }

    public DeviceIOPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DeviceIOPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DeviceIOPService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DeviceIOPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DeviceIOPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DeviceIOPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DeviceIOPort
     */
    @WebEndpoint(name = "DeviceIOPort")
    public DeviceIOPort getDeviceIOPort() {
        return super.getPort(DeviceIOPort, DeviceIOPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeviceIOPort
     */
    @WebEndpoint(name = "DeviceIOPort")
    public DeviceIOPort getDeviceIOPort(WebServiceFeature... features) {
        return super.getPort(DeviceIOPort, DeviceIOPort.class, features);
    }

}
