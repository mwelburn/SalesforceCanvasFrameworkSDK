
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileProperties" type="{http://soap.sforce.com/2006/04/metadata}FileProperties" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messages" type="{http://soap.sforce.com/2006/04/metadata}RetrieveMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zipFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveResult", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "fileProperties",
    "id",
    "messages",
    "zipFile"
})
public class RetrieveResult {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FileProperties> fileProperties;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String id;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<RetrieveMessage> messages;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected byte[] zipFile;

    /**
     * Gets the value of the fileProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileProperties }
     * 
     * 
     */
    public List<FileProperties> getFileProperties() {
        if (fileProperties == null) {
            fileProperties = new ArrayList<FileProperties>();
        }
        return this.fileProperties;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveMessage }
     * 
     * 
     */
    public List<RetrieveMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<RetrieveMessage>();
        }
        return this.messages;
    }

    /**
     * Gets the value of the zipFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getZipFile() {
        return zipFile;
    }

    /**
     * Sets the value of the zipFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setZipFile(byte[] value) {
        this.zipFile = ((byte[]) value);
    }

}
