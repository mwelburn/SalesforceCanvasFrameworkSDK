
package com.sforce.soap._2006._04.metadata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Workflow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workflow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.sforce.com/2006/04/metadata}Metadata">
 *       &lt;sequence>
 *         &lt;element name="alerts" type="{http://soap.sforce.com/2006/04/metadata}WorkflowAlert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldUpdates" type="{http://soap.sforce.com/2006/04/metadata}WorkflowFieldUpdate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="knowledgePublishes" type="{http://soap.sforce.com/2006/04/metadata}WorkflowKnowledgePublish" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outboundMessages" type="{http://soap.sforce.com/2006/04/metadata}WorkflowOutboundMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rules" type="{http://soap.sforce.com/2006/04/metadata}WorkflowRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="send" type="{http://soap.sforce.com/2006/04/metadata}WorkflowSend" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tasks" type="{http://soap.sforce.com/2006/04/metadata}WorkflowTask" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workflow", namespace = "http://soap.sforce.com/2006/04/metadata", propOrder = {
    "alerts",
    "fieldUpdates",
    "knowledgePublishes",
    "outboundMessages",
    "rules",
    "send",
    "tasks"
})
public class Workflow
    extends Metadata
{

    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowAlert> alerts;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowFieldUpdate> fieldUpdates;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowKnowledgePublish> knowledgePublishes;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowOutboundMessage> outboundMessages;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowRule> rules;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowSend> send;
    @XmlElement(namespace = "http://soap.sforce.com/2006/04/metadata")
    protected List<WorkflowTask> tasks;

    /**
     * Gets the value of the alerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowAlert }
     * 
     * 
     */
    public List<WorkflowAlert> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<WorkflowAlert>();
        }
        return this.alerts;
    }

    /**
     * Gets the value of the fieldUpdates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldUpdates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldUpdates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowFieldUpdate }
     * 
     * 
     */
    public List<WorkflowFieldUpdate> getFieldUpdates() {
        if (fieldUpdates == null) {
            fieldUpdates = new ArrayList<WorkflowFieldUpdate>();
        }
        return this.fieldUpdates;
    }

    /**
     * Gets the value of the knowledgePublishes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knowledgePublishes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnowledgePublishes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowKnowledgePublish }
     * 
     * 
     */
    public List<WorkflowKnowledgePublish> getKnowledgePublishes() {
        if (knowledgePublishes == null) {
            knowledgePublishes = new ArrayList<WorkflowKnowledgePublish>();
        }
        return this.knowledgePublishes;
    }

    /**
     * Gets the value of the outboundMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outboundMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutboundMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowOutboundMessage }
     * 
     * 
     */
    public List<WorkflowOutboundMessage> getOutboundMessages() {
        if (outboundMessages == null) {
            outboundMessages = new ArrayList<WorkflowOutboundMessage>();
        }
        return this.outboundMessages;
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
     * {@link WorkflowRule }
     * 
     * 
     */
    public List<WorkflowRule> getRules() {
        if (rules == null) {
            rules = new ArrayList<WorkflowRule>();
        }
        return this.rules;
    }

    /**
     * Gets the value of the send property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the send property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowSend }
     * 
     * 
     */
    public List<WorkflowSend> getSend() {
        if (send == null) {
            send = new ArrayList<WorkflowSend>();
        }
        return this.send;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowTask }
     * 
     * 
     */
    public List<WorkflowTask> getTasks() {
        if (tasks == null) {
            tasks = new ArrayList<WorkflowTask>();
        }
        return this.tasks;
    }

}
