package com.gdin.report.entity;

import java.math.BigDecimal;

public class ArrivalEquipment {
    private BigDecimal arrivalEquipmentId;

    private String arrivalReportId;

    private String transportequipmentId;

    public BigDecimal getArrivalEquipmentId() {
        return arrivalEquipmentId;
    }

    public void setArrivalEquipmentId(BigDecimal arrivalEquipmentId) {
        this.arrivalEquipmentId = arrivalEquipmentId;
    }

    public String getArrivalReportId() {
        return arrivalReportId;
    }

    public void setArrivalReportId(String arrivalReportId) {
        this.arrivalReportId = arrivalReportId == null ? null : arrivalReportId.trim();
    }

    public String getTransportequipmentId() {
        return transportequipmentId;
    }

    public void setTransportequipmentId(String transportequipmentId) {
        this.transportequipmentId = transportequipmentId == null ? null : transportequipmentId.trim();
    }
}