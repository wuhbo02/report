//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 09:20:48 上午 CST 
//


package com.gdin.report.dto.exp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 发货人信息
 * 
 * <p>Java class for Consignor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Consignor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Address" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}ConsignorAddress" minOccurs="0"/>
 *         &lt;element name="Communication" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}Communication" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="AEO" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignor", propOrder = {
    "id",
    "name",
    "address",
    "communication",
    "aeo"
})
public class Consignor {

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Address")
    protected ConsignorAddress address;
    @XmlElement(name = "Communication")
    protected List<Communication> communication;
    @XmlElement(name = "AEO")
    protected String aeo;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorAddress }
     *     
     */
    public ConsignorAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorAddress }
     *     
     */
    public void setAddress(ConsignorAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Communication }
     * 
     * 
     */
    public List<Communication> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<Communication>();
        }
        return this.communication;
    }

    /**
     * Gets the value of the aeo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEO() {
        return aeo;
    }

    /**
     * Sets the value of the aeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEO(String value) {
        this.aeo = value;
    }

}
