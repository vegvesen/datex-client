
package eu.datex.v220;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekOfMonthEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeekOfMonthEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="firstWeekOfMonth"/&gt;
 *     &lt;enumeration value="secondWeekOfMonth"/&gt;
 *     &lt;enumeration value="thirdWeekOfMonth"/&gt;
 *     &lt;enumeration value="fourthWeekOfMonth"/&gt;
 *     &lt;enumeration value="fifthWeekOfMonth"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeekOfMonthEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum WeekOfMonthEnum {

    @XmlEnumValue("firstWeekOfMonth")
    FIRST_WEEK_OF_MONTH("firstWeekOfMonth"),
    @XmlEnumValue("secondWeekOfMonth")
    SECOND_WEEK_OF_MONTH("secondWeekOfMonth"),
    @XmlEnumValue("thirdWeekOfMonth")
    THIRD_WEEK_OF_MONTH("thirdWeekOfMonth"),
    @XmlEnumValue("fourthWeekOfMonth")
    FOURTH_WEEK_OF_MONTH("fourthWeekOfMonth"),
    @XmlEnumValue("fifthWeekOfMonth")
    FIFTH_WEEK_OF_MONTH("fifthWeekOfMonth");
    private final String value;

    WeekOfMonthEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeekOfMonthEnum fromValue(String v) {
        for (WeekOfMonthEnum c: WeekOfMonthEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
