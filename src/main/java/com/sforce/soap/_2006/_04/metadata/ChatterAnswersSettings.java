
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChatterAnswersSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChatterAnswersSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="emailFollowersOnBestAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailFollowersOnReply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailOwnerOnPrivateReply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emailOwnerOnReply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableAnswerViaEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableChatterAnswers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="enableFacebookSSO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableInlinePublisher" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableReputation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableRichTextEditor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="facebookAuthProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showInPortals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChatterAnswersSettings", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "emailFollowersOnBestAnswer",
    "emailFollowersOnReply",
    "emailOwnerOnPrivateReply",
    "emailOwnerOnReply",
    "enableAnswerViaEmail",
    "enableChatterAnswers",
    "enableFacebookSSO",
    "enableInlinePublisher",
    "enableReputation",
    "enableRichTextEditor",
    "facebookAuthProvider",
    "showInPortals"
})
public class ChatterAnswersSettings
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean emailFollowersOnBestAnswer;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean emailFollowersOnReply;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean emailOwnerOnPrivateReply;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean emailOwnerOnReply;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableAnswerViaEmail;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean enableChatterAnswers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableFacebookSSO;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableInlinePublisher;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableReputation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableRichTextEditor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String facebookAuthProvider;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showInPortals;

    /**
     * Gets the value of the emailFollowersOnBestAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailFollowersOnBestAnswer() {
        return emailFollowersOnBestAnswer;
    }

    /**
     * Sets the value of the emailFollowersOnBestAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailFollowersOnBestAnswer(Boolean value) {
        this.emailFollowersOnBestAnswer = value;
    }

    /**
     * Gets the value of the emailFollowersOnReply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailFollowersOnReply() {
        return emailFollowersOnReply;
    }

    /**
     * Sets the value of the emailFollowersOnReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailFollowersOnReply(Boolean value) {
        this.emailFollowersOnReply = value;
    }

    /**
     * Gets the value of the emailOwnerOnPrivateReply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailOwnerOnPrivateReply() {
        return emailOwnerOnPrivateReply;
    }

    /**
     * Sets the value of the emailOwnerOnPrivateReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailOwnerOnPrivateReply(Boolean value) {
        this.emailOwnerOnPrivateReply = value;
    }

    /**
     * Gets the value of the emailOwnerOnReply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailOwnerOnReply() {
        return emailOwnerOnReply;
    }

    /**
     * Sets the value of the emailOwnerOnReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailOwnerOnReply(Boolean value) {
        this.emailOwnerOnReply = value;
    }

    /**
     * Gets the value of the enableAnswerViaEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAnswerViaEmail() {
        return enableAnswerViaEmail;
    }

    /**
     * Sets the value of the enableAnswerViaEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAnswerViaEmail(Boolean value) {
        this.enableAnswerViaEmail = value;
    }

    /**
     * Gets the value of the enableChatterAnswers property.
     * 
     */
    public boolean isEnableChatterAnswers() {
        return enableChatterAnswers;
    }

    /**
     * Sets the value of the enableChatterAnswers property.
     * 
     */
    public void setEnableChatterAnswers(boolean value) {
        this.enableChatterAnswers = value;
    }

    /**
     * Gets the value of the enableFacebookSSO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableFacebookSSO() {
        return enableFacebookSSO;
    }

    /**
     * Sets the value of the enableFacebookSSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableFacebookSSO(Boolean value) {
        this.enableFacebookSSO = value;
    }

    /**
     * Gets the value of the enableInlinePublisher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableInlinePublisher() {
        return enableInlinePublisher;
    }

    /**
     * Sets the value of the enableInlinePublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableInlinePublisher(Boolean value) {
        this.enableInlinePublisher = value;
    }

    /**
     * Gets the value of the enableReputation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableReputation() {
        return enableReputation;
    }

    /**
     * Sets the value of the enableReputation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableReputation(Boolean value) {
        this.enableReputation = value;
    }

    /**
     * Gets the value of the enableRichTextEditor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRichTextEditor() {
        return enableRichTextEditor;
    }

    /**
     * Sets the value of the enableRichTextEditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRichTextEditor(Boolean value) {
        this.enableRichTextEditor = value;
    }

    /**
     * Gets the value of the facebookAuthProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookAuthProvider() {
        return facebookAuthProvider;
    }

    /**
     * Sets the value of the facebookAuthProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookAuthProvider(String value) {
        this.facebookAuthProvider = value;
    }

    /**
     * Gets the value of the showInPortals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInPortals() {
        return showInPortals;
    }

    /**
     * Sets the value of the showInPortals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInPortals(Boolean value) {
        this.showInPortals = value;
    }

}
