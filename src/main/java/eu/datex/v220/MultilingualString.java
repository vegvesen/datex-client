
package eu.datex.v220;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultilingualString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultilingualString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="values"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="value" type="{http://datex2.eu/schema/2/2_0}MultilingualStringValue" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilingualString", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "values"
})
public class MultilingualString {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected MultilingualString.Values values;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString.Values }
     *     
     */
    public MultilingualString.Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString.Values }
     *     
     */
    public void setValues(MultilingualString.Values value) {
        this.values = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="value" type="{http://datex2.eu/schema/2/2_0}MultilingualStringValue" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Values {

        @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
        protected List<MultilingualStringValue> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualStringValue }
         * 
         * 
         */
        public List<MultilingualStringValue> getValue() {
            if (value == null) {
                value = new ArrayList<MultilingualStringValue>();
            }
            return this.value;
        }

    }

}
