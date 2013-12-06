
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldTranslation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFieldTranslation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseValues" type="{http://soap.sforce.com/2006/04/metadata}ObjectNameCaseValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://soap.sforce.com/2006/04/metadata}Gender" minOccurs="0"/>
 *         &lt;element name="help" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="picklistValues" type="{http://soap.sforce.com/2006/04/metadata}PicklistValueTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relationshipLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startsWith" type="{http://soap.sforce.com/2006/04/metadata}StartsWith" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldTranslation", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "caseValues",
    "gender",
    "help",
    "label",
    "name",
    "picklistValues",
    "relationshipLabel",
    "startsWith"
})
public class CustomFieldTranslation {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<ObjectNameCaseValue> caseValues;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected Gender gender;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String help;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String label;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String name;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<PicklistValueTranslation> picklistValues;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String relationshipLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected StartsWith startsWith;

    /**
     * Gets the value of the caseValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caseValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaseValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectNameCaseValue }
     * 
     * 
     */
    public List<ObjectNameCaseValue> getCaseValues() {
        if (caseValues == null) {
            caseValues = new ArrayList<ObjectNameCaseValue>();
        }
        return this.caseValues;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the help property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelp() {
        return help;
    }

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelp(String value) {
        this.help = value;
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
     * Gets the value of the picklistValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the picklistValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPicklistValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistValueTranslation }
     * 
     * 
     */
    public List<PicklistValueTranslation> getPicklistValues() {
        if (picklistValues == null) {
            picklistValues = new ArrayList<PicklistValueTranslation>();
        }
        return this.picklistValues;
    }

    /**
     * Gets the value of the relationshipLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipLabel() {
        return relationshipLabel;
    }

    /**
     * Sets the value of the relationshipLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipLabel(String value) {
        this.relationshipLabel = value;
    }

    /**
     * Gets the value of the startsWith property.
     * 
     * @return
     *     possible object is
     *     {@link StartsWith }
     *     
     */
    public StartsWith getStartsWith() {
        return startsWith;
    }

    /**
     * Sets the value of the startsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartsWith }
     *     
     */
    public void setStartsWith(StartsWith value) {
        this.startsWith = value;
    }

}
