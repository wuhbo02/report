package com.gdin.report.entity;

import java.math.BigDecimal;

public class TallyReport {
    private String tallyReportId;

    private String declarationofficeid;

    private BigDecimal bordertransportmeansId;

    private String tallypartyid;

    private String contactId;

    private String additionalinformation;

    private String messageid;

    private String messagetype;

    public String getTallyReportId() {
        return tallyReportId;
    }

    public void setTallyReportId(String tallyReportId) {
        this.tallyReportId = tallyReportId == null ? null : tallyReportId.trim();
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

    public String getTallypartyid() {
        return tallypartyid;
    }

    public void setTallypartyid(String tallypartyid) {
        this.tallypartyid = tallypartyid == null ? null : tallypartyid.trim();
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId == null ? null : contactId.trim();
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