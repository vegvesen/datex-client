
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaOfInterestEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaOfInterestEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="continentWide"/&gt;
 *     &lt;enumeration value="national"/&gt;
 *     &lt;enumeration value="neighbouringCountries"/&gt;
 *     &lt;enumeration value="notSpecified"/&gt;
 *     &lt;enumeration value="regional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AreaOfInterestEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum AreaOfInterestEnum {

    @XmlEnumValue("continentWide")
    CONTINENT_WIDE("continentWide"),
    @XmlEnumValue("national")
    NATIONAL("national"),
    @XmlEnumValue("neighbouringCountries")
    NEIGHBOURING_COUNTRIES("neighbouringCountries"),
    @XmlEnumValue("notSpecified")
    NOT_SPECIFIED("notSpecified"),
    @XmlEnumValue("regional")
    REGIONAL("regional");
    private final String value;

    AreaOfInterestEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaOfInterestEnum fromValue(String v) {
        for (AreaOfInterestEnum c: AreaOfInterestEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
