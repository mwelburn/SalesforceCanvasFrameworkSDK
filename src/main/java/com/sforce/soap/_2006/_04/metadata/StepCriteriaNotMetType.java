
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StepCriteriaNotMetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StepCriteriaNotMetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ApproveRecord"/>
 *     &lt;enumeration value="RejectRecord"/>
 *     &lt;enumeration value="GotoNextStep"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StepCriteriaNotMetType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum StepCriteriaNotMetType {

    @XmlEnumValue("ApproveRecord")
    APPROVE_RECORD("ApproveRecord"),
    @XmlEnumValue("RejectRecord")
    REJECT_RECORD("RejectRecord"),
    @XmlEnumValue("GotoNextStep")
    GOTO_NEXT_STEP("GotoNextStep");
    private final String value;

    StepCriteriaNotMetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StepCriteriaNotMetType fromValue(String v) {
        for (StepCriteriaNotMetType c: StepCriteriaNotMetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
