package com.gdin.report.entity;

import java.math.BigDecimal;

public class ChangePortConsignment {
    private BigDecimal changePortConsignmentId;

    private String changePortId;

    private BigDecimal consignmentId;

    public BigDecimal getChangePortConsignmentId() {
        return changePortConsignmentId;
    }

    public void setChangePortConsignmentId(BigDecimal changePortConsignmentId) {
        this.changePortConsignmentId = changePortConsignmentId;
    }

    public String getChangePortId() {
        return changePortId;
    }

    public void setChangePortId(String changePortId) {
        this.changePortId = changePortId == null ? null : changePortId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}