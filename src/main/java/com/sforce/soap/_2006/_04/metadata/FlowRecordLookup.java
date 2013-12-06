
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowRecordLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowRecordLookup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="connector" type="{http://soap.sforce.com/2006/04/metadata}FlowConnector" minOccurs="0"/>
 *         &lt;element name="faultConnector" type="{http://soap.sforce.com/2006/04/metadata}FlowConnector" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://soap.sforce.com/2006/04/metadata}FlowRecordFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="object" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputAssignments" type="{http://soap.sforce.com/2006/04/metadata}FlowOutputFieldAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="queriedFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sObjectOutputReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://soap.sforce.com/2006/04/metadata}SortOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowRecordLookup", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "connector",
    "faultConnector",
    "filters",
    "object",
    "outputAssignments",
    "queriedFields",
    "sObjectOutputReference",
    "sortField",
    "sortOrder"
})
public class FlowRecordLookup
    extends FlowNode
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowConnector connector;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowConnector faultConnector;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowRecordFilter> filters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String object;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowOutputFieldAssignment> outputAssignments;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> queriedFields;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String sObjectOutputReference;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String sortField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SortOrder sortOrder;

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setConnector(FlowConnector value) {
        this.connector = value;
    }

    /**
     * Gets the value of the faultConnector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getFaultConnector() {
        return faultConnector;
    }

    /**
     * Sets the value of the faultConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setFaultConnector(FlowConnector value) {
        this.faultConnector = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRecordFilter }
     * 
     * 
     */
    public List<FlowRecordFilter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<FlowRecordFilter>();
        }
        return this.filters;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
    }

    /**
     * Gets the value of the outputAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowOutputFieldAssignment }
     * 
     * 
     */
    public List<FlowOutputFieldAssignment> getOutputAssignments() {
        if (outputAssignments == null) {
            outputAssignments = new ArrayList<FlowOutputFieldAssignment>();
        }
        return this.outputAssignments;
    }

    /**
     * Gets the value of the queriedFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queriedFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueriedFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQueriedFields() {
        if (queriedFields == null) {
            queriedFields = new ArrayList<String>();
        }
        return this.queriedFields;
    }

    /**
     * Gets the value of the sObjectOutputReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSObjectOutputReference() {
        return sObjectOutputReference;
    }

    /**
     * Sets the value of the sObjectOutputReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSObjectOutputReference(String value) {
        this.sObjectOutputReference = value;
    }

    /**
     * Gets the value of the sortField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortField() {
        return sortField;
    }

    /**
     * Sets the value of the sortField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortField(String value) {
        this.sortField = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

}
