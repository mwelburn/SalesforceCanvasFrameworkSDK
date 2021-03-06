
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="customDataTypeComponents" type="{http://soap.sforce.com/2006/04/metadata}CustomDataTypeComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editComponentsOnSeparateLines" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rightAligned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supportComponentsInReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomDataType", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "customDataTypeComponents",
    "description",
    "displayFormula",
    "editComponentsOnSeparateLines",
    "label",
    "rightAligned",
    "supportComponentsInReports"
})
public class CustomDataType
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<CustomDataTypeComponent> customDataTypeComponents;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String description;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String displayFormula;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean editComponentsOnSeparateLines;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean rightAligned;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean supportComponentsInReports;

    /**
     * Gets the value of the customDataTypeComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customDataTypeComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomDataTypeComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomDataTypeComponent }
     * 
     * 
     */
    public List<CustomDataTypeComponent> getCustomDataTypeComponents() {
        if (customDataTypeComponents == null) {
            customDataTypeComponents = new ArrayList<CustomDataTypeComponent>();
        }
        return this.customDataTypeComponents;
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
     * Gets the value of the displayFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFormula() {
        return displayFormula;
    }

    /**
     * Sets the value of the displayFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFormula(String value) {
        this.displayFormula = value;
    }

    /**
     * Gets the value of the editComponentsOnSeparateLines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditComponentsOnSeparateLines() {
        return editComponentsOnSeparateLines;
    }

    /**
     * Sets the value of the editComponentsOnSeparateLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditComponentsOnSeparateLines(Boolean value) {
        this.editComponentsOnSeparateLines = value;
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
     * Gets the value of the rightAligned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightAligned() {
        return rightAligned;
    }

    /**
     * Sets the value of the rightAligned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightAligned(Boolean value) {
        this.rightAligned = value;
    }

    /**
     * Gets the value of the supportComponentsInReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportComponentsInReports() {
        return supportComponentsInReports;
    }

    /**
     * Sets the value of the supportComponentsInReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportComponentsInReports(Boolean value) {
        this.supportComponentsInReports = value;
    }

}
