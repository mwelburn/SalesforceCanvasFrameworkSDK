
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomConsoleComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomConsoleComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryTabComponents" type="{http://soap.sforce.com/2006/04/metadata}PrimaryTabComponents" minOccurs="0"/>
 *         &lt;element name="subtabComponents" type="{http://soap.sforce.com/2006/04/metadata}SubtabComponents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomConsoleComponents", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "primaryTabComponents",
    "subtabComponents"
})
public class CustomConsoleComponents {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected PrimaryTabComponents primaryTabComponents;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SubtabComponents subtabComponents;

    /**
     * Gets the value of the primaryTabComponents property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryTabComponents }
     *     
     */
    public PrimaryTabComponents getPrimaryTabComponents() {
        return primaryTabComponents;
    }

    /**
     * Sets the value of the primaryTabComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryTabComponents }
     *     
     */
    public void setPrimaryTabComponents(PrimaryTabComponents value) {
        this.primaryTabComponents = value;
    }

    /**
     * Gets the value of the subtabComponents property.
     * 
     * @return
     *     possible object is
     *     {@link SubtabComponents }
     *     
     */
    public SubtabComponents getSubtabComponents() {
        return subtabComponents;
    }

    /**
     * Sets the value of the subtabComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtabComponents }
     *     
     */
    public void setSubtabComponents(SubtabComponents value) {
        this.subtabComponents = value;
    }

}
