
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterheadHeaderFooter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterheadHeaderFooter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="horizontalAlignment" type="{http://soap.sforce.com/2006/04/metadata}LetterheadHorizontalAlignment" minOccurs="0"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verticalAlignment" type="{http://soap.sforce.com/2006/04/metadata}LetterheadVerticalAlignment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterheadHeaderFooter", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "backgroundColor",
    "height",
    "horizontalAlignment",
    "logo",
    "verticalAlignment"
})
public class LetterheadHeaderFooter {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String backgroundColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int height;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LetterheadHorizontalAlignment horizontalAlignment;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String logo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LetterheadVerticalAlignment verticalAlignment;

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the horizontalAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link LetterheadHorizontalAlignment }
     *     
     */
    public LetterheadHorizontalAlignment getHorizontalAlignment() {
        return horizontalAlignment;
    }

    /**
     * Sets the value of the horizontalAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterheadHorizontalAlignment }
     *     
     */
    public void setHorizontalAlignment(LetterheadHorizontalAlignment value) {
        this.horizontalAlignment = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the verticalAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link LetterheadVerticalAlignment }
     *     
     */
    public LetterheadVerticalAlignment getVerticalAlignment() {
        return verticalAlignment;
    }

    /**
     * Sets the value of the verticalAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterheadVerticalAlignment }
     *     
     */
    public void setVerticalAlignment(LetterheadVerticalAlignment value) {
        this.verticalAlignment = value;
    }

}
