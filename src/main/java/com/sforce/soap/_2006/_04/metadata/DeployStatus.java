
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeployStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeployStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Succeeded"/>
 *     &lt;enumeration value="SucceededPartial"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Canceling"/>
 *     &lt;enumeration value="Canceled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeployStatus", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum DeployStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),
    @XmlEnumValue("SucceededPartial")
    SUCCEEDED_PARTIAL("SucceededPartial"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Canceling")
    CANCELING("Canceling"),
    @XmlEnumValue("Canceled")
    CANCELED("Canceled");
    private final String value;

    DeployStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeployStatus fromValue(String v) {
        for (DeployStatus c: DeployStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
