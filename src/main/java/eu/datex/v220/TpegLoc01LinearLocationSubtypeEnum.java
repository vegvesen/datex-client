
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc01LinearLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc01LinearLocationSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="segment"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01LinearLocationSubtypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum TpegLoc01LinearLocationSubtypeEnum {

    @XmlEnumValue("segment")
    SEGMENT("segment");
    private final String value;

    TpegLoc01LinearLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01LinearLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01LinearLocationSubtypeEnum c: TpegLoc01LinearLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
