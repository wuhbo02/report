package com.gdin.report.entity;

import java.math.BigDecimal;

public class EmptycontaConsignment {
    private BigDecimal emptycontaConsignmentId;

    private String emptycontaId;

    private BigDecimal consignmentId;

    public BigDecimal getEmptycontaConsignmentId() {
        return emptycontaConsignmentId;
    }

    public void setEmptycontaConsignmentId(BigDecimal emptycontaConsignmentId) {
        this.emptycontaConsignmentId = emptycontaConsignmentId;
    }

    public String getEmptycontaId() {
        return emptycontaId;
    }

    public void setEmptycontaId(String emptycontaId) {
        this.emptycontaId = emptycontaId == null ? null : emptycontaId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}