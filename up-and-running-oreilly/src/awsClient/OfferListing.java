
package awsClient;

import java.math.BigInteger;
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
 *         &lt;element name="OfferListingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="AmountSaved" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="PercentageSaved" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailabilityAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IsPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="MinimumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="MaximumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IsEligibleForSuperSaverShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEligibleForPrime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "offerListingId",
    "price",
    "salePrice",
    "amountSaved",
    "percentageSaved",
    "availability",
    "availabilityAttributes",
    "isEligibleForSuperSaverShipping",
    "isEligibleForPrime"
})
@XmlRootElement(name = "OfferListing")
public class OfferListing {

    @XmlElement(name = "OfferListingId")
    protected String offerListingId;
    @XmlElement(name = "Price")
    protected Price price;
    @XmlElement(name = "SalePrice")
    protected Price salePrice;
    @XmlElement(name = "AmountSaved")
    protected Price amountSaved;
    @XmlElement(name = "PercentageSaved")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger percentageSaved;
    @XmlElement(name = "Availability")
    protected String availability;
    @XmlElement(name = "AvailabilityAttributes")
    protected OfferListing.AvailabilityAttributes availabilityAttributes;
    @XmlElement(name = "IsEligibleForSuperSaverShipping")
    protected Boolean isEligibleForSuperSaverShipping;
    @XmlElement(name = "IsEligibleForPrime")
    protected Boolean isEligibleForPrime;

    /**
     * Obtém o valor da propriedade offerListingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferListingId() {
        return offerListingId;
    }

    /**
     * Define o valor da propriedade offerListingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferListingId(String value) {
        this.offerListingId = value;
    }

    /**
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade salePrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getSalePrice() {
        return salePrice;
    }

    /**
     * Define o valor da propriedade salePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setSalePrice(Price value) {
        this.salePrice = value;
    }

    /**
     * Obtém o valor da propriedade amountSaved.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getAmountSaved() {
        return amountSaved;
    }

    /**
     * Define o valor da propriedade amountSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setAmountSaved(Price value) {
        this.amountSaved = value;
    }

    /**
     * Obtém o valor da propriedade percentageSaved.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentageSaved() {
        return percentageSaved;
    }

    /**
     * Define o valor da propriedade percentageSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentageSaved(BigInteger value) {
        this.percentageSaved = value;
    }

    /**
     * Obtém o valor da propriedade availability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Define o valor da propriedade availability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Obtém o valor da propriedade availabilityAttributes.
     * 
     * @return
     *     possible object is
     *     {@link OfferListing.AvailabilityAttributes }
     *     
     */
    public OfferListing.AvailabilityAttributes getAvailabilityAttributes() {
        return availabilityAttributes;
    }

    /**
     * Define o valor da propriedade availabilityAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferListing.AvailabilityAttributes }
     *     
     */
    public void setAvailabilityAttributes(OfferListing.AvailabilityAttributes value) {
        this.availabilityAttributes = value;
    }

    /**
     * Obtém o valor da propriedade isEligibleForSuperSaverShipping.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForSuperSaverShipping() {
        return isEligibleForSuperSaverShipping;
    }

    /**
     * Define o valor da propriedade isEligibleForSuperSaverShipping.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForSuperSaverShipping(Boolean value) {
        this.isEligibleForSuperSaverShipping = value;
    }

    /**
     * Obtém o valor da propriedade isEligibleForPrime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForPrime() {
        return isEligibleForPrime;
    }

    /**
     * Define o valor da propriedade isEligibleForPrime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForPrime(Boolean value) {
        this.isEligibleForPrime = value;
    }


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
     *         &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IsPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="MinimumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="MaximumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
        "availabilityType",
        "isPreorder",
        "minimumHours",
        "maximumHours"
    })
    public static class AvailabilityAttributes {

        @XmlElement(name = "AvailabilityType")
        protected String availabilityType;
        @XmlElement(name = "IsPreorder")
        protected Boolean isPreorder;
        @XmlElement(name = "MinimumHours")
        protected BigInteger minimumHours;
        @XmlElement(name = "MaximumHours")
        protected BigInteger maximumHours;

        /**
         * Obtém o valor da propriedade availabilityType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailabilityType() {
            return availabilityType;
        }

        /**
         * Define o valor da propriedade availabilityType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailabilityType(String value) {
            this.availabilityType = value;
        }

        /**
         * Obtém o valor da propriedade isPreorder.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsPreorder() {
            return isPreorder;
        }

        /**
         * Define o valor da propriedade isPreorder.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPreorder(Boolean value) {
            this.isPreorder = value;
        }

        /**
         * Obtém o valor da propriedade minimumHours.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumHours() {
            return minimumHours;
        }

        /**
         * Define o valor da propriedade minimumHours.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumHours(BigInteger value) {
            this.minimumHours = value;
        }

        /**
         * Obtém o valor da propriedade maximumHours.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumHours() {
            return maximumHours;
        }

        /**
         * Define o valor da propriedade maximumHours.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumHours(BigInteger value) {
            this.maximumHours = value;
        }

    }

}
