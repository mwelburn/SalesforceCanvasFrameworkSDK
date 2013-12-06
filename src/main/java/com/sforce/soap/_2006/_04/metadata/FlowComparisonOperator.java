
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowComparisonOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowComparisonOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EqualTo"/>
 *     &lt;enumeration value="NotEqualTo"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="GreaterThanOrEqualTo"/>
 *     &lt;enumeration value="LessThanOrEqualTo"/>
 *     &lt;enumeration value="StartsWith"/>
 *     &lt;enumeration value="EndsWith"/>
 *     &lt;enumeration value="Contains"/>
 *     &lt;enumeration value="IsNull"/>
 *     &lt;enumeration value="WasSelected"/>
 *     &lt;enumeration value="WasVisited"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowComparisonOperator", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum FlowComparisonOperator {

    @XmlEnumValue("EqualTo")
    EQUAL_TO("EqualTo"),
    @XmlEnumValue("NotEqualTo")
    NOT_EQUAL_TO("NotEqualTo"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("GreaterThanOrEqualTo"),
    @XmlEnumValue("LessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("LessThanOrEqualTo"),
    @XmlEnumValue("StartsWith")
    STARTS_WITH("StartsWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("IsNull")
    IS_NULL("IsNull"),
    @XmlEnumValue("WasSelected")
    WAS_SELECTED("WasSelected"),
    @XmlEnumValue("WasVisited")
    WAS_VISITED("WasVisited");
    private final String value;

    FlowComparisonOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowComparisonOperator fromValue(String v) {
        for (FlowComparisonOperator c: FlowComparisonOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
