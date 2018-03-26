
package awsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="SwatchImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="SmallImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="ThumbnailImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="TinyImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="MediumImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="LargeImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swatchImage",
    "smallImage",
    "thumbnailImage",
    "tinyImage",
    "mediumImage",
    "largeImage"
})
@XmlRootElement(name = "ImageSet")
public class ImageSet {

    @XmlElement(name = "SwatchImage")
    protected Image swatchImage;
    @XmlElement(name = "SmallImage")
    protected Image smallImage;
    @XmlElement(name = "ThumbnailImage")
    protected Image thumbnailImage;
    @XmlElement(name = "TinyImage")
    protected Image tinyImage;
    @XmlElement(name = "MediumImage")
    protected Image mediumImage;
    @XmlElement(name = "LargeImage")
    protected Image largeImage;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * Obtém o valor da propriedade swatchImage.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getSwatchImage() {
        return swatchImage;
    }

    /**
     * Define o valor da propriedade swatchImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setSwatchImage(Image value) {
        this.swatchImage = value;
    }

    /**
     * Obtém o valor da propriedade smallImage.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getSmallImage() {
        return smallImage;
    }

    /**
     * Define o valor da propriedade smallImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setSmallImage(Image value) {
        this.smallImage = value;
    }

    /**
     * Obtém o valor da propriedade thumbnailImage.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * Define o valor da propriedade thumbnailImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setThumbnailImage(Image value) {
        this.thumbnailImage = value;
    }

    /**
     * Obtém o valor da propriedade tinyImage.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getTinyImage() {
        return tinyImage;
    }

    /**
     * Define o valor da propriedade tinyImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setTinyImage(Image value) {
        this.tinyImage = value;
    }

    /**
     * Obtém o valor da propriedade mediumImage.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getMediumImage() {
        return mediumImage;
    }

    /**
     * Define o valor da propriedade mediumImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setMediumImage(Image value) {
        this.mediumImage = value;
    }

    /**
     * Obtém o valor da propriedade largeImage.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLargeImage() {
        return largeImage;
    }

    /**
     * Define o valor da propriedade largeImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLargeImage(Image value) {
        this.largeImage = value;
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

}
