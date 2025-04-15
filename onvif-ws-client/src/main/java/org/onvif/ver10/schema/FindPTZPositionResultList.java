
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * &lt;p&gt;FindPTZPositionResultList complex type的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FindPTZPositionResultList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SearchState" type="{http://www.onvif.org/ver10/schema}SearchState"/&amp;gt;
 *         &amp;lt;element name="Result" type="{http://www.onvif.org/ver10/schema}FindPTZPositionResult" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPTZPositionResultList", propOrder = {
    "searchState",
    "result"
})
public class FindPTZPositionResultList {

    @XmlElement(name = "SearchState", required = true)
    @XmlSchemaType(name = "string")
    protected SearchState searchState;
    @XmlElement(name = "Result")
    protected List<FindPTZPositionResult> result;

    /**
     * 获取searchState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchState }
     *     
     */
    public SearchState getSearchState() {
        return searchState;
    }

    /**
     * 设置searchState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchState }
     *     
     */
    public void setSearchState(SearchState value) {
        this.searchState = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the result property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getResult().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link FindPTZPositionResult }
     * 
     * 
     */
    public List<FindPTZPositionResult> getResult() {
        if (result == null) {
            result = new ArrayList<FindPTZPositionResult>();
        }
        return this.result;
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
