
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowHomePage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowStandardAnswersPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowStandardIdeasPages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowStandardLookups" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowStandardSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="analyticsTrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationRequiredPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bandwidthExceededPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changePasswordPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chatterAnswersForgotPasswordConfirmPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chatterAnswersForgotPasswordPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chatterAnswersHelpPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chatterAnswersLoginPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chatterAnswersRegistrationPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customWebAddresses" type="{http://soap.sforce.com/2006/04/metadata}SiteWebAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="favoriteIcon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileNotFoundPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genericErrorPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guestProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inMaintenancePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inactiveIndexPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexPage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="masterLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="myProfilePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requireInsecurePortalAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="robotsTxtPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rootComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverIsDown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteAdmin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteRedirectMappings" type="{http://soap.sforce.com/2006/04/metadata}SiteRedirectMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="siteTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteType" type="{http://soap.sforce.com/2006/04/metadata}SiteType"/>
 *         &lt;element name="subdomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlPathPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSite", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "allowHomePage",
    "allowStandardAnswersPages",
    "allowStandardIdeasPages",
    "allowStandardLookups",
    "allowStandardSearch",
    "analyticsTrackingCode",
    "authorizationRequiredPage",
    "bandwidthExceededPage",
    "changePasswordPage",
    "chatterAnswersForgotPasswordConfirmPage",
    "chatterAnswersForgotPasswordPage",
    "chatterAnswersHelpPage",
    "chatterAnswersLoginPage",
    "chatterAnswersRegistrationPage",
    "customWebAddresses",
    "description",
    "favoriteIcon",
    "fileNotFoundPage",
    "genericErrorPage",
    "guestProfile",
    "inMaintenancePage",
    "inactiveIndexPage",
    "indexPage",
    "masterLabel",
    "myProfilePage",
    "portal",
    "requireInsecurePortalAccess",
    "robotsTxtPage",
    "rootComponent",
    "serverIsDown",
    "siteAdmin",
    "siteRedirectMappings",
    "siteTemplate",
    "siteType",
    "subdomain",
    "urlPathPrefix"
})
public class CustomSite
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean active;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean allowHomePage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean allowStandardAnswersPages;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean allowStandardIdeasPages;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean allowStandardLookups;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean allowStandardSearch;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String analyticsTrackingCode;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String authorizationRequiredPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String bandwidthExceededPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String changePasswordPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String chatterAnswersForgotPasswordConfirmPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String chatterAnswersForgotPasswordPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String chatterAnswersHelpPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String chatterAnswersLoginPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String chatterAnswersRegistrationPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<SiteWebAddress> customWebAddresses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String favoriteIcon;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String fileNotFoundPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String genericErrorPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String guestProfile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String inMaintenancePage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String inactiveIndexPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String indexPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String masterLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String myProfilePage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String portal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean requireInsecurePortalAccess;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String robotsTxtPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String rootComponent;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String serverIsDown;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String siteAdmin;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<SiteRedirectMapping> siteRedirectMappings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String siteTemplate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SiteType siteType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String subdomain;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String urlPathPrefix;

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
     * Gets the value of the allowHomePage property.
     * 
     */
    public boolean isAllowHomePage() {
        return allowHomePage;
    }

    /**
     * Sets the value of the allowHomePage property.
     * 
     */
    public void setAllowHomePage(boolean value) {
        this.allowHomePage = value;
    }

    /**
     * Gets the value of the allowStandardAnswersPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowStandardAnswersPages() {
        return allowStandardAnswersPages;
    }

    /**
     * Sets the value of the allowStandardAnswersPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowStandardAnswersPages(Boolean value) {
        this.allowStandardAnswersPages = value;
    }

    /**
     * Gets the value of the allowStandardIdeasPages property.
     * 
     */
    public boolean isAllowStandardIdeasPages() {
        return allowStandardIdeasPages;
    }

    /**
     * Sets the value of the allowStandardIdeasPages property.
     * 
     */
    public void setAllowStandardIdeasPages(boolean value) {
        this.allowStandardIdeasPages = value;
    }

    /**
     * Gets the value of the allowStandardLookups property.
     * 
     */
    public boolean isAllowStandardLookups() {
        return allowStandardLookups;
    }

    /**
     * Sets the value of the allowStandardLookups property.
     * 
     */
    public void setAllowStandardLookups(boolean value) {
        this.allowStandardLookups = value;
    }

    /**
     * Gets the value of the allowStandardSearch property.
     * 
     */
    public boolean isAllowStandardSearch() {
        return allowStandardSearch;
    }

    /**
     * Sets the value of the allowStandardSearch property.
     * 
     */
    public void setAllowStandardSearch(boolean value) {
        this.allowStandardSearch = value;
    }

    /**
     * Gets the value of the analyticsTrackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalyticsTrackingCode() {
        return analyticsTrackingCode;
    }

    /**
     * Sets the value of the analyticsTrackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalyticsTrackingCode(String value) {
        this.analyticsTrackingCode = value;
    }

    /**
     * Gets the value of the authorizationRequiredPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationRequiredPage() {
        return authorizationRequiredPage;
    }

    /**
     * Sets the value of the authorizationRequiredPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationRequiredPage(String value) {
        this.authorizationRequiredPage = value;
    }

    /**
     * Gets the value of the bandwidthExceededPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidthExceededPage() {
        return bandwidthExceededPage;
    }

    /**
     * Sets the value of the bandwidthExceededPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidthExceededPage(String value) {
        this.bandwidthExceededPage = value;
    }

    /**
     * Gets the value of the changePasswordPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangePasswordPage() {
        return changePasswordPage;
    }

    /**
     * Sets the value of the changePasswordPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangePasswordPage(String value) {
        this.changePasswordPage = value;
    }

    /**
     * Gets the value of the chatterAnswersForgotPasswordConfirmPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChatterAnswersForgotPasswordConfirmPage() {
        return chatterAnswersForgotPasswordConfirmPage;
    }

    /**
     * Sets the value of the chatterAnswersForgotPasswordConfirmPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChatterAnswersForgotPasswordConfirmPage(String value) {
        this.chatterAnswersForgotPasswordConfirmPage = value;
    }

    /**
     * Gets the value of the chatterAnswersForgotPasswordPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChatterAnswersForgotPasswordPage() {
        return chatterAnswersForgotPasswordPage;
    }

    /**
     * Sets the value of the chatterAnswersForgotPasswordPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChatterAnswersForgotPasswordPage(String value) {
        this.chatterAnswersForgotPasswordPage = value;
    }

    /**
     * Gets the value of the chatterAnswersHelpPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChatterAnswersHelpPage() {
        return chatterAnswersHelpPage;
    }

    /**
     * Sets the value of the chatterAnswersHelpPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChatterAnswersHelpPage(String value) {
        this.chatterAnswersHelpPage = value;
    }

    /**
     * Gets the value of the chatterAnswersLoginPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChatterAnswersLoginPage() {
        return chatterAnswersLoginPage;
    }

    /**
     * Sets the value of the chatterAnswersLoginPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChatterAnswersLoginPage(String value) {
        this.chatterAnswersLoginPage = value;
    }

    /**
     * Gets the value of the chatterAnswersRegistrationPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChatterAnswersRegistrationPage() {
        return chatterAnswersRegistrationPage;
    }

    /**
     * Sets the value of the chatterAnswersRegistrationPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChatterAnswersRegistrationPage(String value) {
        this.chatterAnswersRegistrationPage = value;
    }

    /**
     * Gets the value of the customWebAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customWebAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomWebAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteWebAddress }
     * 
     * 
     */
    public List<SiteWebAddress> getCustomWebAddresses() {
        if (customWebAddresses == null) {
            customWebAddresses = new ArrayList<SiteWebAddress>();
        }
        return this.customWebAddresses;
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
     * Gets the value of the favoriteIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavoriteIcon() {
        return favoriteIcon;
    }

    /**
     * Sets the value of the favoriteIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavoriteIcon(String value) {
        this.favoriteIcon = value;
    }

    /**
     * Gets the value of the fileNotFoundPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNotFoundPage() {
        return fileNotFoundPage;
    }

    /**
     * Sets the value of the fileNotFoundPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNotFoundPage(String value) {
        this.fileNotFoundPage = value;
    }

    /**
     * Gets the value of the genericErrorPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericErrorPage() {
        return genericErrorPage;
    }

    /**
     * Sets the value of the genericErrorPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericErrorPage(String value) {
        this.genericErrorPage = value;
    }

    /**
     * Gets the value of the guestProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestProfile() {
        return guestProfile;
    }

    /**
     * Sets the value of the guestProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestProfile(String value) {
        this.guestProfile = value;
    }

    /**
     * Gets the value of the inMaintenancePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMaintenancePage() {
        return inMaintenancePage;
    }

    /**
     * Sets the value of the inMaintenancePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMaintenancePage(String value) {
        this.inMaintenancePage = value;
    }

    /**
     * Gets the value of the inactiveIndexPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveIndexPage() {
        return inactiveIndexPage;
    }

    /**
     * Sets the value of the inactiveIndexPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveIndexPage(String value) {
        this.inactiveIndexPage = value;
    }

    /**
     * Gets the value of the indexPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexPage() {
        return indexPage;
    }

    /**
     * Sets the value of the indexPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexPage(String value) {
        this.indexPage = value;
    }

    /**
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLabel(String value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the myProfilePage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyProfilePage() {
        return myProfilePage;
    }

    /**
     * Sets the value of the myProfilePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyProfilePage(String value) {
        this.myProfilePage = value;
    }

    /**
     * Gets the value of the portal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortal() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortal(String value) {
        this.portal = value;
    }

    /**
     * Gets the value of the requireInsecurePortalAccess property.
     * 
     */
    public boolean isRequireInsecurePortalAccess() {
        return requireInsecurePortalAccess;
    }

    /**
     * Sets the value of the requireInsecurePortalAccess property.
     * 
     */
    public void setRequireInsecurePortalAccess(boolean value) {
        this.requireInsecurePortalAccess = value;
    }

    /**
     * Gets the value of the robotsTxtPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRobotsTxtPage() {
        return robotsTxtPage;
    }

    /**
     * Sets the value of the robotsTxtPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRobotsTxtPage(String value) {
        this.robotsTxtPage = value;
    }

    /**
     * Gets the value of the rootComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootComponent() {
        return rootComponent;
    }

    /**
     * Sets the value of the rootComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootComponent(String value) {
        this.rootComponent = value;
    }

    /**
     * Gets the value of the serverIsDown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerIsDown() {
        return serverIsDown;
    }

    /**
     * Sets the value of the serverIsDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerIsDown(String value) {
        this.serverIsDown = value;
    }

    /**
     * Gets the value of the siteAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteAdmin() {
        return siteAdmin;
    }

    /**
     * Sets the value of the siteAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteAdmin(String value) {
        this.siteAdmin = value;
    }

    /**
     * Gets the value of the siteRedirectMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteRedirectMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteRedirectMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteRedirectMapping }
     * 
     * 
     */
    public List<SiteRedirectMapping> getSiteRedirectMappings() {
        if (siteRedirectMappings == null) {
            siteRedirectMappings = new ArrayList<SiteRedirectMapping>();
        }
        return this.siteRedirectMappings;
    }

    /**
     * Gets the value of the siteTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteTemplate() {
        return siteTemplate;
    }

    /**
     * Sets the value of the siteTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteTemplate(String value) {
        this.siteTemplate = value;
    }

    /**
     * Gets the value of the siteType property.
     * 
     * @return
     *     possible object is
     *     {@link SiteType }
     *     
     */
    public SiteType getSiteType() {
        return siteType;
    }

    /**
     * Sets the value of the siteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteType }
     *     
     */
    public void setSiteType(SiteType value) {
        this.siteType = value;
    }

    /**
     * Gets the value of the subdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * Sets the value of the subdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdomain(String value) {
        this.subdomain = value;
    }

    /**
     * Gets the value of the urlPathPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPathPrefix() {
        return urlPathPrefix;
    }

    /**
     * Sets the value of the urlPathPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPathPrefix(String value) {
        this.urlPathPrefix = value;
    }

}
