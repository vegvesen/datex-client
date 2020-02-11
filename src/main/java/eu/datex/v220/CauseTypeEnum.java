
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CauseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CauseTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accident"/&gt;
 *     &lt;enumeration value="congestion"/&gt;
 *     &lt;enumeration value="earlierAccident"/&gt;
 *     &lt;enumeration value="earlierEvent"/&gt;
 *     &lt;enumeration value="earlierIncident"/&gt;
 *     &lt;enumeration value="equipmentFailure"/&gt;
 *     &lt;enumeration value="excessiveHeat"/&gt;
 *     &lt;enumeration value="frost"/&gt;
 *     &lt;enumeration value="holidayTraffic"/&gt;
 *     &lt;enumeration value="infrastructureFailure"/&gt;
 *     &lt;enumeration value="largeNumbersOfVisitors"/&gt;
 *     &lt;enumeration value="obstruction"/&gt;
 *     &lt;enumeration value="pollutionAlert"/&gt;
 *     &lt;enumeration value="poorWeather"/&gt;
 *     &lt;enumeration value="problemsAtBorderPost"/&gt;
 *     &lt;enumeration value="problemsAtCustomPost"/&gt;
 *     &lt;enumeration value="problemsOnLocalRoads"/&gt;
 *     &lt;enumeration value="radioactiveLeakAlert"/&gt;
 *     &lt;enumeration value="roadsideEvent"/&gt;
 *     &lt;enumeration value="rubberNecking"/&gt;
 *     &lt;enumeration value="securityIncident"/&gt;
 *     &lt;enumeration value="shearWeightOfTraffic"/&gt;
 *     &lt;enumeration value="technicalProblems"/&gt;
 *     &lt;enumeration value="terrorism"/&gt;
 *     &lt;enumeration value="toxicCloudAlert"/&gt;
 *     &lt;enumeration value="vandalism"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CauseTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum CauseTypeEnum {

    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("congestion")
    CONGESTION("congestion"),
    @XmlEnumValue("earlierAccident")
    EARLIER_ACCIDENT("earlierAccident"),
    @XmlEnumValue("earlierEvent")
    EARLIER_EVENT("earlierEvent"),
    @XmlEnumValue("earlierIncident")
    EARLIER_INCIDENT("earlierIncident"),
    @XmlEnumValue("equipmentFailure")
    EQUIPMENT_FAILURE("equipmentFailure"),
    @XmlEnumValue("excessiveHeat")
    EXCESSIVE_HEAT("excessiveHeat"),
    @XmlEnumValue("frost")
    FROST("frost"),
    @XmlEnumValue("holidayTraffic")
    HOLIDAY_TRAFFIC("holidayTraffic"),
    @XmlEnumValue("infrastructureFailure")
    INFRASTRUCTURE_FAILURE("infrastructureFailure"),
    @XmlEnumValue("largeNumbersOfVisitors")
    LARGE_NUMBERS_OF_VISITORS("largeNumbersOfVisitors"),
    @XmlEnumValue("obstruction")
    OBSTRUCTION("obstruction"),
    @XmlEnumValue("pollutionAlert")
    POLLUTION_ALERT("pollutionAlert"),
    @XmlEnumValue("poorWeather")
    POOR_WEATHER("poorWeather"),
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),
    @XmlEnumValue("problemsAtCustomPost")
    PROBLEMS_AT_CUSTOM_POST("problemsAtCustomPost"),
    @XmlEnumValue("problemsOnLocalRoads")
    PROBLEMS_ON_LOCAL_ROADS("problemsOnLocalRoads"),
    @XmlEnumValue("radioactiveLeakAlert")
    RADIOACTIVE_LEAK_ALERT("radioactiveLeakAlert"),
    @XmlEnumValue("roadsideEvent")
    ROADSIDE_EVENT("roadsideEvent"),
    @XmlEnumValue("rubberNecking")
    RUBBER_NECKING("rubberNecking"),
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),
    @XmlEnumValue("shearWeightOfTraffic")
    SHEAR_WEIGHT_OF_TRAFFIC("shearWeightOfTraffic"),
    @XmlEnumValue("technicalProblems")
    TECHNICAL_PROBLEMS("technicalProblems"),
    @XmlEnumValue("terrorism")
    TERRORISM("terrorism"),
    @XmlEnumValue("toxicCloudAlert")
    TOXIC_CLOUD_ALERT("toxicCloudAlert"),
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CauseTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CauseTypeEnum fromValue(String v) {
        for (CauseTypeEnum c: CauseTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
