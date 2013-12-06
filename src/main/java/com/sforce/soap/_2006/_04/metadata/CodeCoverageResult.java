
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeCoverageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeCoverageResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmlInfo" type="{http://soap.sforce.com/2006/04/metadata}CodeLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://soap.sforce.com/2006/04/metadata}ID"/>
 *         &lt;element name="locationsNotCovered" type="{http://soap.sforce.com/2006/04/metadata}CodeLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="methodInfo" type="{http://soap.sforce.com/2006/04/metadata}CodeLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="namespace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numLocations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numLocationsNotCovered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="soqlInfo" type="{http://soap.sforce.com/2006/04/metadata}CodeLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="soslInfo" type="{http://soap.sforce.com/2006/04/metadata}CodeLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeCoverageResult", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "dmlInfo",
    "id",
    "locationsNotCovered",
    "methodInfo",
    "name",
    "namespace",
    "numLocations",
    "numLocationsNotCovered",
    "soqlInfo",
    "soslInfo",
    "type"
})
public class CodeCoverageResult {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CodeLocation> dmlInfo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String id;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CodeLocation> locationsNotCovered;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CodeLocation> methodInfo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true, nillable = true)
    protected String namespace;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numLocations;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numLocationsNotCovered;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CodeLocation> soqlInfo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CodeLocation> soslInfo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String type;

    /**
     * Gets the value of the dmlInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmlInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmlInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeLocation }
     * 
     * 
     */
    public List<CodeLocation> getDmlInfo() {
        if (dmlInfo == null) {
            dmlInfo = new ArrayList<CodeLocation>();
        }
        return this.dmlInfo;
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
     * Gets the value of the locationsNotCovered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationsNotCovered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationsNotCovered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeLocation }
     * 
     * 
     */
    public List<CodeLocation> getLocationsNotCovered() {
        if (locationsNotCovered == null) {
            locationsNotCovered = new ArrayList<CodeLocation>();
        }
        return this.locationsNotCovered;
    }

    /**
     * Gets the value of the methodInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeLocation }
     * 
     * 
     */
    public List<CodeLocation> getMethodInfo() {
        if (methodInfo == null) {
            methodInfo = new ArrayList<CodeLocation>();
        }
        return this.methodInfo;
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
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the numLocations property.
     * 
     */
    public int getNumLocations() {
        return numLocations;
    }

    /**
     * Sets the value of the numLocations property.
     * 
     */
    public void setNumLocations(int value) {
        this.numLocations = value;
    }

    /**
     * Gets the value of the numLocationsNotCovered property.
     * 
     */
    public int getNumLocationsNotCovered() {
        return numLocationsNotCovered;
    }

    /**
     * Sets the value of the numLocationsNotCovered property.
     * 
     */
    public void setNumLocationsNotCovered(int value) {
        this.numLocationsNotCovered = value;
    }

    /**
     * Gets the value of the soqlInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soqlInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoqlInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeLocation }
     * 
     * 
     */
    public List<CodeLocation> getSoqlInfo() {
        if (soqlInfo == null) {
            soqlInfo = new ArrayList<CodeLocation>();
        }
        return this.soqlInfo;
    }

    /**
     * Gets the value of the soslInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soslInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoslInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeLocation }
     * 
     * 
     */
    public List<CodeLocation> getSoslInfo() {
        if (soslInfo == null) {
            soslInfo = new ArrayList<CodeLocation>();
        }
        return this.soslInfo;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
