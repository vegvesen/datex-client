
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficFlow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axleFlow" type="{http://datex2.eu/schema/2/2_0}AxleFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="pcuFlow" type="{http://datex2.eu/schema/2/2_0}PcuFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="percentageLongVehicles" type="{http://datex2.eu/schema/2/2_0}PercentageValue" minOccurs="0"/&gt;
 *         &lt;element name="vehicleFlow" type="{http://datex2.eu/schema/2/2_0}VehicleFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="trafficFlowExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficFlow", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "axleFlow",
    "pcuFlow",
    "percentageLongVehicles",
    "vehicleFlow",
    "trafficFlowExtension"
})
public class TrafficFlow
    extends TrafficData
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected AxleFlowValue axleFlow;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected PcuFlowValue pcuFlow;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected PercentageValue percentageLongVehicles;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected VehicleFlowValue vehicleFlow;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType trafficFlowExtension;

    /**
     * Gets the value of the axleFlow property.
     * 
     * @return
     *     possible object is
     *     {@link AxleFlowValue }
     *     
     */
    public AxleFlowValue getAxleFlow() {
        return axleFlow;
    }

    /**
     * Sets the value of the axleFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxleFlowValue }
     *     
     */
    public void setAxleFlow(AxleFlowValue value) {
        this.axleFlow = value;
    }

    /**
     * Gets the value of the pcuFlow property.
     * 
     * @return
     *     possible object is
     *     {@link PcuFlowValue }
     *     
     */
    public PcuFlowValue getPcuFlow() {
        return pcuFlow;
    }

    /**
     * Sets the value of the pcuFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link PcuFlowValue }
     *     
     */
    public void setPcuFlow(PcuFlowValue value) {
        this.pcuFlow = value;
    }

    /**
     * Gets the value of the percentageLongVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getPercentageLongVehicles() {
        return percentageLongVehicles;
    }

    /**
     * Sets the value of the percentageLongVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setPercentageLongVehicles(PercentageValue value) {
        this.percentageLongVehicles = value;
    }

    /**
     * Gets the value of the vehicleFlow property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFlowValue }
     *     
     */
    public VehicleFlowValue getVehicleFlow() {
        return vehicleFlow;
    }

    /**
     * Sets the value of the vehicleFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFlowValue }
     *     
     */
    public void setVehicleFlow(VehicleFlowValue value) {
        this.vehicleFlow = value;
    }

    /**
     * Gets the value of the trafficFlowExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficFlowExtension() {
        return trafficFlowExtension;
    }

    /**
     * Sets the value of the trafficFlowExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficFlowExtension(ExtensionType value) {
        this.trafficFlowExtension = value;
    }

}
