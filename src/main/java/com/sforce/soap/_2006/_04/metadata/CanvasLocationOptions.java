
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanvasLocationOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanvasLocationOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Chatter"/>
 *     &lt;enumeration value="UserProfile"/>
 *     &lt;enumeration value="Visualforce"/>
 *     &lt;enumeration value="Aura"/>
 *     &lt;enumeration value="Publisher"/>
 *     &lt;enumeration value="ChatterFeed"/>
 *     &lt;enumeration value="ServiceDesk"/>
 *     &lt;enumeration value="OpenCTI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CanvasLocationOptions", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum CanvasLocationOptions {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Chatter")
    CHATTER("Chatter"),
    @XmlEnumValue("UserProfile")
    USER_PROFILE("UserProfile"),
    @XmlEnumValue("Visualforce")
    VISUALFORCE("Visualforce"),
    @XmlEnumValue("Aura")
    AURA("Aura"),
    @XmlEnumValue("Publisher")
    PUBLISHER("Publisher"),
    @XmlEnumValue("ChatterFeed")
    CHATTER_FEED("ChatterFeed"),
    @XmlEnumValue("ServiceDesk")
    SERVICE_DESK("ServiceDesk"),
    @XmlEnumValue("OpenCTI")
    OPEN_CTI("OpenCTI");
    private final String value;

    CanvasLocationOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CanvasLocationOptions fromValue(String v) {
        for (CanvasLocationOptions c: CanvasLocationOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
