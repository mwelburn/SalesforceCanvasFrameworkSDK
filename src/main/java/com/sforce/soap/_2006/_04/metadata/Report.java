
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Report complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Report">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="aggregates" type="{http://soap.sforce.com/2006/04/metadata}ReportAggregate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="block" type="{http://soap.sforce.com/2006/04/metadata}Report" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="blockInfo" type="{http://soap.sforce.com/2006/04/metadata}ReportBlockInfo" minOccurs="0"/>
 *         &lt;element name="buckets" type="{http://soap.sforce.com/2006/04/metadata}ReportBucketField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chart" type="{http://soap.sforce.com/2006/04/metadata}ReportChart" minOccurs="0"/>
 *         &lt;element name="colorRanges" type="{http://soap.sforce.com/2006/04/metadata}ReportColorRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="columns" type="{http://soap.sforce.com/2006/04/metadata}ReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="crossFilters" type="{http://soap.sforce.com/2006/04/metadata}ReportCrossFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://soap.sforce.com/2006/04/metadata}CurrencyIsoCode" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filter" type="{http://soap.sforce.com/2006/04/metadata}ReportFilter" minOccurs="0"/>
 *         &lt;element name="format" type="{http://soap.sforce.com/2006/04/metadata}ReportFormat"/>
 *         &lt;element name="groupingsAcross" type="{http://soap.sforce.com/2006/04/metadata}ReportGrouping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupingsDown" type="{http://soap.sforce.com/2006/04/metadata}ReportGrouping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="historicalSelector" type="{http://soap.sforce.com/2006/04/metadata}ReportHistoricalSelector" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="params" type="{http://soap.sforce.com/2006/04/metadata}ReportParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roleHierarchyFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showCurrentDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sortColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://soap.sforce.com/2006/04/metadata}SortOrder" minOccurs="0"/>
 *         &lt;element name="territoryHierarchyFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeFrameFilter" type="{http://soap.sforce.com/2006/04/metadata}ReportTimeFrameFilter" minOccurs="0"/>
 *         &lt;element name="userFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "aggregates",
    "block",
    "blockInfo",
    "buckets",
    "chart",
    "colorRanges",
    "columns",
    "crossFilters",
    "currency",
    "description",
    "division",
    "filter",
    "format",
    "groupingsAcross",
    "groupingsDown",
    "historicalSelector",
    "name",
    "params",
    "reportType",
    "roleHierarchyFilter",
    "rowLimit",
    "scope",
    "showCurrentDate",
    "showDetails",
    "sortColumn",
    "sortOrder",
    "territoryHierarchyFilter",
    "timeFrameFilter",
    "userFilter"
})
public class Report
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportAggregate> aggregates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<Report> block;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportBlockInfo blockInfo;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportBucketField> buckets;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportChart chart;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportColorRange> colorRanges;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportColumn> columns;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportCrossFilter> crossFilters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected CurrencyIsoCode currency;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String division;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportFilter filter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ReportFormat format;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportGrouping> groupingsAcross;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportGrouping> groupingsDown;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportHistoricalSelector historicalSelector;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ReportParam> params;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String reportType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String roleHierarchyFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer rowLimit;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String scope;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showCurrentDate;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showDetails;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String sortColumn;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected SortOrder sortOrder;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String territoryHierarchyFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportTimeFrameFilter timeFrameFilter;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String userFilter;

    /**
     * Gets the value of the aggregates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportAggregate }
     * 
     * 
     */
    public List<ReportAggregate> getAggregates() {
        if (aggregates == null) {
            aggregates = new ArrayList<ReportAggregate>();
        }
        return this.aggregates;
    }

    /**
     * Gets the value of the block property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the block property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Report }
     * 
     * 
     */
    public List<Report> getBlock() {
        if (block == null) {
            block = new ArrayList<Report>();
        }
        return this.block;
    }

    /**
     * Gets the value of the blockInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReportBlockInfo }
     *     
     */
    public ReportBlockInfo getBlockInfo() {
        return blockInfo;
    }

    /**
     * Sets the value of the blockInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportBlockInfo }
     *     
     */
    public void setBlockInfo(ReportBlockInfo value) {
        this.blockInfo = value;
    }

    /**
     * Gets the value of the buckets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buckets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuckets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportBucketField }
     * 
     * 
     */
    public List<ReportBucketField> getBuckets() {
        if (buckets == null) {
            buckets = new ArrayList<ReportBucketField>();
        }
        return this.buckets;
    }

    /**
     * Gets the value of the chart property.
     * 
     * @return
     *     possible object is
     *     {@link ReportChart }
     *     
     */
    public ReportChart getChart() {
        return chart;
    }

    /**
     * Sets the value of the chart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportChart }
     *     
     */
    public void setChart(ReportChart value) {
        this.chart = value;
    }

    /**
     * Gets the value of the colorRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportColorRange }
     * 
     * 
     */
    public List<ReportColorRange> getColorRanges() {
        if (colorRanges == null) {
            colorRanges = new ArrayList<ReportColorRange>();
        }
        return this.colorRanges;
    }

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportColumn }
     * 
     * 
     */
    public List<ReportColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<ReportColumn>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the crossFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportCrossFilter }
     * 
     * 
     */
    public List<ReportCrossFilter> getCrossFilters() {
        if (crossFilters == null) {
            crossFilters = new ArrayList<ReportCrossFilter>();
        }
        return this.crossFilters;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyIsoCode }
     *     
     */
    public CurrencyIsoCode getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyIsoCode }
     *     
     */
    public void setCurrency(CurrencyIsoCode value) {
        this.currency = value;
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
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ReportFilter }
     *     
     */
    public ReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportFilter }
     *     
     */
    public void setFilter(ReportFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ReportFormat }
     *     
     */
    public ReportFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportFormat }
     *     
     */
    public void setFormat(ReportFormat value) {
        this.format = value;
    }

    /**
     * Gets the value of the groupingsAcross property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingsAcross property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingsAcross().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportGrouping }
     * 
     * 
     */
    public List<ReportGrouping> getGroupingsAcross() {
        if (groupingsAcross == null) {
            groupingsAcross = new ArrayList<ReportGrouping>();
        }
        return this.groupingsAcross;
    }

    /**
     * Gets the value of the groupingsDown property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingsDown property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingsDown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportGrouping }
     * 
     * 
     */
    public List<ReportGrouping> getGroupingsDown() {
        if (groupingsDown == null) {
            groupingsDown = new ArrayList<ReportGrouping>();
        }
        return this.groupingsDown;
    }

    /**
     * Gets the value of the historicalSelector property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHistoricalSelector }
     *     
     */
    public ReportHistoricalSelector getHistoricalSelector() {
        return historicalSelector;
    }

    /**
     * Sets the value of the historicalSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHistoricalSelector }
     *     
     */
    public void setHistoricalSelector(ReportHistoricalSelector value) {
        this.historicalSelector = value;
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
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportParam }
     * 
     * 
     */
    public List<ReportParam> getParams() {
        if (params == null) {
            params = new ArrayList<ReportParam>();
        }
        return this.params;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the roleHierarchyFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleHierarchyFilter() {
        return roleHierarchyFilter;
    }

    /**
     * Sets the value of the roleHierarchyFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleHierarchyFilter(String value) {
        this.roleHierarchyFilter = value;
    }

    /**
     * Gets the value of the rowLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowLimit() {
        return rowLimit;
    }

    /**
     * Sets the value of the rowLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowLimit(Integer value) {
        this.rowLimit = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the showCurrentDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowCurrentDate() {
        return showCurrentDate;
    }

    /**
     * Sets the value of the showCurrentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCurrentDate(Boolean value) {
        this.showCurrentDate = value;
    }

    /**
     * Gets the value of the showDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowDetails() {
        return showDetails;
    }

    /**
     * Sets the value of the showDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDetails(Boolean value) {
        this.showDetails = value;
    }

    /**
     * Gets the value of the sortColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortColumn() {
        return sortColumn;
    }

    /**
     * Sets the value of the sortColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortColumn(String value) {
        this.sortColumn = value;
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
     * Gets the value of the territoryHierarchyFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryHierarchyFilter() {
        return territoryHierarchyFilter;
    }

    /**
     * Sets the value of the territoryHierarchyFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryHierarchyFilter(String value) {
        this.territoryHierarchyFilter = value;
    }

    /**
     * Gets the value of the timeFrameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTimeFrameFilter }
     *     
     */
    public ReportTimeFrameFilter getTimeFrameFilter() {
        return timeFrameFilter;
    }

    /**
     * Sets the value of the timeFrameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTimeFrameFilter }
     *     
     */
    public void setTimeFrameFilter(ReportTimeFrameFilter value) {
        this.timeFrameFilter = value;
    }

    /**
     * Gets the value of the userFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFilter() {
        return userFilter;
    }

    /**
     * Sets the value of the userFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFilter(String value) {
        this.userFilter = value;
    }

}
