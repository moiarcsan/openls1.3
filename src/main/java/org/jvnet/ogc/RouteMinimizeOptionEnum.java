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
 * <p>Java class for RouteMinimizeOptionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RouteMinimizeOptionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SHORTEST_DISTANCE"/>
 *     &lt;enumeration value="SHORTEST_TIME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RouteMinimizeOptionEnum", namespace = "http://www.opengis.net/ols/nav")
@XmlEnum
public enum RouteMinimizeOptionEnum {

    SHORTEST_DISTANCE,
    SHORTEST_TIME;

    public String value() {
        return name();
    }

    public static RouteMinimizeOptionEnum fromValue(String v) {
        return valueOf(v);
    }

}
