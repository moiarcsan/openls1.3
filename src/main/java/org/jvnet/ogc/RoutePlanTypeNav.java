//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 11:01:13 AM CEST 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutePlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WayPointList" type="{http://www.opengis.net/ols/nav}RoutePointSequenceType"/>
 *         &lt;element name="AvoidList" type="{http://www.opengis.net/xls}AvoidListType" minOccurs="0"/>
 *         &lt;element name="ExtendedRouteControl" type="{http://www.opengis.net/ols/nav}RouteControlType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="useRealTimeTraffic" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RelaxConstraint" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePlanType", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "wayPointList",
    "avoidList",
    "extendedRouteControl"
})
public class RoutePlanTypeNav {

    @XmlElement(name = "WayPointList", required = true)
    protected RoutePointSequenceType wayPointList;
    @XmlElement(name = "AvoidList")
    protected AvoidListType avoidList;
    @XmlElement(name = "ExtendedRouteControl", required = true)
    protected RouteControlType extendedRouteControl;
    @XmlAttribute(name = "useRealTimeTraffic")
    protected Boolean useRealTimeTraffic;
    @XmlAttribute(name = "RelaxConstraint", required = true)
    protected boolean relaxConstraint;

    /**
     * Gets the value of the wayPointList property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointSequenceType }
     *     
     */
    public RoutePointSequenceType getWayPointList() {
        return wayPointList;
    }

    /**
     * Sets the value of the wayPointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointSequenceType }
     *     
     */
    public void setWayPointList(RoutePointSequenceType value) {
        this.wayPointList = value;
    }

    /**
     * Gets the value of the avoidList property.
     * 
     * @return
     *     possible object is
     *     {@link AvoidListType }
     *     
     */
    public AvoidListType getAvoidList() {
        return avoidList;
    }

    /**
     * Sets the value of the avoidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvoidListType }
     *     
     */
    public void setAvoidList(AvoidListType value) {
        this.avoidList = value;
    }

    /**
     * Gets the value of the extendedRouteControl property.
     * 
     * @return
     *     possible object is
     *     {@link RouteControlType }
     *     
     */
    public RouteControlType getExtendedRouteControl() {
        return extendedRouteControl;
    }

    /**
     * Sets the value of the extendedRouteControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteControlType }
     *     
     */
    public void setExtendedRouteControl(RouteControlType value) {
        this.extendedRouteControl = value;
    }

    /**
     * Gets the value of the useRealTimeTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseRealTimeTraffic() {
        if (useRealTimeTraffic == null) {
            return false;
        } else {
            return useRealTimeTraffic;
        }
    }

    /**
     * Sets the value of the useRealTimeTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseRealTimeTraffic(Boolean value) {
        this.useRealTimeTraffic = value;
    }

    /**
     * Gets the value of the relaxConstraint property.
     * 
     */
    public boolean isRelaxConstraint() {
        return relaxConstraint;
    }

    /**
     * Sets the value of the relaxConstraint property.
     * 
     */
    public void setRelaxConstraint(boolean value) {
        this.relaxConstraint = value;
    }

}