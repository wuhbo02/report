package com.gdin.report.service;

import com.gdin.report.dao.TallyConsignmentMapper;
import com.gdin.report.entity.TallyConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class TallyConsignmentService {
    @Autowired
    private TallyConsignmentMapper tallyConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal tallyConsignmentId){
        return tallyConsignmentMapper.deleteByPrimaryKey(tallyConsignmentId);
    }
    @Transactional
    int insert(TallyConsignment record){
        return tallyConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(TallyConsignment record){
        return tallyConsignmentMapper.insertSelective(record);
    }

    TallyConsignment selectByPrimaryKey(BigDecimal tallyConsignmentId){
        return tallyConsignmentMapper.selectByPrimaryKey(tallyConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(TallyConsignment record){
        return tallyConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(TallyConsignment record){
        return tallyConsignmentMapper.updateByPrimaryKey(record);
    }
}