package com.gdin.report.service;

import com.gdin.report.dao.CommunicationMapper;
import com.gdin.report.entity.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunicationService {
    @Autowired
    private CommunicationMapper communicationMapper;


    int deleteByPrimaryKey(String communicationId){
        return communicationMapper.deleteByPrimaryKey(communicationId);
    }

    int insert(Communication record){
        return communicationMapper.insert(record);
    }

    int insertSelective(Communication record){
        return communicationMapper.insertSelective(record);
    }

    Communication selectByPrimaryKey(String communicationId){
        return communicationMapper.selectByPrimaryKey(communicationId);
    }

    int updateByPrimaryKeySelective(Communication record){
        return communicationMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Communication record){
        return communicationMapper.updateByPrimaryKey(record);
    }
}