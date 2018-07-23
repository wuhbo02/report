package com.gdin.report.service;

import com.gdin.report.dao.CommunicationMapper;
import com.gdin.report.entity.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommunicationService {
    @Autowired
    private CommunicationMapper communicationMapper;

    @Transactional
    int deleteByPrimaryKey(String communicationId){
        return communicationMapper.deleteByPrimaryKey(communicationId);
    }
    @Transactional
    int insert(Communication record){
        return communicationMapper.insert(record);
    }
    @Transactional
    int insertSelective(Communication record){
        return communicationMapper.insertSelective(record);
    }

    Communication selectByPrimaryKey(String communicationId){
        return communicationMapper.selectByPrimaryKey(communicationId);
    }
    @Transactional
    int updateByPrimaryKeySelective(Communication record){
        return communicationMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(Communication record){
        return communicationMapper.updateByPrimaryKey(record);
    }
}