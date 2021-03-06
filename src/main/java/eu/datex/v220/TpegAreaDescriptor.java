
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegAreaDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegAreaDescriptorType" type="{http://datex2.eu/schema/2/2_0}TpegLoc03AreaDescriptorSubtypeEnum"/&gt;
 *         &lt;element name="tpegAreaDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaDescriptor", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "tpegAreaDescriptorType",
    "tpegAreaDescriptorExtension"
})
public class TpegAreaDescriptor
    extends TpegDescriptor
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03AreaDescriptorSubtypeEnum tpegAreaDescriptorType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType tpegAreaDescriptorExtension;

    /**
     * Gets the value of the tpegAreaDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03AreaDescriptorSubtypeEnum getTpegAreaDescriptorType() {
        return tpegAreaDescriptorType;
    }

    /**
     * Sets the value of the tpegAreaDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public void setTpegAreaDescriptorType(TpegLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegAreaDescriptorType = value;
    }

    /**
     * Gets the value of the tpegAreaDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegAreaDescriptorExtension() {
        return tpegAreaDescriptorExtension;
    }

    /**
     * Sets the value of the tpegAreaDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegAreaDescriptorExtension(ExtensionType value) {
        this.tpegAreaDescriptorExtension = value;
    }

}
