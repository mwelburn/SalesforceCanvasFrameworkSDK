
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDynamicChoiceSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowDynamicChoiceSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}FlowElement">
 *       &lt;sequence>
 *         &lt;element name="dataType" type="{http://soap.sforce.com/2006/04/metadata}FlowDataType"/>
 *         &lt;element name="displayField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filters" type="{http://soap.sforce.com/2006/04/metadata}FlowRecordFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="object" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputAssignments" type="{http://soap.sforce.com/2006/04/metadata}FlowOutputFieldAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://soap.sforce.com/2006/04/metadata}SortOrder" minOccurs="0"/>
 *         &lt;element name="valueField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDynamicChoiceSet", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "dataType",
    "displayField",
    "filters",
    "limit",
    "object",
    "outputAssignments",
    "sortField",
    "sortOrder",
    "valueField"
})
public class FlowDynamicChoiceSet
    extends FlowElement
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FlowDataType dataType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String displayField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowRecordFilter> filters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer limit;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String object;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowOutputFieldAssignment> outputAssignments;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String sortField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SortOrder sortOrder;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String valueField;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link FlowDataType }
     *     
     */
    public FlowDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowDataType }
     *     
     */
    public void setDataType(FlowDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the displayField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayField() {
        return displayField;
    }

    /**
     * Sets the value of the displayField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayField(String value) {
        this.displayField = value;
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
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
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

    /**
     * Gets the value of the valueField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueField() {
        return valueField;
    }

    /**
     * Sets the value of the valueField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueField(String value) {
        this.valueField = value;
    }

}
