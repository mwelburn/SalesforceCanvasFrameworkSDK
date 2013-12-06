
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoselectColumnsFromReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="chartAxisRange" type="{http://soap.sforce.com/2006/04/metadata}ChartRangeType" minOccurs="0"/>
 *         &lt;element name="chartAxisRangeMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="chartAxisRangeMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="chartSummary" type="{http://soap.sforce.com/2006/04/metadata}ChartSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="componentType" type="{http://soap.sforce.com/2006/04/metadata}DashboardComponentType"/>
 *         &lt;element name="dashboardFilterColumns" type="{http://soap.sforce.com/2006/04/metadata}DashboardFilterColumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dashboardTableColumn" type="{http://soap.sforce.com/2006/04/metadata}DashboardTableColumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="displayUnits" type="{http://soap.sforce.com/2006/04/metadata}ChartUnits" minOccurs="0"/>
 *         &lt;element name="drillDownUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drillEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="drillToDetailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableHover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expandOthers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gaugeMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="gaugeMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="groupingColumn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicatorBreakpoint1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="indicatorBreakpoint2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="indicatorHighColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicatorLowColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicatorMiddleColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legendPosition" type="{http://soap.sforce.com/2006/04/metadata}ChartLegendPosition" minOccurs="0"/>
 *         &lt;element name="maxValuesDisplayed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="metricLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageHeightInPixels" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scontrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scontrolHeightInPixels" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="showPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showPicturesOnCharts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showPicturesOnTables" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sortBy" type="{http://soap.sforce.com/2006/04/metadata}DashboardComponentFilter" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useReportChart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardComponent", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "autoselectColumnsFromReport",
    "chartAxisRange",
    "chartAxisRangeMax",
    "chartAxisRangeMin",
    "chartSummary",
    "componentType",
    "dashboardFilterColumns",
    "dashboardTableColumn",
    "displayUnits",
    "drillDownUrl",
    "drillEnabled",
    "drillToDetailEnabled",
    "enableHover",
    "expandOthers",
    "footer",
    "gaugeMax",
    "gaugeMin",
    "groupingColumn",
    "header",
    "indicatorBreakpoint1",
    "indicatorBreakpoint2",
    "indicatorHighColor",
    "indicatorLowColor",
    "indicatorMiddleColor",
    "legendPosition",
    "maxValuesDisplayed",
    "metricLabel",
    "page",
    "pageHeightInPixels",
    "report",
    "scontrol",
    "scontrolHeightInPixels",
    "showPercentage",
    "showPicturesOnCharts",
    "showPicturesOnTables",
    "showTotal",
    "showValues",
    "sortBy",
    "title",
    "useReportChart"
})
public class DashboardComponent {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean autoselectColumnsFromReport;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChartRangeType chartAxisRange;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double chartAxisRangeMax;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double chartAxisRangeMin;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ChartSummary> chartSummary;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected DashboardComponentType componentType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<DashboardFilterColumn> dashboardFilterColumns;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<DashboardTableColumn> dashboardTableColumn;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChartUnits displayUnits;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String drillDownUrl;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean drillEnabled;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean drillToDetailEnabled;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableHover;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean expandOthers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String footer;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double gaugeMax;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double gaugeMin;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<String> groupingColumn;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String header;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double indicatorBreakpoint1;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double indicatorBreakpoint2;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String indicatorHighColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String indicatorLowColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String indicatorMiddleColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChartLegendPosition legendPosition;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer maxValuesDisplayed;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String metricLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String page;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer pageHeightInPixels;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String report;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String scontrol;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer scontrolHeightInPixels;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showPercentage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showPicturesOnCharts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showPicturesOnTables;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showTotal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showValues;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DashboardComponentFilter sortBy;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String title;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean useReportChart;

    /**
     * Gets the value of the autoselectColumnsFromReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoselectColumnsFromReport() {
        return autoselectColumnsFromReport;
    }

    /**
     * Sets the value of the autoselectColumnsFromReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoselectColumnsFromReport(Boolean value) {
        this.autoselectColumnsFromReport = value;
    }

    /**
     * Gets the value of the chartAxisRange property.
     * 
     * @return
     *     possible object is
     *     {@link ChartRangeType }
     *     
     */
    public ChartRangeType getChartAxisRange() {
        return chartAxisRange;
    }

    /**
     * Sets the value of the chartAxisRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartRangeType }
     *     
     */
    public void setChartAxisRange(ChartRangeType value) {
        this.chartAxisRange = value;
    }

    /**
     * Gets the value of the chartAxisRangeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChartAxisRangeMax() {
        return chartAxisRangeMax;
    }

    /**
     * Sets the value of the chartAxisRangeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChartAxisRangeMax(Double value) {
        this.chartAxisRangeMax = value;
    }

    /**
     * Gets the value of the chartAxisRangeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChartAxisRangeMin() {
        return chartAxisRangeMin;
    }

    /**
     * Sets the value of the chartAxisRangeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChartAxisRangeMin(Double value) {
        this.chartAxisRangeMin = value;
    }

    /**
     * Gets the value of the chartSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chartSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChartSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChartSummary }
     * 
     * 
     */
    public List<ChartSummary> getChartSummary() {
        if (chartSummary == null) {
            chartSummary = new ArrayList<ChartSummary>();
        }
        return this.chartSummary;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardComponentType }
     *     
     */
    public DashboardComponentType getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardComponentType }
     *     
     */
    public void setComponentType(DashboardComponentType value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the dashboardFilterColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dashboardFilterColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDashboardFilterColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DashboardFilterColumn }
     * 
     * 
     */
    public List<DashboardFilterColumn> getDashboardFilterColumns() {
        if (dashboardFilterColumns == null) {
            dashboardFilterColumns = new ArrayList<DashboardFilterColumn>();
        }
        return this.dashboardFilterColumns;
    }

    /**
     * Gets the value of the dashboardTableColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dashboardTableColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDashboardTableColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DashboardTableColumn }
     * 
     * 
     */
    public List<DashboardTableColumn> getDashboardTableColumn() {
        if (dashboardTableColumn == null) {
            dashboardTableColumn = new ArrayList<DashboardTableColumn>();
        }
        return this.dashboardTableColumn;
    }

    /**
     * Gets the value of the displayUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ChartUnits }
     *     
     */
    public ChartUnits getDisplayUnits() {
        return displayUnits;
    }

    /**
     * Sets the value of the displayUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartUnits }
     *     
     */
    public void setDisplayUnits(ChartUnits value) {
        this.displayUnits = value;
    }

    /**
     * Gets the value of the drillDownUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrillDownUrl() {
        return drillDownUrl;
    }

    /**
     * Sets the value of the drillDownUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrillDownUrl(String value) {
        this.drillDownUrl = value;
    }

    /**
     * Gets the value of the drillEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrillEnabled() {
        return drillEnabled;
    }

    /**
     * Sets the value of the drillEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrillEnabled(Boolean value) {
        this.drillEnabled = value;
    }

    /**
     * Gets the value of the drillToDetailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrillToDetailEnabled() {
        return drillToDetailEnabled;
    }

    /**
     * Sets the value of the drillToDetailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrillToDetailEnabled(Boolean value) {
        this.drillToDetailEnabled = value;
    }

    /**
     * Gets the value of the enableHover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHover() {
        return enableHover;
    }

    /**
     * Sets the value of the enableHover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHover(Boolean value) {
        this.enableHover = value;
    }

    /**
     * Gets the value of the expandOthers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpandOthers() {
        return expandOthers;
    }

    /**
     * Sets the value of the expandOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpandOthers(Boolean value) {
        this.expandOthers = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * Gets the value of the gaugeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGaugeMax() {
        return gaugeMax;
    }

    /**
     * Sets the value of the gaugeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGaugeMax(Double value) {
        this.gaugeMax = value;
    }

    /**
     * Gets the value of the gaugeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGaugeMin() {
        return gaugeMin;
    }

    /**
     * Sets the value of the gaugeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGaugeMin(Double value) {
        this.gaugeMin = value;
    }

    /**
     * Gets the value of the groupingColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupingColumn() {
        if (groupingColumn == null) {
            groupingColumn = new ArrayList<String>();
        }
        return this.groupingColumn;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the indicatorBreakpoint1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIndicatorBreakpoint1() {
        return indicatorBreakpoint1;
    }

    /**
     * Sets the value of the indicatorBreakpoint1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIndicatorBreakpoint1(Double value) {
        this.indicatorBreakpoint1 = value;
    }

    /**
     * Gets the value of the indicatorBreakpoint2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIndicatorBreakpoint2() {
        return indicatorBreakpoint2;
    }

    /**
     * Sets the value of the indicatorBreakpoint2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIndicatorBreakpoint2(Double value) {
        this.indicatorBreakpoint2 = value;
    }

    /**
     * Gets the value of the indicatorHighColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorHighColor() {
        return indicatorHighColor;
    }

    /**
     * Sets the value of the indicatorHighColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorHighColor(String value) {
        this.indicatorHighColor = value;
    }

    /**
     * Gets the value of the indicatorLowColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorLowColor() {
        return indicatorLowColor;
    }

    /**
     * Sets the value of the indicatorLowColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorLowColor(String value) {
        this.indicatorLowColor = value;
    }

    /**
     * Gets the value of the indicatorMiddleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorMiddleColor() {
        return indicatorMiddleColor;
    }

    /**
     * Sets the value of the indicatorMiddleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatorMiddleColor(String value) {
        this.indicatorMiddleColor = value;
    }

    /**
     * Gets the value of the legendPosition property.
     * 
     * @return
     *     possible object is
     *     {@link ChartLegendPosition }
     *     
     */
    public ChartLegendPosition getLegendPosition() {
        return legendPosition;
    }

    /**
     * Sets the value of the legendPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartLegendPosition }
     *     
     */
    public void setLegendPosition(ChartLegendPosition value) {
        this.legendPosition = value;
    }

    /**
     * Gets the value of the maxValuesDisplayed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxValuesDisplayed() {
        return maxValuesDisplayed;
    }

    /**
     * Sets the value of the maxValuesDisplayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxValuesDisplayed(Integer value) {
        this.maxValuesDisplayed = value;
    }

    /**
     * Gets the value of the metricLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetricLabel() {
        return metricLabel;
    }

    /**
     * Sets the value of the metricLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetricLabel(String value) {
        this.metricLabel = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the pageHeightInPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageHeightInPixels() {
        return pageHeightInPixels;
    }

    /**
     * Sets the value of the pageHeightInPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageHeightInPixels(Integer value) {
        this.pageHeightInPixels = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReport(String value) {
        this.report = value;
    }

    /**
     * Gets the value of the scontrol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScontrol() {
        return scontrol;
    }

    /**
     * Sets the value of the scontrol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScontrol(String value) {
        this.scontrol = value;
    }

    /**
     * Gets the value of the scontrolHeightInPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScontrolHeightInPixels() {
        return scontrolHeightInPixels;
    }

    /**
     * Sets the value of the scontrolHeightInPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScontrolHeightInPixels(Integer value) {
        this.scontrolHeightInPixels = value;
    }

    /**
     * Gets the value of the showPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPercentage() {
        return showPercentage;
    }

    /**
     * Sets the value of the showPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPercentage(Boolean value) {
        this.showPercentage = value;
    }

    /**
     * Gets the value of the showPicturesOnCharts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPicturesOnCharts() {
        return showPicturesOnCharts;
    }

    /**
     * Sets the value of the showPicturesOnCharts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPicturesOnCharts(Boolean value) {
        this.showPicturesOnCharts = value;
    }

    /**
     * Gets the value of the showPicturesOnTables property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPicturesOnTables() {
        return showPicturesOnTables;
    }

    /**
     * Sets the value of the showPicturesOnTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPicturesOnTables(Boolean value) {
        this.showPicturesOnTables = value;
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
     * Gets the value of the showValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowValues() {
        return showValues;
    }

    /**
     * Sets the value of the showValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowValues(Boolean value) {
        this.showValues = value;
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

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the useReportChart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseReportChart() {
        return useReportChart;
    }

    /**
     * Sets the value of the useReportChart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseReportChart(Boolean value) {
        this.useReportChart = value;
    }

}
