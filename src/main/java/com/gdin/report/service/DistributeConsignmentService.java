package com.gdin.report.service;

import com.gdin.report.dao.DistributeConsignmentMapper;
import com.gdin.report.entity.DistributeConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class DistributeConsignmentService {
    @Autowired
    private DistributeConsignmentMapper distributeConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal distributeConsignmentId){
        return  distributeConsignmentMapper.deleteByPrimaryKey(distributeConsignmentId);
    }
    @Transactional
    int insert(DistributeConsignment record){
        return  distributeConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(DistributeConsignment record){
        return  distributeConsignmentMapper.insertSelective(record);
    }

    DistributeConsignment selectByPrimaryKey(BigDecimal distributeConsignmentId){
        return  distributeConsignmentMapper.selectByPrimaryKey(distributeConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(DistributeConsignment record){
        return  distributeConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(DistributeConsignment record){
        return  distributeConsignmentMapper.updateByPrimaryKey(record);
    }
}