package com.gdin.report.entity;

import java.math.BigDecimal;

public class ContactCommunication {
    private BigDecimal contactCommunicationId;

    private String contactId;

    private String communicationId;

    public BigDecimal getContactCommunicationId() {
        return contactCommunicationId;
    }

    public void setContactCommunicationId(BigDecimal contactCommunicationId) {
        this.contactCommunicationId = contactCommunicationId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId == null ? null : contactId.trim();
    }

    public String getCommunicationId() {
        return communicationId;
    }

    public void setCommunicationId(String communicationId) {
        this.communicationId = communicationId == null ? null : communicationId.trim();
    }
}