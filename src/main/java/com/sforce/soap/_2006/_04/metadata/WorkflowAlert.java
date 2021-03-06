
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowAlert">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}WorkflowAction">
 *       &lt;sequence>
 *         &lt;element name="ccEmails" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recipients" type="{http://soap.sforce.com/2006/04/metadata}WorkflowEmailRecipient" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="senderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderType" type="{http://soap.sforce.com/2006/04/metadata}ActionEmailSenderType" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowAlert", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "ccEmails",
    "description",
    "_protected",
    "recipients",
    "senderAddress",
    "senderType",
    "template"
})
public class WorkflowAlert
    extends WorkflowAction
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> ccEmails;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String description;
    @XmlElement(name = "protected", namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean _protected;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowEmailRecipient> recipients;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String senderAddress;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ActionEmailSenderType senderType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String template;

    /**
     * Gets the value of the ccEmails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccEmails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCcEmails() {
        if (ccEmails == null) {
            ccEmails = new ArrayList<String>();
        }
        return this.ccEmails;
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
     * Gets the value of the protected property.
     * 
     */
    public boolean isProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     */
    public void setProtected(boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowEmailRecipient }
     * 
     * 
     */
    public List<WorkflowEmailRecipient> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<WorkflowEmailRecipient>();
        }
        return this.recipients;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the senderType property.
     * 
     * @return
     *     possible object is
     *     {@link ActionEmailSenderType }
     *     
     */
    public ActionEmailSenderType getSenderType() {
        return senderType;
    }

    /**
     * Sets the value of the senderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionEmailSenderType }
     *     
     */
    public void setSenderType(ActionEmailSenderType value) {
        this.senderType = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

}
