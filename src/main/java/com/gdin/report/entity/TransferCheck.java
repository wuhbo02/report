package com.gdin.report.entity;

public class TransferCheck {
    private String transferCheckId;

    private String declarationofficeid;

    private String messageid;

    private String messagetype;

    public String getTransferCheckId() {
        return transferCheckId;
    }

    public void setTransferCheckId(String transferCheckId) {
        this.transferCheckId = transferCheckId == null ? null : transferCheckId.trim();
    }

    public String getDeclarationofficeid() {
        return declarationofficeid;
    }

    public void setDeclarationofficeid(String declarationofficeid) {
        this.declarationofficeid = declarationofficeid == null ? null : declarationofficeid.trim();
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