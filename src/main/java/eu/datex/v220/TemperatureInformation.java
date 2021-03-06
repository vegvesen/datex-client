
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemperatureInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemperatureInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temperature" type="{http://datex2.eu/schema/2/2_0}Temperature"/&gt;
 *         &lt;element name="temperatureInformationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureInformation", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "temperature",
    "temperatureInformationExtension"
})
public class TemperatureInformation
    extends WeatherData
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected Temperature temperature;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType temperatureInformationExtension;

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the temperatureInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemperatureInformationExtension() {
        return temperatureInformationExtension;
    }

    /**
     * Sets the value of the temperatureInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemperatureInformationExtension(ExtensionType value) {
        this.temperatureInformationExtension = value;
    }

}
