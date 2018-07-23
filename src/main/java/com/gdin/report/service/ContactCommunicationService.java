package com.gdin.report.service;

import com.gdin.report.dao.ContactCommunicationMapper;
import com.gdin.report.entity.ContactCommunication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ContactCommunicationService {
    @Autowired
    private ContactCommunicationMapper contactCommunicationMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal contactCommunicationId){
        return contactCommunicationMapper.deleteByPrimaryKey(contactCommunicationId);
    }
    @Transactional
    int insert(ContactCommunication record){
        return contactCommunicationMapper.insert(record);
    }
    @Transactional
    int insertSelective(ContactCommunication record){
        return contactCommunicationMapper.insertSelective(record);
    }

    ContactCommunication selectByPrimaryKey(BigDecimal contactCommunicationId){
        return contactCommunicationMapper.selectByPrimaryKey(contactCommunicationId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ContactCommunication record){
        return contactCommunicationMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ContactCommunication record){
        return contactCommunicationMapper.updateByPrimaryKey(record);
    }
}