
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayCurrency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisplayCurrency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CORPORATE"/>
 *     &lt;enumeration value="PERSONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisplayCurrency", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum DisplayCurrency {

    CORPORATE,
    PERSONAL;

    public String value() {
        return name();
    }

    public static DisplayCurrency fromValue(String v) {
        return valueOf(v);
    }

}
