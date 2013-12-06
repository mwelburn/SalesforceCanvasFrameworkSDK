
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardTableColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardTableColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aggregateType" type="{http://soap.sforce.com/2006/04/metadata}ReportSummaryType" minOccurs="0"/>
 *         &lt;element name="column" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="showTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sortBy" type="{http://soap.sforce.com/2006/04/metadata}DashboardComponentFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardTableColumn", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "aggregateType",
    "column",
    "showTotal",
    "sortBy"
})
public class DashboardTableColumn {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportSummaryType aggregateType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String column;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showTotal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DashboardComponentFilter sortBy;

    /**
     * Gets the value of the aggregateType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSummaryType }
     *     
     */
    public ReportSummaryType getAggregateType() {
        return aggregateType;
    }

    /**
     * Sets the value of the aggregateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSummaryType }
     *     
     */
    public void setAggregateType(ReportSummaryType value) {
        this.aggregateType = value;
    }

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
     * Gets the value of the showTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowTotal() {
        return showTotal;
    }

    /**
     * Sets the value of the showTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTotal(Boolean value) {
        this.showTotal = value;
    }

    /**
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardComponentFilter }
     *     
     */
    public DashboardComponentFilter getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardComponentFilter }
     *     
     */
    public void setSortBy(DashboardComponentFilter value) {
        this.sortBy = value;
    }

}
