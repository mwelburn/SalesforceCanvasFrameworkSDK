
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomTab complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTab">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="customObject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flexiPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frameHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hasSidebar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileReady" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="motif" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scontrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splashPageLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlEncodingKey" type="{http://soap.sforce.com/2006/04/metadata}Encoding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTab", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "customObject",
    "description",
    "flexiPage",
    "frameHeight",
    "hasSidebar",
    "icon",
    "label",
    "mobileReady",
    "motif",
    "page",
    "scontrol",
    "splashPageLink",
    "url",
    "urlEncodingKey"
})
public class CustomTab
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean customObject;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String flexiPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer frameHeight;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean hasSidebar;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String icon;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean mobileReady;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String motif;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String page;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String scontrol;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String splashPageLink;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String url;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Encoding urlEncodingKey;

    /**
     * Gets the value of the customObject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomObject() {
        return customObject;
    }

    /**
     * Sets the value of the customObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomObject(Boolean value) {
        this.customObject = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the flexiPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexiPage() {
        return flexiPage;
    }

    /**
     * Sets the value of the flexiPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexiPage(String value) {
        this.flexiPage = value;
    }

    /**
     * Gets the value of the frameHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrameHeight() {
        return frameHeight;
    }

    /**
     * Sets the value of the frameHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrameHeight(Integer value) {
        this.frameHeight = value;
    }

    /**
     * Gets the value of the hasSidebar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSidebar() {
        return hasSidebar;
    }

    /**
     * Sets the value of the hasSidebar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSidebar(Boolean value) {
        this.hasSidebar = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the label property.
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
     * Sets the value of the label property.
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
     * Gets the value of the mobileReady property.
     * 
     */
    public boolean isMobileReady() {
        return mobileReady;
    }

    /**
     * Sets the value of the mobileReady property.
     * 
     */
    public void setMobileReady(boolean value) {
        this.mobileReady = value;
    }

    /**
     * Gets the value of the motif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotif() {
        return motif;
    }

    /**
     * Sets the value of the motif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotif(String value) {
        this.motif = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the scontrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScontrol() {
        return scontrol;
    }

    /**
     * Sets the value of the scontrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScontrol(String value) {
        this.scontrol = value;
    }

    /**
     * Gets the value of the splashPageLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplashPageLink() {
        return splashPageLink;
    }

    /**
     * Sets the value of the splashPageLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplashPageLink(String value) {
        this.splashPageLink = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the urlEncodingKey property.
     * 
     * @return
     *     possible object is
     *     {@link Encoding }
     *     
     */
    public Encoding getUrlEncodingKey() {
        return urlEncodingKey;
    }

    /**
     * Sets the value of the urlEncodingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Encoding }
     *     
     */
    public void setUrlEncodingKey(Encoding value) {
        this.urlEncodingKey = value;
    }

}
