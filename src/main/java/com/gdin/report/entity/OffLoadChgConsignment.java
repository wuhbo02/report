package com.gdin.report.entity;

import java.math.BigDecimal;

public class OffLoadChgConsignment {
    private BigDecimal offLoadChgConsignmentId;

    private String offLoadChgId;

    private BigDecimal consignmentId;

    public BigDecimal getOffLoadChgConsignmentId() {
        return offLoadChgConsignmentId;
    }

    public void setOffLoadChgConsignmentId(BigDecimal offLoadChgConsignmentId) {
        this.offLoadChgConsignmentId = offLoadChgConsignmentId;
    }

    public String getOffLoadChgId() {
        return offLoadChgId;
    }

    public void setOffLoadChgId(String offLoadChgId) {
        this.offLoadChgId = offLoadChgId == null ? null : offLoadChgId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}