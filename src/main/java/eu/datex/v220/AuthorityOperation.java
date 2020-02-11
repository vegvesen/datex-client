
package eu.datex.v220;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorityOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorityOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Activity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorityOperationType" type="{http://datex2.eu/schema/2/2_0}AuthorityOperationTypeEnum"/&gt;
 *         &lt;element name="authorityOperationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityOperation", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "authorityOperationType",
    "authorityOperationExtension"
})
public class AuthorityOperation
    extends Activity
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected AuthorityOperationTypeEnum authorityOperationType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType authorityOperationExtension;

    /**
     * Gets the value of the authorityOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public AuthorityOperationTypeEnum getAuthorityOperationType() {
        return authorityOperationType;
    }

    /**
     * Sets the value of the authorityOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public void setAuthorityOperationType(AuthorityOperationTypeEnum value) {
        this.authorityOperationType = value;
    }

    /**
     * Gets the value of the authorityOperationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAuthorityOperationExtension() {
        return authorityOperationExtension;
    }

    /**
     * Sets the value of the authorityOperationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAuthorityOperationExtension(ExtensionType value) {
        this.authorityOperationExtension = value;
    }

}
