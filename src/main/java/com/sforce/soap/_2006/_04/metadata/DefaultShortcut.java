
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefaultShortcut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultShortcut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="keyCommand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultShortcut", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "action",
    "active",
    "keyCommand"
})
@XmlSeeAlso({
    CustomShortcut.class
})
public class DefaultShortcut {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String action;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String keyCommand;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the keyCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCommand() {
        return keyCommand;
    }

    /**
     * Sets the value of the keyCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCommand(String value) {
        this.keyCommand = value;
    }

}
