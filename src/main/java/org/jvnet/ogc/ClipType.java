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
 * <p>Java class for ClipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}Polygon"/>
 *         &lt;element ref="{http://www.opengis.net/gml}CircleByCenterPoint"/>
 *         &lt;element name="LineCorridor" type="{http://www.opengis.net/xls}LineCorridorType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClipType", propOrder = {
    "polygon",
    "circleByCenterPoint",
    "lineCorridor"
})
public class ClipType {

    @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml")
    protected PolygonType polygon;
    @XmlElement(name = "CircleByCenterPoint", namespace = "http://www.opengis.net/gml")
    protected CircleByCenterPointType circleByCenterPoint;
    @XmlElement(name = "LineCorridor")
    protected LineCorridorType lineCorridor;

    /**
     * Clips the portrayed map with a polygon
     * 
     * @return
     *     possible object is
     *     {@link PolygonType }
     *     
     */
    public PolygonType getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonType }
     *     
     */
    public void setPolygon(PolygonType value) {
        this.polygon = value;
    }

    /**
     * Clips the portrayed map with a circle
     * 
     * @return
     *     possible object is
     *     {@link CircleByCenterPointType }
     *     
     */
    public CircleByCenterPointType getCircleByCenterPoint() {
        return circleByCenterPoint;
    }

    /**
     * Sets the value of the circleByCenterPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircleByCenterPointType }
     *     
     */
    public void setCircleByCenterPoint(CircleByCenterPointType value) {
        this.circleByCenterPoint = value;
    }

    /**
     * Gets the value of the lineCorridor property.
     * 
     * @return
     *     possible object is
     *     {@link LineCorridorType }
     *     
     */
    public LineCorridorType getLineCorridor() {
        return lineCorridor;
    }

    /**
     * Sets the value of the lineCorridor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineCorridorType }
     *     
     */
    public void setLineCorridor(LineCorridorType value) {
        this.lineCorridor = value;
    }

}
