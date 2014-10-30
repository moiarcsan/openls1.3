//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.29 at 06:46:24 PM CET 
//


package org.jvnet.ogc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract type representing the set of parameters for a service request.
 * 
 * <p>Java class for AbstractRequestParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequestParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequestParametersType")
@XmlSeeAlso({
    DetermineRouteRequestTypeNav.class,
    GetPositionRequestType.class,
    GetNearbyMapObjRequestType.class,
    CloseCursorRequest.class,
    GetCursorPositionRequest.class,
    GetCursorInfoRequest.class,
    SetCursorPositionRequest.class,
    CursorFetchRequest.class,
    ProcessCursorRequest.class,
    ReverseGeocodeRequestType.class,
    GeocodeRequestType.class,
    DirectoryRequestType.class,
    DetermineRouteRequestType.class,
    PortrayMapRequestType.class,
    SLIRType.class,
    GetPortrayMapCapabilitiesRequestType.class
})
public abstract class AbstractRequestParametersType {


}
