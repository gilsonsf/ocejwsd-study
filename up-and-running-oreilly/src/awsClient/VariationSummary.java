
package awsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="LowestPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="HighestPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="HighestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
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
    "lowestPrice",
    "highestPrice",
    "lowestSalePrice",
    "highestSalePrice"
})
@XmlRootElement(name = "VariationSummary")
public class VariationSummary {

    @XmlElement(name = "LowestPrice")
    protected Price lowestPrice;
    @XmlElement(name = "HighestPrice")
    protected Price highestPrice;
    @XmlElement(name = "LowestSalePrice")
    protected Price lowestSalePrice;
    @XmlElement(name = "HighestSalePrice")
    protected Price highestSalePrice;

    /**
     * Obtém o valor da propriedade lowestPrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestPrice() {
        return lowestPrice;
    }

    /**
     * Define o valor da propriedade lowestPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestPrice(Price value) {
        this.lowestPrice = value;
    }

    /**
     * Obtém o valor da propriedade highestPrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getHighestPrice() {
        return highestPrice;
    }

    /**
     * Define o valor da propriedade highestPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setHighestPrice(Price value) {
        this.highestPrice = value;
    }

    /**
     * Obtém o valor da propriedade lowestSalePrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getLowestSalePrice() {
        return lowestSalePrice;
    }

    /**
     * Define o valor da propriedade lowestSalePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setLowestSalePrice(Price value) {
        this.lowestSalePrice = value;
    }

    /**
     * Obtém o valor da propriedade highestSalePrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getHighestSalePrice() {
        return highestSalePrice;
    }

    /**
     * Define o valor da propriedade highestSalePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setHighestSalePrice(Price value) {
        this.highestSalePrice = value;
    }

}
