
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveChatDeployment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveChatDeployment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="brandingImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainWhiteList" type="{http://soap.sforce.com/2006/04/metadata}LiveChatDeploymentDomainWhitelist" minOccurs="0"/>
 *         &lt;element name="enablePrechatApi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableTranscriptSave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobileBrandingImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="windowTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveChatDeployment", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "brandingImage",
    "domainWhiteList",
    "enablePrechatApi",
    "enableTranscriptSave",
    "label",
    "mobileBrandingImage",
    "site",
    "windowTitle"
})
public class LiveChatDeployment
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String brandingImage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LiveChatDeploymentDomainWhitelist domainWhiteList;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enablePrechatApi;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableTranscriptSave;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String mobileBrandingImage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String site;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String windowTitle;

    /**
     * Gets the value of the brandingImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingImage() {
        return brandingImage;
    }

    /**
     * Sets the value of the brandingImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingImage(String value) {
        this.brandingImage = value;
    }

    /**
     * Gets the value of the domainWhiteList property.
     * 
     * @return
     *     possible object is
     *     {@link LiveChatDeploymentDomainWhitelist }
     *     
     */
    public LiveChatDeploymentDomainWhitelist getDomainWhiteList() {
        return domainWhiteList;
    }

    /**
     * Sets the value of the domainWhiteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveChatDeploymentDomainWhitelist }
     *     
     */
    public void setDomainWhiteList(LiveChatDeploymentDomainWhitelist value) {
        this.domainWhiteList = value;
    }

    /**
     * Gets the value of the enablePrechatApi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnablePrechatApi() {
        return enablePrechatApi;
    }

    /**
     * Sets the value of the enablePrechatApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePrechatApi(Boolean value) {
        this.enablePrechatApi = value;
    }

    /**
     * Gets the value of the enableTranscriptSave property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTranscriptSave() {
        return enableTranscriptSave;
    }

    /**
     * Sets the value of the enableTranscriptSave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTranscriptSave(Boolean value) {
        this.enableTranscriptSave = value;
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
     * Gets the value of the mobileBrandingImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileBrandingImage() {
        return mobileBrandingImage;
    }

    /**
     * Sets the value of the mobileBrandingImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileBrandingImage(String value) {
        this.mobileBrandingImage = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the windowTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowTitle() {
        return windowTitle;
    }

    /**
     * Sets the value of the windowTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowTitle(String value) {
        this.windowTitle = value;
    }

}
