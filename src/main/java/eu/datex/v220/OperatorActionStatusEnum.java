
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorActionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorActionStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="requested"/&gt;
 *     &lt;enumeration value="approved"/&gt;
 *     &lt;enumeration value="beingImplemented"/&gt;
 *     &lt;enumeration value="implemented"/&gt;
 *     &lt;enumeration value="rejected"/&gt;
 *     &lt;enumeration value="terminationRequested"/&gt;
 *     &lt;enumeration value="beingTerminated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionStatusEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum OperatorActionStatusEnum {

    @XmlEnumValue("requested")
    REQUESTED("requested"),
    @XmlEnumValue("approved")
    APPROVED("approved"),
    @XmlEnumValue("beingImplemented")
    BEING_IMPLEMENTED("beingImplemented"),
    @XmlEnumValue("implemented")
    IMPLEMENTED("implemented"),
    @XmlEnumValue("rejected")
    REJECTED("rejected"),
    @XmlEnumValue("terminationRequested")
    TERMINATION_REQUESTED("terminationRequested"),
    @XmlEnumValue("beingTerminated")
    BEING_TERMINATED("beingTerminated");
    private final String value;

    OperatorActionStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionStatusEnum fromValue(String v) {
        for (OperatorActionStatusEnum c: OperatorActionStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
