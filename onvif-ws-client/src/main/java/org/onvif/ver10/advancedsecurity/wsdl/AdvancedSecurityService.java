package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * Common functionality for all advanced security service parts.
 *     
 *
 * This class was generated by Apache CXF 4.0.5
 * Generated source version: 4.0.5
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", name = "AdvancedSecurityService")
@XmlSeeAlso({ObjectFactory.class})
public interface AdvancedSecurityService {

    /**
     * Returns the capabilities of the advanced security service. The result is
     *         returned in a typed answer.
     *       
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/advancedsecurity/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", className = "org.onvif.ver10.advancedsecurity.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", className = "org.onvif.ver10.advancedsecurity.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl")
    public org.onvif.ver10.advancedsecurity.wsdl.Capabilities getServiceCapabilities()
;
}
