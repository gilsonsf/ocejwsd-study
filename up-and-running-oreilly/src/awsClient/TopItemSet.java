
package awsClient;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TopItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DetailPageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Artist" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Actor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "type",
    "topItem"
})
@XmlRootElement(name = "TopItemSet")
public class TopItemSet {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "TopItem", required = true)
    protected List<TopItemSet.TopItem> topItem;

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the topItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopItemSet.TopItem }
     * 
     * 
     */
    public List<TopItemSet.TopItem> getTopItem() {
        if (topItem == null) {
            topItem = new ArrayList<TopItemSet.TopItem>();
        }
        return this.topItem;
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
     *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DetailPageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Artist" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Actor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "asin",
        "title",
        "detailPageURL",
        "productGroup",
        "author",
        "artist",
        "actor"
    })
    public static class TopItem {

        @XmlElement(name = "ASIN")
        protected String asin;
        @XmlElement(name = "Title")
        protected String title;
        @XmlElement(name = "DetailPageURL")
        protected String detailPageURL;
        @XmlElement(name = "ProductGroup")
        protected String productGroup;
        @XmlElement(name = "Author")
        protected List<String> author;
        @XmlElement(name = "Artist")
        protected List<String> artist;
        @XmlElement(name = "Actor")
        protected List<String> actor;

        /**
         * Obtém o valor da propriedade asin.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getASIN() {
            return asin;
        }

        /**
         * Define o valor da propriedade asin.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setASIN(String value) {
            this.asin = value;
        }

        /**
         * Obtém o valor da propriedade title.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Define o valor da propriedade title.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Obtém o valor da propriedade detailPageURL.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetailPageURL() {
            return detailPageURL;
        }

        /**
         * Define o valor da propriedade detailPageURL.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetailPageURL(String value) {
            this.detailPageURL = value;
        }

        /**
         * Obtém o valor da propriedade productGroup.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductGroup() {
            return productGroup;
        }

        /**
         * Define o valor da propriedade productGroup.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductGroup(String value) {
            this.productGroup = value;
        }

        /**
         * Gets the value of the author property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the author property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAuthor() {
            if (author == null) {
                author = new ArrayList<String>();
            }
            return this.author;
        }

        /**
         * Gets the value of the artist property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the artist property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArtist().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getArtist() {
            if (artist == null) {
                artist = new ArrayList<String>();
            }
            return this.artist;
        }

        /**
         * Gets the value of the actor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getActor() {
            if (actor == null) {
                actor = new ArrayList<String>();
            }
            return this.actor;
        }

    }

}
