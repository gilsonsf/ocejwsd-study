
package awsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CartAddRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CartAddRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HMAC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MergeCart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Items" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OfferListingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                             &lt;element name="AssociateTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ListItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResponseGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartAddRequest", propOrder = {
    "cartId",
    "hmac",
    "mergeCart",
    "items",
    "responseGroup"
})
public class CartAddRequest {

    @XmlElement(name = "CartId")
    protected String cartId;
    @XmlElement(name = "HMAC")
    protected String hmac;
    @XmlElement(name = "MergeCart")
    protected String mergeCart;
    @XmlElement(name = "Items")
    protected CartAddRequest.Items items;
    @XmlElement(name = "ResponseGroup")
    protected List<String> responseGroup;

    /**
     * Obtém o valor da propriedade cartId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * Define o valor da propriedade cartId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartId(String value) {
        this.cartId = value;
    }

    /**
     * Obtém o valor da propriedade hmac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMAC() {
        return hmac;
    }

    /**
     * Define o valor da propriedade hmac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMAC(String value) {
        this.hmac = value;
    }

    /**
     * Obtém o valor da propriedade mergeCart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergeCart() {
        return mergeCart;
    }

    /**
     * Define o valor da propriedade mergeCart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergeCart(String value) {
        this.mergeCart = value;
    }

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link CartAddRequest.Items }
     *     
     */
    public CartAddRequest.Items getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link CartAddRequest.Items }
     *     
     */
    public void setItems(CartAddRequest.Items value) {
        this.items = value;
    }

    /**
     * Gets the value of the responseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResponseGroup() {
        if (responseGroup == null) {
            responseGroup = new ArrayList<String>();
        }
        return this.responseGroup;
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
     *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OfferListingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *                   &lt;element name="AssociateTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ListItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "item"
    })
    public static class Items {

        @XmlElement(name = "Item")
        protected List<CartAddRequest.Items.Item> item;

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
         * {@link CartAddRequest.Items.Item }
         * 
         * 
         */
        public List<CartAddRequest.Items.Item> getItem() {
            if (item == null) {
                item = new ArrayList<CartAddRequest.Items.Item>();
            }
            return this.item;
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
         *         &lt;element name="OfferListingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
         *         &lt;element name="AssociateTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ListItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "offerListingId",
            "quantity",
            "associateTag",
            "listItemId"
        })
        public static class Item {

            @XmlElement(name = "ASIN")
            protected String asin;
            @XmlElement(name = "OfferListingId")
            protected String offerListingId;
            @XmlElement(name = "Quantity")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger quantity;
            @XmlElement(name = "AssociateTag")
            protected String associateTag;
            @XmlElement(name = "ListItemId")
            protected String listItemId;

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
             * Obtém o valor da propriedade quantity.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * Define o valor da propriedade quantity.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

            /**
             * Obtém o valor da propriedade associateTag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssociateTag() {
                return associateTag;
            }

            /**
             * Define o valor da propriedade associateTag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssociateTag(String value) {
                this.associateTag = value;
            }

            /**
             * Obtém o valor da propriedade listItemId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getListItemId() {
                return listItemId;
            }

            /**
             * Define o valor da propriedade listItemId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setListItemId(String value) {
                this.listItemId = value;
            }

        }

    }

}
