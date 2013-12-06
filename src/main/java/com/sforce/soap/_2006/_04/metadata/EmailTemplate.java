
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailTemplate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}MetadataWithContent">
 *       &lt;sequence>
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="attachedDocuments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://soap.sforce.com/2006/04/metadata}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encodingKey" type="{http://soap.sforce.com/2006/04/metadata}Encoding"/>
 *         &lt;element name="letterhead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="packageVersions" type="{http://soap.sforce.com/2006/04/metadata}PackageVersion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="style" type="{http://soap.sforce.com/2006/04/metadata}EmailTemplateStyle"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://soap.sforce.com/2006/04/metadata}EmailTemplateType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailTemplate", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apiVersion",
    "attachedDocuments",
    "attachments",
    "available",
    "description",
    "encodingKey",
    "letterhead",
    "name",
    "packageVersions",
    "style",
    "subject",
    "textOnly",
    "type"
})
public class EmailTemplate
    extends MetadataWithContent
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double apiVersion;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> attachedDocuments;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<Attachment> attachments;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean available;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected Encoding encodingKey;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String letterhead;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PackageVersion> packageVersions;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected EmailTemplateStyle style;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String subject;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String textOnly;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected EmailTemplateType type;

    /**
     * Gets the value of the apiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setApiVersion(Double value) {
        this.apiVersion = value;
    }

    /**
     * Gets the value of the attachedDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAttachedDocuments() {
        if (attachedDocuments == null) {
            attachedDocuments = new ArrayList<String>();
        }
        return this.attachedDocuments;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<Attachment>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
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
     * Gets the value of the encodingKey property.
     * 
     * @return
     *     possible object is
     *     {@link Encoding }
     *     
     */
    public Encoding getEncodingKey() {
        return encodingKey;
    }

    /**
     * Sets the value of the encodingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Encoding }
     *     
     */
    public void setEncodingKey(Encoding value) {
        this.encodingKey = value;
    }

    /**
     * Gets the value of the letterhead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterhead() {
        return letterhead;
    }

    /**
     * Sets the value of the letterhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterhead(String value) {
        this.letterhead = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the packageVersions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageVersions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageVersions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageVersion }
     * 
     * 
     */
    public List<PackageVersion> getPackageVersions() {
        if (packageVersions == null) {
            packageVersions = new ArrayList<PackageVersion>();
        }
        return this.packageVersions;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link EmailTemplateStyle }
     *     
     */
    public EmailTemplateStyle getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTemplateStyle }
     *     
     */
    public void setStyle(EmailTemplateStyle value) {
        this.style = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the textOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextOnly() {
        return textOnly;
    }

    /**
     * Sets the value of the textOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextOnly(String value) {
        this.textOnly = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EmailTemplateType }
     *     
     */
    public EmailTemplateType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTemplateType }
     *     
     */
    public void setType(EmailTemplateType value) {
        this.type = value;
    }

}
