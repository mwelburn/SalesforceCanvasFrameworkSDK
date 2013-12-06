
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomApplication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="customApplicationComponents" type="{http://soap.sforce.com/2006/04/metadata}CustomApplicationComponents" minOccurs="0"/>
 *         &lt;element name="defaultLandingTab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailPageRefreshMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainWhitelist" type="{http://soap.sforce.com/2006/04/metadata}DomainWhitelist" minOccurs="0"/>
 *         &lt;element name="enableKeyboardShortcuts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isServiceCloudConsole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="keyboardShortcuts" type="{http://soap.sforce.com/2006/04/metadata}KeyboardShortcuts" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listPlacement" type="{http://soap.sforce.com/2006/04/metadata}ListPlacement" minOccurs="0"/>
 *         &lt;element name="listRefreshMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liveAgentConfig" type="{http://soap.sforce.com/2006/04/metadata}LiveAgentConfig" minOccurs="0"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pushNotifications" type="{http://soap.sforce.com/2006/04/metadata}PushNotifications" minOccurs="0"/>
 *         &lt;element name="saveUserSessions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tab" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="workspaceMappings" type="{http://soap.sforce.com/2006/04/metadata}WorkspaceMappings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomApplication", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "customApplicationComponents",
    "defaultLandingTab",
    "description",
    "detailPageRefreshMethod",
    "domainWhitelist",
    "enableKeyboardShortcuts",
    "isServiceCloudConsole",
    "keyboardShortcuts",
    "label",
    "listPlacement",
    "listRefreshMethod",
    "liveAgentConfig",
    "logo",
    "pushNotifications",
    "saveUserSessions",
    "tab",
    "workspaceMappings"
})
public class CustomApplication
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected CustomApplicationComponents customApplicationComponents;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultLandingTab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String detailPageRefreshMethod;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DomainWhitelist domainWhitelist;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableKeyboardShortcuts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isServiceCloudConsole;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected KeyboardShortcuts keyboardShortcuts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ListPlacement listPlacement;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String listRefreshMethod;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LiveAgentConfig liveAgentConfig;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String logo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected PushNotifications pushNotifications;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean saveUserSessions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> tab;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected WorkspaceMappings workspaceMappings;

    /**
     * Gets the value of the customApplicationComponents property.
     * 
     * @return
     *     possible object is
     *     {@link CustomApplicationComponents }
     *     
     */
    public CustomApplicationComponents getCustomApplicationComponents() {
        return customApplicationComponents;
    }

    /**
     * Sets the value of the customApplicationComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomApplicationComponents }
     *     
     */
    public void setCustomApplicationComponents(CustomApplicationComponents value) {
        this.customApplicationComponents = value;
    }

    /**
     * Gets the value of the defaultLandingTab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLandingTab() {
        return defaultLandingTab;
    }

    /**
     * Sets the value of the defaultLandingTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLandingTab(String value) {
        this.defaultLandingTab = value;
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
     * Gets the value of the detailPageRefreshMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailPageRefreshMethod() {
        return detailPageRefreshMethod;
    }

    /**
     * Sets the value of the detailPageRefreshMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailPageRefreshMethod(String value) {
        this.detailPageRefreshMethod = value;
    }

    /**
     * Gets the value of the domainWhitelist property.
     * 
     * @return
     *     possible object is
     *     {@link DomainWhitelist }
     *     
     */
    public DomainWhitelist getDomainWhitelist() {
        return domainWhitelist;
    }

    /**
     * Sets the value of the domainWhitelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainWhitelist }
     *     
     */
    public void setDomainWhitelist(DomainWhitelist value) {
        this.domainWhitelist = value;
    }

    /**
     * Gets the value of the enableKeyboardShortcuts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableKeyboardShortcuts() {
        return enableKeyboardShortcuts;
    }

    /**
     * Sets the value of the enableKeyboardShortcuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableKeyboardShortcuts(Boolean value) {
        this.enableKeyboardShortcuts = value;
    }

    /**
     * Gets the value of the isServiceCloudConsole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceCloudConsole() {
        return isServiceCloudConsole;
    }

    /**
     * Sets the value of the isServiceCloudConsole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceCloudConsole(Boolean value) {
        this.isServiceCloudConsole = value;
    }

    /**
     * Gets the value of the keyboardShortcuts property.
     * 
     * @return
     *     possible object is
     *     {@link KeyboardShortcuts }
     *     
     */
    public KeyboardShortcuts getKeyboardShortcuts() {
        return keyboardShortcuts;
    }

    /**
     * Sets the value of the keyboardShortcuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyboardShortcuts }
     *     
     */
    public void setKeyboardShortcuts(KeyboardShortcuts value) {
        this.keyboardShortcuts = value;
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
     * Gets the value of the listPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link ListPlacement }
     *     
     */
    public ListPlacement getListPlacement() {
        return listPlacement;
    }

    /**
     * Sets the value of the listPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPlacement }
     *     
     */
    public void setListPlacement(ListPlacement value) {
        this.listPlacement = value;
    }

    /**
     * Gets the value of the listRefreshMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListRefreshMethod() {
        return listRefreshMethod;
    }

    /**
     * Sets the value of the listRefreshMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListRefreshMethod(String value) {
        this.listRefreshMethod = value;
    }

    /**
     * Gets the value of the liveAgentConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LiveAgentConfig }
     *     
     */
    public LiveAgentConfig getLiveAgentConfig() {
        return liveAgentConfig;
    }

    /**
     * Sets the value of the liveAgentConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveAgentConfig }
     *     
     */
    public void setLiveAgentConfig(LiveAgentConfig value) {
        this.liveAgentConfig = value;
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
     * Gets the value of the pushNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link PushNotifications }
     *     
     */
    public PushNotifications getPushNotifications() {
        return pushNotifications;
    }

    /**
     * Sets the value of the pushNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotifications }
     *     
     */
    public void setPushNotifications(PushNotifications value) {
        this.pushNotifications = value;
    }

    /**
     * Gets the value of the saveUserSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveUserSessions() {
        return saveUserSessions;
    }

    /**
     * Sets the value of the saveUserSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveUserSessions(Boolean value) {
        this.saveUserSessions = value;
    }

    /**
     * Gets the value of the tab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTab() {
        if (tab == null) {
            tab = new ArrayList<String>();
        }
        return this.tab;
    }

    /**
     * Gets the value of the workspaceMappings property.
     * 
     * @return
     *     possible object is
     *     {@link WorkspaceMappings }
     *     
     */
    public WorkspaceMappings getWorkspaceMappings() {
        return workspaceMappings;
    }

    /**
     * Sets the value of the workspaceMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkspaceMappings }
     *     
     */
    public void setWorkspaceMappings(WorkspaceMappings value) {
        this.workspaceMappings = value;
    }

}
