
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearLineStringExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearLineStringExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gmlLineString" type="{http://datex2.eu/schema/2/2_0}GMLLineString"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearLineStringExtension", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "gmlLineString"
})
public class LinearLineStringExtension {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected GMLLineString gmlLineString;

    /**
     * Gets the value of the gmlLineString property.
     * 
     * @return
     *     possible object is
     *     {@link GMLLineString }
     *     
     */
    public GMLLineString getGmlLineString() {
        return gmlLineString;
    }

    /**
     * Sets the value of the gmlLineString property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLLineString }
     *     
     */
    public void setGmlLineString(GMLLineString value) {
        this.gmlLineString = value;
    }

}
