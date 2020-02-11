
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemperatureValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemperatureValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="temperature" type="{http://datex2.eu/schema/2/2_0}TemperatureCelsius"/&gt;
 *         &lt;element name="temperatureValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureValue", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "temperature",
    "temperatureValueExtension"
})
public class TemperatureValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected float temperature;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType temperatureValueExtension;

    /**
     * Gets the value of the temperature property.
     * 
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     */
    public void setTemperature(float value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the temperatureValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemperatureValueExtension() {
        return temperatureValueExtension;
    }

    /**
     * Sets the value of the temperatureValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemperatureValueExtension(ExtensionType value) {
        this.temperatureValueExtension = value;
    }

}
