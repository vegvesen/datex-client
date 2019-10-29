
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _TextPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_TextPage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsText" type="{http://datex2.eu/schema/2/2_0}VmsText"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_TextPage", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "vmsText"
})
public class TextPage {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected VmsText vmsText;
    @XmlAttribute(name = "pageNumber", required = true)
    protected int pageNumber;

    /**
     * Gets the value of the vmsText property.
     * 
     * @return
     *     possible object is
     *     {@link VmsText }
     *     
     */
    public VmsText getVmsText() {
        return vmsText;
    }

    /**
     * Sets the value of the vmsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsText }
     *     
     */
    public void setVmsText(VmsText value) {
        this.vmsText = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

}
