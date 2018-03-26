
package awsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalVariations" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TotalVariationPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}VariationDimensions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "totalVariations",
    "totalVariationPages",
    "variationDimensions",
    "item"
})
@XmlRootElement(name = "Variations")
public class Variations {

    @XmlElement(name = "TotalVariations")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalVariations;
    @XmlElement(name = "TotalVariationPages")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalVariationPages;
    @XmlElement(name = "VariationDimensions")
    protected VariationDimensions variationDimensions;
    @XmlElement(name = "Item")
    protected List<Item> item;

    /**
     * Obtém o valor da propriedade totalVariations.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVariations() {
        return totalVariations;
    }

    /**
     * Define o valor da propriedade totalVariations.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVariations(BigInteger value) {
        this.totalVariations = value;
    }

    /**
     * Obtém o valor da propriedade totalVariationPages.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVariationPages() {
        return totalVariationPages;
    }

    /**
     * Define o valor da propriedade totalVariationPages.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVariationPages(BigInteger value) {
        this.totalVariationPages = value;
    }

    /**
     * Obtém o valor da propriedade variationDimensions.
     * 
     * @return
     *     possible object is
     *     {@link VariationDimensions }
     *     
     */
    public VariationDimensions getVariationDimensions() {
        return variationDimensions;
    }

    /**
     * Define o valor da propriedade variationDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationDimensions }
     *     
     */
    public void setVariationDimensions(VariationDimensions value) {
        this.variationDimensions = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

}
