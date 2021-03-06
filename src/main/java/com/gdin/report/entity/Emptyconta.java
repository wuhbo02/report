package com.gdin.report.entity;

import java.math.BigDecimal;

public class Emptyconta {
    private String emptycontaId;

    private String representativepersonname;

    private String declarationofficeid;

    private BigDecimal bordertransportmeansId;

    private String additionalinformation;

    private String messageid;

    private String messagetype;

    public String getEmptycontaId() {
        return emptycontaId;
    }

    public void setEmptycontaId(String emptycontaId) {
        this.emptycontaId = emptycontaId == null ? null : emptycontaId.trim();
    }

    public String getRepresentativepersonname() {
        return representativepersonname;
    }

    public void setRepresentativepersonname(String representativepersonname) {
        this.representativepersonname = representativepersonname == null ? null : representativepersonname.trim();
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