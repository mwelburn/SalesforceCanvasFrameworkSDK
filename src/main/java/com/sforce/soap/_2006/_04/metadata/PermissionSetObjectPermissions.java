
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionSetObjectPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSetObjectPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowCreate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowEdit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowRead" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifyAllRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="object" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewAllRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSetObjectPermissions", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "allowCreate",
    "allowDelete",
    "allowEdit",
    "allowRead",
    "modifyAllRecords",
    "object",
    "viewAllRecords"
})
public class PermissionSetObjectPermissions {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean allowCreate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean allowDelete;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean allowEdit;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean allowRead;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean modifyAllRecords;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String object;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean viewAllRecords;

    /**
     * Gets the value of the allowCreate property.
     * 
     */
    public boolean isAllowCreate() {
        return allowCreate;
    }

    /**
     * Sets the value of the allowCreate property.
     * 
     */
    public void setAllowCreate(boolean value) {
        this.allowCreate = value;
    }

    /**
     * Gets the value of the allowDelete property.
     * 
     */
    public boolean isAllowDelete() {
        return allowDelete;
    }

    /**
     * Sets the value of the allowDelete property.
     * 
     */
    public void setAllowDelete(boolean value) {
        this.allowDelete = value;
    }

    /**
     * Gets the value of the allowEdit property.
     * 
     */
    public boolean isAllowEdit() {
        return allowEdit;
    }

    /**
     * Sets the value of the allowEdit property.
     * 
     */
    public void setAllowEdit(boolean value) {
        this.allowEdit = value;
    }

    /**
     * Gets the value of the allowRead property.
     * 
     */
    public boolean isAllowRead() {
        return allowRead;
    }

    /**
     * Sets the value of the allowRead property.
     * 
     */
    public void setAllowRead(boolean value) {
        this.allowRead = value;
    }

    /**
     * Gets the value of the modifyAllRecords property.
     * 
     */
    public boolean isModifyAllRecords() {
        return modifyAllRecords;
    }

    /**
     * Sets the value of the modifyAllRecords property.
     * 
     */
    public void setModifyAllRecords(boolean value) {
        this.modifyAllRecords = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
    }

    /**
     * Gets the value of the viewAllRecords property.
     * 
     */
    public boolean isViewAllRecords() {
        return viewAllRecords;
    }

    /**
     * Sets the value of the viewAllRecords property.
     * 
     */
    public void setViewAllRecords(boolean value) {
        this.viewAllRecords = value;
    }

}
