
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCMethod2SecondaryPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2SecondaryPointLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/2/2_0}AlertCLocation"/&gt;
 *         &lt;element name="alertCMethod2SecondaryPointLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2SecondaryPointLocation", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "alertCLocation",
    "alertCMethod2SecondaryPointLocationExtension"
})
public class AlertCMethod2SecondaryPointLocation {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected AlertCLocation alertCLocation;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType alertCMethod2SecondaryPointLocationExtension;

    /**
     * Gets the value of the alertCLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLocation }
     *     
     */
    public AlertCLocation getAlertCLocation() {
        return alertCLocation;
    }

    /**
     * Sets the value of the alertCLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLocation }
     *     
     */
    public void setAlertCLocation(AlertCLocation value) {
        this.alertCLocation = value;
    }

    /**
     * Gets the value of the alertCMethod2SecondaryPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod2SecondaryPointLocationExtension() {
        return alertCMethod2SecondaryPointLocationExtension;
    }

    /**
     * Sets the value of the alertCMethod2SecondaryPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod2SecondaryPointLocationExtension(ExtensionType value) {
        this.alertCMethod2SecondaryPointLocationExtension = value;
    }

}
