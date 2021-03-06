
package com.sforce.soap._2006._04.metadata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardComponentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DashboardComponentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bar"/>
 *     &lt;enumeration value="BarGrouped"/>
 *     &lt;enumeration value="BarStacked"/>
 *     &lt;enumeration value="BarStacked100"/>
 *     &lt;enumeration value="Column"/>
 *     &lt;enumeration value="ColumnGrouped"/>
 *     &lt;enumeration value="ColumnStacked"/>
 *     &lt;enumeration value="ColumnStacked100"/>
 *     &lt;enumeration value="Line"/>
 *     &lt;enumeration value="LineGrouped"/>
 *     &lt;enumeration value="Pie"/>
 *     &lt;enumeration value="Table"/>
 *     &lt;enumeration value="Metric"/>
 *     &lt;enumeration value="Gauge"/>
 *     &lt;enumeration value="LineCumulative"/>
 *     &lt;enumeration value="LineGroupedCumulative"/>
 *     &lt;enumeration value="Scontrol"/>
 *     &lt;enumeration value="VisualforcePage"/>
 *     &lt;enumeration value="Donut"/>
 *     &lt;enumeration value="Funnel"/>
 *     &lt;enumeration value="ColumnLine"/>
 *     &lt;enumeration value="ColumnLineGrouped"/>
 *     &lt;enumeration value="ColumnLineStacked"/>
 *     &lt;enumeration value="ColumnLineStacked100"/>
 *     &lt;enumeration value="Scatter"/>
 *     &lt;enumeration value="ScatterGrouped"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DashboardComponentType", namespace = "http://soap.sforce.com/2006/04/metadata")
@XmlEnum
public enum DashboardComponentType {

    @XmlEnumValue("Bar")
    BAR("Bar"),
    @XmlEnumValue("BarGrouped")
    BAR_GROUPED("BarGrouped"),
    @XmlEnumValue("BarStacked")
    BAR_STACKED("BarStacked"),
    @XmlEnumValue("BarStacked100")
    BAR_STACKED_100("BarStacked100"),
    @XmlEnumValue("Column")
    COLUMN("Column"),
    @XmlEnumValue("ColumnGrouped")
    COLUMN_GROUPED("ColumnGrouped"),
    @XmlEnumValue("ColumnStacked")
    COLUMN_STACKED("ColumnStacked"),
    @XmlEnumValue("ColumnStacked100")
    COLUMN_STACKED_100("ColumnStacked100"),
    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("LineGrouped")
    LINE_GROUPED("LineGrouped"),
    @XmlEnumValue("Pie")
    PIE("Pie"),
    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("Metric")
    METRIC("Metric"),
    @XmlEnumValue("Gauge")
    GAUGE("Gauge"),
    @XmlEnumValue("LineCumulative")
    LINE_CUMULATIVE("LineCumulative"),
    @XmlEnumValue("LineGroupedCumulative")
    LINE_GROUPED_CUMULATIVE("LineGroupedCumulative"),
    @XmlEnumValue("Scontrol")
    SCONTROL("Scontrol"),
    @XmlEnumValue("VisualforcePage")
    VISUALFORCE_PAGE("VisualforcePage"),
    @XmlEnumValue("Donut")
    DONUT("Donut"),
    @XmlEnumValue("Funnel")
    FUNNEL("Funnel"),
    @XmlEnumValue("ColumnLine")
    COLUMN_LINE("ColumnLine"),
    @XmlEnumValue("ColumnLineGrouped")
    COLUMN_LINE_GROUPED("ColumnLineGrouped"),
    @XmlEnumValue("ColumnLineStacked")
    COLUMN_LINE_STACKED("ColumnLineStacked"),
    @XmlEnumValue("ColumnLineStacked100")
    COLUMN_LINE_STACKED_100("ColumnLineStacked100"),
    @XmlEnumValue("Scatter")
    SCATTER("Scatter"),
    @XmlEnumValue("ScatterGrouped")
    SCATTER_GROUPED("ScatterGrouped");
    private final String value;

    DashboardComponentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DashboardComponentType fromValue(String v) {
        for (DashboardComponentType c: DashboardComponentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
