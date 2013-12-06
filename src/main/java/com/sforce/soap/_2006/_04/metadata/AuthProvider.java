
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthProvider">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="authorizeUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumerSecret" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultScopes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executionUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="friendlyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerType" type="{http://soap.sforce.com/2006/04/metadata}AuthProviderType"/>
 *         &lt;element name="registrationHandler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userInfoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthProvider", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "authorizeUrl",
    "consumerKey",
    "consumerSecret",
    "defaultScopes",
    "errorUrl",
    "executionUser",
    "friendlyName",
    "portal",
    "providerType",
    "registrationHandler",
    "tokenUrl",
    "userInfoUrl"
})
public class AuthProvider
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String authorizeUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String consumerKey;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String consumerSecret;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultScopes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String errorUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String executionUser;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String friendlyName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String portal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected AuthProviderType providerType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String registrationHandler;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String tokenUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String userInfoUrl;

    /**
     * Gets the value of the authorizeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    /**
     * Sets the value of the authorizeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizeUrl(String value) {
        this.authorizeUrl = value;
    }

    /**
     * Gets the value of the consumerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * Sets the value of the consumerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerKey(String value) {
        this.consumerKey = value;
    }

    /**
     * Gets the value of the consumerSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * Sets the value of the consumerSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSecret(String value) {
        this.consumerSecret = value;
    }

    /**
     * Gets the value of the defaultScopes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultScopes() {
        return defaultScopes;
    }

    /**
     * Sets the value of the defaultScopes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultScopes(String value) {
        this.defaultScopes = value;
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
     * Gets the value of the executionUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionUser() {
        return executionUser;
    }

    /**
     * Sets the value of the executionUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionUser(String value) {
        this.executionUser = value;
    }

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the portal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortal() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortal(String value) {
        this.portal = value;
    }

    /**
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthProviderType }
     *     
     */
    public AuthProviderType getProviderType() {
        return providerType;
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthProviderType }
     *     
     */
    public void setProviderType(AuthProviderType value) {
        this.providerType = value;
    }

    /**
     * Gets the value of the registrationHandler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationHandler() {
        return registrationHandler;
    }

    /**
     * Sets the value of the registrationHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationHandler(String value) {
        this.registrationHandler = value;
    }

    /**
     * Gets the value of the tokenUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenUrl() {
        return tokenUrl;
    }

    /**
     * Sets the value of the tokenUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenUrl(String value) {
        this.tokenUrl = value;
    }

    /**
     * Gets the value of the userInfoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInfoUrl() {
        return userInfoUrl;
    }

    /**
     * Sets the value of the userInfoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInfoUrl(String value) {
        this.userInfoUrl = value;
    }

}
