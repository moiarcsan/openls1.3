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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Defines a single turn-by-turn route instruction or advisory formatted for presentation.
 * 
 * <p>Java class for RouteInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteInstructionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Instruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distance" type="{http://www.opengis.net/xls}DistanceType"/>
 *         &lt;element name="RouteInstructionGeometry" type="{http://www.opengis.net/xls}RouteGeometryType" minOccurs="0"/>
 *         &lt;element name="BoundingBox" type="{http://www.opengis.net/gml}EnvelopeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="duration" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInstructionType", propOrder = {
    "instruction",
    "distance",
    "routeInstructionGeometry",
    "boundingBox"
})
public class RouteInstructionType {

    @XmlElement(name = "Instruction", required = true)
    protected String instruction;
    @XmlElement(required = true)
    protected DistanceType distance;
    @XmlElement(name = "RouteInstructionGeometry")
    protected RouteGeometryType routeInstructionGeometry;
    @XmlElement(name = "BoundingBox")
    protected EnvelopeType boundingBox;
    @XmlAttribute(name = "duration", required = true)
    protected Duration duration;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setDistance(DistanceType value) {
        this.distance = value;
    }

    /**
     * Gets the value of the routeInstructionGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link RouteGeometryType }
     *     
     */
    public RouteGeometryType getRouteInstructionGeometry() {
        return routeInstructionGeometry;
    }

    /**
     * Sets the value of the routeInstructionGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteGeometryType }
     *     
     */
    public void setRouteInstructionGeometry(RouteGeometryType value) {
        this.routeInstructionGeometry = value;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeType }
     *     
     */
    public EnvelopeType getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeType }
     *     
     */
    public void setBoundingBox(EnvelopeType value) {
        this.boundingBox = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
