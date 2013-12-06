
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportCrossFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportCrossFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaItems" type="{http://soap.sforce.com/2006/04/metadata}ReportFilterItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://soap.sforce.com/2006/04/metadata}ObjectFilterOperator"/>
 *         &lt;element name="primaryTableColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relatedTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relatedTableJoinColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCrossFilter", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "criteriaItems",
    "operation",
    "primaryTableColumn",
    "relatedTable",
    "relatedTableJoinColumn"
})
public class ReportCrossFilter {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportFilterItem> criteriaItems;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ObjectFilterOperator operation;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String primaryTableColumn;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String relatedTable;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String relatedTableJoinColumn;

    /**
     * Gets the value of the criteriaItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportFilterItem }
     * 
     * 
     */
    public List<ReportFilterItem> getCriteriaItems() {
        if (criteriaItems == null) {
            criteriaItems = new ArrayList<ReportFilterItem>();
        }
        return this.criteriaItems;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectFilterOperator }
     *     
     */
    public ObjectFilterOperator getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectFilterOperator }
     *     
     */
    public void setOperation(ObjectFilterOperator value) {
        this.operation = value;
    }

    /**
     * Gets the value of the primaryTableColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryTableColumn() {
        return primaryTableColumn;
    }

    /**
     * Sets the value of the primaryTableColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryTableColumn(String value) {
        this.primaryTableColumn = value;
    }

    /**
     * Gets the value of the relatedTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedTable() {
        return relatedTable;
    }

    /**
     * Sets the value of the relatedTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedTable(String value) {
        this.relatedTable = value;
    }

    /**
     * Gets the value of the relatedTableJoinColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedTableJoinColumn() {
        return relatedTableJoinColumn;
    }

    /**
     * Sets the value of the relatedTableJoinColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedTableJoinColumn(String value) {
        this.relatedTableJoinColumn = value;
    }

}
