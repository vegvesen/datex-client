
package eu.datex.v220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideServiceDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideServiceDisruption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideServiceDisruptionType" type="{http://datex2.eu/schema/2/2_0}RoadsideServiceDisruptionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="roadsideServiceDisruptionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideServiceDisruption", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "roadsideServiceDisruptionType",
    "roadsideServiceDisruptionExtension"
})
public class RoadsideServiceDisruption
    extends NonRoadEventInformation
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected List<RoadsideServiceDisruptionTypeEnum> roadsideServiceDisruptionType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType roadsideServiceDisruptionExtension;

    /**
     * Gets the value of the roadsideServiceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadsideServiceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadsideServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadsideServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<RoadsideServiceDisruptionTypeEnum> getRoadsideServiceDisruptionType() {
        if (roadsideServiceDisruptionType == null) {
            roadsideServiceDisruptionType = new ArrayList<RoadsideServiceDisruptionTypeEnum>();
        }
        return this.roadsideServiceDisruptionType;
    }

    /**
     * Gets the value of the roadsideServiceDisruptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideServiceDisruptionExtension() {
        return roadsideServiceDisruptionExtension;
    }

    /**
     * Sets the value of the roadsideServiceDisruptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideServiceDisruptionExtension(ExtensionType value) {
        this.roadsideServiceDisruptionExtension = value;
    }

}
