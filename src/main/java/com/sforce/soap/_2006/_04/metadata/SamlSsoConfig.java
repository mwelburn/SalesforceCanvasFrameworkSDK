
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamlSsoConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamlSsoConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeNameIdFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityLocation" type="{http://soap.sforce.com/2006/04/metadata}SamlIdentityLocationType"/>
 *         &lt;element name="identityMapping" type="{http://soap.sforce.com/2006/04/metadata}SamlIdentityType"/>
 *         &lt;element name="issuer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loginUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logoutUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oauthTokenEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redirectBinding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="salesforceLoginUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="samlEntityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="samlVersion" type="{http://soap.sforce.com/2006/04/metadata}SamlType"/>
 *         &lt;element name="userProvisioning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="validationCert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamlSsoConfig", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "attributeName",
    "attributeNameIdFormat",
    "errorUrl",
    "identityLocation",
    "identityMapping",
    "issuer",
    "loginUrl",
    "logoutUrl",
    "name",
    "oauthTokenEndpoint",
    "redirectBinding",
    "salesforceLoginUrl",
    "samlEntityId",
    "samlVersion",
    "userProvisioning",
    "validationCert"
})
public class SamlSsoConfig
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String attributeName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String attributeNameIdFormat;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String errorUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SamlIdentityLocationType identityLocation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SamlIdentityType identityMapping;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String issuer;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String loginUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String logoutUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String oauthTokenEndpoint;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean redirectBinding;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String salesforceLoginUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String samlEntityId;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SamlType samlVersion;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean userProvisioning;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String validationCert;

    /**
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Gets the value of the attributeNameIdFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeNameIdFormat() {
        return attributeNameIdFormat;
    }

    /**
     * Sets the value of the attributeNameIdFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeNameIdFormat(String value) {
        this.attributeNameIdFormat = value;
    }

    /**
     * Gets the value of the errorUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUrl() {
        return errorUrl;
    }

    /**
     * Sets the value of the errorUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUrl(String value) {
        this.errorUrl = value;
    }

    /**
     * Gets the value of the identityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SamlIdentityLocationType }
     *     
     */
    public SamlIdentityLocationType getIdentityLocation() {
        return identityLocation;
    }

    /**
     * Sets the value of the identityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamlIdentityLocationType }
     *     
     */
    public void setIdentityLocation(SamlIdentityLocationType value) {
        this.identityLocation = value;
    }

    /**
     * Gets the value of the identityMapping property.
     * 
     * @return
     *     possible object is
     *     {@link SamlIdentityType }
     *     
     */
    public SamlIdentityType getIdentityMapping() {
        return identityMapping;
    }

    /**
     * Sets the value of the identityMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamlIdentityType }
     *     
     */
    public void setIdentityMapping(SamlIdentityType value) {
        this.identityMapping = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the loginUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    /**
     * Sets the value of the loginUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUrl(String value) {
        this.loginUrl = value;
    }

    /**
     * Gets the value of the logoutUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutUrl() {
        return logoutUrl;
    }

    /**
     * Sets the value of the logoutUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutUrl(String value) {
        this.logoutUrl = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the oauthTokenEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthTokenEndpoint() {
        return oauthTokenEndpoint;
    }

    /**
     * Sets the value of the oauthTokenEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthTokenEndpoint(String value) {
        this.oauthTokenEndpoint = value;
    }

    /**
     * Gets the value of the redirectBinding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedirectBinding() {
        return redirectBinding;
    }

    /**
     * Sets the value of the redirectBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedirectBinding(Boolean value) {
        this.redirectBinding = value;
    }

    /**
     * Gets the value of the salesforceLoginUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesforceLoginUrl() {
        return salesforceLoginUrl;
    }

    /**
     * Sets the value of the salesforceLoginUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesforceLoginUrl(String value) {
        this.salesforceLoginUrl = value;
    }

    /**
     * Gets the value of the samlEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamlEntityId() {
        return samlEntityId;
    }

    /**
     * Sets the value of the samlEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamlEntityId(String value) {
        this.samlEntityId = value;
    }

    /**
     * Gets the value of the samlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SamlType }
     *     
     */
    public SamlType getSamlVersion() {
        return samlVersion;
    }

    /**
     * Sets the value of the samlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamlType }
     *     
     */
    public void setSamlVersion(SamlType value) {
        this.samlVersion = value;
    }

    /**
     * Gets the value of the userProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserProvisioning() {
        return userProvisioning;
    }

    /**
     * Sets the value of the userProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserProvisioning(Boolean value) {
        this.userProvisioning = value;
    }

    /**
     * Gets the value of the validationCert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCert() {
        return validationCert;
    }

    /**
     * Sets the value of the validationCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCert(String value) {
        this.validationCert = value;
    }

}
