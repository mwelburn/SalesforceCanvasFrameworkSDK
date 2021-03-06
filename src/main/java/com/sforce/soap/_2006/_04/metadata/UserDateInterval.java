
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserDateInterval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserDateInterval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTERVAL_CURRENT"/>
 *     &lt;enumeration value="INTERVAL_CURNEXT1"/>
 *     &lt;enumeration value="INTERVAL_CURPREV1"/>
 *     &lt;enumeration value="INTERVAL_NEXT1"/>
 *     &lt;enumeration value="INTERVAL_PREV1"/>
 *     &lt;enumeration value="INTERVAL_CURNEXT3"/>
 *     &lt;enumeration value="INTERVAL_CURFY"/>
 *     &lt;enumeration value="INTERVAL_PREVFY"/>
 *     &lt;enumeration value="INTERVAL_PREV2FY"/>
 *     &lt;enumeration value="INTERVAL_AGO2FY"/>
 *     &lt;enumeration value="INTERVAL_NEXTFY"/>
 *     &lt;enumeration value="INTERVAL_PREVCURFY"/>
 *     &lt;enumeration value="INTERVAL_PREVCUR2FY"/>
 *     &lt;enumeration value="INTERVAL_CURNEXTFY"/>
 *     &lt;enumeration value="INTERVAL_CUSTOM"/>
 *     &lt;enumeration value="INTERVAL_YESTERDAY"/>
 *     &lt;enumeration value="INTERVAL_TODAY"/>
 *     &lt;enumeration value="INTERVAL_TOMORROW"/>
 *     &lt;enumeration value="INTERVAL_LASTWEEK"/>
 *     &lt;enumeration value="INTERVAL_THISWEEK"/>
 *     &lt;enumeration value="INTERVAL_NEXTWEEK"/>
 *     &lt;enumeration value="INTERVAL_LASTMONTH"/>
 *     &lt;enumeration value="INTERVAL_THISMONTH"/>
 *     &lt;enumeration value="INTERVAL_NEXTMONTH"/>
 *     &lt;enumeration value="INTERVAL_LASTTHISMONTH"/>
 *     &lt;enumeration value="INTERVAL_THISNEXTMONTH"/>
 *     &lt;enumeration value="INTERVAL_CURRENTQ"/>
 *     &lt;enumeration value="INTERVAL_CURNEXTQ"/>
 *     &lt;enumeration value="INTERVAL_CURPREVQ"/>
 *     &lt;enumeration value="INTERVAL_NEXTQ"/>
 *     &lt;enumeration value="INTERVAL_PREVQ"/>
 *     &lt;enumeration value="INTERVAL_CURNEXT3Q"/>
 *     &lt;enumeration value="INTERVAL_CURY"/>
 *     &lt;enumeration value="INTERVAL_PREVY"/>
 *     &lt;enumeration value="INTERVAL_PREV2Y"/>
 *     &lt;enumeration value="INTERVAL_AGO2Y"/>
 *     &lt;enumeration value="INTERVAL_NEXTY"/>
 *     &lt;enumeration value="INTERVAL_PREVCURY"/>
 *     &lt;enumeration value="INTERVAL_PREVCUR2Y"/>
 *     &lt;enumeration value="INTERVAL_CURNEXTY"/>
 *     &lt;enumeration value="INTERVAL_LAST7"/>
 *     &lt;enumeration value="INTERVAL_LAST30"/>
 *     &lt;enumeration value="INTERVAL_LAST60"/>
 *     &lt;enumeration value="INTERVAL_LAST90"/>
 *     &lt;enumeration value="INTERVAL_LAST120"/>
 *     &lt;enumeration value="INTERVAL_NEXT7"/>
 *     &lt;enumeration value="INTERVAL_NEXT30"/>
 *     &lt;enumeration value="INTERVAL_NEXT60"/>
 *     &lt;enumeration value="INTERVAL_NEXT90"/>
 *     &lt;enumeration value="INTERVAL_NEXT120"/>
 *     &lt;enumeration value="LAST_FISCALWEEK"/>
 *     &lt;enumeration value="THIS_FISCALWEEK"/>
 *     &lt;enumeration value="NEXT_FISCALWEEK"/>
 *     &lt;enumeration value="LAST_FISCALPERIOD"/>
 *     &lt;enumeration value="THIS_FISCALPERIOD"/>
 *     &lt;enumeration value="NEXT_FISCALPERIOD"/>
 *     &lt;enumeration value="LASTTHIS_FISCALPERIOD"/>
 *     &lt;enumeration value="THISNEXT_FISCALPERIOD"/>
 *     &lt;enumeration value="CURRENT_ENTITLEMENT_PERIOD"/>
 *     &lt;enumeration value="PREVIOUS_ENTITLEMENT_PERIOD"/>
 *     &lt;enumeration value="PREVIOUS_TWO_ENTITLEMENT_PERIODS"/>
 *     &lt;enumeration value="TWO_ENTITLEMENT_PERIODS_AGO"/>
 *     &lt;enumeration value="CURRENT_AND_PREVIOUS_ENTITLEMENT_PERIOD"/>
 *     &lt;enumeration value="CURRENT_AND_PREVIOUS_TWO_ENTITLEMENT_PERIODS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserDateInterval", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum UserDateInterval {

    INTERVAL_CURRENT("INTERVAL_CURRENT"),
    @XmlEnumValue("INTERVAL_CURNEXT1")
    INTERVAL_CURNEXT_1("INTERVAL_CURNEXT1"),
    @XmlEnumValue("INTERVAL_CURPREV1")
    INTERVAL_CURPREV_1("INTERVAL_CURPREV1"),
    @XmlEnumValue("INTERVAL_NEXT1")
    INTERVAL_NEXT_1("INTERVAL_NEXT1"),
    @XmlEnumValue("INTERVAL_PREV1")
    INTERVAL_PREV_1("INTERVAL_PREV1"),
    @XmlEnumValue("INTERVAL_CURNEXT3")
    INTERVAL_CURNEXT_3("INTERVAL_CURNEXT3"),
    INTERVAL_CURFY("INTERVAL_CURFY"),
    INTERVAL_PREVFY("INTERVAL_PREVFY"),
    @XmlEnumValue("INTERVAL_PREV2FY")
    INTERVAL_PREV_2_FY("INTERVAL_PREV2FY"),
    @XmlEnumValue("INTERVAL_AGO2FY")
    INTERVAL_AGO_2_FY("INTERVAL_AGO2FY"),
    INTERVAL_NEXTFY("INTERVAL_NEXTFY"),
    INTERVAL_PREVCURFY("INTERVAL_PREVCURFY"),
    @XmlEnumValue("INTERVAL_PREVCUR2FY")
    INTERVAL_PREVCUR_2_FY("INTERVAL_PREVCUR2FY"),
    INTERVAL_CURNEXTFY("INTERVAL_CURNEXTFY"),
    INTERVAL_CUSTOM("INTERVAL_CUSTOM"),
    INTERVAL_YESTERDAY("INTERVAL_YESTERDAY"),
    INTERVAL_TODAY("INTERVAL_TODAY"),
    INTERVAL_TOMORROW("INTERVAL_TOMORROW"),
    INTERVAL_LASTWEEK("INTERVAL_LASTWEEK"),
    INTERVAL_THISWEEK("INTERVAL_THISWEEK"),
    INTERVAL_NEXTWEEK("INTERVAL_NEXTWEEK"),
    INTERVAL_LASTMONTH("INTERVAL_LASTMONTH"),
    INTERVAL_THISMONTH("INTERVAL_THISMONTH"),
    INTERVAL_NEXTMONTH("INTERVAL_NEXTMONTH"),
    INTERVAL_LASTTHISMONTH("INTERVAL_LASTTHISMONTH"),
    INTERVAL_THISNEXTMONTH("INTERVAL_THISNEXTMONTH"),
    INTERVAL_CURRENTQ("INTERVAL_CURRENTQ"),
    INTERVAL_CURNEXTQ("INTERVAL_CURNEXTQ"),
    INTERVAL_CURPREVQ("INTERVAL_CURPREVQ"),
    INTERVAL_NEXTQ("INTERVAL_NEXTQ"),
    INTERVAL_PREVQ("INTERVAL_PREVQ"),
    @XmlEnumValue("INTERVAL_CURNEXT3Q")
    INTERVAL_CURNEXT_3_Q("INTERVAL_CURNEXT3Q"),
    INTERVAL_CURY("INTERVAL_CURY"),
    INTERVAL_PREVY("INTERVAL_PREVY"),
    @XmlEnumValue("INTERVAL_PREV2Y")
    INTERVAL_PREV_2_Y("INTERVAL_PREV2Y"),
    @XmlEnumValue("INTERVAL_AGO2Y")
    INTERVAL_AGO_2_Y("INTERVAL_AGO2Y"),
    INTERVAL_NEXTY("INTERVAL_NEXTY"),
    INTERVAL_PREVCURY("INTERVAL_PREVCURY"),
    @XmlEnumValue("INTERVAL_PREVCUR2Y")
    INTERVAL_PREVCUR_2_Y("INTERVAL_PREVCUR2Y"),
    INTERVAL_CURNEXTY("INTERVAL_CURNEXTY"),
    @XmlEnumValue("INTERVAL_LAST7")
    INTERVAL_LAST_7("INTERVAL_LAST7"),
    @XmlEnumValue("INTERVAL_LAST30")
    INTERVAL_LAST_30("INTERVAL_LAST30"),
    @XmlEnumValue("INTERVAL_LAST60")
    INTERVAL_LAST_60("INTERVAL_LAST60"),
    @XmlEnumValue("INTERVAL_LAST90")
    INTERVAL_LAST_90("INTERVAL_LAST90"),
    @XmlEnumValue("INTERVAL_LAST120")
    INTERVAL_LAST_120("INTERVAL_LAST120"),
    @XmlEnumValue("INTERVAL_NEXT7")
    INTERVAL_NEXT_7("INTERVAL_NEXT7"),
    @XmlEnumValue("INTERVAL_NEXT30")
    INTERVAL_NEXT_30("INTERVAL_NEXT30"),
    @XmlEnumValue("INTERVAL_NEXT60")
    INTERVAL_NEXT_60("INTERVAL_NEXT60"),
    @XmlEnumValue("INTERVAL_NEXT90")
    INTERVAL_NEXT_90("INTERVAL_NEXT90"),
    @XmlEnumValue("INTERVAL_NEXT120")
    INTERVAL_NEXT_120("INTERVAL_NEXT120"),
    LAST_FISCALWEEK("LAST_FISCALWEEK"),
    THIS_FISCALWEEK("THIS_FISCALWEEK"),
    NEXT_FISCALWEEK("NEXT_FISCALWEEK"),
    LAST_FISCALPERIOD("LAST_FISCALPERIOD"),
    THIS_FISCALPERIOD("THIS_FISCALPERIOD"),
    NEXT_FISCALPERIOD("NEXT_FISCALPERIOD"),
    LASTTHIS_FISCALPERIOD("LASTTHIS_FISCALPERIOD"),
    THISNEXT_FISCALPERIOD("THISNEXT_FISCALPERIOD"),
    CURRENT_ENTITLEMENT_PERIOD("CURRENT_ENTITLEMENT_PERIOD"),
    PREVIOUS_ENTITLEMENT_PERIOD("PREVIOUS_ENTITLEMENT_PERIOD"),
    PREVIOUS_TWO_ENTITLEMENT_PERIODS("PREVIOUS_TWO_ENTITLEMENT_PERIODS"),
    TWO_ENTITLEMENT_PERIODS_AGO("TWO_ENTITLEMENT_PERIODS_AGO"),
    CURRENT_AND_PREVIOUS_ENTITLEMENT_PERIOD("CURRENT_AND_PREVIOUS_ENTITLEMENT_PERIOD"),
    CURRENT_AND_PREVIOUS_TWO_ENTITLEMENT_PERIODS("CURRENT_AND_PREVIOUS_TWO_ENTITLEMENT_PERIODS");
    private final String value;

    UserDateInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserDateInterval fromValue(String v) {
        for (UserDateInterval c: UserDateInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
