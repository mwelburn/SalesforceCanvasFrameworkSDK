
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartBackgroundDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChartBackgroundDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TopToBottom"/>
 *     &lt;enumeration value="LeftToRight"/>
 *     &lt;enumeration value="Diagonal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChartBackgroundDirection", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum ChartBackgroundDirection {

    @XmlEnumValue("TopToBottom")
    TOP_TO_BOTTOM("TopToBottom"),
    @XmlEnumValue("LeftToRight")
    LEFT_TO_RIGHT("LeftToRight"),
    @XmlEnumValue("Diagonal")
    DIAGONAL("Diagonal");
    private final String value;

    ChartBackgroundDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChartBackgroundDirection fromValue(String v) {
        for (ChartBackgroundDirection c: ChartBackgroundDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
