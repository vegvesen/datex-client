
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedPercentile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedPercentile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehiclePercentage" type="{http://datex2.eu/schema/2/2_0}PercentageValue"/&gt;
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2/2_0}SpeedValue"/&gt;
 *         &lt;element name="speedPercentileExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedPercentile", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "vehiclePercentage",
    "speedPercentile",
    "speedPercentileExtension"
})
public class SpeedPercentile {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected PercentageValue vehiclePercentage;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected SpeedValue speedPercentile;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType speedPercentileExtension;

    /**
     * Gets the value of the vehiclePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getVehiclePercentage() {
        return vehiclePercentage;
    }

    /**
     * Sets the value of the vehiclePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setVehiclePercentage(PercentageValue value) {
        this.vehiclePercentage = value;
    }

    /**
     * Gets the value of the speedPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Sets the value of the speedPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setSpeedPercentile(SpeedValue value) {
        this.speedPercentile = value;
    }

    /**
     * Gets the value of the speedPercentileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedPercentileExtension() {
        return speedPercentileExtension;
    }

    /**
     * Sets the value of the speedPercentileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedPercentileExtension(ExtensionType value) {
        this.speedPercentileExtension = value;
    }

}
