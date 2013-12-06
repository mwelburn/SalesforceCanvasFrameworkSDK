
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeMetadataObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeMetadataObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="childXmlNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inFolder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="metaFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeMetadataObject", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "childXmlNames",
    "directoryName",
    "inFolder",
    "metaFile",
    "suffix",
    "xmlName"
})
public class DescribeMetadataObject {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> childXmlNames;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String directoryName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean inFolder;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean metaFile;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String suffix;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String xmlName;

    /**
     * Gets the value of the childXmlNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childXmlNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildXmlNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChildXmlNames() {
        if (childXmlNames == null) {
            childXmlNames = new ArrayList<String>();
        }
        return this.childXmlNames;
    }

    /**
     * Gets the value of the directoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryName() {
        return directoryName;
    }

    /**
     * Sets the value of the directoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryName(String value) {
        this.directoryName = value;
    }

    /**
     * Gets the value of the inFolder property.
     * 
     */
    public boolean isInFolder() {
        return inFolder;
    }

    /**
     * Sets the value of the inFolder property.
     * 
     */
    public void setInFolder(boolean value) {
        this.inFolder = value;
    }

    /**
     * Gets the value of the metaFile property.
     * 
     */
    public boolean isMetaFile() {
        return metaFile;
    }

    /**
     * Sets the value of the metaFile property.
     * 
     */
    public void setMetaFile(boolean value) {
        this.metaFile = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the xmlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlName() {
        return xmlName;
    }

    /**
     * Sets the value of the xmlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlName(String value) {
        this.xmlName = value;
    }

}
