//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.24 at 12:01:44 下午 CST 
//


package com.gdin.report.dto.exp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 关联数据段
 * 
 * <p>Java class for Relation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportInformation" type="{urn:Declaration:datamodel:standard:CN:MT8105:1}ImportInformation"/>
 *         &lt;element name="ExportInformation" type="{urn:Declaration:datamodel:standard:CN:MT8105:1}ExportInformation"/>
 *         &lt;element name="TransportEquipment" type="{urn:Declaration:datamodel:standard:CN:MT8105:1}ChangeTransportEquipment" maxOccurs="9999" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" type="{urn:Declaration:datamodel:standard:CN:MT8105:1}AdditionalInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relation", propOrder = {
    "importInformation",
    "exportInformation",
    "transportEquipment",
    "additionalInformation"
})
public class Relation {

    @XmlElement(name = "ImportInformation", required = true)
    protected ImportInformation importInformation;
    @XmlElement(name = "ExportInformation", required = true)
    protected ExportInformation exportInformation;
    @XmlElement(name = "TransportEquipment", required = true)
    protected List<ChangeTransportEquipment> transportEquipment;
    @XmlElement(name = "AdditionalInformation")
    protected AdditionalInformation additionalInformation;

    /**
     * Gets the value of the importInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ImportInformation }
     *     
     */
    public ImportInformation getImportInformation() {
        return importInformation;
    }

    /**
     * Sets the value of the importInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportInformation }
     *     
     */
    public void setImportInformation(ImportInformation value) {
        this.importInformation = value;
    }

    /**
     * Gets the value of the exportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExportInformation }
     *     
     */
    public ExportInformation getExportInformation() {
        return exportInformation;
    }

    /**
     * Sets the value of the exportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportInformation }
     *     
     */
    public void setExportInformation(ExportInformation value) {
        this.exportInformation = value;
    }

    /**
     * Gets the value of the transportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeTransportEquipment }
     * 
     * 
     */
    public List<ChangeTransportEquipment> getTransportEquipment() {
        if (transportEquipment == null) {
            transportEquipment = new ArrayList<ChangeTransportEquipment>();
        }
        return this.transportEquipment;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation }
     *     
     */
    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation }
     *     
     */
    public void setAdditionalInformation(AdditionalInformation value) {
        this.additionalInformation = value;
    }

}
