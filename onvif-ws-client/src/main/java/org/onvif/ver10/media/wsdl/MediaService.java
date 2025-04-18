package org.onvif.ver10.media.wsdl;

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
@WebServiceClient(name = "MediaService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver10/media/wsdl")
public class MediaService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://www.onvif.org/ver10/media/wsdl", "MediaService");
    public static final QName MediaPort = new QName("http://www.onvif.org/ver10/media/wsdl", "MediaPort");
    static {
        WSDL_LOCATION = null;
    }

    public MediaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MediaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MediaService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MediaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MediaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MediaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Media
     */
    @WebEndpoint(name = "MediaPort")
    public Media getMediaPort() {
        return super.getPort(MediaPort, Media.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Media
     */
    @WebEndpoint(name = "MediaPort")
    public Media getMediaPort(WebServiceFeature... features) {
        return super.getPort(MediaPort, Media.class, features);
    }

}
