
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.ws.wsaddressing.W3CEndpointReference;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubscriptionReference" type="{http://www.w3.org/2005/08/addressing}EndpointReferenceType"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}CurrentTime"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}TerminationTime"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subscriptionReference",
    "currentTime",
    "terminationTime",
    "any"
})
@XmlRootElement(name = "CreatePullPointSubscriptionResponse")
public class CreatePullPointSubscriptionResponse {

    @XmlElement(name = "SubscriptionReference", required = true)
    protected W3CEndpointReference subscriptionReference;
    @XmlElement(name = "CurrentTime", namespace = "http://docs.oasis-open.org/wsn/b-2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentTime;
    @XmlElement(name = "TerminationTime", namespace = "http://docs.oasis-open.org/wsn/b-2", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 获取subscriptionReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link W3CEndpointReference }
     *     
     */
    public W3CEndpointReference getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * 设置subscriptionReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link W3CEndpointReference }
     *     
     */
    public void setSubscriptionReference(W3CEndpointReference value) {
        this.subscriptionReference = value;
    }

    /**
     * Current time of the server for synchronization purposes.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentTime() {
        return currentTime;
    }

    /**
     * 设置currentTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentTime(XMLGregorianCalendar value) {
        this.currentTime = value;
    }

    /**
     * Date time when the PullPoint will be shut down without further pull requests.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationTime() {
        return terminationTime;
    }

    /**
     * 设置terminationTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationTime(XMLGregorianCalendar value) {
        this.terminationTime = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
