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
 * <p>Java class for InputMSIDsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputMSIDsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/xls}AbstractMSIDsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/xls}InputMSInformation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputMSIDsType", propOrder = {
    "inputMSInformation"
})
public class InputMSIDsType
    extends AbstractMSIDsType
{

    @XmlElement(name = "InputMSInformation", required = true)
    protected InputMSInformationType inputMSInformation;

    /**
     * Gets the value of the inputMSInformation property.
     * 
     * @return
     *     possible object is
     *     {@link InputMSInformationType }
     *     
     */
    public InputMSInformationType getInputMSInformation() {
        return inputMSInformation;
    }

    /**
     * Sets the value of the inputMSInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputMSInformationType }
     *     
     */
    public void setInputMSInformation(InputMSInformationType value) {
        this.inputMSInformation = value;
    }

}