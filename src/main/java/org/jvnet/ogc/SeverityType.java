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
 * <p>Java class for SeverityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Info/ Status"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeverityType")
@XmlEnum
public enum SeverityType {


    /**
     * This indicates that although there is an error, other parts of the request will still be processed in the normal way.
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * This indicates that although there is an error, other parts of the request will still be processed in the normal way.
     * 
     */
    @XmlEnumValue("Info/ Status")
    INFO_STATUS("Info/ Status"),

    /**
     * This indicates that there is an unrecoverable error in the request and no part of the request will processed.
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    SeverityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityType fromValue(String v) {
        for (SeverityType c: SeverityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
