//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 11:01:13 AM CEST 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AbsoluteDateType" type="{http://www.opengis.net/ols/nav}AbsoluteDateType" minOccurs="0"/>
 *         &lt;element name="ExtendedDate" type="{http://www.opengis.net/ols/nav}ExtendedDateType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "absoluteDateType",
    "extendedDate"
})
public class DateType {

    @XmlElement(name = "AbsoluteDateType")
    protected AbsoluteDateType absoluteDateType;
    @XmlElement(name = "ExtendedDate")
    protected ExtendedDateType extendedDate;

    /**
     * Gets the value of the absoluteDateType property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteDateType }
     *     
     */
    public AbsoluteDateType getAbsoluteDateType() {
        return absoluteDateType;
    }

    /**
     * Sets the value of the absoluteDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteDateType }
     *     
     */
    public void setAbsoluteDateType(AbsoluteDateType value) {
        this.absoluteDateType = value;
    }

    /**
     * Gets the value of the extendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedDateType }
     *     
     */
    public ExtendedDateType getExtendedDate() {
        return extendedDate;
    }

    /**
     * Sets the value of the extendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedDateType }
     *     
     */
    public void setExtendedDate(ExtendedDateType value) {
        this.extendedDate = value;
    }

}