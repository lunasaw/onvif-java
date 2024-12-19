
package org.onvif.ver10.schema;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayOutputSettings complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RelayOutputSettings">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}RelayMode"/>
 *         <element name="DelayTime" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         <element name="IdleState" type="{http://www.onvif.org/ver10/schema}RelayIdleState"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayOutputSettings", propOrder = {
    "mode",
    "delayTime",
    "idleState"
})
public class RelayOutputSettings {

    /**
     * 'Bistable' or 'Monostable'
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Bistable – After setting the state, the relay remains in this state.&lt;/li&gt;&lt;li&gt;Monostable – After setting the state, the relay returns to its idle state after
     *                 the specified time.
     *               &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected RelayMode mode;
    /**
     * Time after which the relay returns to its idle state if it is in
     *             monostable mode. If the Mode field is set to bistable mode the value of the parameter
     *             can be ignored.
     * 
     */
    @XmlElement(name = "DelayTime", required = true)
    protected Duration delayTime;
    /**
     * 'open' or 'closed'
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;'open' means that the relay is open when the relay state is set to 'inactive'
     *                 through the trigger command and closed when the state is set to 'active' through the
     *                 same command.
     *               &lt;/li&gt;&lt;li&gt;'closed' means that the relay is closed when the relay state is set to 'inactive'
     *                 through the trigger command and open when the state is set to 'active' through the
     *                 same command.
     *               &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     */
    @XmlElement(name = "IdleState", required = true)
    @XmlSchemaType(name = "string")
    protected RelayIdleState idleState;

    /**
     * 'Bistable' or 'Monostable'
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;Bistable – After setting the state, the relay remains in this state.&lt;/li&gt;&lt;li&gt;Monostable – After setting the state, the relay returns to its idle state after
     *                 the specified time.
     *               &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link RelayMode }
     *     
     */
    public RelayMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayMode }
     *     
     * @see #getMode()
     */
    public void setMode(RelayMode value) {
        this.mode = value;
    }

    /**
     * Time after which the relay returns to its idle state if it is in
     *             monostable mode. If the Mode field is set to bistable mode the value of the parameter
     *             can be ignored.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelayTime() {
        return delayTime;
    }

    /**
     * Sets the value of the delayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getDelayTime()
     */
    public void setDelayTime(Duration value) {
        this.delayTime = value;
    }

    /**
     * 'open' or 'closed'
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;'open' means that the relay is open when the relay state is set to 'inactive'
     *                 through the trigger command and closed when the state is set to 'active' through the
     *                 same command.
     *               &lt;/li&gt;&lt;li&gt;'closed' means that the relay is closed when the relay state is set to 'inactive'
     *                 through the trigger command and open when the state is set to 'active' through the
     *                 same command.
     *               &lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * 
     * @return
     *     possible object is
     *     {@link RelayIdleState }
     *     
     */
    public RelayIdleState getIdleState() {
        return idleState;
    }

    /**
     * Sets the value of the idleState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayIdleState }
     *     
     * @see #getIdleState()
     */
    public void setIdleState(RelayIdleState value) {
        this.idleState = value;
    }

}
