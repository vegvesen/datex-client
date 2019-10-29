
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonOrderedLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOrderedLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}GroupOfLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonOrderedLocationsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOrderedLocations", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "nonOrderedLocationsExtension"
})
@XmlSeeAlso({
    NonOrderedLocationGroupByList.class,
    NonOrderedLocationGroupByReference.class
})
public abstract class NonOrderedLocations
    extends GroupOfLocations
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType nonOrderedLocationsExtension;

    /**
     * Gets the value of the nonOrderedLocationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonOrderedLocationsExtension() {
        return nonOrderedLocationsExtension;
    }

    /**
     * Sets the value of the nonOrderedLocationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonOrderedLocationsExtension(ExtensionType value) {
        this.nonOrderedLocationsExtension = value;
    }

}
