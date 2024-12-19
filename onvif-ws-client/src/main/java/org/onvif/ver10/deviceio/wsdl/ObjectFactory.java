
package org.onvif.ver10.deviceio.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.deviceio.wsdl package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "Capabilities");
    private static final QName _GetVideoSources_QNAME = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "GetVideoSources");
    private static final QName _GetVideoSourcesResponse_QNAME = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "GetVideoSourcesResponse");
    private static final QName _GetAudioSources_QNAME = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "GetAudioSources");
    private static final QName _GetAudioSourcesResponse_QNAME = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "GetAudioSourcesResponse");
    private static final QName _GetAudioOutputs_QNAME = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "GetAudioOutputs");
    private static final QName _GetAudioOutputsResponse_QNAME = new QName("http://www.onvif.org/ver10/deviceIO/wsdl", "GetAudioOutputsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.deviceio.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     * @return
     *     the new instance of {@link GetServiceCapabilities }
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     * 
     * @return
     *     the new instance of {@link GetServiceCapabilitiesResponse }
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     * @return
     *     the new instance of {@link Capabilities }
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link GetRelayOutputOptions }
     * 
     * @return
     *     the new instance of {@link GetRelayOutputOptions }
     */
    public GetRelayOutputOptions createGetRelayOutputOptions() {
        return new GetRelayOutputOptions();
    }

    /**
     * Create an instance of {@link GetRelayOutputOptionsResponse }
     * 
     * @return
     *     the new instance of {@link GetRelayOutputOptionsResponse }
     */
    public GetRelayOutputOptionsResponse createGetRelayOutputOptionsResponse() {
        return new GetRelayOutputOptionsResponse();
    }

    /**
     * Create an instance of {@link RelayOutputOptions }
     * 
     * @return
     *     the new instance of {@link RelayOutputOptions }
     */
    public RelayOutputOptions createRelayOutputOptions() {
        return new RelayOutputOptions();
    }

    /**
     * Create an instance of {@link Get }
     * 
     * @return
     *     the new instance of {@link Get }
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     * @return
     *     the new instance of {@link GetResponse }
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link GetVideoOutputs }
     * 
     * @return
     *     the new instance of {@link GetVideoOutputs }
     */
    public GetVideoOutputs createGetVideoOutputs() {
        return new GetVideoOutputs();
    }

    /**
     * Create an instance of {@link GetVideoOutputsResponse }
     * 
     * @return
     *     the new instance of {@link GetVideoOutputsResponse }
     */
    public GetVideoOutputsResponse createGetVideoOutputsResponse() {
        return new GetVideoOutputsResponse();
    }

    /**
     * Create an instance of {@link GetAudioSourceConfiguration }
     * 
     * @return
     *     the new instance of {@link GetAudioSourceConfiguration }
     */
    public GetAudioSourceConfiguration createGetAudioSourceConfiguration() {
        return new GetAudioSourceConfiguration();
    }

    /**
     * Create an instance of {@link GetAudioSourceConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link GetAudioSourceConfigurationResponse }
     */
    public GetAudioSourceConfigurationResponse createGetAudioSourceConfigurationResponse() {
        return new GetAudioSourceConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetAudioOutputConfiguration }
     * 
     * @return
     *     the new instance of {@link GetAudioOutputConfiguration }
     */
    public GetAudioOutputConfiguration createGetAudioOutputConfiguration() {
        return new GetAudioOutputConfiguration();
    }

    /**
     * Create an instance of {@link GetAudioOutputConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link GetAudioOutputConfigurationResponse }
     */
    public GetAudioOutputConfigurationResponse createGetAudioOutputConfigurationResponse() {
        return new GetAudioOutputConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetVideoSourceConfiguration }
     * 
     * @return
     *     the new instance of {@link GetVideoSourceConfiguration }
     */
    public GetVideoSourceConfiguration createGetVideoSourceConfiguration() {
        return new GetVideoSourceConfiguration();
    }

    /**
     * Create an instance of {@link GetVideoSourceConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link GetVideoSourceConfigurationResponse }
     */
    public GetVideoSourceConfigurationResponse createGetVideoSourceConfigurationResponse() {
        return new GetVideoSourceConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetVideoOutputConfiguration }
     * 
     * @return
     *     the new instance of {@link GetVideoOutputConfiguration }
     */
    public GetVideoOutputConfiguration createGetVideoOutputConfiguration() {
        return new GetVideoOutputConfiguration();
    }

    /**
     * Create an instance of {@link GetVideoOutputConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link GetVideoOutputConfigurationResponse }
     */
    public GetVideoOutputConfigurationResponse createGetVideoOutputConfigurationResponse() {
        return new GetVideoOutputConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetAudioSourceConfiguration }
     * 
     * @return
     *     the new instance of {@link SetAudioSourceConfiguration }
     */
    public SetAudioSourceConfiguration createSetAudioSourceConfiguration() {
        return new SetAudioSourceConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioSourceConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link SetAudioSourceConfigurationResponse }
     */
    public SetAudioSourceConfigurationResponse createSetAudioSourceConfigurationResponse() {
        return new SetAudioSourceConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetAudioOutputConfiguration }
     * 
     * @return
     *     the new instance of {@link SetAudioOutputConfiguration }
     */
    public SetAudioOutputConfiguration createSetAudioOutputConfiguration() {
        return new SetAudioOutputConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioOutputConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link SetAudioOutputConfigurationResponse }
     */
    public SetAudioOutputConfigurationResponse createSetAudioOutputConfigurationResponse() {
        return new SetAudioOutputConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetVideoSourceConfiguration }
     * 
     * @return
     *     the new instance of {@link SetVideoSourceConfiguration }
     */
    public SetVideoSourceConfiguration createSetVideoSourceConfiguration() {
        return new SetVideoSourceConfiguration();
    }

    /**
     * Create an instance of {@link SetVideoSourceConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link SetVideoSourceConfigurationResponse }
     */
    public SetVideoSourceConfigurationResponse createSetVideoSourceConfigurationResponse() {
        return new SetVideoSourceConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetVideoOutputConfiguration }
     * 
     * @return
     *     the new instance of {@link SetVideoOutputConfiguration }
     */
    public SetVideoOutputConfiguration createSetVideoOutputConfiguration() {
        return new SetVideoOutputConfiguration();
    }

    /**
     * Create an instance of {@link SetVideoOutputConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link SetVideoOutputConfigurationResponse }
     */
    public SetVideoOutputConfigurationResponse createSetVideoOutputConfigurationResponse() {
        return new SetVideoOutputConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetVideoSourceConfigurationOptions }
     * 
     * @return
     *     the new instance of {@link GetVideoSourceConfigurationOptions }
     */
    public GetVideoSourceConfigurationOptions createGetVideoSourceConfigurationOptions() {
        return new GetVideoSourceConfigurationOptions();
    }

    /**
     * Create an instance of {@link GetVideoSourceConfigurationOptionsResponse }
     * 
     * @return
     *     the new instance of {@link GetVideoSourceConfigurationOptionsResponse }
     */
    public GetVideoSourceConfigurationOptionsResponse createGetVideoSourceConfigurationOptionsResponse() {
        return new GetVideoSourceConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetVideoOutputConfigurationOptions }
     * 
     * @return
     *     the new instance of {@link GetVideoOutputConfigurationOptions }
     */
    public GetVideoOutputConfigurationOptions createGetVideoOutputConfigurationOptions() {
        return new GetVideoOutputConfigurationOptions();
    }

    /**
     * Create an instance of {@link GetVideoOutputConfigurationOptionsResponse }
     * 
     * @return
     *     the new instance of {@link GetVideoOutputConfigurationOptionsResponse }
     */
    public GetVideoOutputConfigurationOptionsResponse createGetVideoOutputConfigurationOptionsResponse() {
        return new GetVideoOutputConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioSourceConfigurationOptions }
     * 
     * @return
     *     the new instance of {@link GetAudioSourceConfigurationOptions }
     */
    public GetAudioSourceConfigurationOptions createGetAudioSourceConfigurationOptions() {
        return new GetAudioSourceConfigurationOptions();
    }

    /**
     * Create an instance of {@link GetAudioSourceConfigurationOptionsResponse }
     * 
     * @return
     *     the new instance of {@link GetAudioSourceConfigurationOptionsResponse }
     */
    public GetAudioSourceConfigurationOptionsResponse createGetAudioSourceConfigurationOptionsResponse() {
        return new GetAudioSourceConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioOutputConfigurationOptions }
     * 
     * @return
     *     the new instance of {@link GetAudioOutputConfigurationOptions }
     */
    public GetAudioOutputConfigurationOptions createGetAudioOutputConfigurationOptions() {
        return new GetAudioOutputConfigurationOptions();
    }

    /**
     * Create an instance of {@link GetAudioOutputConfigurationOptionsResponse }
     * 
     * @return
     *     the new instance of {@link GetAudioOutputConfigurationOptionsResponse }
     */
    public GetAudioOutputConfigurationOptionsResponse createGetAudioOutputConfigurationOptionsResponse() {
        return new GetAudioOutputConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link SetRelayOutputSettings }
     * 
     * @return
     *     the new instance of {@link SetRelayOutputSettings }
     */
    public SetRelayOutputSettings createSetRelayOutputSettings() {
        return new SetRelayOutputSettings();
    }

    /**
     * Create an instance of {@link SetRelayOutputSettingsResponse }
     * 
     * @return
     *     the new instance of {@link SetRelayOutputSettingsResponse }
     */
    public SetRelayOutputSettingsResponse createSetRelayOutputSettingsResponse() {
        return new SetRelayOutputSettingsResponse();
    }

    /**
     * Create an instance of {@link GetDigitalInputs }
     * 
     * @return
     *     the new instance of {@link GetDigitalInputs }
     */
    public GetDigitalInputs createGetDigitalInputs() {
        return new GetDigitalInputs();
    }

    /**
     * Create an instance of {@link GetDigitalInputsResponse }
     * 
     * @return
     *     the new instance of {@link GetDigitalInputsResponse }
     */
    public GetDigitalInputsResponse createGetDigitalInputsResponse() {
        return new GetDigitalInputsResponse();
    }

    /**
     * Create an instance of {@link GetDigitalInputConfigurationOptions }
     * 
     * @return
     *     the new instance of {@link GetDigitalInputConfigurationOptions }
     */
    public GetDigitalInputConfigurationOptions createGetDigitalInputConfigurationOptions() {
        return new GetDigitalInputConfigurationOptions();
    }

    /**
     * Create an instance of {@link GetDigitalInputConfigurationOptionsResponse }
     * 
     * @return
     *     the new instance of {@link GetDigitalInputConfigurationOptionsResponse }
     */
    public GetDigitalInputConfigurationOptionsResponse createGetDigitalInputConfigurationOptionsResponse() {
        return new GetDigitalInputConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link DigitalInputConfigurationInputOptions }
     * 
     * @return
     *     the new instance of {@link DigitalInputConfigurationInputOptions }
     */
    public DigitalInputConfigurationInputOptions createDigitalInputConfigurationInputOptions() {
        return new DigitalInputConfigurationInputOptions();
    }

    /**
     * Create an instance of {@link SetDigitalInputConfigurations }
     * 
     * @return
     *     the new instance of {@link SetDigitalInputConfigurations }
     */
    public SetDigitalInputConfigurations createSetDigitalInputConfigurations() {
        return new SetDigitalInputConfigurations();
    }

    /**
     * Create an instance of {@link SetDigitalInputConfigurationsResponse }
     * 
     * @return
     *     the new instance of {@link SetDigitalInputConfigurationsResponse }
     */
    public SetDigitalInputConfigurationsResponse createSetDigitalInputConfigurationsResponse() {
        return new SetDigitalInputConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetSerialPorts }
     * 
     * @return
     *     the new instance of {@link GetSerialPorts }
     */
    public GetSerialPorts createGetSerialPorts() {
        return new GetSerialPorts();
    }

    /**
     * Create an instance of {@link GetSerialPortsResponse }
     * 
     * @return
     *     the new instance of {@link GetSerialPortsResponse }
     */
    public GetSerialPortsResponse createGetSerialPortsResponse() {
        return new GetSerialPortsResponse();
    }

    /**
     * Create an instance of {@link SerialPort }
     * 
     * @return
     *     the new instance of {@link SerialPort }
     */
    public SerialPort createSerialPort() {
        return new SerialPort();
    }

    /**
     * Create an instance of {@link GetSerialPortConfiguration }
     * 
     * @return
     *     the new instance of {@link GetSerialPortConfiguration }
     */
    public GetSerialPortConfiguration createGetSerialPortConfiguration() {
        return new GetSerialPortConfiguration();
    }

    /**
     * Create an instance of {@link GetSerialPortConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link GetSerialPortConfigurationResponse }
     */
    public GetSerialPortConfigurationResponse createGetSerialPortConfigurationResponse() {
        return new GetSerialPortConfigurationResponse();
    }

    /**
     * Create an instance of {@link SerialPortConfiguration }
     * 
     * @return
     *     the new instance of {@link SerialPortConfiguration }
     */
    public SerialPortConfiguration createSerialPortConfiguration() {
        return new SerialPortConfiguration();
    }

    /**
     * Create an instance of {@link SetSerialPortConfiguration }
     * 
     * @return
     *     the new instance of {@link SetSerialPortConfiguration }
     */
    public SetSerialPortConfiguration createSetSerialPortConfiguration() {
        return new SetSerialPortConfiguration();
    }

    /**
     * Create an instance of {@link SetSerialPortConfigurationResponse }
     * 
     * @return
     *     the new instance of {@link SetSerialPortConfigurationResponse }
     */
    public SetSerialPortConfigurationResponse createSetSerialPortConfigurationResponse() {
        return new SetSerialPortConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetSerialPortConfigurationOptions }
     * 
     * @return
     *     the new instance of {@link GetSerialPortConfigurationOptions }
     */
    public GetSerialPortConfigurationOptions createGetSerialPortConfigurationOptions() {
        return new GetSerialPortConfigurationOptions();
    }

    /**
     * Create an instance of {@link GetSerialPortConfigurationOptionsResponse }
     * 
     * @return
     *     the new instance of {@link GetSerialPortConfigurationOptionsResponse }
     */
    public GetSerialPortConfigurationOptionsResponse createGetSerialPortConfigurationOptionsResponse() {
        return new GetSerialPortConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link SerialPortConfigurationOptions }
     * 
     * @return
     *     the new instance of {@link SerialPortConfigurationOptions }
     */
    public SerialPortConfigurationOptions createSerialPortConfigurationOptions() {
        return new SerialPortConfigurationOptions();
    }

    /**
     * Create an instance of {@link SendReceiveSerialCommand }
     * 
     * @return
     *     the new instance of {@link SendReceiveSerialCommand }
     */
    public SendReceiveSerialCommand createSendReceiveSerialCommand() {
        return new SendReceiveSerialCommand();
    }

    /**
     * Create an instance of {@link SerialData }
     * 
     * @return
     *     the new instance of {@link SerialData }
     */
    public SerialData createSerialData() {
        return new SerialData();
    }

    /**
     * Create an instance of {@link SendReceiveSerialCommandResponse }
     * 
     * @return
     *     the new instance of {@link SendReceiveSerialCommandResponse }
     */
    public SendReceiveSerialCommandResponse createSendReceiveSerialCommandResponse() {
        return new SendReceiveSerialCommandResponse();
    }

    /**
     * Create an instance of {@link RelayOutputOptionsExtension }
     * 
     * @return
     *     the new instance of {@link RelayOutputOptionsExtension }
     */
    public RelayOutputOptionsExtension createRelayOutputOptionsExtension() {
        return new RelayOutputOptionsExtension();
    }

    /**
     * Create an instance of {@link ParityBitList }
     * 
     * @return
     *     the new instance of {@link ParityBitList }
     */
    public ParityBitList createParityBitList() {
        return new ParityBitList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/deviceIO/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Get }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/deviceIO/wsdl", name = "GetVideoSources")
    public JAXBElement<Get> createGetVideoSources(Get value) {
        return new JAXBElement<>(_GetVideoSources_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/deviceIO/wsdl", name = "GetVideoSourcesResponse")
    public JAXBElement<GetResponse> createGetVideoSourcesResponse(GetResponse value) {
        return new JAXBElement<>(_GetVideoSourcesResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Get }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/deviceIO/wsdl", name = "GetAudioSources")
    public JAXBElement<Get> createGetAudioSources(Get value) {
        return new JAXBElement<>(_GetAudioSources_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/deviceIO/wsdl", name = "GetAudioSourcesResponse")
    public JAXBElement<GetResponse> createGetAudioSourcesResponse(GetResponse value) {
        return new JAXBElement<>(_GetAudioSourcesResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Get }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/deviceIO/wsdl", name = "GetAudioOutputs")
    public JAXBElement<Get> createGetAudioOutputs(Get value) {
        return new JAXBElement<>(_GetAudioOutputs_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/deviceIO/wsdl", name = "GetAudioOutputsResponse")
    public JAXBElement<GetResponse> createGetAudioOutputsResponse(GetResponse value) {
        return new JAXBElement<>(_GetAudioOutputsResponse_QNAME, GetResponse.class, null, value);
    }

}
