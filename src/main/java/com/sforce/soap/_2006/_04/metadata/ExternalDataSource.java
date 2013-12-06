
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalDataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalDataSource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customConfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oauthRefreshToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauthScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalType" type="{http://soap.sforce.com/2006/04/metadata}ExternalPrincipalType"/>
 *         &lt;element name="protocol" type="{http://soap.sforce.com/2006/04/metadata}AuthenticationProtocol"/>
 *         &lt;element name="remoteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repository" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://soap.sforce.com/2006/04/metadata}ExternalDataSourceType"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalDataSource", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apiKey",
    "authProvider",
    "certificate",
    "customConfiguration",
    "endpoint",
    "label",
    "oauthRefreshToken",
    "oauthScope",
    "oauthToken",
    "password",
    "principalType",
    "protocol",
    "remoteIdentifier",
    "repository",
    "type",
    "username",
    "version"
})
public class ExternalDataSource
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String apiKey;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String authProvider;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String certificate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String customConfiguration;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String endpoint;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String oauthRefreshToken;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String oauthScope;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String oauthToken;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String password;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ExternalPrincipalType principalType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected AuthenticationProtocol protocol;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String remoteIdentifier;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String repository;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String type;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String username;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String version;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the authProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthProvider() {
        return authProvider;
    }

    /**
     * Sets the value of the authProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthProvider(String value) {
        this.authProvider = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Sets the value of the certificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
    }

    /**
     * Gets the value of the customConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomConfiguration() {
        return customConfiguration;
    }

    /**
     * Sets the value of the customConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomConfiguration(String value) {
        this.customConfiguration = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpoint(String value) {
        this.endpoint = value;
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
     * Gets the value of the oauthRefreshToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthRefreshToken() {
        return oauthRefreshToken;
    }

    /**
     * Sets the value of the oauthRefreshToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthRefreshToken(String value) {
        this.oauthRefreshToken = value;
    }

    /**
     * Gets the value of the oauthScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthScope() {
        return oauthScope;
    }

    /**
     * Sets the value of the oauthScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthScope(String value) {
        this.oauthScope = value;
    }

    /**
     * Gets the value of the oauthToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthToken() {
        return oauthToken;
    }

    /**
     * Sets the value of the oauthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthToken(String value) {
        this.oauthToken = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the principalType property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPrincipalType }
     *     
     */
    public ExternalPrincipalType getPrincipalType() {
        return principalType;
    }

    /**
     * Sets the value of the principalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPrincipalType }
     *     
     */
    public void setPrincipalType(ExternalPrincipalType value) {
        this.principalType = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationProtocol }
     *     
     */
    public AuthenticationProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationProtocol }
     *     
     */
    public void setProtocol(AuthenticationProtocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the remoteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIdentifier() {
        return remoteIdentifier;
    }

    /**
     * Sets the value of the remoteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIdentifier(String value) {
        this.remoteIdentifier = value;
    }

    /**
     * Gets the value of the repository property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepository() {
        return repository;
    }

    /**
     * Sets the value of the repository property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepository(String value) {
        this.repository = value;
    }

    /**
     * Gets the value of the type property.
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
     * Sets the value of the type property.
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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
