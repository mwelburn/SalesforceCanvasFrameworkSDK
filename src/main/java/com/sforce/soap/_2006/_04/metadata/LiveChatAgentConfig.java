
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveChatAgentConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveChatAgentConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="assignments" type="{http://soap.sforce.com/2006/04/metadata}AgentConfigAssignments" minOccurs="0"/>
 *         &lt;element name="autoGreeting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="criticalWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customAgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableAgentSneakPeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableAutoAwayOnDecline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableChatMonitoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableLogoutSound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableRequestSound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableSneakPeek" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableWhisperMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supervisorDefaultAgentStatusFilter" type="{http://soap.sforce.com/2006/04/metadata}SupervisorAgentStatusFilter" minOccurs="0"/>
 *         &lt;element name="supervisorDefaultButtonFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorDefaultSkillFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supervisorSkills" type="{http://soap.sforce.com/2006/04/metadata}SupervisorAgentConfigSkills" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveChatAgentConfig", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "assignments",
    "autoGreeting",
    "capacity",
    "criticalWaitTime",
    "customAgentName",
    "enableAgentSneakPeek",
    "enableAutoAwayOnDecline",
    "enableChatMonitoring",
    "enableLogoutSound",
    "enableNotifications",
    "enableRequestSound",
    "enableSneakPeek",
    "enableWhisperMessage",
    "label",
    "supervisorDefaultAgentStatusFilter",
    "supervisorDefaultButtonFilter",
    "supervisorDefaultSkillFilter",
    "supervisorSkills"
})
public class LiveChatAgentConfig
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected AgentConfigAssignments assignments;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String autoGreeting;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer capacity;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer criticalWaitTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String customAgentName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableAgentSneakPeek;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableAutoAwayOnDecline;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableChatMonitoring;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableLogoutSound;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableNotifications;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableRequestSound;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableSneakPeek;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableWhisperMessage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SupervisorAgentStatusFilter supervisorDefaultAgentStatusFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String supervisorDefaultButtonFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String supervisorDefaultSkillFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SupervisorAgentConfigSkills supervisorSkills;

    /**
     * Gets the value of the assignments property.
     * 
     * @return
     *     possible object is
     *     {@link AgentConfigAssignments }
     *     
     */
    public AgentConfigAssignments getAssignments() {
        return assignments;
    }

    /**
     * Sets the value of the assignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentConfigAssignments }
     *     
     */
    public void setAssignments(AgentConfigAssignments value) {
        this.assignments = value;
    }

    /**
     * Gets the value of the autoGreeting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoGreeting() {
        return autoGreeting;
    }

    /**
     * Sets the value of the autoGreeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoGreeting(String value) {
        this.autoGreeting = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapacity(Integer value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the criticalWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCriticalWaitTime() {
        return criticalWaitTime;
    }

    /**
     * Sets the value of the criticalWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCriticalWaitTime(Integer value) {
        this.criticalWaitTime = value;
    }

    /**
     * Gets the value of the customAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAgentName() {
        return customAgentName;
    }

    /**
     * Sets the value of the customAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAgentName(String value) {
        this.customAgentName = value;
    }

    /**
     * Gets the value of the enableAgentSneakPeek property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAgentSneakPeek() {
        return enableAgentSneakPeek;
    }

    /**
     * Sets the value of the enableAgentSneakPeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAgentSneakPeek(Boolean value) {
        this.enableAgentSneakPeek = value;
    }

    /**
     * Gets the value of the enableAutoAwayOnDecline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAutoAwayOnDecline() {
        return enableAutoAwayOnDecline;
    }

    /**
     * Sets the value of the enableAutoAwayOnDecline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAutoAwayOnDecline(Boolean value) {
        this.enableAutoAwayOnDecline = value;
    }

    /**
     * Gets the value of the enableChatMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableChatMonitoring() {
        return enableChatMonitoring;
    }

    /**
     * Sets the value of the enableChatMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableChatMonitoring(Boolean value) {
        this.enableChatMonitoring = value;
    }

    /**
     * Gets the value of the enableLogoutSound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableLogoutSound() {
        return enableLogoutSound;
    }

    /**
     * Sets the value of the enableLogoutSound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableLogoutSound(Boolean value) {
        this.enableLogoutSound = value;
    }

    /**
     * Gets the value of the enableNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableNotifications() {
        return enableNotifications;
    }

    /**
     * Sets the value of the enableNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableNotifications(Boolean value) {
        this.enableNotifications = value;
    }

    /**
     * Gets the value of the enableRequestSound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRequestSound() {
        return enableRequestSound;
    }

    /**
     * Sets the value of the enableRequestSound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRequestSound(Boolean value) {
        this.enableRequestSound = value;
    }

    /**
     * Gets the value of the enableSneakPeek property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSneakPeek() {
        return enableSneakPeek;
    }

    /**
     * Sets the value of the enableSneakPeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSneakPeek(Boolean value) {
        this.enableSneakPeek = value;
    }

    /**
     * Gets the value of the enableWhisperMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableWhisperMessage() {
        return enableWhisperMessage;
    }

    /**
     * Sets the value of the enableWhisperMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableWhisperMessage(Boolean value) {
        this.enableWhisperMessage = value;
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
     * Gets the value of the supervisorDefaultAgentStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisorAgentStatusFilter }
     *     
     */
    public SupervisorAgentStatusFilter getSupervisorDefaultAgentStatusFilter() {
        return supervisorDefaultAgentStatusFilter;
    }

    /**
     * Sets the value of the supervisorDefaultAgentStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisorAgentStatusFilter }
     *     
     */
    public void setSupervisorDefaultAgentStatusFilter(SupervisorAgentStatusFilter value) {
        this.supervisorDefaultAgentStatusFilter = value;
    }

    /**
     * Gets the value of the supervisorDefaultButtonFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorDefaultButtonFilter() {
        return supervisorDefaultButtonFilter;
    }

    /**
     * Sets the value of the supervisorDefaultButtonFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorDefaultButtonFilter(String value) {
        this.supervisorDefaultButtonFilter = value;
    }

    /**
     * Gets the value of the supervisorDefaultSkillFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorDefaultSkillFilter() {
        return supervisorDefaultSkillFilter;
    }

    /**
     * Sets the value of the supervisorDefaultSkillFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorDefaultSkillFilter(String value) {
        this.supervisorDefaultSkillFilter = value;
    }

    /**
     * Gets the value of the supervisorSkills property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisorAgentConfigSkills }
     *     
     */
    public SupervisorAgentConfigSkills getSupervisorSkills() {
        return supervisorSkills;
    }

    /**
     * Sets the value of the supervisorSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisorAgentConfigSkills }
     *     
     */
    public void setSupervisorSkills(SupervisorAgentConfigSkills value) {
        this.supervisorSkills = value;
    }

}
