package com.gdin.report.entity;

import java.math.BigDecimal;

public class DispatchConsignment {
    private BigDecimal dispatchConsignmentId;

    private String dispatchReportId;

    private BigDecimal consignmentId;

    public BigDecimal getDispatchConsignmentId() {
        return dispatchConsignmentId;
    }

    public void setDispatchConsignmentId(BigDecimal dispatchConsignmentId) {
        this.dispatchConsignmentId = dispatchConsignmentId;
    }

    public String getDispatchReportId() {
        return dispatchReportId;
    }

    public void setDispatchReportId(String dispatchReportId) {
        this.dispatchReportId = dispatchReportId == null ? null : dispatchReportId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}