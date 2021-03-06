
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearWithinLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearWithinLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="administrativeAreaOfLinearSection" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="directionBoundOnLinearSection" type="{http://datex2.eu/schema/2/2_0}DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="directionRelativeOnLinearSection" type="{http://datex2.eu/schema/2/2_0}LinearReferencingDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="heightGradeOfLinearSection" type="{http://datex2.eu/schema/2/2_0}HeightGradeEnum" minOccurs="0"/&gt;
 *         &lt;element name="linearElement" type="{http://datex2.eu/schema/2/2_0}LinearElement"/&gt;
 *         &lt;element name="fromPoint" type="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="toPoint" type="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="linearWithinLinearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearWithinLinearElement", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "administrativeAreaOfLinearSection",
    "directionBoundOnLinearSection",
    "directionRelativeOnLinearSection",
    "heightGradeOfLinearSection",
    "linearElement",
    "fromPoint",
    "toPoint",
    "linearWithinLinearElementExtension"
})
public class LinearWithinLinearElement {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString administrativeAreaOfLinearSection;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected DirectionEnum directionBoundOnLinearSection;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected LinearReferencingDirectionEnum directionRelativeOnLinearSection;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected HeightGradeEnum heightGradeOfLinearSection;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected LinearElement linearElement;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected DistanceAlongLinearElement fromPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected DistanceAlongLinearElement toPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType linearWithinLinearElementExtension;

    /**
     * Gets the value of the administrativeAreaOfLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdministrativeAreaOfLinearSection() {
        return administrativeAreaOfLinearSection;
    }

    /**
     * Sets the value of the administrativeAreaOfLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdministrativeAreaOfLinearSection(MultilingualString value) {
        this.administrativeAreaOfLinearSection = value;
    }

    /**
     * Gets the value of the directionBoundOnLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBoundOnLinearSection() {
        return directionBoundOnLinearSection;
    }

    /**
     * Sets the value of the directionBoundOnLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionBoundOnLinearSection(DirectionEnum value) {
        this.directionBoundOnLinearSection = value;
    }

    /**
     * Gets the value of the directionRelativeOnLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link LinearReferencingDirectionEnum }
     *     
     */
    public LinearReferencingDirectionEnum getDirectionRelativeOnLinearSection() {
        return directionRelativeOnLinearSection;
    }

    /**
     * Sets the value of the directionRelativeOnLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearReferencingDirectionEnum }
     *     
     */
    public void setDirectionRelativeOnLinearSection(LinearReferencingDirectionEnum value) {
        this.directionRelativeOnLinearSection = value;
    }

    /**
     * Gets the value of the heightGradeOfLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link HeightGradeEnum }
     *     
     */
    public HeightGradeEnum getHeightGradeOfLinearSection() {
        return heightGradeOfLinearSection;
    }

    /**
     * Sets the value of the heightGradeOfLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightGradeEnum }
     *     
     */
    public void setHeightGradeOfLinearSection(HeightGradeEnum value) {
        this.heightGradeOfLinearSection = value;
    }

    /**
     * Gets the value of the linearElement property.
     * 
     * @return
     *     possible object is
     *     {@link LinearElement }
     *     
     */
    public LinearElement getLinearElement() {
        return linearElement;
    }

    /**
     * Sets the value of the linearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearElement }
     *     
     */
    public void setLinearElement(LinearElement value) {
        this.linearElement = value;
    }

    /**
     * Gets the value of the fromPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getFromPoint() {
        return fromPoint;
    }

    /**
     * Sets the value of the fromPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setFromPoint(DistanceAlongLinearElement value) {
        this.fromPoint = value;
    }

    /**
     * Gets the value of the toPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getToPoint() {
        return toPoint;
    }

    /**
     * Sets the value of the toPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setToPoint(DistanceAlongLinearElement value) {
        this.toPoint = value;
    }

    /**
     * Gets the value of the linearWithinLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearWithinLinearElementExtension() {
        return linearWithinLinearElementExtension;
    }

    /**
     * Sets the value of the linearWithinLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearWithinLinearElementExtension(ExtensionType value) {
        this.linearWithinLinearElementExtension = value;
    }

}
