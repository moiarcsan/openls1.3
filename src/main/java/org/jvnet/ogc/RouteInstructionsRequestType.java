//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the request parameters for turn-by-turn route instructions and travel advisories formatted for presentation.
 * 
 * <p>Java class for RouteInstructionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteInstructionsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" default="text/plain" />
 *       &lt;attribute name="provideGeometry" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="provideBoundingBox" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInstructionsRequestType")
public class RouteInstructionsRequestType {

    @XmlAttribute(name = "format")
    protected String format;
    @XmlAttribute(name = "provideGeometry")
    protected Boolean provideGeometry;
    @XmlAttribute(name = "provideBoundingBox")
    protected Boolean provideBoundingBox;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        if (format == null) {
            return "text/plain";
        } else {
            return format;
        }
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the provideGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProvideGeometry() {
        if (provideGeometry == null) {
            return false;
        } else {
            return provideGeometry;
        }
    }

    /**
     * Sets the value of the provideGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvideGeometry(Boolean value) {
        this.provideGeometry = value;
    }

    /**
     * Gets the value of the provideBoundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProvideBoundingBox() {
        if (provideBoundingBox == null) {
            return false;
        } else {
            return provideBoundingBox;
        }
    }

    /**
     * Sets the value of the provideBoundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvideBoundingBox(Boolean value) {
        this.provideBoundingBox = value;
    }

}
