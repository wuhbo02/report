package com.gdin.report.entity;

import java.math.BigDecimal;

public class TransferCheckRelation {
    private BigDecimal transferCheckRelationId;

    private String transferCheckId;

    private String importReportId;

    private String exportReportId;

    private String additionalinformation;

    public BigDecimal getTransferCheckRelationId() {
        return transferCheckRelationId;
    }

    public void setTransferCheckRelationId(BigDecimal transferCheckRelationId) {
        this.transferCheckRelationId = transferCheckRelationId;
    }

    public String getTransferCheckId() {
        return transferCheckId;
    }

    public void setTransferCheckId(String transferCheckId) {
        this.transferCheckId = transferCheckId == null ? null : transferCheckId.trim();
    }

    public String getImportReportId() {
        return importReportId;
    }

    public void setImportReportId(String importReportId) {
        this.importReportId = importReportId == null ? null : importReportId.trim();
    }

    public String getExportReportId() {
        return exportReportId;
    }

    public void setExportReportId(String exportReportId) {
        this.exportReportId = exportReportId == null ? null : exportReportId.trim();
    }

    public String getAdditionalinformation() {
        return additionalinformation;
    }

    public void setAdditionalinformation(String additionalinformation) {
        this.additionalinformation = additionalinformation == null ? null : additionalinformation.trim();
    }
}