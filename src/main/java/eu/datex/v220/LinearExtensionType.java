
package eu.datex.v220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for _LinearExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_LinearExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="linearLineStringExtension" type="{http://datex2.eu/schema/2/2_0}LinearLineStringExtension" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_LinearExtensionType", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "linearLineStringExtension",
    "any"
})
public class LinearExtensionType {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected LinearLineStringExtension linearLineStringExtension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the linearLineStringExtension property.
     * 
     * @return
     *     possible object is
     *     {@link LinearLineStringExtension }
     *     
     */
    public LinearLineStringExtension getLinearLineStringExtension() {
        return linearLineStringExtension;
    }

    /**
     * Sets the value of the linearLineStringExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearLineStringExtension }
     *     
     */
    public void setLinearLineStringExtension(LinearLineStringExtension value) {
        this.linearLineStringExtension = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
