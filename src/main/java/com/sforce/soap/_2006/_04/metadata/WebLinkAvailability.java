
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLinkAvailability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebLinkAvailability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="online"/>
 *     &lt;enumeration value="offline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebLinkAvailability", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum WebLinkAvailability {

    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("offline")
    OFFLINE("offline");
    private final String value;

    WebLinkAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLinkAvailability fromValue(String v) {
        for (WebLinkAvailability c: WebLinkAvailability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
