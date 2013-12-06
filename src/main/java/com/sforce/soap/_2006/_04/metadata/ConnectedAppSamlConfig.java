
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedAppSamlConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedAppSamlConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acsUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="samlNameIdFormat" type="{http://soap.sforce.com/2006/04/metadata}SamlNameIdFormatType" minOccurs="0"/>
 *         &lt;element name="samlSubjectCustomAttr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="samlSubjectType" type="{http://soap.sforce.com/2006/04/metadata}SamlSubjectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedAppSamlConfig", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "acsUrl",
    "certificate",
    "entityUrl",
    "issuer",
    "samlNameIdFormat",
    "samlSubjectCustomAttr",
    "samlSubjectType"
})
public class ConnectedAppSamlConfig {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String acsUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String certificate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String entityUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String issuer;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SamlNameIdFormatType samlNameIdFormat;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String samlSubjectCustomAttr;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SamlSubjectType samlSubjectType;

    /**
     * Gets the value of the acsUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsUrl() {
        return acsUrl;
    }

    /**
     * Sets the value of the acsUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsUrl(String value) {
        this.acsUrl = value;
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
     * Gets the value of the entityUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityUrl() {
        return entityUrl;
    }

    /**
     * Sets the value of the entityUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityUrl(String value) {
        this.entityUrl = value;
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
     * Gets the value of the samlNameIdFormat property.
     * 
     * @return
     *     possible object is
     *     {@link SamlNameIdFormatType }
     *     
     */
    public SamlNameIdFormatType getSamlNameIdFormat() {
        return samlNameIdFormat;
    }

    /**
     * Sets the value of the samlNameIdFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamlNameIdFormatType }
     *     
     */
    public void setSamlNameIdFormat(SamlNameIdFormatType value) {
        this.samlNameIdFormat = value;
    }

    /**
     * Gets the value of the samlSubjectCustomAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamlSubjectCustomAttr() {
        return samlSubjectCustomAttr;
    }

    /**
     * Sets the value of the samlSubjectCustomAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamlSubjectCustomAttr(String value) {
        this.samlSubjectCustomAttr = value;
    }

    /**
     * Gets the value of the samlSubjectType property.
     * 
     * @return
     *     possible object is
     *     {@link SamlSubjectType }
     *     
     */
    public SamlSubjectType getSamlSubjectType() {
        return samlSubjectType;
    }

    /**
     * Sets the value of the samlSubjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamlSubjectType }
     *     
     */
    public void setSamlSubjectType(SamlSubjectType value) {
        this.samlSubjectType = value;
    }

}
