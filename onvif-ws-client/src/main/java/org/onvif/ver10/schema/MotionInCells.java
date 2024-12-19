
package org.onvif.ver10.schema;

import java.math.BigInteger;
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
 * <p>Java class for MotionInCells complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MotionInCells">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Columns" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Rows" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="Cells" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotionInCells", propOrder = {
    "any"
})
public class MotionInCells {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    /**
     * Number of columns of the cell grid (x dimension)
     * 
     */
    @XmlAttribute(name = "Columns", required = true)
    protected BigInteger columns;
    /**
     * Number of rows of the cell grid (y dimension)
     * 
     */
    @XmlAttribute(name = "Rows", required = true)
    protected BigInteger rows;
    /**
     * A “1” denotes a cell where motion is detected and a “0” an empty cell. The
     *           first cell is in the upper left corner. Then the cell order goes first from left to right
     *           and then from up to down. If the number of cells is not a multiple of 8 the last byte is
     *           filled with zeros. The information is run length encoded according to Packbit coding in
     *           ISO 12369 (TIFF, Revision 6.0).
     * 
     */
    @XmlAttribute(name = "Cells", required = true)
    protected byte[] cells;
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
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Number of columns of the cell grid (x dimension)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getColumns()
     */
    public void setColumns(BigInteger value) {
        this.columns = value;
    }

    /**
     * Number of rows of the cell grid (y dimension)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getRows()
     */
    public void setRows(BigInteger value) {
        this.rows = value;
    }

    /**
     * A “1” denotes a cell where motion is detected and a “0” an empty cell. The
     *           first cell is in the upper left corner. Then the cell order goes first from left to right
     *           and then from up to down. If the number of cells is not a multiple of 8 the last byte is
     *           filled with zeros. The information is run length encoded according to Packbit coding in
     *           ISO 12369 (TIFF, Revision 6.0).
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCells() {
        return cells;
    }

    /**
     * Sets the value of the cells property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     * @see #getCells()
     */
    public void setCells(byte[] value) {
        this.cells = value;
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
