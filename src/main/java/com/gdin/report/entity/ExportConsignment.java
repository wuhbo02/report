package com.gdin.report.entity;

import java.math.BigDecimal;

public class ExportConsignment {
    private BigDecimal exportConsignmentId;

    private String exportReportId;

    private BigDecimal consignmentId;

    public BigDecimal getExportConsignmentId() {
        return exportConsignmentId;
    }

    public void setExportConsignmentId(BigDecimal exportConsignmentId) {
        this.exportConsignmentId = exportConsignmentId;
    }

    public String getExportReportId() {
        return exportReportId;
    }

    public void setExportReportId(String exportReportId) {
        this.exportReportId = exportReportId == null ? null : exportReportId.trim();
    }

    public BigDecimal getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(BigDecimal consignmentId) {
        this.consignmentId = consignmentId;
    }
}