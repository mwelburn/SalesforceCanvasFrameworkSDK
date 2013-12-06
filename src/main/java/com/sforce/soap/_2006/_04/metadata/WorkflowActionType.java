
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FieldUpdate"/>
 *     &lt;enumeration value="KnowledgePublish"/>
 *     &lt;enumeration value="Task"/>
 *     &lt;enumeration value="Alert"/>
 *     &lt;enumeration value="Send"/>
 *     &lt;enumeration value="OutboundMessage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkflowActionType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum WorkflowActionType {

    @XmlEnumValue("FieldUpdate")
    FIELD_UPDATE("FieldUpdate"),
    @XmlEnumValue("KnowledgePublish")
    KNOWLEDGE_PUBLISH("KnowledgePublish"),
    @XmlEnumValue("Task")
    TASK("Task"),
    @XmlEnumValue("Alert")
    ALERT("Alert"),
    @XmlEnumValue("Send")
    SEND("Send"),
    @XmlEnumValue("OutboundMessage")
    OUTBOUND_MESSAGE("OutboundMessage");
    private final String value;

    WorkflowActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowActionType fromValue(String v) {
        for (WorkflowActionType c: WorkflowActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
