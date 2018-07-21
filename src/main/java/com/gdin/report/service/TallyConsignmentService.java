package com.gdin.report.service;

import com.gdin.report.dao.TallyConsignmentMapper;
import com.gdin.report.entity.TallyConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TallyConsignmentService {
    @Autowired
    private TallyConsignmentMapper tallyConsignmentMapper;


    int deleteByPrimaryKey(BigDecimal tallyConsignmentId){
        return tallyConsignmentMapper.deleteByPrimaryKey(tallyConsignmentId);
    }

    int insert(TallyConsignment record){
        return tallyConsignmentMapper.insert(record);
    }

    int insertSelective(TallyConsignment record){
        return tallyConsignmentMapper.insertSelective(record);
    }

    TallyConsignment selectByPrimaryKey(BigDecimal tallyConsignmentId){
        return tallyConsignmentMapper.selectByPrimaryKey(tallyConsignmentId);
    }

    int updateByPrimaryKeySelective(TallyConsignment record){
        return tallyConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(TallyConsignment record){
        return tallyConsignmentMapper.updateByPrimaryKey(record);
    }
}