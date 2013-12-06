
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="applicationVisibilities" type="{http://soap.sforce.com/2006/04/metadata}ProfileApplicationVisibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classAccesses" type="{http://soap.sforce.com/2006/04/metadata}ProfileApexClassAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalDataSourceAccesses" type="{http://soap.sforce.com/2006/04/metadata}ProfileExternalDataSourceAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldPermissions" type="{http://soap.sforce.com/2006/04/metadata}ProfileFieldLevelSecurity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="layoutAssignments" type="{http://soap.sforce.com/2006/04/metadata}ProfileLayoutAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loginHours" type="{http://soap.sforce.com/2006/04/metadata}ProfileLoginHours" minOccurs="0"/>
 *         &lt;element name="loginIpRanges" type="{http://soap.sforce.com/2006/04/metadata}ProfileLoginIpRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objectPermissions" type="{http://soap.sforce.com/2006/04/metadata}ProfileObjectPermissions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageAccesses" type="{http://soap.sforce.com/2006/04/metadata}ProfileApexPageAccess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recordTypeVisibilities" type="{http://soap.sforce.com/2006/04/metadata}ProfileRecordTypeVisibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tabVisibilities" type="{http://soap.sforce.com/2006/04/metadata}ProfileTabVisibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPermissions" type="{http://soap.sforce.com/2006/04/metadata}ProfileUserPermission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "applicationVisibilities",
    "classAccesses",
    "externalDataSourceAccesses",
    "fieldPermissions",
    "layoutAssignments",
    "loginHours",
    "loginIpRanges",
    "objectPermissions",
    "pageAccesses",
    "recordTypeVisibilities",
    "tabVisibilities",
    "userLicense",
    "userPermissions"
})
public class Profile
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileApplicationVisibility> applicationVisibilities;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileApexClassAccess> classAccesses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileExternalDataSourceAccess> externalDataSourceAccesses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileFieldLevelSecurity> fieldPermissions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileLayoutAssignment> layoutAssignments;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ProfileLoginHours loginHours;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileLoginIpRange> loginIpRanges;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileObjectPermissions> objectPermissions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileApexPageAccess> pageAccesses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileRecordTypeVisibility> recordTypeVisibilities;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileTabVisibility> tabVisibilities;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String userLicense;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ProfileUserPermission> userPermissions;

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
     * {@link ProfileApplicationVisibility }
     * 
     * 
     */
    public List<ProfileApplicationVisibility> getApplicationVisibilities() {
        if (applicationVisibilities == null) {
            applicationVisibilities = new ArrayList<ProfileApplicationVisibility>();
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
     * {@link ProfileApexClassAccess }
     * 
     * 
     */
    public List<ProfileApexClassAccess> getClassAccesses() {
        if (classAccesses == null) {
            classAccesses = new ArrayList<ProfileApexClassAccess>();
        }
        return this.classAccesses;
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
     * {@link ProfileExternalDataSourceAccess }
     * 
     * 
     */
    public List<ProfileExternalDataSourceAccess> getExternalDataSourceAccesses() {
        if (externalDataSourceAccesses == null) {
            externalDataSourceAccesses = new ArrayList<ProfileExternalDataSourceAccess>();
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
     * {@link ProfileFieldLevelSecurity }
     * 
     * 
     */
    public List<ProfileFieldLevelSecurity> getFieldPermissions() {
        if (fieldPermissions == null) {
            fieldPermissions = new ArrayList<ProfileFieldLevelSecurity>();
        }
        return this.fieldPermissions;
    }

    /**
     * Gets the value of the layoutAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layoutAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayoutAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileLayoutAssignment }
     * 
     * 
     */
    public List<ProfileLayoutAssignment> getLayoutAssignments() {
        if (layoutAssignments == null) {
            layoutAssignments = new ArrayList<ProfileLayoutAssignment>();
        }
        return this.layoutAssignments;
    }

    /**
     * Gets the value of the loginHours property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileLoginHours }
     *     
     */
    public ProfileLoginHours getLoginHours() {
        return loginHours;
    }

    /**
     * Sets the value of the loginHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileLoginHours }
     *     
     */
    public void setLoginHours(ProfileLoginHours value) {
        this.loginHours = value;
    }

    /**
     * Gets the value of the loginIpRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loginIpRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoginIpRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileLoginIpRange }
     * 
     * 
     */
    public List<ProfileLoginIpRange> getLoginIpRanges() {
        if (loginIpRanges == null) {
            loginIpRanges = new ArrayList<ProfileLoginIpRange>();
        }
        return this.loginIpRanges;
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
     * {@link ProfileObjectPermissions }
     * 
     * 
     */
    public List<ProfileObjectPermissions> getObjectPermissions() {
        if (objectPermissions == null) {
            objectPermissions = new ArrayList<ProfileObjectPermissions>();
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
     * {@link ProfileApexPageAccess }
     * 
     * 
     */
    public List<ProfileApexPageAccess> getPageAccesses() {
        if (pageAccesses == null) {
            pageAccesses = new ArrayList<ProfileApexPageAccess>();
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
     * {@link ProfileRecordTypeVisibility }
     * 
     * 
     */
    public List<ProfileRecordTypeVisibility> getRecordTypeVisibilities() {
        if (recordTypeVisibilities == null) {
            recordTypeVisibilities = new ArrayList<ProfileRecordTypeVisibility>();
        }
        return this.recordTypeVisibilities;
    }

    /**
     * Gets the value of the tabVisibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabVisibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabVisibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileTabVisibility }
     * 
     * 
     */
    public List<ProfileTabVisibility> getTabVisibilities() {
        if (tabVisibilities == null) {
            tabVisibilities = new ArrayList<ProfileTabVisibility>();
        }
        return this.tabVisibilities;
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
     * {@link ProfileUserPermission }
     * 
     * 
     */
    public List<ProfileUserPermission> getUserPermissions() {
        if (userPermissions == null) {
            userPermissions = new ArrayList<ProfileUserPermission>();
        }
        return this.userPermissions;
    }

}
