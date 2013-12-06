
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StepRejectBehaviorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StepRejectBehaviorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RejectRequest"/>
 *     &lt;enumeration value="BackToPrevious"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StepRejectBehaviorType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum StepRejectBehaviorType {

    @XmlEnumValue("RejectRequest")
    REJECT_REQUEST("RejectRequest"),
    @XmlEnumValue("BackToPrevious")
    BACK_TO_PREVIOUS("BackToPrevious");
    private final String value;

    StepRejectBehaviorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StepRejectBehaviorType fromValue(String v) {
        for (StepRejectBehaviorType c: StepRejectBehaviorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
