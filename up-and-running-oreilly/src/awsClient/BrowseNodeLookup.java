
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
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketplaceDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AWSAccessKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociateTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Validate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLEscaping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}BrowseNodeLookupRequest" minOccurs="0"/>
 *         &lt;element name="Request" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}BrowseNodeLookupRequest" maxOccurs="unbounded" minOccurs="0"/>
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
    "marketplaceDomain",
    "awsAccessKeyId",
    "associateTag",
    "validate",
    "xmlEscaping",
    "shared",
    "request"
})
@XmlRootElement(name = "BrowseNodeLookup")
public class BrowseNodeLookup {

    @XmlElement(name = "MarketplaceDomain")
    protected String marketplaceDomain;
    @XmlElement(name = "AWSAccessKeyId")
    protected String awsAccessKeyId;
    @XmlElement(name = "AssociateTag")
    protected String associateTag;
    @XmlElement(name = "Validate")
    protected String validate;
    @XmlElement(name = "XMLEscaping")
    protected String xmlEscaping;
    @XmlElement(name = "Shared")
    protected BrowseNodeLookupRequest shared;
    @XmlElement(name = "Request")
    protected List<BrowseNodeLookupRequest> request;

    /**
     * Obt�m o valor da propriedade marketplaceDomain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplaceDomain() {
        return marketplaceDomain;
    }

    /**
     * Define o valor da propriedade marketplaceDomain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplaceDomain(String value) {
        this.marketplaceDomain = value;
    }

    /**
     * Obt�m o valor da propriedade awsAccessKeyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWSAccessKeyId() {
        return awsAccessKeyId;
    }

    /**
     * Define o valor da propriedade awsAccessKeyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWSAccessKeyId(String value) {
        this.awsAccessKeyId = value;
    }

    /**
     * Obt�m o valor da propriedade associateTag.
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
     * Obt�m o valor da propriedade validate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidate() {
        return validate;
    }

    /**
     * Define o valor da propriedade validate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidate(String value) {
        this.validate = value;
    }

    /**
     * Obt�m o valor da propriedade xmlEscaping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLEscaping() {
        return xmlEscaping;
    }

    /**
     * Define o valor da propriedade xmlEscaping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLEscaping(String value) {
        this.xmlEscaping = value;
    }

    /**
     * Obt�m o valor da propriedade shared.
     * 
     * @return
     *     possible object is
     *     {@link BrowseNodeLookupRequest }
     *     
     */
    public BrowseNodeLookupRequest getShared() {
        return shared;
    }

    /**
     * Define o valor da propriedade shared.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowseNodeLookupRequest }
     *     
     */
    public void setShared(BrowseNodeLookupRequest value) {
        this.shared = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrowseNodeLookupRequest }
     * 
     * 
     */
    public List<BrowseNodeLookupRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<BrowseNodeLookupRequest>();
        }
        return this.request;
    }

}
