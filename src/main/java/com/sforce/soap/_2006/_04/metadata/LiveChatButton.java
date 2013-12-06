
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveChatButton complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveChatButton">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="animation" type="{http://soap.sforce.com/2006/04/metadata}LiveChatButtonPresentation" minOccurs="0"/>
 *         &lt;element name="autoGreeting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chatPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAgentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deployments" type="{http://soap.sforce.com/2006/04/metadata}LiveChatButtonDeployments" minOccurs="0"/>
 *         &lt;element name="enableQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inviteEndPosition" type="{http://soap.sforce.com/2006/04/metadata}LiveChatButtonInviteEndPosition" minOccurs="0"/>
 *         &lt;element name="inviteImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviteStartPosition" type="{http://soap.sforce.com/2006/04/metadata}LiveChatButtonInviteStartPosition" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offlineImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onlineImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionsHasInviteAfterAccept" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="optionsHasInviteAfterReject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="optionsIsInviteAutoRemove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="overallQueueLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="perAgentQueueLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="postChatPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postChatUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preChatFormPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preChatFormUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pushTimeOut" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="routingType" type="{http://soap.sforce.com/2006/04/metadata}LiveChatButtonRoutingType"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skills" type="{http://soap.sforce.com/2006/04/metadata}LiveChatButtonSkills" minOccurs="0"/>
 *         &lt;element name="timeToRemoveInvite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://soap.sforce.com/2006/04/metadata}LiveChatButtonType"/>
 *         &lt;element name="windowLanguage" type="{http://soap.sforce.com/2006/04/metadata}Language" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveChatButton", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "animation",
    "autoGreeting",
    "chatPage",
    "customAgentName",
    "deployments",
    "enableQueue",
    "inviteEndPosition",
    "inviteImage",
    "inviteStartPosition",
    "isActive",
    "label",
    "offlineImage",
    "onlineImage",
    "optionsHasInviteAfterAccept",
    "optionsHasInviteAfterReject",
    "optionsIsInviteAutoRemove",
    "overallQueueLength",
    "perAgentQueueLength",
    "postChatPage",
    "postChatUrl",
    "preChatFormPage",
    "preChatFormUrl",
    "pushTimeOut",
    "routingType",
    "site",
    "skills",
    "timeToRemoveInvite",
    "type",
    "windowLanguage"
})
public class LiveChatButton
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LiveChatButtonPresentation animation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String autoGreeting;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String chatPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String customAgentName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LiveChatButtonDeployments deployments;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableQueue;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LiveChatButtonInviteEndPosition inviteEndPosition;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String inviteImage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LiveChatButtonInviteStartPosition inviteStartPosition;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isActive;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String offlineImage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String onlineImage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean optionsHasInviteAfterAccept;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean optionsHasInviteAfterReject;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean optionsIsInviteAutoRemove;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer overallQueueLength;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer perAgentQueueLength;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String postChatPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String postChatUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String preChatFormPage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String preChatFormUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer pushTimeOut;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected LiveChatButtonRoutingType routingType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String site;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected LiveChatButtonSkills skills;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer timeToRemoveInvite;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected LiveChatButtonType type;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Language windowLanguage;

    /**
     * Gets the value of the animation property.
     * 
     * @return
     *     possible object is
     *     {@link LiveChatButtonPresentation }
     *     
     */
    public LiveChatButtonPresentation getAnimation() {
        return animation;
    }

    /**
     * Sets the value of the animation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveChatButtonPresentation }
     *     
     */
    public void setAnimation(LiveChatButtonPresentation value) {
        this.animation = value;
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
     * Gets the value of the chatPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChatPage() {
        return chatPage;
    }

    /**
     * Sets the value of the chatPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChatPage(String value) {
        this.chatPage = value;
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
     * Gets the value of the deployments property.
     * 
     * @return
     *     possible object is
     *     {@link LiveChatButtonDeployments }
     *     
     */
    public LiveChatButtonDeployments getDeployments() {
        return deployments;
    }

    /**
     * Sets the value of the deployments property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveChatButtonDeployments }
     *     
     */
    public void setDeployments(LiveChatButtonDeployments value) {
        this.deployments = value;
    }

    /**
     * Gets the value of the enableQueue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableQueue() {
        return enableQueue;
    }

    /**
     * Sets the value of the enableQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableQueue(Boolean value) {
        this.enableQueue = value;
    }

    /**
     * Gets the value of the inviteEndPosition property.
     * 
     * @return
     *     possible object is
     *     {@link LiveChatButtonInviteEndPosition }
     *     
     */
    public LiveChatButtonInviteEndPosition getInviteEndPosition() {
        return inviteEndPosition;
    }

    /**
     * Sets the value of the inviteEndPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveChatButtonInviteEndPosition }
     *     
     */
    public void setInviteEndPosition(LiveChatButtonInviteEndPosition value) {
        this.inviteEndPosition = value;
    }

    /**
     * Gets the value of the inviteImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteImage() {
        return inviteImage;
    }

    /**
     * Sets the value of the inviteImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteImage(String value) {
        this.inviteImage = value;
    }

    /**
     * Gets the value of the inviteStartPosition property.
     * 
     * @return
     *     possible object is
     *     {@link LiveChatButtonInviteStartPosition }
     *     
     */
    public LiveChatButtonInviteStartPosition getInviteStartPosition() {
        return inviteStartPosition;
    }

    /**
     * Sets the value of the inviteStartPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveChatButtonInviteStartPosition }
     *     
     */
    public void setInviteStartPosition(LiveChatButtonInviteStartPosition value) {
        this.inviteStartPosition = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
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
     * Gets the value of the offlineImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfflineImage() {
        return offlineImage;
    }

    /**
     * Sets the value of the offlineImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfflineImage(String value) {
        this.offlineImage = value;
    }

    /**
     * Gets the value of the onlineImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlineImage() {
        return onlineImage;
    }

    /**
     * Sets the value of the onlineImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlineImage(String value) {
        this.onlineImage = value;
    }

    /**
     * Gets the value of the optionsHasInviteAfterAccept property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsHasInviteAfterAccept() {
        return optionsHasInviteAfterAccept;
    }

    /**
     * Sets the value of the optionsHasInviteAfterAccept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsHasInviteAfterAccept(Boolean value) {
        this.optionsHasInviteAfterAccept = value;
    }

    /**
     * Gets the value of the optionsHasInviteAfterReject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsHasInviteAfterReject() {
        return optionsHasInviteAfterReject;
    }

    /**
     * Sets the value of the optionsHasInviteAfterReject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsHasInviteAfterReject(Boolean value) {
        this.optionsHasInviteAfterReject = value;
    }

    /**
     * Gets the value of the optionsIsInviteAutoRemove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsIsInviteAutoRemove() {
        return optionsIsInviteAutoRemove;
    }

    /**
     * Sets the value of the optionsIsInviteAutoRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsIsInviteAutoRemove(Boolean value) {
        this.optionsIsInviteAutoRemove = value;
    }

    /**
     * Gets the value of the overallQueueLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverallQueueLength() {
        return overallQueueLength;
    }

    /**
     * Sets the value of the overallQueueLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverallQueueLength(Integer value) {
        this.overallQueueLength = value;
    }

    /**
     * Gets the value of the perAgentQueueLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPerAgentQueueLength() {
        return perAgentQueueLength;
    }

    /**
     * Sets the value of the perAgentQueueLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPerAgentQueueLength(Integer value) {
        this.perAgentQueueLength = value;
    }

    /**
     * Gets the value of the postChatPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostChatPage() {
        return postChatPage;
    }

    /**
     * Sets the value of the postChatPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostChatPage(String value) {
        this.postChatPage = value;
    }

    /**
     * Gets the value of the postChatUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostChatUrl() {
        return postChatUrl;
    }

    /**
     * Sets the value of the postChatUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostChatUrl(String value) {
        this.postChatUrl = value;
    }

    /**
     * Gets the value of the preChatFormPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreChatFormPage() {
        return preChatFormPage;
    }

    /**
     * Sets the value of the preChatFormPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreChatFormPage(String value) {
        this.preChatFormPage = value;
    }

    /**
     * Gets the value of the preChatFormUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreChatFormUrl() {
        return preChatFormUrl;
    }

    /**
     * Sets the value of the preChatFormUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreChatFormUrl(String value) {
        this.preChatFormUrl = value;
    }

    /**
     * Gets the value of the pushTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPushTimeOut() {
        return pushTimeOut;
    }

    /**
     * Sets the value of the pushTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPushTimeOut(Integer value) {
        this.pushTimeOut = value;
    }

    /**
     * Gets the value of the routingType property.
     * 
     * @return
     *     possible object is
     *     {@link LiveChatButtonRoutingType }
     *     
     */
    public LiveChatButtonRoutingType getRoutingType() {
        return routingType;
    }

    /**
     * Sets the value of the routingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveChatButtonRoutingType }
     *     
     */
    public void setRoutingType(LiveChatButtonRoutingType value) {
        this.routingType = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * @return
     *     possible object is
     *     {@link LiveChatButtonSkills }
     *     
     */
    public LiveChatButtonSkills getSkills() {
        return skills;
    }

    /**
     * Sets the value of the skills property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveChatButtonSkills }
     *     
     */
    public void setSkills(LiveChatButtonSkills value) {
        this.skills = value;
    }

    /**
     * Gets the value of the timeToRemoveInvite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeToRemoveInvite() {
        return timeToRemoveInvite;
    }

    /**
     * Sets the value of the timeToRemoveInvite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeToRemoveInvite(Integer value) {
        this.timeToRemoveInvite = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LiveChatButtonType }
     *     
     */
    public LiveChatButtonType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveChatButtonType }
     *     
     */
    public void setType(LiveChatButtonType value) {
        this.type = value;
    }

    /**
     * Gets the value of the windowLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getWindowLanguage() {
        return windowLanguage;
    }

    /**
     * Sets the value of the windowLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setWindowLanguage(Language value) {
        this.windowLanguage = value;
    }

}
