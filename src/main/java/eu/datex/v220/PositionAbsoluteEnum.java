
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionAbsoluteEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionAbsoluteEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="onLeft"/&gt;
 *     &lt;enumeration value="onRight"/&gt;
 *     &lt;enumeration value="atTop"/&gt;
 *     &lt;enumeration value="atBottom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionAbsoluteEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum PositionAbsoluteEnum {

    @XmlEnumValue("onLeft")
    ON_LEFT("onLeft"),
    @XmlEnumValue("onRight")
    ON_RIGHT("onRight"),
    @XmlEnumValue("atTop")
    AT_TOP("atTop"),
    @XmlEnumValue("atBottom")
    AT_BOTTOM("atBottom");
    private final String value;

    PositionAbsoluteEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionAbsoluteEnum fromValue(String v) {
        for (PositionAbsoluteEnum c: PositionAbsoluteEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
