
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportChart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportChart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="backgroundColor1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backgroundColor2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backgroundFadeDir" type="{http://soap.sforce.com/2006/04/metadata}ChartBackgroundDirection" minOccurs="0"/>
 *         &lt;element name="chartSummaries" type="{http://soap.sforce.com/2006/04/metadata}ChartSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chartType" type="{http://soap.sforce.com/2006/04/metadata}ChartType"/>
 *         &lt;element name="enableHoverLabels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expandOthers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupingColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legendPosition" type="{http://soap.sforce.com/2006/04/metadata}ChartLegendPosition" minOccurs="0"/>
 *         &lt;element name="location" type="{http://soap.sforce.com/2006/04/metadata}ChartPosition" minOccurs="0"/>
 *         &lt;element name="secondaryGroupingColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showAxisLabels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="size" type="{http://soap.sforce.com/2006/04/metadata}ReportChartSize" minOccurs="0"/>
 *         &lt;element name="summaryAxisManualRangeEnd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="summaryAxisManualRangeStart" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="summaryAxisRange" type="{http://soap.sforce.com/2006/04/metadata}ChartRangeType" minOccurs="0"/>
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titleColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titleSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportChart", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "backgroundColor1",
    "backgroundColor2",
    "backgroundFadeDir",
    "chartSummaries",
    "chartType",
    "enableHoverLabels",
    "expandOthers",
    "groupingColumn",
    "legendPosition",
    "location",
    "secondaryGroupingColumn",
    "showAxisLabels",
    "showPercentage",
    "showTotal",
    "showValues",
    "size",
    "summaryAxisManualRangeEnd",
    "summaryAxisManualRangeStart",
    "summaryAxisRange",
    "textColor",
    "textSize",
    "title",
    "titleColor",
    "titleSize"
})
public class ReportChart {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String backgroundColor1;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String backgroundColor2;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChartBackgroundDirection backgroundFadeDir;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ChartSummary> chartSummaries;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ChartType chartType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean enableHoverLabels;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean expandOthers;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String groupingColumn;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChartLegendPosition legendPosition;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChartPosition location;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String secondaryGroupingColumn;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showAxisLabels;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showPercentage;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showTotal;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showValues;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportChartSize size;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double summaryAxisManualRangeEnd;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Double summaryAxisManualRangeStart;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ChartRangeType summaryAxisRange;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String textColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer textSize;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String title;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String titleColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer titleSize;

    /**
     * Gets the value of the backgroundColor1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor1() {
        return backgroundColor1;
    }

    /**
     * Sets the value of the backgroundColor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor1(String value) {
        this.backgroundColor1 = value;
    }

    /**
     * Gets the value of the backgroundColor2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor2() {
        return backgroundColor2;
    }

    /**
     * Sets the value of the backgroundColor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor2(String value) {
        this.backgroundColor2 = value;
    }

    /**
     * Gets the value of the backgroundFadeDir property.
     * 
     * @return
     *     possible object is
     *     {@link ChartBackgroundDirection }
     *     
     */
    public ChartBackgroundDirection getBackgroundFadeDir() {
        return backgroundFadeDir;
    }

    /**
     * Sets the value of the backgroundFadeDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartBackgroundDirection }
     *     
     */
    public void setBackgroundFadeDir(ChartBackgroundDirection value) {
        this.backgroundFadeDir = value;
    }

    /**
     * Gets the value of the chartSummaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chartSummaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChartSummaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChartSummary }
     * 
     * 
     */
    public List<ChartSummary> getChartSummaries() {
        if (chartSummaries == null) {
            chartSummaries = new ArrayList<ChartSummary>();
        }
        return this.chartSummaries;
    }

    /**
     * Gets the value of the chartType property.
     * 
     * @return
     *     possible object is
     *     {@link ChartType }
     *     
     */
    public ChartType getChartType() {
        return chartType;
    }

    /**
     * Sets the value of the chartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartType }
     *     
     */
    public void setChartType(ChartType value) {
        this.chartType = value;
    }

    /**
     * Gets the value of the enableHoverLabels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHoverLabels() {
        return enableHoverLabels;
    }

    /**
     * Sets the value of the enableHoverLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHoverLabels(Boolean value) {
        this.enableHoverLabels = value;
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
     * Gets the value of the groupingColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingColumn() {
        return groupingColumn;
    }

    /**
     * Sets the value of the groupingColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingColumn(String value) {
        this.groupingColumn = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ChartPosition }
     *     
     */
    public ChartPosition getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartPosition }
     *     
     */
    public void setLocation(ChartPosition value) {
        this.location = value;
    }

    /**
     * Gets the value of the secondaryGroupingColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryGroupingColumn() {
        return secondaryGroupingColumn;
    }

    /**
     * Sets the value of the secondaryGroupingColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryGroupingColumn(String value) {
        this.secondaryGroupingColumn = value;
    }

    /**
     * Gets the value of the showAxisLabels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowAxisLabels() {
        return showAxisLabels;
    }

    /**
     * Sets the value of the showAxisLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowAxisLabels(Boolean value) {
        this.showAxisLabels = value;
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
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link ReportChartSize }
     *     
     */
    public ReportChartSize getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportChartSize }
     *     
     */
    public void setSize(ReportChartSize value) {
        this.size = value;
    }

    /**
     * Gets the value of the summaryAxisManualRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSummaryAxisManualRangeEnd() {
        return summaryAxisManualRangeEnd;
    }

    /**
     * Sets the value of the summaryAxisManualRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSummaryAxisManualRangeEnd(Double value) {
        this.summaryAxisManualRangeEnd = value;
    }

    /**
     * Gets the value of the summaryAxisManualRangeStart property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSummaryAxisManualRangeStart() {
        return summaryAxisManualRangeStart;
    }

    /**
     * Sets the value of the summaryAxisManualRangeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSummaryAxisManualRangeStart(Double value) {
        this.summaryAxisManualRangeStart = value;
    }

    /**
     * Gets the value of the summaryAxisRange property.
     * 
     * @return
     *     possible object is
     *     {@link ChartRangeType }
     *     
     */
    public ChartRangeType getSummaryAxisRange() {
        return summaryAxisRange;
    }

    /**
     * Sets the value of the summaryAxisRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartRangeType }
     *     
     */
    public void setSummaryAxisRange(ChartRangeType value) {
        this.summaryAxisRange = value;
    }

    /**
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    /**
     * Gets the value of the textSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTextSize() {
        return textSize;
    }

    /**
     * Sets the value of the textSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTextSize(Integer value) {
        this.textSize = value;
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
     * Gets the value of the titleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleColor() {
        return titleColor;
    }

    /**
     * Sets the value of the titleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleColor(String value) {
        this.titleColor = value;
    }

    /**
     * Gets the value of the titleSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitleSize() {
        return titleSize;
    }

    /**
     * Sets the value of the titleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitleSize(Integer value) {
        this.titleSize = value;
    }

}
