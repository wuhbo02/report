package com.gdin.report.entity;

import java.math.BigDecimal;

public class LoadConsignment {
    private BigDecimal loadConsignmentId;

    private String loadReportId;

    private BigDecimal consignmentId;

    public BigDecimal getLoadConsignmentId() {
        return loadConsignmentId;
    }

    public void setLoadConsignmentId(BigDecimal loadConsignmentId) {
        this.loadConsignmentId = loadConsignmentId;
    }

    public String getLoadReportId() {
        return loadReportId;
    }

    public void setLoadReportId(String loadReportId) {
        this.loadReportId = loadReportId == null ? null : loadReportId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}