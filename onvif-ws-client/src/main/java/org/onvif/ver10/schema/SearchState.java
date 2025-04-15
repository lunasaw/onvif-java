
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;SearchState的 Java 类。
 * 
 * &lt;p&gt;以下模式片段指定包含在此类中的预期内容。
 * &lt;pre&gt;
 * &amp;lt;simpleType name="SearchState"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Queued"/&amp;gt;
 *     &amp;lt;enumeration value="Searching"/&amp;gt;
 *     &amp;lt;enumeration value="Completed"/&amp;gt;
 *     &amp;lt;enumeration value="Unknown"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "SearchState")
@XmlEnum
public enum SearchState {


    /**
     * The search is queued and not yet started.
     * 
     */
    @XmlEnumValue("Queued")
    QUEUED("Queued"),

    /**
     * The search is underway and not yet completed.
     * 
     */
    @XmlEnumValue("Searching")
    SEARCHING("Searching"),

    /**
     * The search has been completed and no new results will be found.
     *           
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * The state of the search is unknown. (This is not a valid response from
     *             GetSearchState.)
     *           
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SearchState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchState fromValue(String v) {
        for (SearchState c: SearchState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
