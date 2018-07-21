package com.gdin.report.entity;

import java.math.BigDecimal;

public class OffLoad {
    private String offLoadId;

    private BigDecimal bordertransportmeansId;

    private String additionalinformation;

    private String messageid;

    private String messagetype;

    public String getOffLoadId() {
        return offLoadId;
    }

    public void setOffLoadId(String offLoadId) {
        this.offLoadId = offLoadId == null ? null : offLoadId.trim();
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