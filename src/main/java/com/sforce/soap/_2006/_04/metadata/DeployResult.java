
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeployResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeployResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="completedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="details" type="{http://soap.sforce.com/2006/04/metadata}DeployDetails"/>
 *         &lt;element name="done" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorStatusCode" type="{http://soap.sforce.com/2006/04/metadata}StatusCode" minOccurs="0"/>
 *         &lt;element name="id" type="{http://soap.sforce.com/2006/04/metadata}ID"/>
 *         &lt;element name="ignoreWarnings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numberComponentErrors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberComponentsDeployed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberComponentsTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberTestErrors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberTestsCompleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberTestsTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rollbackOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="stateDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://soap.sforce.com/2006/04/metadata}DeployStatus"/>
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
@XmlType(name = "DeployResult", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "checkOnly",
    "completedDate",
    "createdDate",
    "details",
    "done",
    "errorMessage",
    "errorStatusCode",
    "id",
    "ignoreWarnings",
    "lastModifiedDate",
    "numberComponentErrors",
    "numberComponentsDeployed",
    "numberComponentsTotal",
    "numberTestErrors",
    "numberTestsCompleted",
    "numberTestsTotal",
    "rollbackOnError",
    "startDate",
    "stateDetail",
    "status",
    "success"
})
public class DeployResult {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean checkOnly;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedDate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected DeployDetails details;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean done;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String errorMessage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected StatusCode errorStatusCode;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String id;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean ignoreWarnings;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numberComponentErrors;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numberComponentsDeployed;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numberComponentsTotal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numberTestErrors;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numberTestsCompleted;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int numberTestsTotal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean rollbackOnError;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String stateDetail;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected DeployStatus status;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean success;

    /**
     * Gets the value of the checkOnly property.
     * 
     */
    public boolean isCheckOnly() {
        return checkOnly;
    }

    /**
     * Sets the value of the checkOnly property.
     * 
     */
    public void setCheckOnly(boolean value) {
        this.checkOnly = value;
    }

    /**
     * Gets the value of the completedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedDate() {
        return completedDate;
    }

    /**
     * Sets the value of the completedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedDate(XMLGregorianCalendar value) {
        this.completedDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link DeployDetails }
     *     
     */
    public DeployDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeployDetails }
     *     
     */
    public void setDetails(DeployDetails value) {
        this.details = value;
    }

    /**
     * Gets the value of the done property.
     * 
     */
    public boolean isDone() {
        return done;
    }

    /**
     * Sets the value of the done property.
     * 
     */
    public void setDone(boolean value) {
        this.done = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getErrorStatusCode() {
        return errorStatusCode;
    }

    /**
     * Sets the value of the errorStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setErrorStatusCode(StatusCode value) {
        this.errorStatusCode = value;
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
     * Gets the value of the ignoreWarnings property.
     * 
     */
    public boolean isIgnoreWarnings() {
        return ignoreWarnings;
    }

    /**
     * Sets the value of the ignoreWarnings property.
     * 
     */
    public void setIgnoreWarnings(boolean value) {
        this.ignoreWarnings = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the numberComponentErrors property.
     * 
     */
    public int getNumberComponentErrors() {
        return numberComponentErrors;
    }

    /**
     * Sets the value of the numberComponentErrors property.
     * 
     */
    public void setNumberComponentErrors(int value) {
        this.numberComponentErrors = value;
    }

    /**
     * Gets the value of the numberComponentsDeployed property.
     * 
     */
    public int getNumberComponentsDeployed() {
        return numberComponentsDeployed;
    }

    /**
     * Sets the value of the numberComponentsDeployed property.
     * 
     */
    public void setNumberComponentsDeployed(int value) {
        this.numberComponentsDeployed = value;
    }

    /**
     * Gets the value of the numberComponentsTotal property.
     * 
     */
    public int getNumberComponentsTotal() {
        return numberComponentsTotal;
    }

    /**
     * Sets the value of the numberComponentsTotal property.
     * 
     */
    public void setNumberComponentsTotal(int value) {
        this.numberComponentsTotal = value;
    }

    /**
     * Gets the value of the numberTestErrors property.
     * 
     */
    public int getNumberTestErrors() {
        return numberTestErrors;
    }

    /**
     * Sets the value of the numberTestErrors property.
     * 
     */
    public void setNumberTestErrors(int value) {
        this.numberTestErrors = value;
    }

    /**
     * Gets the value of the numberTestsCompleted property.
     * 
     */
    public int getNumberTestsCompleted() {
        return numberTestsCompleted;
    }

    /**
     * Sets the value of the numberTestsCompleted property.
     * 
     */
    public void setNumberTestsCompleted(int value) {
        this.numberTestsCompleted = value;
    }

    /**
     * Gets the value of the numberTestsTotal property.
     * 
     */
    public int getNumberTestsTotal() {
        return numberTestsTotal;
    }

    /**
     * Sets the value of the numberTestsTotal property.
     * 
     */
    public void setNumberTestsTotal(int value) {
        this.numberTestsTotal = value;
    }

    /**
     * Gets the value of the rollbackOnError property.
     * 
     */
    public boolean isRollbackOnError() {
        return rollbackOnError;
    }

    /**
     * Sets the value of the rollbackOnError property.
     * 
     */
    public void setRollbackOnError(boolean value) {
        this.rollbackOnError = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the stateDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateDetail() {
        return stateDetail;
    }

    /**
     * Sets the value of the stateDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateDetail(String value) {
        this.stateDetail = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DeployStatus }
     *     
     */
    public DeployStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeployStatus }
     *     
     */
    public void setStatus(DeployStatus value) {
        this.status = value;
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
