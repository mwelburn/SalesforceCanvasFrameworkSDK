
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuickActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuickActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="VisualforcePage"/>
 *     &lt;enumeration value="Post"/>
 *     &lt;enumeration value="LogACall"/>
 *     &lt;enumeration value="SocialPost"/>
 *     &lt;enumeration value="Canvas"/>
 *     &lt;enumeration value="Update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuickActionType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum QuickActionType {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("VisualforcePage")
    VISUALFORCE_PAGE("VisualforcePage"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("LogACall")
    LOG_A_CALL("LogACall"),
    @XmlEnumValue("SocialPost")
    SOCIAL_POST("SocialPost"),
    @XmlEnumValue("Canvas")
    CANVAS("Canvas"),
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    QuickActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuickActionType fromValue(String v) {
        for (QuickActionType c: QuickActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
