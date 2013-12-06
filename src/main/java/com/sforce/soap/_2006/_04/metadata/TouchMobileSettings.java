
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TouchMobileSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TouchMobileSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableTouchAppIPad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableTouchAppIPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableTouchBrowserIPad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableTouchIosPhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableVisualforceInTouch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TouchMobileSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "enableTouchAppIPad",
    "enableTouchAppIPhone",
    "enableTouchBrowserIPad",
    "enableTouchIosPhone",
    "enableVisualforceInTouch"
})
public class TouchMobileSettings {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableTouchAppIPad;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableTouchAppIPhone;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableTouchBrowserIPad;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableTouchIosPhone;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableVisualforceInTouch;

    /**
     * Gets the value of the enableTouchAppIPad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTouchAppIPad() {
        return enableTouchAppIPad;
    }

    /**
     * Sets the value of the enableTouchAppIPad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTouchAppIPad(Boolean value) {
        this.enableTouchAppIPad = value;
    }

    /**
     * Gets the value of the enableTouchAppIPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTouchAppIPhone() {
        return enableTouchAppIPhone;
    }

    /**
     * Sets the value of the enableTouchAppIPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTouchAppIPhone(Boolean value) {
        this.enableTouchAppIPhone = value;
    }

    /**
     * Gets the value of the enableTouchBrowserIPad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTouchBrowserIPad() {
        return enableTouchBrowserIPad;
    }

    /**
     * Sets the value of the enableTouchBrowserIPad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTouchBrowserIPad(Boolean value) {
        this.enableTouchBrowserIPad = value;
    }

    /**
     * Gets the value of the enableTouchIosPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTouchIosPhone() {
        return enableTouchIosPhone;
    }

    /**
     * Sets the value of the enableTouchIosPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTouchIosPhone(Boolean value) {
        this.enableTouchIosPhone = value;
    }

    /**
     * Gets the value of the enableVisualforceInTouch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableVisualforceInTouch() {
        return enableVisualforceInTouch;
    }

    /**
     * Sets the value of the enableVisualforceInTouch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableVisualforceInTouch(Boolean value) {
        this.enableVisualforceInTouch = value;
    }

}
