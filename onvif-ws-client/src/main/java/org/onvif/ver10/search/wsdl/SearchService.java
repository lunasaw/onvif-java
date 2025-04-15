package org.onvif.ver10.search.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.13
 * Generated source version: 3.3.13
 *
 */
@WebServiceClient(name = "SearchService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver10/search/wsdl")
public class SearchService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.onvif.org/ver10/search/wsdl", "SearchService");
    public final static QName SearchPort = new QName("http://www.onvif.org/ver10/search/wsdl", "SearchPort");
    static {
        WSDL_LOCATION = null;
    }

    public SearchService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SearchService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SearchService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SearchService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SearchService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SearchService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SearchPort
     */
    @WebEndpoint(name = "SearchPort")
    public SearchPort getSearchPort() {
        return super.getPort(SearchPort, SearchPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchPort
     */
    @WebEndpoint(name = "SearchPort")
    public SearchPort getSearchPort(WebServiceFeature... features) {
        return super.getPort(SearchPort, SearchPort.class, features);
    }

}
