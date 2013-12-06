
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportFilterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportFilterItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="columnToColumn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://soap.sforce.com/2006/04/metadata}FilterOperation"/>
 *         &lt;element name="snapshot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportFilterItem", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "column",
    "columnToColumn",
    "operator",
    "snapshot",
    "value"
})
public class ReportFilterItem {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String column;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean columnToColumn;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected FilterOperation operator;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String snapshot;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String value;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

    /**
     * Gets the value of the columnToColumn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColumnToColumn() {
        return columnToColumn;
    }

    /**
     * Sets the value of the columnToColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColumnToColumn(Boolean value) {
        this.columnToColumn = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link FilterOperation }
     *     
     */
    public FilterOperation getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOperation }
     *     
     */
    public void setOperator(FilterOperation value) {
        this.operator = value;
    }

    /**
     * Gets the value of the snapshot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of the snapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapshot(String value) {
        this.snapshot = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
