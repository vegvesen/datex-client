
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceAlongLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distanceAlongLinearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceAlongLinearElement", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "distanceAlongLinearElementExtension"
})
@XmlSeeAlso({
    DistanceFromLinearElementReferent.class,
    DistanceFromLinearElementStart.class,
    PercentageDistanceAlongLinearElement.class
})
public abstract class DistanceAlongLinearElement {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType distanceAlongLinearElementExtension;

    /**
     * Gets the value of the distanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDistanceAlongLinearElementExtension() {
        return distanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the distanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDistanceAlongLinearElementExtension(ExtensionType value) {
        this.distanceAlongLinearElementExtension = value;
    }

}
