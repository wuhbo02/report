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
 * 报文体
 * 
 * <p>Java class for Declaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Declaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RepresentativePerson" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}RepresentativePerson"/>
 *         &lt;element name="ExitCustomsOffice" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}ExitCustomsOffice"/>
 *         &lt;element name="Agent" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}Agent" minOccurs="0"/>
 *         &lt;element name="Carrier" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}Carrier"/>
 *         &lt;element name="BorderTransportMeans" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}BorderTransportMeans"/>
 *         &lt;element name="Consignment" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}Consignment" maxOccurs="9999"/>
 *         &lt;element name="AdditionalInformation" type="{urn:Declaration:datamodel:standard:CN:MT1101:1}AdditionalInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Declaration", propOrder = {
    "representativePerson",
    "exitCustomsOffice",
    "agent",
    "carrier",
        "declarationOfficeID",
    "borderTransportMeans",
        "unloadingLocation",
        "tallyParty",
    "consignment",
        "transportEquipmentList",
    "additionalInformation"
})
public class Declaration {

    @XmlElement(name = "RepresentativePerson")
    protected RepresentativePerson representativePerson;
    @XmlElement(name = "ExitCustomsOffice")
    protected ExitCustomsOffice exitCustomsOffice;
    @XmlElement(name = "Agent")
    protected Agent agent;
    @XmlElement(name = "Carrier")
    protected Carrier carrier;

    @XmlElement(name = "DeclarationOfficeID")
    protected String declarationOfficeID;

    @XmlElement(name = "BorderTransportMeans")
    protected BorderTransportMeans borderTransportMeans;

    @XmlElement(name = "UnloadingLocation")
    protected UnloadingLocation unloadingLocation;

    @XmlElement(name = "TallyParty")
    protected Party tallyParty;

    @XmlElement(name = "Consignment")
    protected List<Consignment> consignment;

    @XmlElement(name = "TransportEquipment")
    protected List<TransportEquipment> transportEquipmentList;

    @XmlElement(name = "AdditionalInformation")
    protected AdditionalInformation additionalInformation;



    public String getDeclarationOfficeID() {
        return declarationOfficeID;
    }

    public void setDeclarationOfficeID(String declarationOfficeID) {
        this.declarationOfficeID = declarationOfficeID;
    }

    public Party getTallyParty() {
        return tallyParty;
    }

    public void setTallyParty(Party tallyParty) {
        this.tallyParty = tallyParty;
    }

    public UnloadingLocation getUnloadingLocation() {
        return unloadingLocation;
    }

    public void setUnloadingLocation(UnloadingLocation unloadingLocation) {
        this.unloadingLocation = unloadingLocation;
    }

    public List<TransportEquipment> getTransportEquipmentList() {
        return transportEquipmentList;
    }

    public void setTransportEquipmentList(List<TransportEquipment> transportEquipmentList) {
        this.transportEquipmentList = transportEquipmentList;
    }

    /**
     * Gets the value of the representativePerson property.
     * 
     * @return
     *     possible object is
     *     {@link RepresentativePerson }
     *     
     */
    public RepresentativePerson getRepresentativePerson() {
        return representativePerson;
    }

    /**
     * Sets the value of the representativePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativePerson }
     *     
     */
    public void setRepresentativePerson(RepresentativePerson value) {
        this.representativePerson = value;
    }

    /**
     * Gets the value of the exitCustomsOffice property.
     * 
     * @return
     *     possible object is
     *     {@link ExitCustomsOffice }
     *     
     */
    public ExitCustomsOffice getExitCustomsOffice() {
        return exitCustomsOffice;
    }

    /**
     * Sets the value of the exitCustomsOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExitCustomsOffice }
     *     
     */
    public void setExitCustomsOffice(ExitCustomsOffice value) {
        this.exitCustomsOffice = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setAgent(Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link Carrier }
     *     
     */
    public Carrier getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Carrier }
     *     
     */
    public void setCarrier(Carrier value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the borderTransportMeans property.
     * 
     * @return
     *     possible object is
     *     {@link BorderTransportMeans }
     *     
     */
    public BorderTransportMeans getBorderTransportMeans() {
        return borderTransportMeans;
    }

    /**
     * Sets the value of the borderTransportMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderTransportMeans }
     *     
     */
    public void setBorderTransportMeans(BorderTransportMeans value) {
        this.borderTransportMeans = value;
    }

    /**
     * Gets the value of the consignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Consignment> getConsignment() {
        if (consignment == null) {
            consignment = new ArrayList<Consignment>();
        }
        return this.consignment;
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
