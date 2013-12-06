
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Scontrol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Scontrol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}MetadataWithContent">
 *       &lt;sequence>
 *         &lt;element name="contentSource" type="{http://soap.sforce.com/2006/04/metadata}SControlContentSource"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encodingKey" type="{http://soap.sforce.com/2006/04/metadata}Encoding"/>
 *         &lt;element name="fileContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supportsCaching" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scontrol", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "contentSource",
    "description",
    "encodingKey",
    "fileContent",
    "fileName",
    "name",
    "supportsCaching"
})
public class Scontrol
    extends MetadataWithContent
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected SControlContentSource contentSource;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected Encoding encodingKey;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected byte[] fileContent;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String fileName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean supportsCaching;

    /**
     * Gets the value of the contentSource property.
     * 
     * @return
     *     possible object is
     *     {@link SControlContentSource }
     *     
     */
    public SControlContentSource getContentSource() {
        return contentSource;
    }

    /**
     * Sets the value of the contentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SControlContentSource }
     *     
     */
    public void setContentSource(SControlContentSource value) {
        this.contentSource = value;
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
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileContent(byte[] value) {
        this.fileContent = ((byte[]) value);
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * Gets the value of the supportsCaching property.
     * 
     */
    public boolean isSupportsCaching() {
        return supportsCaching;
    }

    /**
     * Sets the value of the supportsCaching property.
     * 
     */
    public void setSupportsCaching(boolean value) {
        this.supportsCaching = value;
    }

}
