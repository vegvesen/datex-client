
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentOrSystemFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentOrSystemFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentOrSystemFaultType" type="{http://datex2.eu/schema/2/2_0}EquipmentOrSystemFaultTypeEnum"/&gt;
 *         &lt;element name="faultyEquipmentOrSystemType" type="{http://datex2.eu/schema/2/2_0}EquipmentOrSystemTypeEnum"/&gt;
 *         &lt;element name="equipmentOrSystemFaultExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentOrSystemFault", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "equipmentOrSystemFaultType",
    "faultyEquipmentOrSystemType",
    "equipmentOrSystemFaultExtension"
})
public class EquipmentOrSystemFault
    extends TrafficElement
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected EquipmentOrSystemFaultTypeEnum equipmentOrSystemFaultType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected EquipmentOrSystemTypeEnum faultyEquipmentOrSystemType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType equipmentOrSystemFaultExtension;

    /**
     * Gets the value of the equipmentOrSystemFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public EquipmentOrSystemFaultTypeEnum getEquipmentOrSystemFaultType() {
        return equipmentOrSystemFaultType;
    }

    /**
     * Sets the value of the equipmentOrSystemFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOrSystemFaultTypeEnum }
     *     
     */
    public void setEquipmentOrSystemFaultType(EquipmentOrSystemFaultTypeEnum value) {
        this.equipmentOrSystemFaultType = value;
    }

    /**
     * Gets the value of the faultyEquipmentOrSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentOrSystemTypeEnum }
     *     
     */
    public EquipmentOrSystemTypeEnum getFaultyEquipmentOrSystemType() {
        return faultyEquipmentOrSystemType;
    }

    /**
     * Sets the value of the faultyEquipmentOrSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentOrSystemTypeEnum }
     *     
     */
    public void setFaultyEquipmentOrSystemType(EquipmentOrSystemTypeEnum value) {
        this.faultyEquipmentOrSystemType = value;
    }

    /**
     * Gets the value of the equipmentOrSystemFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEquipmentOrSystemFaultExtension() {
        return equipmentOrSystemFaultExtension;
    }

    /**
     * Sets the value of the equipmentOrSystemFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEquipmentOrSystemFaultExtension(ExtensionType value) {
        this.equipmentOrSystemFaultExtension = value;
    }

}
