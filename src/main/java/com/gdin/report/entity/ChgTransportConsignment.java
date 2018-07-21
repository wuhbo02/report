package com.gdin.report.entity;

import java.math.BigDecimal;

public class ChgTransportConsignment {
    private BigDecimal chgTransportConsignmentId;

    private String chgTransportId;

    private BigDecimal consignmentId;

    public BigDecimal getChgTransportConsignmentId() {
        return chgTransportConsignmentId;
    }

    public void setChgTransportConsignmentId(BigDecimal chgTransportConsignmentId) {
        this.chgTransportConsignmentId = chgTransportConsignmentId;
    }

    public String getChgTransportId() {
        return chgTransportId;
    }

    public void setChgTransportId(String chgTransportId) {
        this.chgTransportId = chgTransportId == null ? null : chgTransportId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}