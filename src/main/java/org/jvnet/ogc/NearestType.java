//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a spatial filter which selects the POI nearest to the specified location.
 * 
 * <p>Java class for NearestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NearestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/xls}_Location" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nearestCriterion" type="{http://www.opengis.net/xls}NearestCriterionType" default="Proximity" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearestType", propOrder = {
    "location"
})
public class NearestType {

    @XmlElementRef(name = "_Location", namespace = "http://www.opengis.net/xls", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractLocationType>> location;
    @XmlAttribute(name = "nearestCriterion")
    protected NearestCriterionType nearestCriterion;

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PointOfInterestType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractLocationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractPOIType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractLocationType>> getLocation() {
        if (location == null) {
            location = new ArrayList<JAXBElement<? extends AbstractLocationType>>();
        }
        return this.location;
    }

    /**
     * Gets the value of the nearestCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link NearestCriterionType }
     *     
     */
    public NearestCriterionType getNearestCriterion() {
        if (nearestCriterion == null) {
            return NearestCriterionType.PROXIMITY;
        } else {
            return nearestCriterion;
        }
    }

    /**
     * Sets the value of the nearestCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link NearestCriterionType }
     *     
     */
    public void setNearestCriterion(NearestCriterionType value) {
        this.nearestCriterion = value;
    }

}
