
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebToCaseSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebToCaseSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultResponseTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableWebToCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebToCaseSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "caseOrigin",
    "defaultResponseTemplate",
    "enableWebToCase"
})
public class WebToCaseSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String caseOrigin;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultResponseTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableWebToCase;

    /**
     * Gets the value of the caseOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOrigin() {
        return caseOrigin;
    }

    /**
     * Sets the value of the caseOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOrigin(String value) {
        this.caseOrigin = value;
    }

    /**
     * Gets the value of the defaultResponseTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultResponseTemplate() {
        return defaultResponseTemplate;
    }

    /**
     * Sets the value of the defaultResponseTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultResponseTemplate(String value) {
        this.defaultResponseTemplate = value;
    }

    /**
     * Gets the value of the enableWebToCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableWebToCase() {
        return enableWebToCase;
    }

    /**
     * Sets the value of the enableWebToCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableWebToCase(Boolean value) {
        this.enableWebToCase = value;
    }

}
