
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}BasicData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="trafficDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficData", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "forVehiclesWithCharacteristicsOf",
    "trafficDataExtension"
})
@XmlSeeAlso({
    IndividualVehicleDataValues.class,
    TrafficConcentration.class,
    TrafficFlow.class,
    TrafficHeadway.class,
    TrafficSpeed.class
})
public abstract class TrafficData
    extends BasicData
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected VehicleCharacteristics forVehiclesWithCharacteristicsOf;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType trafficDataExtension;

    /**
     * Gets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getForVehiclesWithCharacteristicsOf() {
        return forVehiclesWithCharacteristicsOf;
    }

    /**
     * Sets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        this.forVehiclesWithCharacteristicsOf = value;
    }

    /**
     * Gets the value of the trafficDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficDataExtension() {
        return trafficDataExtension;
    }

    /**
     * Sets the value of the trafficDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficDataExtension(ExtensionType value) {
        this.trafficDataExtension = value;
    }

}
