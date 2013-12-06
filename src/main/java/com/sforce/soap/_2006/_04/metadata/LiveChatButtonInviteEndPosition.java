
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveChatButtonInviteEndPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveChatButtonInviteEndPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TopLeft"/>
 *     &lt;enumeration value="Top"/>
 *     &lt;enumeration value="TopRight"/>
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="Center"/>
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="BottomLeft"/>
 *     &lt;enumeration value="Bottom"/>
 *     &lt;enumeration value="BottomRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiveChatButtonInviteEndPosition", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LiveChatButtonInviteEndPosition {

    @XmlEnumValue("TopLeft")
    TOP_LEFT("TopLeft"),
    @XmlEnumValue("Top")
    TOP("Top"),
    @XmlEnumValue("TopRight")
    TOP_RIGHT("TopRight"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("BottomLeft")
    BOTTOM_LEFT("BottomLeft"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom"),
    @XmlEnumValue("BottomRight")
    BOTTOM_RIGHT("BottomRight");
    private final String value;

    LiveChatButtonInviteEndPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LiveChatButtonInviteEndPosition fromValue(String v) {
        for (LiveChatButtonInviteEndPosition c: LiveChatButtonInviteEndPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
