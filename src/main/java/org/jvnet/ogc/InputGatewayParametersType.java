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
 * <p>Java class for InputGatewayParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputGatewayParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractGatewayParametersType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/xls}InputMSIDs"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputGatewayParametersType", propOrder = {
    "inputMSIDs"
})
public class InputGatewayParametersType
    extends AbstractGatewayParametersType
{

    @XmlElement(name = "InputMSIDs", required = true)
    protected InputMSIDsType inputMSIDs;

    /**
     * Gets the value of the inputMSIDs property.
     * 
     * @return
     *     possible object is
     *     {@link InputMSIDsType }
     *     
     */
    public InputMSIDsType getInputMSIDs() {
        return inputMSIDs;
    }

    /**
     * Sets the value of the inputMSIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputMSIDsType }
     *     
     */
    public void setInputMSIDs(InputMSIDsType value) {
        this.inputMSIDs = value;
    }

}
