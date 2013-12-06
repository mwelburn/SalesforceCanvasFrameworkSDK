
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="applicationVisibilities" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetApplicationVisibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classAccesses" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetApexClassAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalDataSourceAccesses" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetExternalDataSourceAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldPermissions" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetFieldPermissions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectPermissions" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetObjectPermissions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageAccesses" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetApexPageAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordTypeVisibilities" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetRecordTypeVisibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tabSettings" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetTabSetting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPermissions" type="{http://soap.sforce.com/2006/04/metadata}PermissionSetUserPermission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSet", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "applicationVisibilities",
    "classAccesses",
    "description",
    "externalDataSourceAccesses",
    "fieldPermissions",
    "label",
    "objectPermissions",
    "pageAccesses",
    "recordTypeVisibilities",
    "tabSettings",
    "userLicense",
    "userPermissions"
})
public class PermissionSet
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetApplicationVisibility> applicationVisibilities;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetApexClassAccess> classAccesses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetExternalDataSourceAccess> externalDataSourceAccesses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetFieldPermissions> fieldPermissions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetObjectPermissions> objectPermissions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetApexPageAccess> pageAccesses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetRecordTypeVisibility> recordTypeVisibilities;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetTabSetting> tabSettings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String userLicense;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PermissionSetUserPermission> userPermissions;

    /**
     * Gets the value of the applicationVisibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationVisibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationVisibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetApplicationVisibility }
     * 
     * 
     */
    public List<PermissionSetApplicationVisibility> getApplicationVisibilities() {
        if (applicationVisibilities == null) {
            applicationVisibilities = new ArrayList<PermissionSetApplicationVisibility>();
        }
        return this.applicationVisibilities;
    }

    /**
     * Gets the value of the classAccesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classAccesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassAccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetApexClassAccess }
     * 
     * 
     */
    public List<PermissionSetApexClassAccess> getClassAccesses() {
        if (classAccesses == null) {
            classAccesses = new ArrayList<PermissionSetApexClassAccess>();
        }
        return this.classAccesses;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the externalDataSourceAccesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalDataSourceAccesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalDataSourceAccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetExternalDataSourceAccess }
     * 
     * 
     */
    public List<PermissionSetExternalDataSourceAccess> getExternalDataSourceAccesses() {
        if (externalDataSourceAccesses == null) {
            externalDataSourceAccesses = new ArrayList<PermissionSetExternalDataSourceAccess>();
        }
        return this.externalDataSourceAccesses;
    }

    /**
     * Gets the value of the fieldPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetFieldPermissions }
     * 
     * 
     */
    public List<PermissionSetFieldPermissions> getFieldPermissions() {
        if (fieldPermissions == null) {
            fieldPermissions = new ArrayList<PermissionSetFieldPermissions>();
        }
        return this.fieldPermissions;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the objectPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetObjectPermissions }
     * 
     * 
     */
    public List<PermissionSetObjectPermissions> getObjectPermissions() {
        if (objectPermissions == null) {
            objectPermissions = new ArrayList<PermissionSetObjectPermissions>();
        }
        return this.objectPermissions;
    }

    /**
     * Gets the value of the pageAccesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageAccesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageAccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetApexPageAccess }
     * 
     * 
     */
    public List<PermissionSetApexPageAccess> getPageAccesses() {
        if (pageAccesses == null) {
            pageAccesses = new ArrayList<PermissionSetApexPageAccess>();
        }
        return this.pageAccesses;
    }

    /**
     * Gets the value of the recordTypeVisibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordTypeVisibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordTypeVisibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetRecordTypeVisibility }
     * 
     * 
     */
    public List<PermissionSetRecordTypeVisibility> getRecordTypeVisibilities() {
        if (recordTypeVisibilities == null) {
            recordTypeVisibilities = new ArrayList<PermissionSetRecordTypeVisibility>();
        }
        return this.recordTypeVisibilities;
    }

    /**
     * Gets the value of the tabSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetTabSetting }
     * 
     * 
     */
    public List<PermissionSetTabSetting> getTabSettings() {
        if (tabSettings == null) {
            tabSettings = new ArrayList<PermissionSetTabSetting>();
        }
        return this.tabSettings;
    }

    /**
     * Gets the value of the userLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLicense() {
        return userLicense;
    }

    /**
     * Sets the value of the userLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLicense(String value) {
        this.userLicense = value;
    }

    /**
     * Gets the value of the userPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionSetUserPermission }
     * 
     * 
     */
    public List<PermissionSetUserPermission> getUserPermissions() {
        if (userPermissions == null) {
            userPermissions = new ArrayList<PermissionSetUserPermission>();
        }
        return this.userPermissions;
    }

}
