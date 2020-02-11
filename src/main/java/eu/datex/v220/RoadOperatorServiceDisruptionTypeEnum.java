
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadOperatorServiceDisruptionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadOperatorServiceDisruptionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="emergencyTelephoneNumberOutOfService"/&gt;
 *     &lt;enumeration value="informationServiceTelephoneNumberOutOfService"/&gt;
 *     &lt;enumeration value="noTrafficOfficerPatrolService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadOperatorServiceDisruptionTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum RoadOperatorServiceDisruptionTypeEnum {

    @XmlEnumValue("emergencyTelephoneNumberOutOfService")
    EMERGENCY_TELEPHONE_NUMBER_OUT_OF_SERVICE("emergencyTelephoneNumberOutOfService"),
    @XmlEnumValue("informationServiceTelephoneNumberOutOfService")
    INFORMATION_SERVICE_TELEPHONE_NUMBER_OUT_OF_SERVICE("informationServiceTelephoneNumberOutOfService"),
    @XmlEnumValue("noTrafficOfficerPatrolService")
    NO_TRAFFIC_OFFICER_PATROL_SERVICE("noTrafficOfficerPatrolService");
    private final String value;

    RoadOperatorServiceDisruptionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadOperatorServiceDisruptionTypeEnum fromValue(String v) {
        for (RoadOperatorServiceDisruptionTypeEnum c: RoadOperatorServiceDisruptionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
