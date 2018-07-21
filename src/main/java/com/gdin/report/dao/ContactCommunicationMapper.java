package com.gdin.report.dao;

import com.gdin.report.entity.ContactCommunication;
import java.math.BigDecimal;

public interface ContactCommunicationMapper {
    int deleteByPrimaryKey(BigDecimal contactCommunicationId);

    int insert(ContactCommunication record);

    int insertSelective(ContactCommunication record);

    ContactCommunication selectByPrimaryKey(BigDecimal contactCommunicationId);

    int updateByPrimaryKeySelective(ContactCommunication record);

    int updateByPrimaryKey(ContactCommunication record);
}