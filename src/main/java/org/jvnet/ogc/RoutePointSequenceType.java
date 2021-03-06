//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a list of waypoints along a route.
 * 
 * <p>Java class for RoutePointSequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePointSequenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartPoint" type="{http://www.opengis.net/ols/nav}RoutePointType"/>
 *         &lt;element name="ViaPoint" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opengis.net/ols/nav}RoutePointType">
 *                 &lt;attribute name="ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EndPoint" type="{http://www.opengis.net/ols/nav}RoutePointType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointSequenceType", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "startPoint",
    "viaPoint",
    "endPoint"
})
public class RoutePointSequenceType {

    @XmlElement(name = "StartPoint", required = true)
    protected RoutePointType startPoint;
    @XmlElement(name = "ViaPoint")
    protected List<RoutePointSequenceType.ViaPoint> viaPoint;
    @XmlElement(name = "EndPoint", required = true)
    protected RoutePointType endPoint;

    /**
     * Gets the value of the startPoint property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointType }
     *     
     */
    public RoutePointType getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointType }
     *     
     */
    public void setStartPoint(RoutePointType value) {
        this.startPoint = value;
    }

    /**
     * Gets the value of the viaPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viaPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViaPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePointSequenceType.ViaPoint }
     * 
     * 
     */
    public List<RoutePointSequenceType.ViaPoint> getViaPoint() {
        if (viaPoint == null) {
            viaPoint = new ArrayList<RoutePointSequenceType.ViaPoint>();
        }
        return this.viaPoint;
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointType }
     *     
     */
    public RoutePointType getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointType }
     *     
     */
    public void setEndPoint(RoutePointType value) {
        this.endPoint = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opengis.net/ols/nav}RoutePointType">
     *       &lt;attribute name="ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ViaPoint
        extends RoutePointType
    {

        @XmlAttribute(name = "ordered")
        protected Boolean ordered;

        /**
         * Gets the value of the ordered property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOrdered() {
            if (ordered == null) {
                return true;
            } else {
                return ordered;
            }
        }

        /**
         * Sets the value of the ordered property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOrdered(Boolean value) {
            this.ordered = value;
        }

    }

}
