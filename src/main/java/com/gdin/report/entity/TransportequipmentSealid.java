package com.gdin.report.entity;

import java.math.BigDecimal;

public class TransportequipmentSealid {
    private BigDecimal transportequipmentSealidId;

    private String transportequipmentId;

    private String sealid;

    private String agencycode;

    private String copmsgid;

    public BigDecimal getTransportequipmentSealidId() {
        return transportequipmentSealidId;
    }

    public void setTransportequipmentSealidId(BigDecimal transportequipmentSealidId) {
        this.transportequipmentSealidId = transportequipmentSealidId;
    }

    public String getTransportequipmentId() {
        return transportequipmentId;
    }

    public void setTransportequipmentId(String transportequipmentId) {
        this.transportequipmentId = transportequipmentId == null ? null : transportequipmentId.trim();
    }

    public String getSealid() {
        return sealid;
    }

    public void setSealid(String sealid) {
        this.sealid = sealid == null ? null : sealid.trim();
    }

    public String getAgencycode() {
        return agencycode;
    }

    public void setAgencycode(String agencycode) {
        this.agencycode = agencycode == null ? null : agencycode.trim();
    }

    public String getCopmsgid() {
        return copmsgid;
    }

    public void setCopmsgid(String copmsgid) {
        this.copmsgid = copmsgid == null ? null : copmsgid.trim();
    }
}