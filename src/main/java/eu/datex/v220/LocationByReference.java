
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedLocationReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedLocationVersionedReference"/&gt;
 *         &lt;element name="locationByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationByReference", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "predefinedLocationReference",
    "locationByReferenceExtension"
})
public class LocationByReference
    extends Location
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected PredefinedLocationVersionedReference predefinedLocationReference;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType locationByReferenceExtension;

    /**
     * Gets the value of the predefinedLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedLocationVersionedReference }
     *     
     */
    public PredefinedLocationVersionedReference getPredefinedLocationReference() {
        return predefinedLocationReference;
    }

    /**
     * Sets the value of the predefinedLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedLocationVersionedReference }
     *     
     */
    public void setPredefinedLocationReference(PredefinedLocationVersionedReference value) {
        this.predefinedLocationReference = value;
    }

    /**
     * Gets the value of the locationByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationByReferenceExtension() {
        return locationByReferenceExtension;
    }

    /**
     * Sets the value of the locationByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationByReferenceExtension(ExtensionType value) {
        this.locationByReferenceExtension = value;
    }

}
