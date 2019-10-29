
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedLocationContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationContainerExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationContainer", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "predefinedLocationContainerExtension"
})
@XmlSeeAlso({
    PredefinedItinerary.class,
    PredefinedLocation.class,
    PredefinedNonOrderedLocationGroup.class
})
public abstract class PredefinedLocationContainer {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType predefinedLocationContainerExtension;

    /**
     * Gets the value of the predefinedLocationContainerExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationContainerExtension() {
        return predefinedLocationContainerExtension;
    }

    /**
     * Sets the value of the predefinedLocationContainerExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationContainerExtension(ExtensionType value) {
        this.predefinedLocationContainerExtension = value;
    }

}
