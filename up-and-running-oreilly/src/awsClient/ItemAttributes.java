
package awsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="Actor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Artist" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AspectRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudienceRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudioFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Binding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogNumberList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CatalogNumberListElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CEROAgeRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClothingSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Creator" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Role" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Director" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EANList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EANListElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EISBN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EpisodeSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESRBAgeRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Feature" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwarePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HazardousMaterialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAdultProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAutographed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEligibleForTradeIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMemorabilia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IssuesPerYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemDimensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *                   &lt;element name="Length" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *                   &lt;element name="Weight" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *                   &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ItemPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Languages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Language" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AudioFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="LegalDisclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="MagazineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManufacturerMaximumAge" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="ManufacturerMinimumAge" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="ManufacturerPartsWarrantyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="MPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfDiscs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfIssues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfTracks" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageDimensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *                   &lt;element name="Length" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *                   &lt;element name="Weight" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *                   &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PackageQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductTypeSubcategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Publisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunningTime" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
 *         &lt;element name="SeikodoProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Studio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriptionLength" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}NonNegativeIntegerWithUnits" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradeInValue" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPCList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UPCListElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Warranty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WEEETaxValue" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
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
    "actor",
    "artist",
    "aspectRatio",
    "audienceRating",
    "audioFormat",
    "author",
    "binding",
    "brand",
    "catalogNumberList",
    "category",
    "ceroAgeRating",
    "clothingSize",
    "color",
    "creator",
    "department",
    "director",
    "ean",
    "eanList",
    "edition",
    "eisbn",
    "episodeSequence",
    "esrbAgeRating",
    "feature",
    "format",
    "genre",
    "hardwarePlatform",
    "hazardousMaterialType",
    "isAdultProduct",
    "isAutographed",
    "isbn",
    "isEligibleForTradeIn",
    "isMemorabilia",
    "issuesPerYear",
    "itemDimensions",
    "itemPartNumber",
    "label",
    "languages",
    "legalDisclaimer",
    "listPrice",
    "magazineType",
    "manufacturer",
    "manufacturerMaximumAge",
    "manufacturerMinimumAge",
    "manufacturerPartsWarrantyDescription",
    "mediaType",
    "model",
    "modelYear",
    "mpn",
    "numberOfDiscs",
    "numberOfIssues",
    "numberOfItems",
    "numberOfPages",
    "numberOfTracks",
    "operatingSystem",
    "packageDimensions",
    "packageQuantity",
    "partNumber",
    "pictureFormat",
    "platform",
    "productGroup",
    "productTypeName",
    "productTypeSubcategory",
    "publicationDate",
    "publisher",
    "regionCode",
    "releaseDate",
    "runningTime",
    "seikodoProductCode",
    "size",
    "sku",
    "studio",
    "subscriptionLength",
    "title",
    "trackSequence",
    "tradeInValue",
    "upc",
    "upcList",
    "warranty",
    "weeeTaxValue"
})
@XmlRootElement(name = "ItemAttributes")
public class ItemAttributes {

    @XmlElement(name = "Actor")
    protected List<String> actor;
    @XmlElement(name = "Artist")
    protected List<String> artist;
    @XmlElement(name = "AspectRatio")
    protected String aspectRatio;
    @XmlElement(name = "AudienceRating")
    protected String audienceRating;
    @XmlElement(name = "AudioFormat")
    protected List<String> audioFormat;
    @XmlElement(name = "Author")
    protected List<String> author;
    @XmlElement(name = "Binding")
    protected String binding;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "CatalogNumberList")
    protected ItemAttributes.CatalogNumberList catalogNumberList;
    @XmlElement(name = "Category")
    protected List<String> category;
    @XmlElement(name = "CEROAgeRating")
    protected String ceroAgeRating;
    @XmlElement(name = "ClothingSize")
    protected String clothingSize;
    @XmlElement(name = "Color")
    protected String color;
    @XmlElement(name = "Creator")
    protected List<ItemAttributes.Creator> creator;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Director")
    protected List<String> director;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "EANList")
    protected ItemAttributes.EANList eanList;
    @XmlElement(name = "Edition")
    protected String edition;
    @XmlElement(name = "EISBN")
    protected List<String> eisbn;
    @XmlElement(name = "EpisodeSequence")
    protected String episodeSequence;
    @XmlElement(name = "ESRBAgeRating")
    protected String esrbAgeRating;
    @XmlElement(name = "Feature")
    protected List<String> feature;
    @XmlElement(name = "Format")
    protected List<String> format;
    @XmlElement(name = "Genre")
    protected String genre;
    @XmlElement(name = "HardwarePlatform")
    protected String hardwarePlatform;
    @XmlElement(name = "HazardousMaterialType")
    protected String hazardousMaterialType;
    @XmlElement(name = "IsAdultProduct")
    protected Boolean isAdultProduct;
    @XmlElement(name = "IsAutographed")
    protected Boolean isAutographed;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "IsEligibleForTradeIn")
    protected Boolean isEligibleForTradeIn;
    @XmlElement(name = "IsMemorabilia")
    protected Boolean isMemorabilia;
    @XmlElement(name = "IssuesPerYear")
    protected String issuesPerYear;
    @XmlElement(name = "ItemDimensions")
    protected ItemAttributes.ItemDimensions itemDimensions;
    @XmlElement(name = "ItemPartNumber")
    protected String itemPartNumber;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "Languages")
    protected ItemAttributes.Languages languages;
    @XmlElement(name = "LegalDisclaimer")
    protected String legalDisclaimer;
    @XmlElement(name = "ListPrice")
    protected Price listPrice;
    @XmlElement(name = "MagazineType")
    protected String magazineType;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "ManufacturerMaximumAge")
    protected DecimalWithUnits manufacturerMaximumAge;
    @XmlElement(name = "ManufacturerMinimumAge")
    protected DecimalWithUnits manufacturerMinimumAge;
    @XmlElement(name = "ManufacturerPartsWarrantyDescription")
    protected String manufacturerPartsWarrantyDescription;
    @XmlElement(name = "MediaType")
    protected String mediaType;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "ModelYear")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger modelYear;
    @XmlElement(name = "MPN")
    protected String mpn;
    @XmlElement(name = "NumberOfDiscs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDiscs;
    @XmlElement(name = "NumberOfIssues")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfIssues;
    @XmlElement(name = "NumberOfItems")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfItems;
    @XmlElement(name = "NumberOfPages")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPages;
    @XmlElement(name = "NumberOfTracks")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfTracks;
    @XmlElement(name = "OperatingSystem")
    protected String operatingSystem;
    @XmlElement(name = "PackageDimensions")
    protected ItemAttributes.PackageDimensions packageDimensions;
    @XmlElement(name = "PackageQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageQuantity;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "PictureFormat")
    protected List<String> pictureFormat;
    @XmlElement(name = "Platform")
    protected List<String> platform;
    @XmlElement(name = "ProductGroup")
    protected String productGroup;
    @XmlElement(name = "ProductTypeName")
    protected String productTypeName;
    @XmlElement(name = "ProductTypeSubcategory")
    protected String productTypeSubcategory;
    @XmlElement(name = "PublicationDate")
    protected String publicationDate;
    @XmlElement(name = "Publisher")
    protected String publisher;
    @XmlElement(name = "RegionCode")
    protected String regionCode;
    @XmlElement(name = "ReleaseDate")
    protected String releaseDate;
    @XmlElement(name = "RunningTime")
    protected DecimalWithUnits runningTime;
    @XmlElement(name = "SeikodoProductCode")
    protected String seikodoProductCode;
    @XmlElement(name = "Size")
    protected String size;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "Studio")
    protected String studio;
    @XmlElement(name = "SubscriptionLength")
    protected NonNegativeIntegerWithUnits subscriptionLength;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "TrackSequence")
    protected String trackSequence;
    @XmlElement(name = "TradeInValue")
    protected Price tradeInValue;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "UPCList")
    protected ItemAttributes.UPCList upcList;
    @XmlElement(name = "Warranty")
    protected String warranty;
    @XmlElement(name = "WEEETaxValue")
    protected Price weeeTaxValue;

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
     * Obtém o valor da propriedade aspectRatio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Define o valor da propriedade aspectRatio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectRatio(String value) {
        this.aspectRatio = value;
    }

    /**
     * Obtém o valor da propriedade audienceRating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceRating() {
        return audienceRating;
    }

    /**
     * Define o valor da propriedade audienceRating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceRating(String value) {
        this.audienceRating = value;
    }

    /**
     * Gets the value of the audioFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudioFormat() {
        if (audioFormat == null) {
            audioFormat = new ArrayList<String>();
        }
        return this.audioFormat;
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
     * Obtém o valor da propriedade binding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Define o valor da propriedade binding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinding(String value) {
        this.binding = value;
    }

    /**
     * Obtém o valor da propriedade brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Define o valor da propriedade brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Obtém o valor da propriedade catalogNumberList.
     * 
     * @return
     *     possible object is
     *     {@link ItemAttributes.CatalogNumberList }
     *     
     */
    public ItemAttributes.CatalogNumberList getCatalogNumberList() {
        return catalogNumberList;
    }

    /**
     * Define o valor da propriedade catalogNumberList.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAttributes.CatalogNumberList }
     *     
     */
    public void setCatalogNumberList(ItemAttributes.CatalogNumberList value) {
        this.catalogNumberList = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategory() {
        if (category == null) {
            category = new ArrayList<String>();
        }
        return this.category;
    }

    /**
     * Obtém o valor da propriedade ceroAgeRating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEROAgeRating() {
        return ceroAgeRating;
    }

    /**
     * Define o valor da propriedade ceroAgeRating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEROAgeRating(String value) {
        this.ceroAgeRating = value;
    }

    /**
     * Obtém o valor da propriedade clothingSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingSize() {
        return clothingSize;
    }

    /**
     * Define o valor da propriedade clothingSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingSize(String value) {
        this.clothingSize = value;
    }

    /**
     * Obtém o valor da propriedade color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define o valor da propriedade color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemAttributes.Creator }
     * 
     * 
     */
    public List<ItemAttributes.Creator> getCreator() {
        if (creator == null) {
            creator = new ArrayList<ItemAttributes.Creator>();
        }
        return this.creator;
    }

    /**
     * Obtém o valor da propriedade department.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Define o valor da propriedade department.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the director property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the director property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDirector() {
        if (director == null) {
            director = new ArrayList<String>();
        }
        return this.director;
    }

    /**
     * Obtém o valor da propriedade ean.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Define o valor da propriedade ean.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Obtém o valor da propriedade eanList.
     * 
     * @return
     *     possible object is
     *     {@link ItemAttributes.EANList }
     *     
     */
    public ItemAttributes.EANList getEANList() {
        return eanList;
    }

    /**
     * Define o valor da propriedade eanList.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAttributes.EANList }
     *     
     */
    public void setEANList(ItemAttributes.EANList value) {
        this.eanList = value;
    }

    /**
     * Obtém o valor da propriedade edition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Define o valor da propriedade edition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the eisbn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eisbn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEISBN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEISBN() {
        if (eisbn == null) {
            eisbn = new ArrayList<String>();
        }
        return this.eisbn;
    }

    /**
     * Obtém o valor da propriedade episodeSequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpisodeSequence() {
        return episodeSequence;
    }

    /**
     * Define o valor da propriedade episodeSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpisodeSequence(String value) {
        this.episodeSequence = value;
    }

    /**
     * Obtém o valor da propriedade esrbAgeRating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESRBAgeRating() {
        return esrbAgeRating;
    }

    /**
     * Define o valor da propriedade esrbAgeRating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESRBAgeRating(String value) {
        this.esrbAgeRating = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFeature() {
        if (feature == null) {
            feature = new ArrayList<String>();
        }
        return this.feature;
    }

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFormat() {
        if (format == null) {
            format = new ArrayList<String>();
        }
        return this.format;
    }

    /**
     * Obtém o valor da propriedade genre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Define o valor da propriedade genre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Obtém o valor da propriedade hardwarePlatform.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * Define o valor da propriedade hardwarePlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwarePlatform(String value) {
        this.hardwarePlatform = value;
    }

    /**
     * Obtém o valor da propriedade hazardousMaterialType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardousMaterialType() {
        return hazardousMaterialType;
    }

    /**
     * Define o valor da propriedade hazardousMaterialType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardousMaterialType(String value) {
        this.hazardousMaterialType = value;
    }

    /**
     * Obtém o valor da propriedade isAdultProduct.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdultProduct() {
        return isAdultProduct;
    }

    /**
     * Define o valor da propriedade isAdultProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdultProduct(Boolean value) {
        this.isAdultProduct = value;
    }

    /**
     * Obtém o valor da propriedade isAutographed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutographed() {
        return isAutographed;
    }

    /**
     * Define o valor da propriedade isAutographed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutographed(Boolean value) {
        this.isAutographed = value;
    }

    /**
     * Obtém o valor da propriedade isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Define o valor da propriedade isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Obtém o valor da propriedade isEligibleForTradeIn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForTradeIn() {
        return isEligibleForTradeIn;
    }

    /**
     * Define o valor da propriedade isEligibleForTradeIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForTradeIn(Boolean value) {
        this.isEligibleForTradeIn = value;
    }

    /**
     * Obtém o valor da propriedade isMemorabilia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMemorabilia() {
        return isMemorabilia;
    }

    /**
     * Define o valor da propriedade isMemorabilia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMemorabilia(Boolean value) {
        this.isMemorabilia = value;
    }

    /**
     * Obtém o valor da propriedade issuesPerYear.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuesPerYear() {
        return issuesPerYear;
    }

    /**
     * Define o valor da propriedade issuesPerYear.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuesPerYear(String value) {
        this.issuesPerYear = value;
    }

    /**
     * Obtém o valor da propriedade itemDimensions.
     * 
     * @return
     *     possible object is
     *     {@link ItemAttributes.ItemDimensions }
     *     
     */
    public ItemAttributes.ItemDimensions getItemDimensions() {
        return itemDimensions;
    }

    /**
     * Define o valor da propriedade itemDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAttributes.ItemDimensions }
     *     
     */
    public void setItemDimensions(ItemAttributes.ItemDimensions value) {
        this.itemDimensions = value;
    }

    /**
     * Obtém o valor da propriedade itemPartNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPartNumber() {
        return itemPartNumber;
    }

    /**
     * Define o valor da propriedade itemPartNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPartNumber(String value) {
        this.itemPartNumber = value;
    }

    /**
     * Obtém o valor da propriedade label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define o valor da propriedade label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtém o valor da propriedade languages.
     * 
     * @return
     *     possible object is
     *     {@link ItemAttributes.Languages }
     *     
     */
    public ItemAttributes.Languages getLanguages() {
        return languages;
    }

    /**
     * Define o valor da propriedade languages.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAttributes.Languages }
     *     
     */
    public void setLanguages(ItemAttributes.Languages value) {
        this.languages = value;
    }

    /**
     * Obtém o valor da propriedade legalDisclaimer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalDisclaimer() {
        return legalDisclaimer;
    }

    /**
     * Define o valor da propriedade legalDisclaimer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalDisclaimer(String value) {
        this.legalDisclaimer = value;
    }

    /**
     * Obtém o valor da propriedade listPrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getListPrice() {
        return listPrice;
    }

    /**
     * Define o valor da propriedade listPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setListPrice(Price value) {
        this.listPrice = value;
    }

    /**
     * Obtém o valor da propriedade magazineType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagazineType() {
        return magazineType;
    }

    /**
     * Define o valor da propriedade magazineType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagazineType(String value) {
        this.magazineType = value;
    }

    /**
     * Obtém o valor da propriedade manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Define o valor da propriedade manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Obtém o valor da propriedade manufacturerMaximumAge.
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getManufacturerMaximumAge() {
        return manufacturerMaximumAge;
    }

    /**
     * Define o valor da propriedade manufacturerMaximumAge.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setManufacturerMaximumAge(DecimalWithUnits value) {
        this.manufacturerMaximumAge = value;
    }

    /**
     * Obtém o valor da propriedade manufacturerMinimumAge.
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getManufacturerMinimumAge() {
        return manufacturerMinimumAge;
    }

    /**
     * Define o valor da propriedade manufacturerMinimumAge.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setManufacturerMinimumAge(DecimalWithUnits value) {
        this.manufacturerMinimumAge = value;
    }

    /**
     * Obtém o valor da propriedade manufacturerPartsWarrantyDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerPartsWarrantyDescription() {
        return manufacturerPartsWarrantyDescription;
    }

    /**
     * Define o valor da propriedade manufacturerPartsWarrantyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerPartsWarrantyDescription(String value) {
        this.manufacturerPartsWarrantyDescription = value;
    }

    /**
     * Obtém o valor da propriedade mediaType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Define o valor da propriedade mediaType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Obtém o valor da propriedade model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Define o valor da propriedade model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Obtém o valor da propriedade modelYear.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModelYear() {
        return modelYear;
    }

    /**
     * Define o valor da propriedade modelYear.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModelYear(BigInteger value) {
        this.modelYear = value;
    }

    /**
     * Obtém o valor da propriedade mpn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPN() {
        return mpn;
    }

    /**
     * Define o valor da propriedade mpn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPN(String value) {
        this.mpn = value;
    }

    /**
     * Obtém o valor da propriedade numberOfDiscs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDiscs() {
        return numberOfDiscs;
    }

    /**
     * Define o valor da propriedade numberOfDiscs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDiscs(BigInteger value) {
        this.numberOfDiscs = value;
    }

    /**
     * Obtém o valor da propriedade numberOfIssues.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIssues() {
        return numberOfIssues;
    }

    /**
     * Define o valor da propriedade numberOfIssues.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIssues(BigInteger value) {
        this.numberOfIssues = value;
    }

    /**
     * Obtém o valor da propriedade numberOfItems.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Define o valor da propriedade numberOfItems.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItems(BigInteger value) {
        this.numberOfItems = value;
    }

    /**
     * Obtém o valor da propriedade numberOfPages.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Define o valor da propriedade numberOfPages.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPages(BigInteger value) {
        this.numberOfPages = value;
    }

    /**
     * Obtém o valor da propriedade numberOfTracks.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTracks() {
        return numberOfTracks;
    }

    /**
     * Define o valor da propriedade numberOfTracks.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTracks(BigInteger value) {
        this.numberOfTracks = value;
    }

    /**
     * Obtém o valor da propriedade operatingSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Define o valor da propriedade operatingSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }

    /**
     * Obtém o valor da propriedade packageDimensions.
     * 
     * @return
     *     possible object is
     *     {@link ItemAttributes.PackageDimensions }
     *     
     */
    public ItemAttributes.PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * Define o valor da propriedade packageDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAttributes.PackageDimensions }
     *     
     */
    public void setPackageDimensions(ItemAttributes.PackageDimensions value) {
        this.packageDimensions = value;
    }

    /**
     * Obtém o valor da propriedade packageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageQuantity() {
        return packageQuantity;
    }

    /**
     * Define o valor da propriedade packageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageQuantity(BigInteger value) {
        this.packageQuantity = value;
    }

    /**
     * Obtém o valor da propriedade partNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Define o valor da propriedade partNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the pictureFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPictureFormat() {
        if (pictureFormat == null) {
            pictureFormat = new ArrayList<String>();
        }
        return this.pictureFormat;
    }

    /**
     * Gets the value of the platform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the platform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlatform() {
        if (platform == null) {
            platform = new ArrayList<String>();
        }
        return this.platform;
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
     * Obtém o valor da propriedade productTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * Define o valor da propriedade productTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeName(String value) {
        this.productTypeName = value;
    }

    /**
     * Obtém o valor da propriedade productTypeSubcategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeSubcategory() {
        return productTypeSubcategory;
    }

    /**
     * Define o valor da propriedade productTypeSubcategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeSubcategory(String value) {
        this.productTypeSubcategory = value;
    }

    /**
     * Obtém o valor da propriedade publicationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Define o valor da propriedade publicationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Obtém o valor da propriedade publisher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Define o valor da propriedade publisher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Obtém o valor da propriedade regionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Define o valor da propriedade regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Obtém o valor da propriedade releaseDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Define o valor da propriedade releaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseDate(String value) {
        this.releaseDate = value;
    }

    /**
     * Obtém o valor da propriedade runningTime.
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getRunningTime() {
        return runningTime;
    }

    /**
     * Define o valor da propriedade runningTime.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setRunningTime(DecimalWithUnits value) {
        this.runningTime = value;
    }

    /**
     * Obtém o valor da propriedade seikodoProductCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeikodoProductCode() {
        return seikodoProductCode;
    }

    /**
     * Define o valor da propriedade seikodoProductCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeikodoProductCode(String value) {
        this.seikodoProductCode = value;
    }

    /**
     * Obtém o valor da propriedade size.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Define o valor da propriedade size.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Obtém o valor da propriedade sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Define o valor da propriedade sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Obtém o valor da propriedade studio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudio() {
        return studio;
    }

    /**
     * Define o valor da propriedade studio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudio(String value) {
        this.studio = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionLength.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerWithUnits }
     *     
     */
    public NonNegativeIntegerWithUnits getSubscriptionLength() {
        return subscriptionLength;
    }

    /**
     * Define o valor da propriedade subscriptionLength.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerWithUnits }
     *     
     */
    public void setSubscriptionLength(NonNegativeIntegerWithUnits value) {
        this.subscriptionLength = value;
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
     * Obtém o valor da propriedade trackSequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackSequence() {
        return trackSequence;
    }

    /**
     * Define o valor da propriedade trackSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackSequence(String value) {
        this.trackSequence = value;
    }

    /**
     * Obtém o valor da propriedade tradeInValue.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getTradeInValue() {
        return tradeInValue;
    }

    /**
     * Define o valor da propriedade tradeInValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setTradeInValue(Price value) {
        this.tradeInValue = value;
    }

    /**
     * Obtém o valor da propriedade upc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Define o valor da propriedade upc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Obtém o valor da propriedade upcList.
     * 
     * @return
     *     possible object is
     *     {@link ItemAttributes.UPCList }
     *     
     */
    public ItemAttributes.UPCList getUPCList() {
        return upcList;
    }

    /**
     * Define o valor da propriedade upcList.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAttributes.UPCList }
     *     
     */
    public void setUPCList(ItemAttributes.UPCList value) {
        this.upcList = value;
    }

    /**
     * Obtém o valor da propriedade warranty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarranty() {
        return warranty;
    }

    /**
     * Define o valor da propriedade warranty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarranty(String value) {
        this.warranty = value;
    }

    /**
     * Obtém o valor da propriedade weeeTaxValue.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getWEEETaxValue() {
        return weeeTaxValue;
    }

    /**
     * Define o valor da propriedade weeeTaxValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setWEEETaxValue(Price value) {
        this.weeeTaxValue = value;
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
     *         &lt;element name="CatalogNumberListElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "catalogNumberListElement"
    })
    public static class CatalogNumberList {

        @XmlElement(name = "CatalogNumberListElement")
        protected List<String> catalogNumberListElement;

        /**
         * Gets the value of the catalogNumberListElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the catalogNumberListElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCatalogNumberListElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCatalogNumberListElement() {
            if (catalogNumberListElement == null) {
                catalogNumberListElement = new ArrayList<String>();
            }
            return this.catalogNumberListElement;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Role" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Creator {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Role", required = true)
        protected String role;

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtém o valor da propriedade role.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Define o valor da propriedade role.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

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
     *         &lt;element name="EANListElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "eanListElement"
    })
    public static class EANList {

        @XmlElement(name = "EANListElement")
        protected List<String> eanListElement;

        /**
         * Gets the value of the eanListElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eanListElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEANListElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEANListElement() {
            if (eanListElement == null) {
                eanListElement = new ArrayList<String>();
            }
            return this.eanListElement;
        }

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
     *         &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
     *         &lt;element name="Length" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
     *         &lt;element name="Weight" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
     *         &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
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
        "height",
        "length",
        "weight",
        "width"
    })
    public static class ItemDimensions {

        @XmlElement(name = "Height")
        protected DecimalWithUnits height;
        @XmlElement(name = "Length")
        protected DecimalWithUnits length;
        @XmlElement(name = "Weight")
        protected DecimalWithUnits weight;
        @XmlElement(name = "Width")
        protected DecimalWithUnits width;

        /**
         * Obtém o valor da propriedade height.
         * 
         * @return
         *     possible object is
         *     {@link DecimalWithUnits }
         *     
         */
        public DecimalWithUnits getHeight() {
            return height;
        }

        /**
         * Define o valor da propriedade height.
         * 
         * @param value
         *     allowed object is
         *     {@link DecimalWithUnits }
         *     
         */
        public void setHeight(DecimalWithUnits value) {
            this.height = value;
        }

        /**
         * Obtém o valor da propriedade length.
         * 
         * @return
         *     possible object is
         *     {@link DecimalWithUnits }
         *     
         */
        public DecimalWithUnits getLength() {
            return length;
        }

        /**
         * Define o valor da propriedade length.
         * 
         * @param value
         *     allowed object is
         *     {@link DecimalWithUnits }
         *     
         */
        public void setLength(DecimalWithUnits value) {
            this.length = value;
        }

        /**
         * Obtém o valor da propriedade weight.
         * 
         * @return
         *     possible object is
         *     {@link DecimalWithUnits }
         *     
         */
        public DecimalWithUnits getWeight() {
            return weight;
        }

        /**
         * Define o valor da propriedade weight.
         * 
         * @param value
         *     allowed object is
         *     {@link DecimalWithUnits }
         *     
         */
        public void setWeight(DecimalWithUnits value) {
            this.weight = value;
        }

        /**
         * Obtém o valor da propriedade width.
         * 
         * @return
         *     possible object is
         *     {@link DecimalWithUnits }
         *     
         */
        public DecimalWithUnits getWidth() {
            return width;
        }

        /**
         * Define o valor da propriedade width.
         * 
         * @param value
         *     allowed object is
         *     {@link DecimalWithUnits }
         *     
         */
        public void setWidth(DecimalWithUnits value) {
            this.width = value;
        }

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
     *         &lt;element name="Language" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AudioFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "language"
    })
    public static class Languages {

        @XmlElement(name = "Language")
        protected List<ItemAttributes.Languages.Language> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemAttributes.Languages.Language }
         * 
         * 
         */
        public List<ItemAttributes.Languages.Language> getLanguage() {
            if (language == null) {
                language = new ArrayList<ItemAttributes.Languages.Language>();
            }
            return this.language;
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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AudioFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "name",
            "type",
            "audioFormat"
        })
        public static class Language {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Type")
            protected String type;
            @XmlElement(name = "AudioFormat")
            protected String audioFormat;

            /**
             * Obtém o valor da propriedade name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define o valor da propriedade name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

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
             * Obtém o valor da propriedade audioFormat.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAudioFormat() {
                return audioFormat;
            }

            /**
             * Define o valor da propriedade audioFormat.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAudioFormat(String value) {
                this.audioFormat = value;
            }

        }

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
     *         &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
     *         &lt;element name="Length" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
     *         &lt;element name="Weight" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
     *         &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits" minOccurs="0"/>
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
        "height",
        "length",
        "weight",
        "width"
    })
    public static class PackageDimensions {

        @XmlElement(name = "Height")
        protected DecimalWithUnits height;
        @XmlElement(name = "Length")
        protected DecimalWithUnits length;
        @XmlElement(name = "Weight")
        protected DecimalWithUnits weight;
        @XmlElement(name = "Width")
        protected DecimalWithUnits width;

        /**
         * Obtém o valor da propriedade height.
         * 
         * @return
         *     possible object is
         *     {@link DecimalWithUnits }
         *     
         */
        public DecimalWithUnits getHeight() {
            return height;
        }

        /**
         * Define o valor da propriedade height.
         * 
         * @param value
         *     allowed object is
         *     {@link DecimalWithUnits }
         *     
         */
        public void setHeight(DecimalWithUnits value) {
            this.height = value;
        }

        /**
         * Obtém o valor da propriedade length.
         * 
         * @return
         *     possible object is
         *     {@link DecimalWithUnits }
         *     
         */
        public DecimalWithUnits getLength() {
            return length;
        }

        /**
         * Define o valor da propriedade length.
         * 
         * @param value
         *     allowed object is
         *     {@link DecimalWithUnits }
         *     
         */
        public void setLength(DecimalWithUnits value) {
            this.length = value;
        }

        /**
         * Obtém o valor da propriedade weight.
         * 
         * @return
         *     possible object is
         *     {@link DecimalWithUnits }
         *     
         */
        public DecimalWithUnits getWeight() {
            return weight;
        }

        /**
         * Define o valor da propriedade weight.
         * 
         * @param value
         *     allowed object is
         *     {@link DecimalWithUnits }
         *     
         */
        public void setWeight(DecimalWithUnits value) {
            this.weight = value;
        }

        /**
         * Obtém o valor da propriedade width.
         * 
         * @return
         *     possible object is
         *     {@link DecimalWithUnits }
         *     
         */
        public DecimalWithUnits getWidth() {
            return width;
        }

        /**
         * Define o valor da propriedade width.
         * 
         * @param value
         *     allowed object is
         *     {@link DecimalWithUnits }
         *     
         */
        public void setWidth(DecimalWithUnits value) {
            this.width = value;
        }

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
     *         &lt;element name="UPCListElement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "upcListElement"
    })
    public static class UPCList {

        @XmlElement(name = "UPCListElement")
        protected List<String> upcListElement;

        /**
         * Gets the value of the upcListElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the upcListElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUPCListElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUPCListElement() {
            if (upcListElement == null) {
                upcListElement = new ArrayList<String>();
            }
            return this.upcListElement;
        }

    }

}
