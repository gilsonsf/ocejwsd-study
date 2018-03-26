
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
 *         &lt;element name="SearchIndex" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IndexName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Results" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="Pages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CorrectedQuery" minOccurs="0"/>
 *                   &lt;element name="RelevanceRank" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "searchIndex"
})
@XmlRootElement(name = "SearchResultsMap")
public class SearchResultsMap {

    @XmlElement(name = "SearchIndex", required = true)
    protected List<SearchResultsMap.SearchIndex> searchIndex;

    /**
     * Gets the value of the searchIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResultsMap.SearchIndex }
     * 
     * 
     */
    public List<SearchResultsMap.SearchIndex> getSearchIndex() {
        if (searchIndex == null) {
            searchIndex = new ArrayList<SearchResultsMap.SearchIndex>();
        }
        return this.searchIndex;
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
     *         &lt;element name="IndexName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Results" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="Pages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CorrectedQuery" minOccurs="0"/>
     *         &lt;element name="RelevanceRank" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "indexName",
        "results",
        "pages",
        "correctedQuery",
        "relevanceRank",
        "asin"
    })
    public static class SearchIndex {

        @XmlElement(name = "IndexName", required = true)
        protected String indexName;
        @XmlElement(name = "Results")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger results;
        @XmlElement(name = "Pages")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger pages;
        @XmlElement(name = "CorrectedQuery")
        protected CorrectedQuery correctedQuery;
        @XmlElement(name = "RelevanceRank", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger relevanceRank;
        @XmlElement(name = "ASIN", required = true)
        protected List<String> asin;

        /**
         * Obtém o valor da propriedade indexName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndexName() {
            return indexName;
        }

        /**
         * Define o valor da propriedade indexName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndexName(String value) {
            this.indexName = value;
        }

        /**
         * Obtém o valor da propriedade results.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getResults() {
            return results;
        }

        /**
         * Define o valor da propriedade results.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setResults(BigInteger value) {
            this.results = value;
        }

        /**
         * Obtém o valor da propriedade pages.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPages() {
            return pages;
        }

        /**
         * Define o valor da propriedade pages.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPages(BigInteger value) {
            this.pages = value;
        }

        /**
         * Obtém o valor da propriedade correctedQuery.
         * 
         * @return
         *     possible object is
         *     {@link CorrectedQuery }
         *     
         */
        public CorrectedQuery getCorrectedQuery() {
            return correctedQuery;
        }

        /**
         * Define o valor da propriedade correctedQuery.
         * 
         * @param value
         *     allowed object is
         *     {@link CorrectedQuery }
         *     
         */
        public void setCorrectedQuery(CorrectedQuery value) {
            this.correctedQuery = value;
        }

        /**
         * Obtém o valor da propriedade relevanceRank.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRelevanceRank() {
            return relevanceRank;
        }

        /**
         * Define o valor da propriedade relevanceRank.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRelevanceRank(BigInteger value) {
            this.relevanceRank = value;
        }

        /**
         * Gets the value of the asin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the asin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getASIN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getASIN() {
            if (asin == null) {
                asin = new ArrayList<String>();
            }
            return this.asin;
        }

    }

}
