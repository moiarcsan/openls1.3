//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayOfWeekOfMonthType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayOfWeekOfMonthType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayOfWeek" type="{http://www.opengis.net/ols/nav}DayOfWeekEnum"/>
 *         &lt;element name="WeekOfMonth" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayOfWeekOfMonthType", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "dayOfWeek",
    "weekOfMonth"
})
public class DayOfWeekOfMonthType {

    @XmlElement(name = "DayOfWeek", required = true)
    protected DayOfWeekEnum dayOfWeek;
    @XmlElement(name = "WeekOfMonth")
    @XmlSchemaType(name = "unsignedShort")
    protected int weekOfMonth;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekEnum }
     *     
     */
    public DayOfWeekEnum getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekEnum }
     *     
     */
    public void setDayOfWeek(DayOfWeekEnum value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the weekOfMonth property.
     * 
     */
    public int getWeekOfMonth() {
        return weekOfMonth;
    }

    /**
     * Sets the value of the weekOfMonth property.
     * 
     */
    public void setWeekOfMonth(int value) {
        this.weekOfMonth = value;
    }

}
