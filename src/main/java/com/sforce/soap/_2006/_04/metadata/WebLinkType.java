
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebLinkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="url"/>
 *     &lt;enumeration value="sControl"/>
 *     &lt;enumeration value="javascript"/>
 *     &lt;enumeration value="page"/>
 *     &lt;enumeration value="flow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebLinkType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum WebLinkType {

    @XmlEnumValue("url")
    URL("url"),
    @XmlEnumValue("sControl")
    S_CONTROL("sControl"),
    @XmlEnumValue("javascript")
    JAVASCRIPT("javascript"),
    @XmlEnumValue("page")
    PAGE("page"),
    @XmlEnumValue("flow")
    FLOW("flow");
    private final String value;

    WebLinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebLinkType fromValue(String v) {
        for (WebLinkType c: WebLinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
