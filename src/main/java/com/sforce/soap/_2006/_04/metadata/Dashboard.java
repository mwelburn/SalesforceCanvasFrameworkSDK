
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dashboard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dashboard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="backgroundEndColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="backgroundFadeDirection" type="{http://soap.sforce.com/2006/04/metadata}ChartBackgroundDirection"/>
 *         &lt;element name="backgroundStartColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dashboardFilters" type="{http://soap.sforce.com/2006/04/metadata}DashboardFilter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dashboardType" type="{http://soap.sforce.com/2006/04/metadata}DashboardType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leftSection" type="{http://soap.sforce.com/2006/04/metadata}DashboardComponentSection"/>
 *         &lt;element name="middleSection" type="{http://soap.sforce.com/2006/04/metadata}DashboardComponentSection" minOccurs="0"/>
 *         &lt;element name="rightSection" type="{http://soap.sforce.com/2006/04/metadata}DashboardComponentSection"/>
 *         &lt;element name="runningUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titleColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titleSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dashboard", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "backgroundEndColor",
    "backgroundFadeDirection",
    "backgroundStartColor",
    "dashboardFilters",
    "dashboardType",
    "description",
    "leftSection",
    "middleSection",
    "rightSection",
    "runningUser",
    "textColor",
    "title",
    "titleColor",
    "titleSize"
})
public class Dashboard
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String backgroundEndColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected ChartBackgroundDirection backgroundFadeDirection;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String backgroundStartColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<DashboardFilter> dashboardFilters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DashboardType dashboardType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected DashboardComponentSection leftSection;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected DashboardComponentSection middleSection;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected DashboardComponentSection rightSection;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String runningUser;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String textColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String title;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String titleColor;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected int titleSize;

    /**
     * Gets the value of the backgroundEndColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundEndColor() {
        return backgroundEndColor;
    }

    /**
     * Sets the value of the backgroundEndColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundEndColor(String value) {
        this.backgroundEndColor = value;
    }

    /**
     * Gets the value of the backgroundFadeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ChartBackgroundDirection }
     *     
     */
    public ChartBackgroundDirection getBackgroundFadeDirection() {
        return backgroundFadeDirection;
    }

    /**
     * Sets the value of the backgroundFadeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartBackgroundDirection }
     *     
     */
    public void setBackgroundFadeDirection(ChartBackgroundDirection value) {
        this.backgroundFadeDirection = value;
    }

    /**
     * Gets the value of the backgroundStartColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundStartColor() {
        return backgroundStartColor;
    }

    /**
     * Sets the value of the backgroundStartColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundStartColor(String value) {
        this.backgroundStartColor = value;
    }

    /**
     * Gets the value of the dashboardFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dashboardFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDashboardFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DashboardFilter }
     * 
     * 
     */
    public List<DashboardFilter> getDashboardFilters() {
        if (dashboardFilters == null) {
            dashboardFilters = new ArrayList<DashboardFilter>();
        }
        return this.dashboardFilters;
    }

    /**
     * Gets the value of the dashboardType property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardType }
     *     
     */
    public DashboardType getDashboardType() {
        return dashboardType;
    }

    /**
     * Sets the value of the dashboardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardType }
     *     
     */
    public void setDashboardType(DashboardType value) {
        this.dashboardType = value;
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
     * Gets the value of the leftSection property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardComponentSection }
     *     
     */
    public DashboardComponentSection getLeftSection() {
        return leftSection;
    }

    /**
     * Sets the value of the leftSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardComponentSection }
     *     
     */
    public void setLeftSection(DashboardComponentSection value) {
        this.leftSection = value;
    }

    /**
     * Gets the value of the middleSection property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardComponentSection }
     *     
     */
    public DashboardComponentSection getMiddleSection() {
        return middleSection;
    }

    /**
     * Sets the value of the middleSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardComponentSection }
     *     
     */
    public void setMiddleSection(DashboardComponentSection value) {
        this.middleSection = value;
    }

    /**
     * Gets the value of the rightSection property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardComponentSection }
     *     
     */
    public DashboardComponentSection getRightSection() {
        return rightSection;
    }

    /**
     * Sets the value of the rightSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardComponentSection }
     *     
     */
    public void setRightSection(DashboardComponentSection value) {
        this.rightSection = value;
    }

    /**
     * Gets the value of the runningUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunningUser() {
        return runningUser;
    }

    /**
     * Sets the value of the runningUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunningUser(String value) {
        this.runningUser = value;
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
     */
    public int getTitleSize() {
        return titleSize;
    }

    /**
     * Sets the value of the titleSize property.
     * 
     */
    public void setTitleSize(int value) {
        this.titleSize = value;
    }

}
