
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomPageWebLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomPageWebLink">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="availability" type="{http://soap.sforce.com/2006/04/metadata}WebLinkAvailability"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayType" type="{http://soap.sforce.com/2006/04/metadata}WebLinkDisplayType"/>
 *         &lt;element name="encodingKey" type="{http://soap.sforce.com/2006/04/metadata}Encoding" minOccurs="0"/>
 *         &lt;element name="hasMenubar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasScrollbars" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasToolbar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isResizable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="linkType" type="{http://soap.sforce.com/2006/04/metadata}WebLinkType"/>
 *         &lt;element name="masterLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openType" type="{http://soap.sforce.com/2006/04/metadata}WebLinkWindowType"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://soap.sforce.com/2006/04/metadata}WebLinkPosition" minOccurs="0"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requireRowSelection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scontrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showsLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showsStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomPageWebLink", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "availability",
    "description",
    "displayType",
    "encodingKey",
    "hasMenubar",
    "hasScrollbars",
    "hasToolbar",
    "height",
    "isResizable",
    "linkType",
    "masterLabel",
    "openType",
    "page",
    "position",
    "_protected",
    "requireRowSelection",
    "scontrol",
    "showsLocation",
    "showsStatus",
    "url",
    "width"
})
public class CustomPageWebLink
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected WebLinkAvailability availability;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected WebLinkDisplayType displayType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Encoding encodingKey;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean hasMenubar;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean hasScrollbars;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean hasToolbar;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer height;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isResizable;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected WebLinkType linkType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String masterLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected WebLinkWindowType openType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String page;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected WebLinkPosition position;
    @XmlElement(name = "protected", namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean _protected;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean requireRowSelection;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String scontrol;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showsLocation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showsStatus;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String url;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer width;

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkAvailability }
     *     
     */
    public WebLinkAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkAvailability }
     *     
     */
    public void setAvailability(WebLinkAvailability value) {
        this.availability = value;
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
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkDisplayType }
     *     
     */
    public WebLinkDisplayType getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkDisplayType }
     *     
     */
    public void setDisplayType(WebLinkDisplayType value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the encodingKey property.
     * 
     * @return
     *     possible object is
     *     {@link Encoding }
     *     
     */
    public Encoding getEncodingKey() {
        return encodingKey;
    }

    /**
     * Sets the value of the encodingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Encoding }
     *     
     */
    public void setEncodingKey(Encoding value) {
        this.encodingKey = value;
    }

    /**
     * Gets the value of the hasMenubar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMenubar() {
        return hasMenubar;
    }

    /**
     * Sets the value of the hasMenubar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMenubar(Boolean value) {
        this.hasMenubar = value;
    }

    /**
     * Gets the value of the hasScrollbars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasScrollbars() {
        return hasScrollbars;
    }

    /**
     * Sets the value of the hasScrollbars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasScrollbars(Boolean value) {
        this.hasScrollbars = value;
    }

    /**
     * Gets the value of the hasToolbar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasToolbar() {
        return hasToolbar;
    }

    /**
     * Sets the value of the hasToolbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasToolbar(Boolean value) {
        this.hasToolbar = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the isResizable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResizable() {
        return isResizable;
    }

    /**
     * Sets the value of the isResizable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResizable(Boolean value) {
        this.isResizable = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkType }
     *     
     */
    public WebLinkType getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkType }
     *     
     */
    public void setLinkType(WebLinkType value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLabel(String value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the openType property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkWindowType }
     *     
     */
    public WebLinkWindowType getOpenType() {
        return openType;
    }

    /**
     * Sets the value of the openType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkWindowType }
     *     
     */
    public void setOpenType(WebLinkWindowType value) {
        this.openType = value;
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link WebLinkPosition }
     *     
     */
    public WebLinkPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebLinkPosition }
     *     
     */
    public void setPosition(WebLinkPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the protected property.
     * 
     */
    public boolean isProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     */
    public void setProtected(boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the requireRowSelection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireRowSelection() {
        return requireRowSelection;
    }

    /**
     * Sets the value of the requireRowSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireRowSelection(Boolean value) {
        this.requireRowSelection = value;
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
     * Gets the value of the showsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowsLocation() {
        return showsLocation;
    }

    /**
     * Sets the value of the showsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowsLocation(Boolean value) {
        this.showsLocation = value;
    }

    /**
     * Gets the value of the showsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowsStatus() {
        return showsStatus;
    }

    /**
     * Sets the value of the showsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowsStatus(Boolean value) {
        this.showsStatus = value;
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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

}
