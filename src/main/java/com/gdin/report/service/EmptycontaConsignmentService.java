package com.gdin.report.service;

import com.gdin.report.dao.EmptycontaConsignmentMapper;
import com.gdin.report.entity.EmptycontaConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class EmptycontaConsignmentService {
    @Autowired
    private EmptycontaConsignmentMapper emptycontaConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal emptycontaConsignmentId){
        return  emptycontaConsignmentMapper.deleteByPrimaryKey(emptycontaConsignmentId);
    }
    @Transactional
    int insert(EmptycontaConsignment record){
        return  emptycontaConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(EmptycontaConsignment record){
        return  emptycontaConsignmentMapper.insertSelective(record);
    }

    EmptycontaConsignment selectByPrimaryKey(BigDecimal emptycontaConsignmentId){
        return  emptycontaConsignmentMapper.selectByPrimaryKey(emptycontaConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(EmptycontaConsignment record){
        return  emptycontaConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(EmptycontaConsignment record){
        return  emptycontaConsignmentMapper.updateByPrimaryKey(record);
    }
}