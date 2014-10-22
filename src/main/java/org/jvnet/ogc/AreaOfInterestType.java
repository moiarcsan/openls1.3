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
 * <p>Java class for AreaOfInterestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaOfInterestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractDataType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}CircleByCenterPoint"/>
 *         &lt;element ref="{http://www.opengis.net/gml}Polygon"/>
 *         &lt;element ref="{http://www.opengis.net/gml}Envelope"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaOfInterestType", propOrder = {
    "circleByCenterPoint",
    "polygon",
    "envelope"
})
public class AreaOfInterestType
    extends AbstractDataType
{

    @XmlElement(name = "CircleByCenterPoint", namespace = "http://www.opengis.net/gml")
    protected CircleByCenterPointType circleByCenterPoint;
    @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml")
    protected PolygonType polygon;
    @XmlElement(name = "Envelope", namespace = "http://www.opengis.net/gml")
    protected EnvelopeType envelope;

    /**
     * Gets the value of the circleByCenterPoint property.
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
     * Gets the value of the polygon property.
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
     * Gets the value of the envelope property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeType }
     *     
     */
    public EnvelopeType getEnvelope() {
        return envelope;
    }

    /**
     * Sets the value of the envelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeType }
     *     
     */
    public void setEnvelope(EnvelopeType value) {
        this.envelope = value;
    }

}
