
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
    "asyncProcessId"
})
@XmlRootElement(name = "checkRetrieveStatus", namespace = "http://soap.sforce.com/2006/04/metadata")
public class CheckRetrieveStatus {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String asyncProcessId;

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

}
