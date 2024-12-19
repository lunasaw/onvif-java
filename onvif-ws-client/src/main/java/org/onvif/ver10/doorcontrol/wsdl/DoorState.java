
package org.onvif.ver10.doorcontrol.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * The DoorState structure contains current aggregate runtime status of Door.
 * 
 * <p>Java class for DoorState complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DoorState">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DoorPhysicalState" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorPhysicalState" minOccurs="0"/>
 *         <element name="LockPhysicalState" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}LockPhysicalState" minOccurs="0"/>
 *         <element name="DoubleLockPhysicalState" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}LockPhysicalState" minOccurs="0"/>
 *         <element name="Alarm" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorAlarmState" minOccurs="0"/>
 *         <element name="Tamper" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorTamper" minOccurs="0"/>
 *         <element name="Fault" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorFault" minOccurs="0"/>
 *         <element name="DoorMode" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}DoorMode"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoorState", propOrder = {
    "doorPhysicalState",
    "lockPhysicalState",
    "doubleLockPhysicalState",
    "alarm",
    "tamper",
    "fault",
    "doorMode",
    "any"
})
public class DoorState {

    /**
     * Physical state of Door; it is of type DoorPhysicalState. A device
     *                 that signals support for DoorMonitor capability for a particular door instance shall
     *                 provide this field.
     * 
     */
    @XmlElement(name = "DoorPhysicalState")
    @XmlSchemaType(name = "string")
    protected DoorPhysicalState doorPhysicalState;
    /**
     * Physical state of the Lock; it is of type LockPhysicalState. A
     *                 device that signals support for LockMonitor capability for a particular door
     *                 instance shall provide this field.
     * 
     */
    @XmlElement(name = "LockPhysicalState")
    @XmlSchemaType(name = "string")
    protected LockPhysicalState lockPhysicalState;
    /**
     * Physical state of the DoubleLock; it is of type LockPhysicalState. A
     *                 device that signals support for DoubleLockMonitor capability for a particular door
     *                 instance shall provide this field.
     * 
     */
    @XmlElement(name = "DoubleLockPhysicalState")
    @XmlSchemaType(name = "string")
    protected LockPhysicalState doubleLockPhysicalState;
    /**
     * Alarm state of the door; it is of type DoorAlarmState. A device that
     *                 signals support for Alarm capability for a particular door instance shall provide
     *                 this field.
     * 
     */
    @XmlElement(name = "Alarm")
    @XmlSchemaType(name = "string")
    protected DoorAlarmState alarm;
    /**
     * Tampering state of the door; it is of type DoorTamper. A device that
     *                 signals support for Tamper capability for a particular door instance shall provide
     *                 this field.
     * 
     */
    @XmlElement(name = "Tamper")
    protected DoorTamper tamper;
    /**
     * Fault information for door; it is of type DoorFault. A device that
     *                 signals support for Fault capability for a particular door instance shall provide
     *                 this field.
     * 
     */
    @XmlElement(name = "Fault")
    protected DoorFault fault;
    /**
     * The logical operating mode of the door; it is of type DoorMode. An
     *                 ONVIF compatible device shall report current operating mode in this field.
     * 
     */
    @XmlElement(name = "DoorMode", required = true)
    @XmlSchemaType(name = "string")
    protected DoorMode doorMode;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Physical state of Door; it is of type DoorPhysicalState. A device
     *                 that signals support for DoorMonitor capability for a particular door instance shall
     *                 provide this field.
     * 
     * @return
     *     possible object is
     *     {@link DoorPhysicalState }
     *     
     */
    public DoorPhysicalState getDoorPhysicalState() {
        return doorPhysicalState;
    }

    /**
     * Sets the value of the doorPhysicalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorPhysicalState }
     *     
     * @see #getDoorPhysicalState()
     */
    public void setDoorPhysicalState(DoorPhysicalState value) {
        this.doorPhysicalState = value;
    }

    /**
     * Physical state of the Lock; it is of type LockPhysicalState. A
     *                 device that signals support for LockMonitor capability for a particular door
     *                 instance shall provide this field.
     * 
     * @return
     *     possible object is
     *     {@link LockPhysicalState }
     *     
     */
    public LockPhysicalState getLockPhysicalState() {
        return lockPhysicalState;
    }

    /**
     * Sets the value of the lockPhysicalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockPhysicalState }
     *     
     * @see #getLockPhysicalState()
     */
    public void setLockPhysicalState(LockPhysicalState value) {
        this.lockPhysicalState = value;
    }

    /**
     * Physical state of the DoubleLock; it is of type LockPhysicalState. A
     *                 device that signals support for DoubleLockMonitor capability for a particular door
     *                 instance shall provide this field.
     * 
     * @return
     *     possible object is
     *     {@link LockPhysicalState }
     *     
     */
    public LockPhysicalState getDoubleLockPhysicalState() {
        return doubleLockPhysicalState;
    }

    /**
     * Sets the value of the doubleLockPhysicalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockPhysicalState }
     *     
     * @see #getDoubleLockPhysicalState()
     */
    public void setDoubleLockPhysicalState(LockPhysicalState value) {
        this.doubleLockPhysicalState = value;
    }

    /**
     * Alarm state of the door; it is of type DoorAlarmState. A device that
     *                 signals support for Alarm capability for a particular door instance shall provide
     *                 this field.
     * 
     * @return
     *     possible object is
     *     {@link DoorAlarmState }
     *     
     */
    public DoorAlarmState getAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorAlarmState }
     *     
     * @see #getAlarm()
     */
    public void setAlarm(DoorAlarmState value) {
        this.alarm = value;
    }

    /**
     * Tampering state of the door; it is of type DoorTamper. A device that
     *                 signals support for Tamper capability for a particular door instance shall provide
     *                 this field.
     * 
     * @return
     *     possible object is
     *     {@link DoorTamper }
     *     
     */
    public DoorTamper getTamper() {
        return tamper;
    }

    /**
     * Sets the value of the tamper property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorTamper }
     *     
     * @see #getTamper()
     */
    public void setTamper(DoorTamper value) {
        this.tamper = value;
    }

    /**
     * Fault information for door; it is of type DoorFault. A device that
     *                 signals support for Fault capability for a particular door instance shall provide
     *                 this field.
     * 
     * @return
     *     possible object is
     *     {@link DoorFault }
     *     
     */
    public DoorFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorFault }
     *     
     * @see #getFault()
     */
    public void setFault(DoorFault value) {
        this.fault = value;
    }

    /**
     * The logical operating mode of the door; it is of type DoorMode. An
     *                 ONVIF compatible device shall report current operating mode in this field.
     * 
     * @return
     *     possible object is
     *     {@link DoorMode }
     *     
     */
    public DoorMode getDoorMode() {
        return doorMode;
    }

    /**
     * Sets the value of the doorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoorMode }
     *     
     * @see #getDoorMode()
     */
    public void setDoorMode(DoorMode value) {
        this.doorMode = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
