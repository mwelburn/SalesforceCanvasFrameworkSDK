
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeployDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeployDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="componentFailures" type="{http://soap.sforce.com/2006/04/metadata}DeployMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="componentSuccesses" type="{http://soap.sforce.com/2006/04/metadata}DeployMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="retrieveResult" type="{http://soap.sforce.com/2006/04/metadata}RetrieveResult" minOccurs="0"/>
 *         &lt;element name="runTestResult" type="{http://soap.sforce.com/2006/04/metadata}RunTestsResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeployDetails", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "componentFailures",
    "componentSuccesses",
    "retrieveResult",
    "runTestResult"
})
public class DeployDetails {

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<DeployMessage> componentFailures;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<DeployMessage> componentSuccesses;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected RetrieveResult retrieveResult;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected RunTestsResult runTestResult;

    /**
     * Gets the value of the componentFailures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentFailures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentFailures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeployMessage }
     * 
     * 
     */
    public List<DeployMessage> getComponentFailures() {
        if (componentFailures == null) {
            componentFailures = new ArrayList<DeployMessage>();
        }
        return this.componentFailures;
    }

    /**
     * Gets the value of the componentSuccesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentSuccesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentSuccesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeployMessage }
     * 
     * 
     */
    public List<DeployMessage> getComponentSuccesses() {
        if (componentSuccesses == null) {
            componentSuccesses = new ArrayList<DeployMessage>();
        }
        return this.componentSuccesses;
    }

    /**
     * Gets the value of the retrieveResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveResult }
     *     
     */
    public RetrieveResult getRetrieveResult() {
        return retrieveResult;
    }

    /**
     * Sets the value of the retrieveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveResult }
     *     
     */
    public void setRetrieveResult(RetrieveResult value) {
        this.retrieveResult = value;
    }

    /**
     * Gets the value of the runTestResult property.
     * 
     * @return
     *     possible object is
     *     {@link RunTestsResult }
     *     
     */
    public RunTestsResult getRunTestResult() {
        return runTestResult;
    }

    /**
     * Sets the value of the runTestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunTestsResult }
     *     
     */
    public void setRunTestResult(RunTestsResult value) {
        this.runTestResult = value;
    }

}
