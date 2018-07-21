package com.gdin.report.entity;

import java.math.BigDecimal;

public class DistributeConsignment {
    private BigDecimal distributeConsignmentId;

    private String distributeReportId;

    private BigDecimal consignmentId;

    public BigDecimal getDistributeConsignmentId() {
        return distributeConsignmentId;
    }

    public void setDistributeConsignmentId(BigDecimal distributeConsignmentId) {
        this.distributeConsignmentId = distributeConsignmentId;
    }

    public String getDistributeReportId() {
        return distributeReportId;
    }

    public void setDistributeReportId(String distributeReportId) {
        this.distributeReportId = distributeReportId == null ? null : distributeReportId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}