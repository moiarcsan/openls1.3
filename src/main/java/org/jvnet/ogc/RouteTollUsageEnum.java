//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 11:01:13 AM CEST 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteTollUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteTollUsageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROHIBIT_TOLLROADS"/>
 *     &lt;enumeration value="AVOID_TOLLROADS"/>
 *     &lt;enumeration value="NO_PREFERENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RouteTollUsageEnum", namespace = "http://www.opengis.net/ols/nav")
@XmlEnum
public enum RouteTollUsageEnum {

    PROHIBIT_TOLLROADS,
    AVOID_TOLLROADS,
    NO_PREFERENCE;

    public String value() {
        return name();
    }

    public static RouteTollUsageEnum fromValue(String v) {
        return valueOf(v);
    }

}
