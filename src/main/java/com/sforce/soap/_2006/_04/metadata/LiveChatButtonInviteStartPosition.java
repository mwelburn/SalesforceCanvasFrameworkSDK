
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveChatButtonInviteStartPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveChatButtonInviteStartPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TopLeft"/>
 *     &lt;enumeration value="TopLeftTop"/>
 *     &lt;enumeration value="Top"/>
 *     &lt;enumeration value="TopRightTop"/>
 *     &lt;enumeration value="TopRight"/>
 *     &lt;enumeration value="TopRightRight"/>
 *     &lt;enumeration value="Right"/>
 *     &lt;enumeration value="BottomRightRight"/>
 *     &lt;enumeration value="BottomRight"/>
 *     &lt;enumeration value="BottomRightBottom"/>
 *     &lt;enumeration value="Bottom"/>
 *     &lt;enumeration value="BottomLeftBottom"/>
 *     &lt;enumeration value="BottomLeft"/>
 *     &lt;enumeration value="BottomLeftLeft"/>
 *     &lt;enumeration value="Left"/>
 *     &lt;enumeration value="TopLeftLeft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiveChatButtonInviteStartPosition", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LiveChatButtonInviteStartPosition {

    @XmlEnumValue("TopLeft")
    TOP_LEFT("TopLeft"),
    @XmlEnumValue("TopLeftTop")
    TOP_LEFT_TOP("TopLeftTop"),
    @XmlEnumValue("Top")
    TOP("Top"),
    @XmlEnumValue("TopRightTop")
    TOP_RIGHT_TOP("TopRightTop"),
    @XmlEnumValue("TopRight")
    TOP_RIGHT("TopRight"),
    @XmlEnumValue("TopRightRight")
    TOP_RIGHT_RIGHT("TopRightRight"),
    @XmlEnumValue("Right")
    RIGHT("Right"),
    @XmlEnumValue("BottomRightRight")
    BOTTOM_RIGHT_RIGHT("BottomRightRight"),
    @XmlEnumValue("BottomRight")
    BOTTOM_RIGHT("BottomRight"),
    @XmlEnumValue("BottomRightBottom")
    BOTTOM_RIGHT_BOTTOM("BottomRightBottom"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom"),
    @XmlEnumValue("BottomLeftBottom")
    BOTTOM_LEFT_BOTTOM("BottomLeftBottom"),
    @XmlEnumValue("BottomLeft")
    BOTTOM_LEFT("BottomLeft"),
    @XmlEnumValue("BottomLeftLeft")
    BOTTOM_LEFT_LEFT("BottomLeftLeft"),
    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("TopLeftLeft")
    TOP_LEFT_LEFT("TopLeftLeft");
    private final String value;

    LiveChatButtonInviteStartPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LiveChatButtonInviteStartPosition fromValue(String v) {
        for (LiveChatButtonInviteStartPosition c: LiveChatButtonInviteStartPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
