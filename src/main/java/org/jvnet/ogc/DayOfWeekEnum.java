//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeekEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Monday = 0x1"/>
 *     &lt;enumeration value="Tuesday = 0x2"/>
 *     &lt;enumeration value="Wednesday = 0x4"/>
 *     &lt;enumeration value="Thursday = 0x8"/>
 *     &lt;enumeration value="Friday = 0x10"/>
 *     &lt;enumeration value="Saturday = 0x20"/>
 *     &lt;enumeration value="Sunday = 0x40"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekEnum", namespace = "http://www.opengis.net/ols/nav")
@XmlEnum
public enum DayOfWeekEnum {

    @XmlEnumValue("Monday = 0x1")
    MONDAY_0_X_1("Monday = 0x1"),
    @XmlEnumValue("Tuesday = 0x2")
    TUESDAY_0_X_2("Tuesday = 0x2"),
    @XmlEnumValue("Wednesday = 0x4")
    WEDNESDAY_0_X_4("Wednesday = 0x4"),
    @XmlEnumValue("Thursday = 0x8")
    THURSDAY_0_X_8("Thursday = 0x8"),
    @XmlEnumValue("Friday = 0x10")
    FRIDAY_0_X_10("Friday = 0x10"),
    @XmlEnumValue("Saturday = 0x20")
    SATURDAY_0_X_20("Saturday = 0x20"),
    @XmlEnumValue("Sunday = 0x40")
    SUNDAY_0_X_40("Sunday = 0x40");
    private final String value;

    DayOfWeekEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayOfWeekEnum fromValue(String v) {
        for (DayOfWeekEnum c: DayOfWeekEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
