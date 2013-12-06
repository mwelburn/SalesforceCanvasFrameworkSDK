
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://soap.sforce.com/2006/04/metadata}LogCategory"/>
 *         &lt;element name="level" type="{http://soap.sforce.com/2006/04/metadata}LogCategoryLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogInfo", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "category",
    "level"
})
public class LogInfo {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected LogCategory category;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected LogCategoryLevel level;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link LogCategory }
     *     
     */
    public LogCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogCategory }
     *     
     */
    public void setCategory(LogCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link LogCategoryLevel }
     *     
     */
    public LogCategoryLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogCategoryLevel }
     *     
     */
    public void setLevel(LogCategoryLevel value) {
        this.level = value;
    }

}
