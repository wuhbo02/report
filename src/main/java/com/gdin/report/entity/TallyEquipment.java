package com.gdin.report.entity;

import java.math.BigDecimal;

public class TallyEquipment {
    private BigDecimal tallyEquipmentId;

    private String tallyReportId;

    private String transportequipmentId;

    public BigDecimal getTallyEquipmentId() {
        return tallyEquipmentId;
    }

    public void setTallyEquipmentId(BigDecimal tallyEquipmentId) {
        this.tallyEquipmentId = tallyEquipmentId;
    }

    public String getTallyReportId() {
        return tallyReportId;
    }

    public void setTallyReportId(String tallyReportId) {
        this.tallyReportId = tallyReportId == null ? null : tallyReportId.trim();
    }

    public String getTransportequipmentId() {
        return transportequipmentId;
    }

    public void setTransportequipmentId(String transportequipmentId) {
        this.transportequipmentId = transportequipmentId == null ? null : transportequipmentId.trim();
    }
}