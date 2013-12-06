
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowApexPluginCall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowApexPluginCall">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="apexClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="connector" type="{http://soap.sforce.com/2006/04/metadata}FlowConnector" minOccurs="0"/>
 *         &lt;element name="faultConnector" type="{http://soap.sforce.com/2006/04/metadata}FlowConnector" minOccurs="0"/>
 *         &lt;element name="inputParameters" type="{http://soap.sforce.com/2006/04/metadata}FlowApexPluginCallInputParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outputParameters" type="{http://soap.sforce.com/2006/04/metadata}FlowApexPluginCallOutputParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowApexPluginCall", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "apexClass",
    "connector",
    "faultConnector",
    "inputParameters",
    "outputParameters"
})
public class FlowApexPluginCall
    extends FlowNode
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata", required = true)
    protected String apexClass;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowConnector connector;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowConnector faultConnector;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowApexPluginCallInputParameter> inputParameters;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowApexPluginCallOutputParameter> outputParameters;

    /**
     * Gets the value of the apexClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApexClass() {
        return apexClass;
    }

    /**
     * Sets the value of the apexClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApexClass(String value) {
        this.apexClass = value;
    }

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setConnector(FlowConnector value) {
        this.connector = value;
    }

    /**
     * Gets the value of the faultConnector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getFaultConnector() {
        return faultConnector;
    }

    /**
     * Sets the value of the faultConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setFaultConnector(FlowConnector value) {
        this.faultConnector = value;
    }

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowApexPluginCallInputParameter }
     * 
     * 
     */
    public List<FlowApexPluginCallInputParameter> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<FlowApexPluginCallInputParameter>();
        }
        return this.inputParameters;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowApexPluginCallOutputParameter }
     * 
     * 
     */
    public List<FlowApexPluginCallOutputParameter> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<FlowApexPluginCallOutputParameter>();
        }
        return this.outputParameters;
    }

}
