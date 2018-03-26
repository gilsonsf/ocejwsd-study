
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
 *         &lt;element name="Summary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EligibilityRequirementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BenefitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "summary"
})
@XmlRootElement(name = "Promotion")
public class Promotion {

    @XmlElement(name = "Summary")
    protected Promotion.Summary summary;

    /**
     * Obtém o valor da propriedade summary.
     * 
     * @return
     *     possible object is
     *     {@link Promotion.Summary }
     *     
     */
    public Promotion.Summary getSummary() {
        return summary;
    }

    /**
     * Define o valor da propriedade summary.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion.Summary }
     *     
     */
    public void setSummary(Promotion.Summary value) {
        this.summary = value;
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
     *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EligibilityRequirementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BenefitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "promotionId",
        "category",
        "startDate",
        "endDate",
        "eligibilityRequirementDescription",
        "benefitDescription",
        "termsAndConditions"
    })
    public static class Summary {

        @XmlElement(name = "PromotionId", required = true)
        protected String promotionId;
        @XmlElement(name = "Category")
        protected String category;
        @XmlElement(name = "StartDate")
        protected String startDate;
        @XmlElement(name = "EndDate")
        protected String endDate;
        @XmlElement(name = "EligibilityRequirementDescription")
        protected String eligibilityRequirementDescription;
        @XmlElement(name = "BenefitDescription")
        protected String benefitDescription;
        @XmlElement(name = "TermsAndConditions")
        protected String termsAndConditions;

        /**
         * Obtém o valor da propriedade promotionId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionId() {
            return promotionId;
        }

        /**
         * Define o valor da propriedade promotionId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionId(String value) {
            this.promotionId = value;
        }

        /**
         * Obtém o valor da propriedade category.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Define o valor da propriedade category.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Obtém o valor da propriedade startDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDate() {
            return startDate;
        }

        /**
         * Define o valor da propriedade startDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDate(String value) {
            this.startDate = value;
        }

        /**
         * Obtém o valor da propriedade endDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * Define o valor da propriedade endDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

        /**
         * Obtém o valor da propriedade eligibilityRequirementDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEligibilityRequirementDescription() {
            return eligibilityRequirementDescription;
        }

        /**
         * Define o valor da propriedade eligibilityRequirementDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEligibilityRequirementDescription(String value) {
            this.eligibilityRequirementDescription = value;
        }

        /**
         * Obtém o valor da propriedade benefitDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBenefitDescription() {
            return benefitDescription;
        }

        /**
         * Define o valor da propriedade benefitDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBenefitDescription(String value) {
            this.benefitDescription = value;
        }

        /**
         * Obtém o valor da propriedade termsAndConditions.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermsAndConditions() {
            return termsAndConditions;
        }

        /**
         * Define o valor da propriedade termsAndConditions.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermsAndConditions(String value) {
            this.termsAndConditions = value;
        }

    }

}
