
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiveChatButtonPresentation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LiveChatButtonPresentation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Slide"/>
 *     &lt;enumeration value="Fade"/>
 *     &lt;enumeration value="Appear"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LiveChatButtonPresentation", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum LiveChatButtonPresentation {

    @XmlEnumValue("Slide")
    SLIDE("Slide"),
    @XmlEnumValue("Fade")
    FADE("Fade"),
    @XmlEnumValue("Appear")
    APPEAR("Appear"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    LiveChatButtonPresentation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LiveChatButtonPresentation fromValue(String v) {
        for (LiveChatButtonPresentation c: LiveChatButtonPresentation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
