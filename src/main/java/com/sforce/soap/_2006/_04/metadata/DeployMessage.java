
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeployMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeployMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="columnNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="problem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemType" type="{http://soap.sforce.com/2006/04/metadata}DeployProblemType" minOccurs="0"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeployMessage", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "changed",
    "columnNumber",
    "created",
    "deleted",
    "fileName",
    "fullName",
    "id",
    "lineNumber",
    "problem",
    "problemType",
    "success"
})
public class DeployMessage {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean changed;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer columnNumber;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean created;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean deleted;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String fileName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String fullName;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String id;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer lineNumber;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String problem;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DeployProblemType problemType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean success;

    /**
     * Gets the value of the changed property.
     * 
     */
    public boolean isChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     */
    public void setChanged(boolean value) {
        this.changed = value;
    }

    /**
     * Gets the value of the columnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColumnNumber() {
        return columnNumber;
    }

    /**
     * Sets the value of the columnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColumnNumber(Integer value) {
        this.columnNumber = value;
    }

    /**
     * Gets the value of the created property.
     * 
     */
    public boolean isCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     */
    public void setCreated(boolean value) {
        this.created = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the problem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblem() {
        return problem;
    }

    /**
     * Sets the value of the problem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblem(String value) {
        this.problem = value;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link DeployProblemType }
     *     
     */
    public DeployProblemType getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeployProblemType }
     *     
     */
    public void setProblemType(DeployProblemType value) {
        this.problemType = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
