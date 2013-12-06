
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UnderConstruction"/>
 *     &lt;enumeration value="Live"/>
 *     &lt;enumeration value="DownForMaintenance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkStatus", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum NetworkStatus {

    @XmlEnumValue("UnderConstruction")
    UNDER_CONSTRUCTION("UnderConstruction"),
    @XmlEnumValue("Live")
    LIVE("Live"),
    @XmlEnumValue("DownForMaintenance")
    DOWN_FOR_MAINTENANCE("DownForMaintenance");
    private final String value;

    NetworkStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkStatus fromValue(String v) {
        for (NetworkStatus c: NetworkStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
