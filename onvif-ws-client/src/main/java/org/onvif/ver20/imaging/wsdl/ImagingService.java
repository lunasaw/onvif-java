package org.onvif.ver20.imaging.wsdl;

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
@WebServiceClient(name = "ImagingService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver20/imaging/wsdl")
public class ImagingService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://www.onvif.org/ver20/imaging/wsdl", "ImagingService");
    public static final QName ImagingPort = new QName("http://www.onvif.org/ver20/imaging/wsdl", "ImagingPort");
    static {
        WSDL_LOCATION = null;
    }

    public ImagingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ImagingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImagingService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ImagingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ImagingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ImagingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ImagingPort
     */
    @WebEndpoint(name = "ImagingPort")
    public ImagingPort getImagingPort() {
        return super.getPort(ImagingPort, ImagingPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImagingPort
     */
    @WebEndpoint(name = "ImagingPort")
    public ImagingPort getImagingPort(WebServiceFeature... features) {
        return super.getPort(ImagingPort, ImagingPort.class, features);
    }

}
