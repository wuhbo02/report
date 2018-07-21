//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 09:20:48 上午 CST 
//


package com.gdin.report.dto.exp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 商品项简要描述
 * 
 * <p>Java class for Commodity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Commodity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CargoDescription" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="UNDGCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="TariffClassificationCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity", propOrder = {
    "cargoDescription",
    "undgCode",
    "tariffClassificationCode"
})
public class Commodity {

    @XmlElement(name = "CargoDescription", required = true)
    protected   String cargoDescription;
    @XmlElement(name = "UNDGCode")
    protected   String undgCode;
    @XmlElement(name = "TariffClassificationCode")
    protected   String tariffClassificationCode;

    /**
     * Gets the value of the cargoDescription property.
     * 
     * @return
     *     possible   String is
     *     {@link   String }
     *     
     */
    public   String getCargoDescription() {
        return cargoDescription;
    }

    /**
     * Sets the value of the cargoDescription property.
     * 
     * @param value
     *     allowed   String is
     *     {@link   String }
     *     
     */
    public void setCargoDescription(  String value) {
        this.cargoDescription = value;
    }

    /**
     * Gets the value of the undgCode property.
     * 
     * @return
     *     possible   String is
     *     {@link   String }
     *     
     */
    public   String getUNDGCode() {
        return undgCode;
    }

    /**
     * Sets the value of the undgCode property.
     * 
     * @param value
     *     allowed   String is
     *     {@link   String }
     *     
     */
    public void setUNDGCode(  String value) {
        this.undgCode = value;
    }

    /**
     * Gets the value of the tariffClassificationCode property.
     * 
     * @return
     *     possible   String is
     *     {@link   String }
     *     
     */
    public   String getTariffClassificationCode() {
        return tariffClassificationCode;
    }

    /**
     * Sets the value of the tariffClassificationCode property.
     * 
     * @param value
     *     allowed   String is
     *     {@link   String }
     *     
     */
    public void setTariffClassificationCode(  String value) {
        this.tariffClassificationCode = value;
    }

}
