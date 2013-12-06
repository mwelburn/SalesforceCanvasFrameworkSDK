
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDecision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowDecision">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}FlowNode">
 *       &lt;sequence>
 *         &lt;element name="defaultConnector" type="{http://soap.sforce.com/2006/04/metadata}FlowConnector" minOccurs="0"/>
 *         &lt;element name="defaultConnectorLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rules" type="{http://soap.sforce.com/2006/04/metadata}FlowRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDecision", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "defaultConnector",
    "defaultConnectorLabel",
    "rules"
})
public class FlowDecision
    extends FlowNode
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected FlowConnector defaultConnector;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected String defaultConnectorLabel;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<FlowRule> rules;

    /**
     * Gets the value of the defaultConnector property.
     * 
     * @return
     *     possible object is
     *     {@link FlowConnector }
     *     
     */
    public FlowConnector getDefaultConnector() {
        return defaultConnector;
    }

    /**
     * Sets the value of the defaultConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowConnector }
     *     
     */
    public void setDefaultConnector(FlowConnector value) {
        this.defaultConnector = value;
    }

    /**
     * Gets the value of the defaultConnectorLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultConnectorLabel() {
        return defaultConnectorLabel;
    }

    /**
     * Sets the value of the defaultConnectorLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultConnectorLabel(String value) {
        this.defaultConnectorLabel = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowRule }
     * 
     * 
     */
    public List<FlowRule> getRules() {
        if (rules == null) {
            rules = new ArrayList<FlowRule>();
        }
        return this.rules;
    }

}
