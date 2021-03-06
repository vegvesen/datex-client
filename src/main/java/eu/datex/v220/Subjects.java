
package eu.datex.v220;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subjects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subjectTypeOfWorks" type="{http://datex2.eu/schema/2/2_0}SubjectTypeOfWorksEnum"/&gt;
 *         &lt;element name="numberOfSubjects" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="subjectsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subjects", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "subjectTypeOfWorks",
    "numberOfSubjects",
    "subjectsExtension"
})
public class Subjects {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected SubjectTypeOfWorksEnum subjectTypeOfWorks;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSubjects;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType subjectsExtension;

    /**
     * Gets the value of the subjectTypeOfWorks property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public SubjectTypeOfWorksEnum getSubjectTypeOfWorks() {
        return subjectTypeOfWorks;
    }

    /**
     * Sets the value of the subjectTypeOfWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public void setSubjectTypeOfWorks(SubjectTypeOfWorksEnum value) {
        this.subjectTypeOfWorks = value;
    }

    /**
     * Gets the value of the numberOfSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSubjects() {
        return numberOfSubjects;
    }

    /**
     * Sets the value of the numberOfSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSubjects(BigInteger value) {
        this.numberOfSubjects = value;
    }

    /**
     * Gets the value of the subjectsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSubjectsExtension() {
        return subjectsExtension;
    }

    /**
     * Sets the value of the subjectsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSubjectsExtension(ExtensionType value) {
        this.subjectsExtension = value;
    }

}
