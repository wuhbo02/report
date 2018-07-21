package com.gdin.report.entity;

import java.math.BigDecimal;

public class LoadReport {
    private String loadReportId;

    private String carrierid;

    private BigDecimal bordertransportmeansId;

    private String additionalinformation;

    private String messageid;

    private String messagetype;

    public String getLoadReportId() {
        return loadReportId;
    }

    public void setLoadReportId(String loadReportId) {
        this.loadReportId = loadReportId == null ? null : loadReportId.trim();
    }

    public String getCarrierid() {
        return carrierid;
    }

    public void setCarrierid(String carrierid) {
        this.carrierid = carrierid == null ? null : carrierid.trim();
    }

    public BigDecimal getBordertransportmeansId() {
        return bordertransportmeansId;
    }

    public void setBordertransportmeansId(BigDecimal bordertransportmeansId) {
        this.bordertransportmeansId = bordertransportmeansId;
    }

    public String getAdditionalinformation() {
        return additionalinformation;
    }

    public void setAdditionalinformation(String additionalinformation) {
        this.additionalinformation = additionalinformation == null ? null : additionalinformation.trim();
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getMessagetype() {
        return messagetype;
    }

    public void setMessagetype(String messagetype) {
        this.messagetype = messagetype == null ? null : messagetype.trim();
    }
}