package org.onvif.ver10.accesscontrol.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.13
 * Generated source version: 3.3.13
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", name = "PACSPort")
@XmlSeeAlso({ObjectFactory.class, org.onvif.ver10.pacs.ObjectFactory.class})
public interface PACSPort {

    /**
     * This operation requests the AccessPointState for the AccessPoint instance specified by
     * Token.
     * </p><p>
     * An ONVIF compliant device that provides Access Control service shall implement this method.
     *       
     */
    @WebMethod(operationName = "GetAccessPointState", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/GetAccessPointState")
    @RequestWrapper(localName = "GetAccessPointState", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAccessPointState")
    @ResponseWrapper(localName = "GetAccessPointStateResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAccessPointStateResponse")
    @WebResult(name = "AccessPointState", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
    public org.onvif.ver10.accesscontrol.wsdl.AccessPointState getAccessPointState(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation allows to Deny or Grant decision at an AccessPoint instance.
     * </p><p>
     * A device that signals support for ExternalAuthorization capability for a particular
     * AccessPoint instance shall implement this method.
     *       
     */
    @WebMethod(operationName = "ExternalAuthorization", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/ExternalAuthorization")
    @RequestWrapper(localName = "ExternalAuthorization", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.ExternalAuthorization")
    @ResponseWrapper(localName = "ExternalAuthorizationResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.ExternalAuthorizationResponse")
    public void externalAuthorization(

        @WebParam(name = "AccessPointToken", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.String accessPointToken,
        @WebParam(name = "CredentialToken", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.String credentialToken,
        @WebParam(name = "Reason", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.String reason,
        @WebParam(name = "Decision", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        org.onvif.ver10.accesscontrol.wsdl.Decision decision
    );

    /**
     * This operation allows enabling an access point.
     * </p><p>
     * A device that signals support for DisableAccessPoint capability for a particular AccessPoint
     * instance shall implement this command.
     * </p><p>
     *       
     */
    @WebMethod(operationName = "EnableAccessPoint", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/EnableAccessPoint")
    @RequestWrapper(localName = "EnableAccessPoint", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.EnableAccessPoint")
    @ResponseWrapper(localName = "EnableAccessPointResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.EnableAccessPointResponse")
    public void enableAccessPoint(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation allows disabling an access point.
     * </p><p>
     * A device that signals support for DisableAccessPoint capability for a particular AccessPoint
     * instance shall implement this command.
     * </p><p>
     *       
     */
    @WebMethod(operationName = "DisableAccessPoint", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/DisableAccessPoint")
    @RequestWrapper(localName = "DisableAccessPoint", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.DisableAccessPoint")
    @ResponseWrapper(localName = "DisableAccessPointResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.DisableAccessPointResponse")
    public void disableAccessPoint(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.String token
    );

    /**
     * This operation returns the capabilities of the Access Control service.
     * </p><p>
     * An ONVIF compliant device which provides the Access Control service shall
     * implement this method.
     *       
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
    public org.onvif.ver10.accesscontrol.wsdl.ServiceCapabilities getServiceCapabilities()
;

    /**
     * This operation requests a list of AccessPointInfo items matching the given tokens.
     * </p><p>
     * An ONVIF compliant device which provides Access Control service shall implement this method.
     * </p><p>
     * The device shall ignore tokens it cannot resolve and shall return an empty list if there
     * are no items matching specified tokens. The device shall not return a fault in this case.
     * </p><p>
     * If the number of requested items is greater than MaxLimit, a TooManyItems
     * fault shall be returned.
     * </p><p>
     *       
     */
    @WebMethod(operationName = "GetAccessPointInfo", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/GetAccessPointInfo")
    @RequestWrapper(localName = "GetAccessPointInfo", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAccessPointInfo")
    @ResponseWrapper(localName = "GetAccessPointInfoResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAccessPointInfoResponse")
    @WebResult(name = "AccessPointInfo", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
    public java.util.List<org.onvif.ver10.accesscontrol.wsdl.AccessPointInfo> getAccessPointInfo(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.util.List<java.lang.String> token
    );

    /**
     * This operation requests a list of AreaInfo items matching the given tokens.
     * </p><p>
     * An ONVIF compliant device which provides Access Control service shall implement this method.
     * </p><p>
     * The device shall ignore tokens it cannot resolve and shall return an empty list if there
     * are no items matching specified tokens. The device shall not return a fault in this case.
     * </p><p>
     * If the number of requested items is greater than MaxLimit, a TooManyItems
     * fault shall be returned.
     * </p><p>
     *       
     */
    @WebMethod(operationName = "GetAreaInfo", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/GetAreaInfo")
    @RequestWrapper(localName = "GetAreaInfo", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAreaInfo")
    @ResponseWrapper(localName = "GetAreaInfoResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAreaInfoResponse")
    @WebResult(name = "AreaInfo", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
    public java.util.List<org.onvif.ver10.accesscontrol.wsdl.AreaInfo> getAreaInfo(

        @WebParam(name = "Token", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.util.List<java.lang.String> token
    );

    /**
     * This operation requests a list of all AccessPointInfo items provided by the device.
     * An ONVIF compliant device which provides the Access Control service shall implement this
     * method.
     * </p><p>
     * A call to this method shall return a StartReference when not all data is returned and more
     * data is available. The reference shall be valid for retrieving the next set of data.
     * Please refer section [Retrieving system configuration] for more details.
     * </p><p>
     * The number of items returned shall not be greater than Limit parameter.
     * </p><p>
     *       
     */
    @WebMethod(operationName = "GetAccessPointInfoList", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/GetAccessPointInfoList")
    @RequestWrapper(localName = "GetAccessPointInfoList", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAccessPointInfoList")
    @ResponseWrapper(localName = "GetAccessPointInfoListResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAccessPointInfoListResponse")
    public void getAccessPointInfoList(

        @WebParam(name = "Limit", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.Integer limit,
        @WebParam(name = "StartReference", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.String startReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "NextStartReference", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        javax.xml.ws.Holder<java.lang.String> nextStartReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "AccessPointInfo", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        javax.xml.ws.Holder<java.util.List<org.onvif.ver10.accesscontrol.wsdl.AccessPointInfo>> accessPointInfo
    );

    /**
     * This operation requests a list of all AreaInfo items provided by the device.
     * An ONVIF compliant device which provides the Access Control service shall implement this
     * method.
     * </p><p>
     * A call to this method shall return a StartReference when not all data is returned and more
     * data is available. The reference shall be valid for retrieving the next set of data.
     * Please refer section [Retrieving system configuration] for more details.
     * </p><p>
     * The number of items returned shall not be greater than Limit parameter.
     * </p><p>
     * 
     *       
     */
    @WebMethod(operationName = "GetAreaInfoList", action = "http://www.onvif.org/ver10/accesscontrol/wsdl/GetAreaInfoList")
    @RequestWrapper(localName = "GetAreaInfoList", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAreaInfoList")
    @ResponseWrapper(localName = "GetAreaInfoListResponse", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl", className = "org.onvif.ver10.accesscontrol.wsdl.GetAreaInfoListResponse")
    public void getAreaInfoList(

        @WebParam(name = "Limit", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.Integer limit,
        @WebParam(name = "StartReference", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        java.lang.String startReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "NextStartReference", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        javax.xml.ws.Holder<java.lang.String> nextStartReference,
        @WebParam(mode = WebParam.Mode.OUT, name = "AreaInfo", targetNamespace = "http://www.onvif.org/ver10/accesscontrol/wsdl")
        javax.xml.ws.Holder<java.util.List<org.onvif.ver10.accesscontrol.wsdl.AreaInfo>> areaInfo
    );
}
