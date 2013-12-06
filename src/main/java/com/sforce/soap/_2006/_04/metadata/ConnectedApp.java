
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedApp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedApp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://soap.sforce.com/2006/04/metadata}ConnectedAppAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="canvasConfig" type="{http://soap.sforce.com/2006/04/metadata}ConnectedAppCanvasConfig" minOccurs="0"/>
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipRanges" type="{http://soap.sforce.com/2006/04/metadata}ConnectedAppIpRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileStartUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauthConfig" type="{http://soap.sforce.com/2006/04/metadata}ConnectedAppOauthConfig" minOccurs="0"/>
 *         &lt;element name="samlConfig" type="{http://soap.sforce.com/2006/04/metadata}ConnectedAppSamlConfig" minOccurs="0"/>
 *         &lt;element name="startUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedApp", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "attributes",
    "canvasConfig",
    "contactEmail",
    "contactPhone",
    "description",
    "iconUrl",
    "infoUrl",
    "ipRanges",
    "label",
    "logoUrl",
    "mobileStartUrl",
    "oauthConfig",
    "samlConfig",
    "startUrl"
})
public class ConnectedApp
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ConnectedAppAttribute> attributes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ConnectedAppCanvasConfig canvasConfig;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String contactEmail;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String contactPhone;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String iconUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String infoUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ConnectedAppIpRange> ipRanges;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String logoUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String mobileStartUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ConnectedAppOauthConfig oauthConfig;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ConnectedAppSamlConfig samlConfig;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String startUrl;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectedAppAttribute }
     * 
     * 
     */
    public List<ConnectedAppAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<ConnectedAppAttribute>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the canvasConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedAppCanvasConfig }
     *     
     */
    public ConnectedAppCanvasConfig getCanvasConfig() {
        return canvasConfig;
    }

    /**
     * Sets the value of the canvasConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedAppCanvasConfig }
     *     
     */
    public void setCanvasConfig(ConnectedAppCanvasConfig value) {
        this.canvasConfig = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
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
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrl(String value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the infoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoUrl() {
        return infoUrl;
    }

    /**
     * Sets the value of the infoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoUrl(String value) {
        this.infoUrl = value;
    }

    /**
     * Gets the value of the ipRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectedAppIpRange }
     * 
     * 
     */
    public List<ConnectedAppIpRange> getIpRanges() {
        if (ipRanges == null) {
            ipRanges = new ArrayList<ConnectedAppIpRange>();
        }
        return this.ipRanges;
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
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

    /**
     * Gets the value of the mobileStartUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileStartUrl() {
        return mobileStartUrl;
    }

    /**
     * Sets the value of the mobileStartUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileStartUrl(String value) {
        this.mobileStartUrl = value;
    }

    /**
     * Gets the value of the oauthConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedAppOauthConfig }
     *     
     */
    public ConnectedAppOauthConfig getOauthConfig() {
        return oauthConfig;
    }

    /**
     * Sets the value of the oauthConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedAppOauthConfig }
     *     
     */
    public void setOauthConfig(ConnectedAppOauthConfig value) {
        this.oauthConfig = value;
    }

    /**
     * Gets the value of the samlConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedAppSamlConfig }
     *     
     */
    public ConnectedAppSamlConfig getSamlConfig() {
        return samlConfig;
    }

    /**
     * Sets the value of the samlConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedAppSamlConfig }
     *     
     */
    public void setSamlConfig(ConnectedAppSamlConfig value) {
        this.samlConfig = value;
    }

    /**
     * Gets the value of the startUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartUrl() {
        return startUrl;
    }

    /**
     * Sets the value of the startUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartUrl(String value) {
        this.startUrl = value;
    }

}
