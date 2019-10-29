
package eu.datex.v220;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxleWeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxleWeight"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="axlePositionIdentifier" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/&gt;
 *         &lt;element name="axleWeight" type="{http://datex2.eu/schema/2/2_0}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="maximumPermittedAxleWeight" type="{http://datex2.eu/schema/2/2_0}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="axleWeightExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleWeight", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "axlePositionIdentifier",
    "axleWeight",
    "maximumPermittedAxleWeight",
    "axleWeightExtension"
})
public class AxleWeight {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger axlePositionIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float axleWeight;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float maximumPermittedAxleWeight;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType axleWeightExtension;

    /**
     * Gets the value of the axlePositionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxlePositionIdentifier() {
        return axlePositionIdentifier;
    }

    /**
     * Sets the value of the axlePositionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxlePositionIdentifier(BigInteger value) {
        this.axlePositionIdentifier = value;
    }

    /**
     * Gets the value of the axleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAxleWeight() {
        return axleWeight;
    }

    /**
     * Sets the value of the axleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxleWeight(Float value) {
        this.axleWeight = value;
    }

    /**
     * Gets the value of the maximumPermittedAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumPermittedAxleWeight() {
        return maximumPermittedAxleWeight;
    }

    /**
     * Sets the value of the maximumPermittedAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumPermittedAxleWeight(Float value) {
        this.maximumPermittedAxleWeight = value;
    }

    /**
     * Gets the value of the axleWeightExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleWeightExtension() {
        return axleWeightExtension;
    }

    /**
     * Sets the value of the axleWeightExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleWeightExtension(ExtensionType value) {
        this.axleWeightExtension = value;
    }

}