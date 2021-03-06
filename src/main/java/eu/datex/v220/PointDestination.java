
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Destination"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="point" type="{http://datex2.eu/schema/2/2_0}Point"/&gt;
 *         &lt;element name="pointDestinationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointDestination", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "point",
    "pointDestinationExtension"
})
public class PointDestination
    extends Destination
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected Point point;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType pointDestinationExtension;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setPoint(Point value) {
        this.point = value;
    }

    /**
     * Gets the value of the pointDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointDestinationExtension() {
        return pointDestinationExtension;
    }

    /**
     * Sets the value of the pointDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointDestinationExtension(ExtensionType value) {
        this.pointDestinationExtension = value;
    }

}
