
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Branding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Branding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginFooterText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageFooter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaryComplementColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quaternaryColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quaternaryComplementColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondaryColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tertiaryColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tertiaryComplementColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeronaryColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeronaryComplementColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Branding", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "loginFooterText",
    "loginLogo",
    "pageFooter",
    "pageHeader",
    "primaryColor",
    "primaryComplementColor",
    "quaternaryColor",
    "quaternaryComplementColor",
    "secondaryColor",
    "tertiaryColor",
    "tertiaryComplementColor",
    "zeronaryColor",
    "zeronaryComplementColor"
})
public class Branding {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String loginFooterText;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String loginLogo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String pageFooter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String pageHeader;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String primaryColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String primaryComplementColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String quaternaryColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String quaternaryComplementColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String secondaryColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String tertiaryColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String tertiaryComplementColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String zeronaryColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String zeronaryComplementColor;

    /**
     * Gets the value of the loginFooterText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginFooterText() {
        return loginFooterText;
    }

    /**
     * Sets the value of the loginFooterText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginFooterText(String value) {
        this.loginFooterText = value;
    }

    /**
     * Gets the value of the loginLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginLogo() {
        return loginLogo;
    }

    /**
     * Sets the value of the loginLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginLogo(String value) {
        this.loginLogo = value;
    }

    /**
     * Gets the value of the pageFooter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageFooter() {
        return pageFooter;
    }

    /**
     * Sets the value of the pageFooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageFooter(String value) {
        this.pageFooter = value;
    }

    /**
     * Gets the value of the pageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageHeader() {
        return pageHeader;
    }

    /**
     * Sets the value of the pageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageHeader(String value) {
        this.pageHeader = value;
    }

    /**
     * Gets the value of the primaryColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryColor() {
        return primaryColor;
    }

    /**
     * Sets the value of the primaryColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryColor(String value) {
        this.primaryColor = value;
    }

    /**
     * Gets the value of the primaryComplementColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryComplementColor() {
        return primaryComplementColor;
    }

    /**
     * Sets the value of the primaryComplementColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryComplementColor(String value) {
        this.primaryComplementColor = value;
    }

    /**
     * Gets the value of the quaternaryColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuaternaryColor() {
        return quaternaryColor;
    }

    /**
     * Sets the value of the quaternaryColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuaternaryColor(String value) {
        this.quaternaryColor = value;
    }

    /**
     * Gets the value of the quaternaryComplementColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuaternaryComplementColor() {
        return quaternaryComplementColor;
    }

    /**
     * Sets the value of the quaternaryComplementColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuaternaryComplementColor(String value) {
        this.quaternaryComplementColor = value;
    }

    /**
     * Gets the value of the secondaryColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryColor() {
        return secondaryColor;
    }

    /**
     * Sets the value of the secondaryColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryColor(String value) {
        this.secondaryColor = value;
    }

    /**
     * Gets the value of the tertiaryColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiaryColor() {
        return tertiaryColor;
    }

    /**
     * Sets the value of the tertiaryColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiaryColor(String value) {
        this.tertiaryColor = value;
    }

    /**
     * Gets the value of the tertiaryComplementColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiaryComplementColor() {
        return tertiaryComplementColor;
    }

    /**
     * Sets the value of the tertiaryComplementColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiaryComplementColor(String value) {
        this.tertiaryComplementColor = value;
    }

    /**
     * Gets the value of the zeronaryColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeronaryColor() {
        return zeronaryColor;
    }

    /**
     * Sets the value of the zeronaryColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeronaryColor(String value) {
        this.zeronaryColor = value;
    }

    /**
     * Gets the value of the zeronaryComplementColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeronaryComplementColor() {
        return zeronaryComplementColor;
    }

    /**
     * Sets the value of the zeronaryComplementColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeronaryComplementColor(String value) {
        this.zeronaryComplementColor = value;
    }

}
