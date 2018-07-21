package com.gdin.report.entity;

import java.math.BigDecimal;

public class ArrivalConsignment {
    private BigDecimal arrivalConsignmentId;

    private String arrivalReportId;

    private BigDecimal consignmentId;

    public BigDecimal getArrivalConsignmentId() {
        return arrivalConsignmentId;
    }

    public void setArrivalConsignmentId(BigDecimal arrivalConsignmentId) {
        this.arrivalConsignmentId = arrivalConsignmentId;
    }

    public String getArrivalReportId() {
        return arrivalReportId;
    }

    public void setArrivalReportId(String arrivalReportId) {
        this.arrivalReportId = arrivalReportId == null ? null : arrivalReportId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}