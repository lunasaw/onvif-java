package org.onvif.ver10.accessrules.wsdl;

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
@WebServiceClient(name = "AccessRulesService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver10/accessrules/wsdl")
public class AccessRulesService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://www.onvif.org/ver10/accessrules/wsdl", "AccessRulesService");
    public static final QName AccessRulesPort = new QName("http://www.onvif.org/ver10/accessrules/wsdl", "AccessRulesPort");
    static {
        WSDL_LOCATION = null;
    }

    public AccessRulesService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AccessRulesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccessRulesService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AccessRulesService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AccessRulesService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AccessRulesService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AccessRulesPort
     */
    @WebEndpoint(name = "AccessRulesPort")
    public AccessRulesPort getAccessRulesPort() {
        return super.getPort(AccessRulesPort, AccessRulesPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccessRulesPort
     */
    @WebEndpoint(name = "AccessRulesPort")
    public AccessRulesPort getAccessRulesPort(WebServiceFeature... features) {
        return super.getPort(AccessRulesPort, AccessRulesPort.class, features);
    }

}
