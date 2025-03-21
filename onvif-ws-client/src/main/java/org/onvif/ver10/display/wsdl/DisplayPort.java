package org.onvif.ver10.display.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.7
 * Generated source version: 4.0.7
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/display/wsdl", name = "DisplayPort")
@XmlSeeAlso({org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class, org.w3._2004._08.xop.include.ObjectFactory.class, org.onvif.ver10.schema.ObjectFactory.class, org.oasis_open.docs.wsn.b_2.ObjectFactory.class, org.oasis_open.docs.wsn.t_1.ObjectFactory.class, ObjectFactory.class, org.w3._2003._05.soap_envelope.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface DisplayPort {

    /**
     * Returns the capabilities of the display service. The result is returned in
     *         a typed answer.
     *       
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/display/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", className = "org.onvif.ver10.display.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", className = "org.onvif.ver10.display.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
    public org.onvif.ver10.display.wsdl.Capabilities getServiceCapabilities()
;

    /**
     * Retrieve the pane configuration for a pane token.
     */
    @WebMethod(operationName = "GetPaneConfiguration", action = "http://www.onvif.org/ver10/display/wsdl/GetPaneConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetPaneConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public GetPaneConfigurationResponse getPaneConfiguration(

        @WebParam(partName = "parameters", name = "GetPaneConfiguration", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        GetPaneConfiguration parameters
    );

    /**
     * List all currently defined panes of a device for a specified video output
     *         (regardless if this pane is visible at a moment). A Pane is a display area on the monitor
     *         that is attached to a video output. A pane has a
     *         PaneConfiguration that describes which entities are associated with the pane. A tests has
     *         to configure the pane according to the connection to be established by setting the
     *         AudioOutput and/or AudioSourceToken. If a Token is not set, the corresponding session will
     *         not be established.
     *       
     */
    @WebMethod(operationName = "GetPaneConfigurations", action = "http://www.onvif.org/ver10/display/wsdl/GetPaneConfigurations")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetPaneConfigurationsResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public GetPaneConfigurationsResponse getPaneConfigurations(

        @WebParam(partName = "parameters", name = "GetPaneConfigurations", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        GetPaneConfigurations parameters
    );

    /**
     * Return the current layout of a video output. The Layout assigns a pane
     *         configuration to a certain area of the display. The layout settings
     *         directly affect a specific video output. The layout consists of a list of PaneConfigurations
     *         and
     *         their associated display areas.
     *       
     */
    @WebMethod(operationName = "GetLayout", action = "http://www.onvif.org/ver10/display/wsdl/GetLayout")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetLayoutResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public GetLayoutResponse getLayout(

        @WebParam(partName = "parameters", name = "GetLayout", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        GetLayout parameters
    );

    /**
     * Change the layout of a display (e.g. change from
     *         single view to split screen view).The Layout assigns a pane configuration to a certain area
     *         of the display. The layout settings
     *         directly affect a specific video output. The layout consists of a list of PaneConfigurations
     *         and
     *         their associated display areas.
     *         
     *         A device implementation shall be tolerant against rounding errors when matching a layout
     *         against its fixed set of layouts by accepting differences of at least one percent.
     *       
     */
    @WebMethod(operationName = "SetLayout", action = "http://www.onvif.org/ver10/display/wsdl/SetLayout")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "SetLayoutResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public SetLayoutResponse setLayout(

        @WebParam(partName = "parameters", name = "SetLayout", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        SetLayout parameters
    );

    /**
     * Delete a pane configuration. A service must respond with an error if the
     *         pane configuration
     *         is in use by the current layout.
     *         
     *         This optional method is only supported by devices that signal support of dynamic pane
     *         creation via their capabilities.
     *       
     */
    @WebMethod(operationName = "DeletePaneConfiguration", action = "http://www.onvif.org/ver10/display/wsdl/DeletePaneConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "DeletePaneConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public DeletePaneConfigurationResponse deletePaneConfiguration(

        @WebParam(partName = "parameters", name = "DeletePaneConfiguration", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        DeletePaneConfiguration parameters
    );

    /**
     * Create a new pane configuration describing the streaming and coding
     *         settings for a display area.
     *         
     *         This optional method is only supported by devices that signal support of dynamic pane
     *         creation via their capabilities.
     *         
     *         The content of the Token field may be ignored by the device.
     *       
     */
    @WebMethod(operationName = "CreatePaneConfiguration", action = "http://www.onvif.org/ver10/display/wsdl/CreatePaneConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "CreatePaneConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public CreatePaneConfigurationResponse createPaneConfiguration(

        @WebParam(partName = "parameters", name = "CreatePaneConfiguration", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        CreatePaneConfiguration parameters
    );

    /**
     * Modify one or more configurations of the specified video output.
     *         This method will only modify the provided configurations and leave the others unchanged.
     *         Use  to remove pane
     *         configurations.
     *       
     */
    @WebMethod(operationName = "SetPaneConfigurations", action = "http://www.onvif.org/ver10/display/wsdl/SetPaneConfigurations")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "SetPaneConfigurationsResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public SetPaneConfigurationsResponse setPaneConfigurations(

        @WebParam(partName = "parameters", name = "SetPaneConfigurations", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        SetPaneConfigurations parameters
    );

    /**
     * This command changes the configuration of the specified pane (tbd)
     *       
     */
    @WebMethod(operationName = "SetPaneConfiguration", action = "http://www.onvif.org/ver10/display/wsdl/SetPaneConfiguration")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "SetPaneConfigurationResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public SetPaneConfigurationResponse setPaneConfiguration(

        @WebParam(partName = "parameters", name = "SetPaneConfiguration", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        SetPaneConfiguration parameters
    );

    /**
     * The Display Options contain the supported layouts (LayoutOptions) and the
     *         decoding and
     *         encoding capabilities (CodingCapabilities) of the device. The GetDisplayOptions command
     *         returns both, Layout and Coding Capabilities, of a VideoOutput.
     *       
     */
    @WebMethod(operationName = "GetDisplayOptions", action = "http://www.onvif.org/ver10/display/wsdl/GetDisplayOptions")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetDisplayOptionsResponse", targetNamespace = "http://www.onvif.org/ver10/display/wsdl", partName = "parameters")
    public GetDisplayOptionsResponse getDisplayOptions(

        @WebParam(partName = "parameters", name = "GetDisplayOptions", targetNamespace = "http://www.onvif.org/ver10/display/wsdl")
        GetDisplayOptions parameters
    );
}
