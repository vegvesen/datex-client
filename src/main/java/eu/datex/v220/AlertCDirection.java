
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCDirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCDirection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCDirectionCoded" type="{http://datex2.eu/schema/2/2_0}AlertCDirectionEnum"/&gt;
 *         &lt;element name="alertCDirectionNamed" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="alertCDirectionSense" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="alertCDirectionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCDirection", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "alertCDirectionCoded",
    "alertCDirectionNamed",
    "alertCDirectionSense",
    "alertCDirectionExtension"
})
public class AlertCDirection {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected AlertCDirectionEnum alertCDirectionCoded;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString alertCDirectionNamed;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Boolean alertCDirectionSense;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType alertCDirectionExtension;

    /**
     * Gets the value of the alertCDirectionCoded property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCDirectionEnum }
     *     
     */
    public AlertCDirectionEnum getAlertCDirectionCoded() {
        return alertCDirectionCoded;
    }

    /**
     * Sets the value of the alertCDirectionCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCDirectionEnum }
     *     
     */
    public void setAlertCDirectionCoded(AlertCDirectionEnum value) {
        this.alertCDirectionCoded = value;
    }

    /**
     * Gets the value of the alertCDirectionNamed property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAlertCDirectionNamed() {
        return alertCDirectionNamed;
    }

    /**
     * Sets the value of the alertCDirectionNamed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAlertCDirectionNamed(MultilingualString value) {
        this.alertCDirectionNamed = value;
    }

    /**
     * Gets the value of the alertCDirectionSense property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertCDirectionSense() {
        return alertCDirectionSense;
    }

    /**
     * Sets the value of the alertCDirectionSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertCDirectionSense(Boolean value) {
        this.alertCDirectionSense = value;
    }

    /**
     * Gets the value of the alertCDirectionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCDirectionExtension() {
        return alertCDirectionExtension;
    }

    /**
     * Sets the value of the alertCDirectionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCDirectionExtension(ExtensionType value) {
        this.alertCDirectionExtension = value;
    }

}
