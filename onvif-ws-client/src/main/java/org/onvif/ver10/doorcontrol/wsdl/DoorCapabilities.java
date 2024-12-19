
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * DoorCapabilities reflect optional functionality of a particular physical entity.
 *             Different door instances may have different set of capabilities.
 *             This information may change during device operation, e.g. if hardware settings are
 *             changed.
 *             The following capabilities are available:
 * 
 * <p>Java class for DoorCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DoorCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Access" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="AccessTimingOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Lock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Unlock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Block" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DoubleLock" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="LockDown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="LockOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DoorMonitor" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="LockMonitor" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="DoubleLockMonitor" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Tamper" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <attribute name="Fault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoorCapabilities", propOrder = {
    "any"
})
public class DoorCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    /**
     * Indicates whether or not this Door instance supports AccessDoor
     *               command to perform momentary access.
     * 
     */
    @XmlAttribute(name = "Access")
    protected Boolean access;
    /**
     * Indicates that this Door instance supports overriding configured
     *               timing in the AccessDoor command.
     * 
     */
    @XmlAttribute(name = "AccessTimingOverride")
    protected Boolean accessTimingOverride;
    /**
     * Indicates that this Door instance supports LockDoor command to lock
     *               the door.
     * 
     */
    @XmlAttribute(name = "Lock")
    protected Boolean lock;
    /**
     * Indicates that this Door instance supports UnlockDoor command to
     *               unlock the door.
     * 
     */
    @XmlAttribute(name = "Unlock")
    protected Boolean unlock;
    /**
     * Indicates that this Door instance supports BlockDoor command to block
     *               the door.
     * 
     */
    @XmlAttribute(name = "Block")
    protected Boolean block;
    /**
     * Indicates that this Door instance supports DoubleLockDoor command to
     *               lock multiple locks on the door.
     * 
     */
    @XmlAttribute(name = "DoubleLock")
    protected Boolean doubleLock;
    /**
     * Indicates that this Door instance supports LockDown (and
     *               LockDownRelease) commands to lock the door and put it in LockedDown mode.
     * 
     */
    @XmlAttribute(name = "LockDown")
    protected Boolean lockDown;
    /**
     * Indicates that this Door instance supports LockOpen (and
     *               LockOpenRelease) commands to unlock the door and put it in LockedOpen mode.
     * 
     */
    @XmlAttribute(name = "LockOpen")
    protected Boolean lockOpen;
    /**
     * Indicates that this Door instance has a DoorMonitor and supports the
     *               DoorPhysicalState event.
     * 
     */
    @XmlAttribute(name = "DoorMonitor")
    protected Boolean doorMonitor;
    /**
     * Indicates that this Door instance has a LockMonitor and supports the
     *               LockPhysicalState event.
     * 
     */
    @XmlAttribute(name = "LockMonitor")
    protected Boolean lockMonitor;
    /**
     * Indicates that this Door instance has a DoubleLockMonitor and supports
     *               the DoubleLockPhysicalState event.
     * 
     */
    @XmlAttribute(name = "DoubleLockMonitor")
    protected Boolean doubleLockMonitor;
    /**
     * Indicates that this Door instance supports door alarm and the
     *               DoorAlarm event.
     * 
     */
    @XmlAttribute(name = "Alarm")
    protected Boolean alarm;
    /**
     * Indicates that this Door instance has a Tamper detector and supports
     *               the DoorTamper event.
     * 
     */
    @XmlAttribute(name = "Tamper")
    protected Boolean tamper;
    /**
     * Indicates that this Door instance supports door fault and the
     *               DoorFault event.
     * 
     */
    @XmlAttribute(name = "Fault")
    protected Boolean fault;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

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
     * Indicates whether or not this Door instance supports AccessDoor
     *               command to perform momentary access.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAccess()
     */
    public void setAccess(Boolean value) {
        this.access = value;
    }

    /**
     * Indicates that this Door instance supports overriding configured
     *               timing in the AccessDoor command.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessTimingOverride() {
        return accessTimingOverride;
    }

    /**
     * Sets the value of the accessTimingOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAccessTimingOverride()
     */
    public void setAccessTimingOverride(Boolean value) {
        this.accessTimingOverride = value;
    }

    /**
     * Indicates that this Door instance supports LockDoor command to lock
     *               the door.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLock() {
        return lock;
    }

    /**
     * Sets the value of the lock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLock()
     */
    public void setLock(Boolean value) {
        this.lock = value;
    }

    /**
     * Indicates that this Door instance supports UnlockDoor command to
     *               unlock the door.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlock() {
        return unlock;
    }

    /**
     * Sets the value of the unlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUnlock()
     */
    public void setUnlock(Boolean value) {
        this.unlock = value;
    }

    /**
     * Indicates that this Door instance supports BlockDoor command to block
     *               the door.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isBlock()
     */
    public void setBlock(Boolean value) {
        this.block = value;
    }

    /**
     * Indicates that this Door instance supports DoubleLockDoor command to
     *               lock multiple locks on the door.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoubleLock() {
        return doubleLock;
    }

    /**
     * Sets the value of the doubleLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDoubleLock()
     */
    public void setDoubleLock(Boolean value) {
        this.doubleLock = value;
    }

    /**
     * Indicates that this Door instance supports LockDown (and
     *               LockDownRelease) commands to lock the door and put it in LockedDown mode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockDown() {
        return lockDown;
    }

    /**
     * Sets the value of the lockDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLockDown()
     */
    public void setLockDown(Boolean value) {
        this.lockDown = value;
    }

    /**
     * Indicates that this Door instance supports LockOpen (and
     *               LockOpenRelease) commands to unlock the door and put it in LockedOpen mode.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockOpen() {
        return lockOpen;
    }

    /**
     * Sets the value of the lockOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLockOpen()
     */
    public void setLockOpen(Boolean value) {
        this.lockOpen = value;
    }

    /**
     * Indicates that this Door instance has a DoorMonitor and supports the
     *               DoorPhysicalState event.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoorMonitor() {
        return doorMonitor;
    }

    /**
     * Sets the value of the doorMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDoorMonitor()
     */
    public void setDoorMonitor(Boolean value) {
        this.doorMonitor = value;
    }

    /**
     * Indicates that this Door instance has a LockMonitor and supports the
     *               LockPhysicalState event.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockMonitor() {
        return lockMonitor;
    }

    /**
     * Sets the value of the lockMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLockMonitor()
     */
    public void setLockMonitor(Boolean value) {
        this.lockMonitor = value;
    }

    /**
     * Indicates that this Door instance has a DoubleLockMonitor and supports
     *               the DoubleLockPhysicalState event.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoubleLockMonitor() {
        return doubleLockMonitor;
    }

    /**
     * Sets the value of the doubleLockMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDoubleLockMonitor()
     */
    public void setDoubleLockMonitor(Boolean value) {
        this.doubleLockMonitor = value;
    }

    /**
     * Indicates that this Door instance supports door alarm and the
     *               DoorAlarm event.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAlarm()
     */
    public void setAlarm(Boolean value) {
        this.alarm = value;
    }

    /**
     * Indicates that this Door instance has a Tamper detector and supports
     *               the DoorTamper event.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTamper() {
        return tamper;
    }

    /**
     * Sets the value of the tamper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTamper()
     */
    public void setTamper(Boolean value) {
        this.tamper = value;
    }

    /**
     * Indicates that this Door instance supports door fault and the
     *               DoorFault event.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFault()
     */
    public void setFault(Boolean value) {
        this.fault = value;
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
