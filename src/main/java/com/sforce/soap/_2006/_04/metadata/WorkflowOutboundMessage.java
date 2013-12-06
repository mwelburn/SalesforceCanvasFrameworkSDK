
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowOutboundMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowOutboundMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}WorkflowAction">
 *       &lt;sequence>
 *         &lt;element name="apiVersion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endpointUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeSessionId" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="integrationUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="useDeadLetterQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowOutboundMessage", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apiVersion",
    "description",
    "endpointUrl",
    "fields",
    "includeSessionId",
    "integrationUser",
    "name",
    "_protected",
    "useDeadLetterQueue"
})
public class WorkflowOutboundMessage
    extends WorkflowAction
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected double apiVersion;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String endpointUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> fields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean includeSessionId;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String integrationUser;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(name = "protected", namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean _protected;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean useDeadLetterQueue;

    /**
     * Gets the value of the apiVersion property.
     * 
     */
    public double getApiVersion() {
        return apiVersion;
    }

    /**
     * Sets the value of the apiVersion property.
     * 
     */
    public void setApiVersion(double value) {
        this.apiVersion = value;
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
     * Gets the value of the endpointUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointUrl() {
        return endpointUrl;
    }

    /**
     * Sets the value of the endpointUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointUrl(String value) {
        this.endpointUrl = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFields() {
        if (fields == null) {
            fields = new ArrayList<String>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the includeSessionId property.
     * 
     */
    public boolean isIncludeSessionId() {
        return includeSessionId;
    }

    /**
     * Sets the value of the includeSessionId property.
     * 
     */
    public void setIncludeSessionId(boolean value) {
        this.includeSessionId = value;
    }

    /**
     * Gets the value of the integrationUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrationUser() {
        return integrationUser;
    }

    /**
     * Sets the value of the integrationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrationUser(String value) {
        this.integrationUser = value;
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
     * Gets the value of the useDeadLetterQueue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDeadLetterQueue() {
        return useDeadLetterQueue;
    }

    /**
     * Sets the value of the useDeadLetterQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDeadLetterQueue(Boolean value) {
        this.useDeadLetterQueue = value;
    }

}
