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


/**
 * <p>Java class for PositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractPositionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}Point"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/xls}Ellipse"/>
 *           &lt;element ref="{http://www.opengis.net/gml}CircleByCenterPoint"/>
 *           &lt;element ref="{http://www.opengis.net/xls}CircularArc"/>
 *           &lt;element ref="{http://www.opengis.net/gml}Polygon"/>
 *           &lt;element ref="{http://www.opengis.net/gml}MultiPolygon"/>
 *         &lt;/choice>
 *         &lt;element name="QoP" type="{http://www.opengis.net/xls}QualityOfPositionType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/xls}Time" minOccurs="0"/>
 *         &lt;element name="Speed" type="{http://www.opengis.net/xls}SpeedType" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.opengis.net/xls}AngleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="levelOfConf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionType", propOrder = {
    "point",
    "ellipse",
    "circleByCenterPoint",
    "circularArc",
    "polygon",
    "multiPolygon",
    "qoP",
    "time",
    "speed",
    "direction"
})
public class PositionType
    extends AbstractPositionType
{

    @XmlElement(name = "Point", namespace = "http://www.opengis.net/gml", required = true)
    protected PointType point;
    @XmlElement(name = "Ellipse")
    protected EllipseType ellipse;
    @XmlElement(name = "CircleByCenterPoint", namespace = "http://www.opengis.net/gml")
    protected CircleByCenterPointType circleByCenterPoint;
    @XmlElement(name = "CircularArc")
    protected CircularArcType circularArc;
    @XmlElement(name = "Polygon", namespace = "http://www.opengis.net/gml")
    protected PolygonType polygon;
    @XmlElement(name = "MultiPolygon", namespace = "http://www.opengis.net/gml")
    protected MultiPolygonType multiPolygon;
    @XmlElement(name = "QoP")
    protected QualityOfPositionType qoP;
    @XmlElement(name = "Time")
    protected TimeType time;
    @XmlElement(name = "Speed")
    protected SpeedType speed;
    @XmlElement(name = "Direction")
    protected AngleType direction;
    @XmlAttribute(name = "levelOfConf")
    protected String levelOfConf;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setPoint(PointType value) {
        this.point = value;
    }

    /**
     * Gets the value of the ellipse property.
     * 
     * @return
     *     possible object is
     *     {@link EllipseType }
     *     
     */
    public EllipseType getEllipse() {
        return ellipse;
    }

    /**
     * Sets the value of the ellipse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EllipseType }
     *     
     */
    public void setEllipse(EllipseType value) {
        this.ellipse = value;
    }

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
     * Gets the value of the circularArc property.
     * 
     * @return
     *     possible object is
     *     {@link CircularArcType }
     *     
     */
    public CircularArcType getCircularArc() {
        return circularArc;
    }

    /**
     * Sets the value of the circularArc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircularArcType }
     *     
     */
    public void setCircularArc(CircularArcType value) {
        this.circularArc = value;
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
     * Gets the value of the multiPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link MultiPolygonType }
     *     
     */
    public MultiPolygonType getMultiPolygon() {
        return multiPolygon;
    }

    /**
     * Sets the value of the multiPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiPolygonType }
     *     
     */
    public void setMultiPolygon(MultiPolygonType value) {
        this.multiPolygon = value;
    }

    /**
     * Gets the value of the qoP property.
     * 
     * @return
     *     possible object is
     *     {@link QualityOfPositionType }
     *     
     */
    public QualityOfPositionType getQoP() {
        return qoP;
    }

    /**
     * Sets the value of the qoP property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityOfPositionType }
     *     
     */
    public void setQoP(QualityOfPositionType value) {
        this.qoP = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setTime(TimeType value) {
        this.time = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setSpeed(SpeedType value) {
        this.speed = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setDirection(AngleType value) {
        this.direction = value;
    }

    /**
     * Gets the value of the levelOfConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfConf() {
        return levelOfConf;
    }

    /**
     * Sets the value of the levelOfConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfConf(String value) {
        this.levelOfConf = value;
    }

}
