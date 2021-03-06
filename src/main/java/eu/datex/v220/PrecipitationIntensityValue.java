
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecipitationIntensityValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationIntensityValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="millimetresPerHourIntensity" type="{http://datex2.eu/schema/2/2_0}IntensityMillimetresPerHour"/&gt;
 *         &lt;element name="precipitationIntensityValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationIntensityValue", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "millimetresPerHourIntensity",
    "precipitationIntensityValueExtension"
})
public class PrecipitationIntensityValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected float millimetresPerHourIntensity;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType precipitationIntensityValueExtension;

    /**
     * Gets the value of the millimetresPerHourIntensity property.
     * 
     */
    public float getMillimetresPerHourIntensity() {
        return millimetresPerHourIntensity;
    }

    /**
     * Sets the value of the millimetresPerHourIntensity property.
     * 
     */
    public void setMillimetresPerHourIntensity(float value) {
        this.millimetresPerHourIntensity = value;
    }

    /**
     * Gets the value of the precipitationIntensityValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationIntensityValueExtension() {
        return precipitationIntensityValueExtension;
    }

    /**
     * Sets the value of the precipitationIntensityValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationIntensityValueExtension(ExtensionType value) {
        this.precipitationIntensityValueExtension = value;
    }

}
