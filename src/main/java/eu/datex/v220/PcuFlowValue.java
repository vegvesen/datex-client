
package eu.datex.v220;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PcuFlowValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PcuFlowValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pcuFlowRate" type="{http://datex2.eu/schema/2/2_0}PassengerCarUnitsPerHour"/&gt;
 *         &lt;element name="pcuFlowValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PcuFlowValue", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "pcuFlowRate",
    "pcuFlowValueExtension"
})
public class PcuFlowValue
    extends DataValue
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pcuFlowRate;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType pcuFlowValueExtension;

    /**
     * Gets the value of the pcuFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPcuFlowRate() {
        return pcuFlowRate;
    }

    /**
     * Sets the value of the pcuFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPcuFlowRate(BigInteger value) {
        this.pcuFlowRate = value;
    }

    /**
     * Gets the value of the pcuFlowValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPcuFlowValueExtension() {
        return pcuFlowValueExtension;
    }

    /**
     * Sets the value of the pcuFlowValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPcuFlowValueExtension(ExtensionType value) {
        this.pcuFlowValueExtension = value;
    }

}
