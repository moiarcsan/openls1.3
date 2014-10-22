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
 * Response for requested route summary.
 * 
 * <p>Java class for DetermineRouteResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetermineRouteResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractResponseParametersType">
 *       &lt;sequence>
 *         &lt;element name="RouteLinkAndCost" type="{http://www.opengis.net/ols/nav}CursorType"/>
 *         &lt;element name="FirstBucket" type="{http://www.opengis.net/ols/nav}CursorFetchResponse" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/xls}RouteHandle" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/xls}RouteSummary" minOccurs="0"/>
 *         &lt;element name="ConstraintRelaxed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WhichConstrainWasRelaxed" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetermineRouteResponseType", namespace = "http://www.opengis.net/ols/nav", propOrder = {
    "routeLinkAndCost",
    "firstBucket",
    "routeHandle",
    "routeSummary",
    "constraintRelaxed",
    "whichConstrainWasRelaxed"
})
public class DetermineRouteResponseTypeNav
    extends AbstractResponseParametersType
{

    @XmlElement(name = "RouteLinkAndCost", required = true)
    protected CursorType routeLinkAndCost;
    @XmlElement(name = "FirstBucket")
    protected CursorFetchResponse firstBucket;
    @XmlElement(name = "RouteHandle", namespace = "http://www.opengis.net/xls")
    protected RouteHandleType routeHandle;
    @XmlElement(name = "RouteSummary", namespace = "http://www.opengis.net/xls")
    protected RouteSummaryType routeSummary;
    @XmlElement(name = "ConstraintRelaxed")
    protected Boolean constraintRelaxed;
    @XmlElement(name = "WhichConstrainWasRelaxed")
    protected Object whichConstrainWasRelaxed;

    /**
     * Gets the value of the routeLinkAndCost property.
     * 
     * @return
     *     possible object is
     *     {@link CursorType }
     *     
     */
    public CursorType getRouteLinkAndCost() {
        return routeLinkAndCost;
    }

    /**
     * Sets the value of the routeLinkAndCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorType }
     *     
     */
    public void setRouteLinkAndCost(CursorType value) {
        this.routeLinkAndCost = value;
    }

    /**
     * Gets the value of the firstBucket property.
     * 
     * @return
     *     possible object is
     *     {@link CursorFetchResponse }
     *     
     */
    public CursorFetchResponse getFirstBucket() {
        return firstBucket;
    }

    /**
     * Sets the value of the firstBucket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorFetchResponse }
     *     
     */
    public void setFirstBucket(CursorFetchResponse value) {
        this.firstBucket = value;
    }

    /**
     * Gets the value of the routeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link RouteHandleType }
     *     
     */
    public RouteHandleType getRouteHandle() {
        return routeHandle;
    }

    /**
     * Sets the value of the routeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteHandleType }
     *     
     */
    public void setRouteHandle(RouteHandleType value) {
        this.routeHandle = value;
    }

    /**
     * Gets the value of the routeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link RouteSummaryType }
     *     
     */
    public RouteSummaryType getRouteSummary() {
        return routeSummary;
    }

    /**
     * Sets the value of the routeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteSummaryType }
     *     
     */
    public void setRouteSummary(RouteSummaryType value) {
        this.routeSummary = value;
    }

    /**
     * Gets the value of the constraintRelaxed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstraintRelaxed() {
        return constraintRelaxed;
    }

    /**
     * Sets the value of the constraintRelaxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstraintRelaxed(Boolean value) {
        this.constraintRelaxed = value;
    }

    /**
     * Gets the value of the whichConstrainWasRelaxed property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWhichConstrainWasRelaxed() {
        return whichConstrainWasRelaxed;
    }

    /**
     * Sets the value of the whichConstrainWasRelaxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWhichConstrainWasRelaxed(Object value) {
        this.whichConstrainWasRelaxed = value;
    }

}
