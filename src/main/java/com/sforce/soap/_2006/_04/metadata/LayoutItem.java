
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LayoutItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LayoutItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="behavior" type="{http://soap.sforce.com/2006/04/metadata}UiBehavior" minOccurs="0"/>
 *         &lt;element name="component" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emptySpace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportChartComponent" type="{http://soap.sforce.com/2006/04/metadata}ReportChartComponentLayoutItem" minOccurs="0"/>
 *         &lt;element name="scontrol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showScrollbars" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LayoutItem", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "behavior",
    "component",
    "customLink",
    "emptySpace",
    "field",
    "height",
    "page",
    "reportChartComponent",
    "scontrol",
    "showLabel",
    "showScrollbars",
    "width"
})
public class LayoutItem {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected UiBehavior behavior;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String component;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String customLink;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean emptySpace;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String field;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer height;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String page;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected ReportChartComponentLayoutItem reportChartComponent;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String scontrol;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean showScrollbars;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String width;

    /**
     * Gets the value of the behavior property.
     * 
     * @return
     *     possible object is
     *     {@link UiBehavior }
     *     
     */
    public UiBehavior getBehavior() {
        return behavior;
    }

    /**
     * Sets the value of the behavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link UiBehavior }
     *     
     */
    public void setBehavior(UiBehavior value) {
        this.behavior = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Gets the value of the customLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomLink() {
        return customLink;
    }

    /**
     * Sets the value of the customLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomLink(String value) {
        this.customLink = value;
    }

    /**
     * Gets the value of the emptySpace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmptySpace() {
        return emptySpace;
    }

    /**
     * Sets the value of the emptySpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmptySpace(Boolean value) {
        this.emptySpace = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
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
     * Gets the value of the reportChartComponent property.
     * 
     * @return
     *     possible object is
     *     {@link ReportChartComponentLayoutItem }
     *     
     */
    public ReportChartComponentLayoutItem getReportChartComponent() {
        return reportChartComponent;
    }

    /**
     * Sets the value of the reportChartComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportChartComponentLayoutItem }
     *     
     */
    public void setReportChartComponent(ReportChartComponentLayoutItem value) {
        this.reportChartComponent = value;
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
     * Gets the value of the showLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLabel() {
        return showLabel;
    }

    /**
     * Sets the value of the showLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLabel(Boolean value) {
        this.showLabel = value;
    }

    /**
     * Gets the value of the showScrollbars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowScrollbars() {
        return showScrollbars;
    }

    /**
     * Sets the value of the showScrollbars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowScrollbars(Boolean value) {
        this.showScrollbars = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

}
