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
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the type of location constraints to perform search.
 * 
 * <p>Java class for POILocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POILocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/xls}Address"/>
 *         &lt;element name="Nearest" type="{http://www.opengis.net/xls}NearestType"/>
 *         &lt;element name="WithinDistance" type="{http://www.opengis.net/xls}WithinDistanceType"/>
 *         &lt;element name="WithinBoundary" type="{http://www.opengis.net/xls}WithinBoundaryType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POILocationType", propOrder = {
    "address",
    "nearest",
    "withinDistance",
    "withinBoundary"
})
public class POILocationType {

    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Nearest")
    protected NearestType nearest;
    @XmlElement(name = "WithinDistance")
    protected WithinDistanceType withinDistance;
    @XmlElement(name = "WithinBoundary")
    protected WithinBoundaryType withinBoundary;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the nearest property.
     * 
     * @return
     *     possible object is
     *     {@link NearestType }
     *     
     */
    public NearestType getNearest() {
        return nearest;
    }

    /**
     * Sets the value of the nearest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NearestType }
     *     
     */
    public void setNearest(NearestType value) {
        this.nearest = value;
    }

    /**
     * Gets the value of the withinDistance property.
     * 
     * @return
     *     possible object is
     *     {@link WithinDistanceType }
     *     
     */
    public WithinDistanceType getWithinDistance() {
        return withinDistance;
    }

    /**
     * Sets the value of the withinDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithinDistanceType }
     *     
     */
    public void setWithinDistance(WithinDistanceType value) {
        this.withinDistance = value;
    }

    /**
     * Gets the value of the withinBoundary property.
     * 
     * @return
     *     possible object is
     *     {@link WithinBoundaryType }
     *     
     */
    public WithinBoundaryType getWithinBoundary() {
        return withinBoundary;
    }

    /**
     * Sets the value of the withinBoundary property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithinBoundaryType }
     *     
     */
    public void setWithinBoundary(WithinBoundaryType value) {
        this.withinBoundary = value;
    }

}
