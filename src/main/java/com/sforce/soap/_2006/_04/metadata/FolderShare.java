
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderShare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolderShare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessLevel" type="{http://soap.sforce.com/2006/04/metadata}FolderShareAccessLevel"/>
 *         &lt;element name="sharedTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sharedToType" type="{http://soap.sforce.com/2006/04/metadata}FolderSharedToType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderShare", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "accessLevel",
    "sharedTo",
    "sharedToType"
})
public class FolderShare {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FolderShareAccessLevel accessLevel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String sharedTo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FolderSharedToType sharedToType;

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link FolderShareAccessLevel }
     *     
     */
    public FolderShareAccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderShareAccessLevel }
     *     
     */
    public void setAccessLevel(FolderShareAccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the sharedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedTo() {
        return sharedTo;
    }

    /**
     * Sets the value of the sharedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedTo(String value) {
        this.sharedTo = value;
    }

    /**
     * Gets the value of the sharedToType property.
     * 
     * @return
     *     possible object is
     *     {@link FolderSharedToType }
     *     
     */
    public FolderSharedToType getSharedToType() {
        return sharedToType;
    }

    /**
     * Sets the value of the sharedToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderSharedToType }
     *     
     */
    public void setSharedToType(FolderSharedToType value) {
        this.sharedToType = value;
    }

}
