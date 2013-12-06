
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asyncProcessId" type="{http://soap.sforce.com/2006/04/metadata}ID"/>
 *         &lt;element name="includeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asyncProcessId",
    "includeDetails"
})
@XmlRootElement(name = "checkDeployStatus", namespace = "http://soap.sforce.com/2006/04/metadata")
public class CheckDeployStatus {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String asyncProcessId;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected boolean includeDetails;

    /**
     * Gets the value of the asyncProcessId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncProcessId() {
        return asyncProcessId;
    }

    /**
     * Sets the value of the asyncProcessId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncProcessId(String value) {
        this.asyncProcessId = value;
    }

    /**
     * Gets the value of the includeDetails property.
     * 
     */
    public boolean isIncludeDetails() {
        return includeDetails;
    }

    /**
     * Sets the value of the includeDetails property.
     * 
     */
    public void setIncludeDetails(boolean value) {
        this.includeDetails = value;
    }

}
