
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericPublicationName" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="genericPublicationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPublication", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "genericPublicationName",
    "genericPublicationExtension"
})
public class GenericPublication
    extends PayloadPublication
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected String genericPublicationName;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType genericPublicationExtension;

    /**
     * Gets the value of the genericPublicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericPublicationName() {
        return genericPublicationName;
    }

    /**
     * Sets the value of the genericPublicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericPublicationName(String value) {
        this.genericPublicationName = value;
    }

    /**
     * Gets the value of the genericPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGenericPublicationExtension() {
        return genericPublicationExtension;
    }

    /**
     * Sets the value of the genericPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGenericPublicationExtension(ExtensionType value) {
        this.genericPublicationExtension = value;
    }

}
