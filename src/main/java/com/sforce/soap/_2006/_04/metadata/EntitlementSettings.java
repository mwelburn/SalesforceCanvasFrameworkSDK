
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitlementSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="assetLookupLimitedToActiveEntitlementsOnAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assetLookupLimitedToActiveEntitlementsOnContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assetLookupLimitedToSameAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assetLookupLimitedToSameContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableEntitlementVersioning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableEntitlements" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entitlementLookupLimitedToActiveStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="entitlementLookupLimitedToSameAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="entitlementLookupLimitedToSameAsset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="entitlementLookupLimitedToSameContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "assetLookupLimitedToActiveEntitlementsOnAccount",
    "assetLookupLimitedToActiveEntitlementsOnContact",
    "assetLookupLimitedToSameAccount",
    "assetLookupLimitedToSameContact",
    "enableEntitlementVersioning",
    "enableEntitlements",
    "entitlementLookupLimitedToActiveStatus",
    "entitlementLookupLimitedToSameAccount",
    "entitlementLookupLimitedToSameAsset",
    "entitlementLookupLimitedToSameContact"
})
public class EntitlementSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean assetLookupLimitedToActiveEntitlementsOnAccount;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean assetLookupLimitedToActiveEntitlementsOnContact;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean assetLookupLimitedToSameAccount;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean assetLookupLimitedToSameContact;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean enableEntitlementVersioning;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean enableEntitlements;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean entitlementLookupLimitedToActiveStatus;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean entitlementLookupLimitedToSameAccount;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean entitlementLookupLimitedToSameAsset;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean entitlementLookupLimitedToSameContact;

    /**
     * Gets the value of the assetLookupLimitedToActiveEntitlementsOnAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssetLookupLimitedToActiveEntitlementsOnAccount() {
        return assetLookupLimitedToActiveEntitlementsOnAccount;
    }

    /**
     * Sets the value of the assetLookupLimitedToActiveEntitlementsOnAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssetLookupLimitedToActiveEntitlementsOnAccount(Boolean value) {
        this.assetLookupLimitedToActiveEntitlementsOnAccount = value;
    }

    /**
     * Gets the value of the assetLookupLimitedToActiveEntitlementsOnContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssetLookupLimitedToActiveEntitlementsOnContact() {
        return assetLookupLimitedToActiveEntitlementsOnContact;
    }

    /**
     * Sets the value of the assetLookupLimitedToActiveEntitlementsOnContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssetLookupLimitedToActiveEntitlementsOnContact(Boolean value) {
        this.assetLookupLimitedToActiveEntitlementsOnContact = value;
    }

    /**
     * Gets the value of the assetLookupLimitedToSameAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssetLookupLimitedToSameAccount() {
        return assetLookupLimitedToSameAccount;
    }

    /**
     * Sets the value of the assetLookupLimitedToSameAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssetLookupLimitedToSameAccount(Boolean value) {
        this.assetLookupLimitedToSameAccount = value;
    }

    /**
     * Gets the value of the assetLookupLimitedToSameContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssetLookupLimitedToSameContact() {
        return assetLookupLimitedToSameContact;
    }

    /**
     * Sets the value of the assetLookupLimitedToSameContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssetLookupLimitedToSameContact(Boolean value) {
        this.assetLookupLimitedToSameContact = value;
    }

    /**
     * Gets the value of the enableEntitlementVersioning property.
     * 
     */
    public boolean isEnableEntitlementVersioning() {
        return enableEntitlementVersioning;
    }

    /**
     * Sets the value of the enableEntitlementVersioning property.
     * 
     */
    public void setEnableEntitlementVersioning(boolean value) {
        this.enableEntitlementVersioning = value;
    }

    /**
     * Gets the value of the enableEntitlements property.
     * 
     */
    public boolean isEnableEntitlements() {
        return enableEntitlements;
    }

    /**
     * Sets the value of the enableEntitlements property.
     * 
     */
    public void setEnableEntitlements(boolean value) {
        this.enableEntitlements = value;
    }

    /**
     * Gets the value of the entitlementLookupLimitedToActiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntitlementLookupLimitedToActiveStatus() {
        return entitlementLookupLimitedToActiveStatus;
    }

    /**
     * Sets the value of the entitlementLookupLimitedToActiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntitlementLookupLimitedToActiveStatus(Boolean value) {
        this.entitlementLookupLimitedToActiveStatus = value;
    }

    /**
     * Gets the value of the entitlementLookupLimitedToSameAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntitlementLookupLimitedToSameAccount() {
        return entitlementLookupLimitedToSameAccount;
    }

    /**
     * Sets the value of the entitlementLookupLimitedToSameAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntitlementLookupLimitedToSameAccount(Boolean value) {
        this.entitlementLookupLimitedToSameAccount = value;
    }

    /**
     * Gets the value of the entitlementLookupLimitedToSameAsset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntitlementLookupLimitedToSameAsset() {
        return entitlementLookupLimitedToSameAsset;
    }

    /**
     * Sets the value of the entitlementLookupLimitedToSameAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntitlementLookupLimitedToSameAsset(Boolean value) {
        this.entitlementLookupLimitedToSameAsset = value;
    }

    /**
     * Gets the value of the entitlementLookupLimitedToSameContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntitlementLookupLimitedToSameContact() {
        return entitlementLookupLimitedToSameContact;
    }

    /**
     * Sets the value of the entitlementLookupLimitedToSameContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntitlementLookupLimitedToSameContact(Boolean value) {
        this.entitlementLookupLimitedToSameContact = value;
    }

}
