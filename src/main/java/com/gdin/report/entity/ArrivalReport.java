package com.gdin.report.entity;

import java.math.BigDecimal;

public class ArrivalReport {
    private String arrivalReportId;

    private String declarationofficeid;

    private BigDecimal bordertransportmeansId;

    private String unloadinglocationid;

    private String arrivaldate;

    private String additionalinformation;

    private String messageid;

    private String messagetype;

    public String getArrivalReportId() {
        return arrivalReportId;
    }

    public void setArrivalReportId(String arrivalReportId) {
        this.arrivalReportId = arrivalReportId == null ? null : arrivalReportId.trim();
    }

    public String getDeclarationofficeid() {
        return declarationofficeid;
    }

    public void setDeclarationofficeid(String declarationofficeid) {
        this.declarationofficeid = declarationofficeid == null ? null : declarationofficeid.trim();
    }

    public BigDecimal getBordertransportmeansId() {
        return bordertransportmeansId;
    }

    public void setBordertransportmeansId(BigDecimal bordertransportmeansId) {
        this.bordertransportmeansId = bordertransportmeansId;
    }

    public String getUnloadinglocationid() {
        return unloadinglocationid;
    }

    public void setUnloadinglocationid(String unloadinglocationid) {
        this.unloadinglocationid = unloadinglocationid == null ? null : unloadinglocationid.trim();
    }

    public String getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(String arrivaldate) {
        this.arrivaldate = arrivaldate == null ? null : arrivaldate.trim();
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