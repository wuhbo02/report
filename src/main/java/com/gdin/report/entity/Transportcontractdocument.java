package com.gdin.report.entity;

public class Transportcontractdocument {
    private String transportcontractdocumentId;

    private String changereasoncode;

    private String conditioncode;

    private String deconsolidator;

    public String getTransportcontractdocumentId() {
        return transportcontractdocumentId;
    }

    public void setTransportcontractdocumentId(String transportcontractdocumentId) {
        this.transportcontractdocumentId = transportcontractdocumentId == null ? null : transportcontractdocumentId.trim();
    }

    public String getChangereasoncode() {
        return changereasoncode;
    }

    public void setChangereasoncode(String changereasoncode) {
        this.changereasoncode = changereasoncode == null ? null : changereasoncode.trim();
    }

    public String getConditioncode() {
        return conditioncode;
    }

    public void setConditioncode(String conditioncode) {
        this.conditioncode = conditioncode == null ? null : conditioncode.trim();
    }

    public String getDeconsolidator() {
        return deconsolidator;
    }

    public void setDeconsolidator(String deconsolidator) {
        this.deconsolidator = deconsolidator == null ? null : deconsolidator.trim();
    }
}