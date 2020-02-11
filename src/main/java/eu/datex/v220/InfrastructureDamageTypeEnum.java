
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfrastructureDamageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InfrastructureDamageTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="burstPipe"/&gt;
 *     &lt;enumeration value="burstWaterMain"/&gt;
 *     &lt;enumeration value="collapsedSewer"/&gt;
 *     &lt;enumeration value="damagedBridge"/&gt;
 *     &lt;enumeration value="damagedCrashBarrier"/&gt;
 *     &lt;enumeration value="damagedFlyover"/&gt;
 *     &lt;enumeration value="damagedGallery"/&gt;
 *     &lt;enumeration value="damagedGantry"/&gt;
 *     &lt;enumeration value="damagedRoadSurface"/&gt;
 *     &lt;enumeration value="damagedTunnel"/&gt;
 *     &lt;enumeration value="damagedViaduct"/&gt;
 *     &lt;enumeration value="fallenPowerCables"/&gt;
 *     &lt;enumeration value="gasLeak"/&gt;
 *     &lt;enumeration value="weakBridge"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InfrastructureDamageTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum InfrastructureDamageTypeEnum {

    @XmlEnumValue("burstPipe")
    BURST_PIPE("burstPipe"),
    @XmlEnumValue("burstWaterMain")
    BURST_WATER_MAIN("burstWaterMain"),
    @XmlEnumValue("collapsedSewer")
    COLLAPSED_SEWER("collapsedSewer"),
    @XmlEnumValue("damagedBridge")
    DAMAGED_BRIDGE("damagedBridge"),
    @XmlEnumValue("damagedCrashBarrier")
    DAMAGED_CRASH_BARRIER("damagedCrashBarrier"),
    @XmlEnumValue("damagedFlyover")
    DAMAGED_FLYOVER("damagedFlyover"),
    @XmlEnumValue("damagedGallery")
    DAMAGED_GALLERY("damagedGallery"),
    @XmlEnumValue("damagedGantry")
    DAMAGED_GANTRY("damagedGantry"),
    @XmlEnumValue("damagedRoadSurface")
    DAMAGED_ROAD_SURFACE("damagedRoadSurface"),
    @XmlEnumValue("damagedTunnel")
    DAMAGED_TUNNEL("damagedTunnel"),
    @XmlEnumValue("damagedViaduct")
    DAMAGED_VIADUCT("damagedViaduct"),
    @XmlEnumValue("fallenPowerCables")
    FALLEN_POWER_CABLES("fallenPowerCables"),
    @XmlEnumValue("gasLeak")
    GAS_LEAK("gasLeak"),
    @XmlEnumValue("weakBridge")
    WEAK_BRIDGE("weakBridge"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    InfrastructureDamageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfrastructureDamageTypeEnum fromValue(String v) {
        for (InfrastructureDamageTypeEnum c: InfrastructureDamageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
