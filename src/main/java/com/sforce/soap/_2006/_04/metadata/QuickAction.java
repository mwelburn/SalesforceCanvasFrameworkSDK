
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="canvas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fieldOverrides" type="{http://soap.sforce.com/2006/04/metadata}FieldOverride" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quickActionLayout" type="{http://soap.sforce.com/2006/04/metadata}QuickActionLayout" minOccurs="0"/>
 *         &lt;element name="standardLabel" type="{http://soap.sforce.com/2006/04/metadata}QuickActionLabel" minOccurs="0"/>
 *         &lt;element name="targetObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetParentField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetRecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://soap.sforce.com/2006/04/metadata}QuickActionType"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickAction", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "canvas",
    "description",
    "fieldOverrides",
    "height",
    "icon",
    "isProtected",
    "label",
    "page",
    "quickActionLayout",
    "standardLabel",
    "targetObject",
    "targetParentField",
    "targetRecordType",
    "type",
    "width"
})
public class QuickAction
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String canvas;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FieldOverride> fieldOverrides;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer height;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String icon;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean isProtected;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String page;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected QuickActionLayout quickActionLayout;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected QuickActionLabel standardLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String targetObject;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String targetParentField;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String targetRecordType;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected QuickActionType type;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Integer width;

    /**
     * Gets the value of the canvas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvas() {
        return canvas;
    }

    /**
     * Sets the value of the canvas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvas(String value) {
        this.canvas = value;
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
     * Gets the value of the fieldOverrides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldOverrides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldOverrides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldOverride }
     * 
     * 
     */
    public List<FieldOverride> getFieldOverrides() {
        if (fieldOverrides == null) {
            fieldOverrides = new ArrayList<FieldOverride>();
        }
        return this.fieldOverrides;
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
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the isProtected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProtected() {
        return isProtected;
    }

    /**
     * Sets the value of the isProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProtected(Boolean value) {
        this.isProtected = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Gets the value of the quickActionLayout property.
     * 
     * @return
     *     possible object is
     *     {@link QuickActionLayout }
     *     
     */
    public QuickActionLayout getQuickActionLayout() {
        return quickActionLayout;
    }

    /**
     * Sets the value of the quickActionLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickActionLayout }
     *     
     */
    public void setQuickActionLayout(QuickActionLayout value) {
        this.quickActionLayout = value;
    }

    /**
     * Gets the value of the standardLabel property.
     * 
     * @return
     *     possible object is
     *     {@link QuickActionLabel }
     *     
     */
    public QuickActionLabel getStandardLabel() {
        return standardLabel;
    }

    /**
     * Sets the value of the standardLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickActionLabel }
     *     
     */
    public void setStandardLabel(QuickActionLabel value) {
        this.standardLabel = value;
    }

    /**
     * Gets the value of the targetObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetObject() {
        return targetObject;
    }

    /**
     * Sets the value of the targetObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetObject(String value) {
        this.targetObject = value;
    }

    /**
     * Gets the value of the targetParentField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetParentField() {
        return targetParentField;
    }

    /**
     * Sets the value of the targetParentField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetParentField(String value) {
        this.targetParentField = value;
    }

    /**
     * Gets the value of the targetRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRecordType() {
        return targetRecordType;
    }

    /**
     * Sets the value of the targetRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetRecordType(String value) {
        this.targetRecordType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QuickActionType }
     *     
     */
    public QuickActionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickActionType }
     *     
     */
    public void setType(QuickActionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

}
