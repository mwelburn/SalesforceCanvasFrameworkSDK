
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomApplicationComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomApplicationComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="buttonIconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buttonStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buttonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buttonWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isHeightFixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isWidthFixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="visualforcePage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomApplicationComponent", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "buttonIconUrl",
    "buttonStyle",
    "buttonText",
    "buttonWidth",
    "height",
    "isHeightFixed",
    "isHidden",
    "isWidthFixed",
    "visualforcePage",
    "width"
})
public class CustomApplicationComponent
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String buttonIconUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String buttonStyle;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String buttonText;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer buttonWidth;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer height;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean isHeightFixed;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean isHidden;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean isWidthFixed;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String visualforcePage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer width;

    /**
     * Gets the value of the buttonIconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonIconUrl() {
        return buttonIconUrl;
    }

    /**
     * Sets the value of the buttonIconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonIconUrl(String value) {
        this.buttonIconUrl = value;
    }

    /**
     * Gets the value of the buttonStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonStyle() {
        return buttonStyle;
    }

    /**
     * Sets the value of the buttonStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonStyle(String value) {
        this.buttonStyle = value;
    }

    /**
     * Gets the value of the buttonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonText() {
        return buttonText;
    }

    /**
     * Sets the value of the buttonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonText(String value) {
        this.buttonText = value;
    }

    /**
     * Gets the value of the buttonWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getButtonWidth() {
        return buttonWidth;
    }

    /**
     * Sets the value of the buttonWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setButtonWidth(Integer value) {
        this.buttonWidth = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the isHeightFixed property.
     * 
     */
    public boolean isIsHeightFixed() {
        return isHeightFixed;
    }

    /**
     * Sets the value of the isHeightFixed property.
     * 
     */
    public void setIsHeightFixed(boolean value) {
        this.isHeightFixed = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the isWidthFixed property.
     * 
     */
    public boolean isIsWidthFixed() {
        return isWidthFixed;
    }

    /**
     * Sets the value of the isWidthFixed property.
     * 
     */
    public void setIsWidthFixed(boolean value) {
        this.isWidthFixed = value;
    }

    /**
     * Gets the value of the visualforcePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualforcePage() {
        return visualforcePage;
    }

    /**
     * Sets the value of the visualforcePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualforcePage(String value) {
        this.visualforcePage = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

}
