
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessHoursEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessHoursEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fridayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="fridayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="mondayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="mondayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saturdayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="saturdayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="sundayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="sundayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="thursdayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="thursdayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="timeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuesdayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="tuesdayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="wednesdayEndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="wednesdayStartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessHoursEntry", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "active",
    "_default",
    "fridayEndTime",
    "fridayStartTime",
    "mondayEndTime",
    "mondayStartTime",
    "name",
    "saturdayEndTime",
    "saturdayStartTime",
    "sundayEndTime",
    "sundayStartTime",
    "thursdayEndTime",
    "thursdayStartTime",
    "timeZoneId",
    "tuesdayEndTime",
    "tuesdayStartTime",
    "wednesdayEndTime",
    "wednesdayStartTime"
})
public class BusinessHoursEntry
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Boolean active;
    @XmlElement(name = "default", namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean _default;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fridayEndTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar fridayStartTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mondayEndTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar mondayStartTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saturdayEndTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar saturdayStartTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sundayEndTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sundayStartTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thursdayEndTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar thursdayStartTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String timeZoneId;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuesdayEndTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tuesdayStartTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wednesdayEndTime;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar wednesdayStartTime;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the default property.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the fridayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFridayEndTime() {
        return fridayEndTime;
    }

    /**
     * Sets the value of the fridayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFridayEndTime(XMLGregorianCalendar value) {
        this.fridayEndTime = value;
    }

    /**
     * Gets the value of the fridayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFridayStartTime() {
        return fridayStartTime;
    }

    /**
     * Sets the value of the fridayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFridayStartTime(XMLGregorianCalendar value) {
        this.fridayStartTime = value;
    }

    /**
     * Gets the value of the mondayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMondayEndTime() {
        return mondayEndTime;
    }

    /**
     * Sets the value of the mondayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMondayEndTime(XMLGregorianCalendar value) {
        this.mondayEndTime = value;
    }

    /**
     * Gets the value of the mondayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMondayStartTime() {
        return mondayStartTime;
    }

    /**
     * Sets the value of the mondayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMondayStartTime(XMLGregorianCalendar value) {
        this.mondayStartTime = value;
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
     * Gets the value of the saturdayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaturdayEndTime() {
        return saturdayEndTime;
    }

    /**
     * Sets the value of the saturdayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaturdayEndTime(XMLGregorianCalendar value) {
        this.saturdayEndTime = value;
    }

    /**
     * Gets the value of the saturdayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSaturdayStartTime() {
        return saturdayStartTime;
    }

    /**
     * Sets the value of the saturdayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSaturdayStartTime(XMLGregorianCalendar value) {
        this.saturdayStartTime = value;
    }

    /**
     * Gets the value of the sundayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSundayEndTime() {
        return sundayEndTime;
    }

    /**
     * Sets the value of the sundayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSundayEndTime(XMLGregorianCalendar value) {
        this.sundayEndTime = value;
    }

    /**
     * Gets the value of the sundayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSundayStartTime() {
        return sundayStartTime;
    }

    /**
     * Sets the value of the sundayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSundayStartTime(XMLGregorianCalendar value) {
        this.sundayStartTime = value;
    }

    /**
     * Gets the value of the thursdayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThursdayEndTime() {
        return thursdayEndTime;
    }

    /**
     * Sets the value of the thursdayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThursdayEndTime(XMLGregorianCalendar value) {
        this.thursdayEndTime = value;
    }

    /**
     * Gets the value of the thursdayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThursdayStartTime() {
        return thursdayStartTime;
    }

    /**
     * Sets the value of the thursdayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThursdayStartTime(XMLGregorianCalendar value) {
        this.thursdayStartTime = value;
    }

    /**
     * Gets the value of the timeZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Sets the value of the timeZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneId(String value) {
        this.timeZoneId = value;
    }

    /**
     * Gets the value of the tuesdayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuesdayEndTime() {
        return tuesdayEndTime;
    }

    /**
     * Sets the value of the tuesdayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuesdayEndTime(XMLGregorianCalendar value) {
        this.tuesdayEndTime = value;
    }

    /**
     * Gets the value of the tuesdayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTuesdayStartTime() {
        return tuesdayStartTime;
    }

    /**
     * Sets the value of the tuesdayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTuesdayStartTime(XMLGregorianCalendar value) {
        this.tuesdayStartTime = value;
    }

    /**
     * Gets the value of the wednesdayEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWednesdayEndTime() {
        return wednesdayEndTime;
    }

    /**
     * Sets the value of the wednesdayEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWednesdayEndTime(XMLGregorianCalendar value) {
        this.wednesdayEndTime = value;
    }

    /**
     * Gets the value of the wednesdayStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWednesdayStartTime() {
        return wednesdayStartTime;
    }

    /**
     * Sets the value of the wednesdayStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWednesdayStartTime(XMLGregorianCalendar value) {
        this.wednesdayStartTime = value;
    }

}
