package com.gdin.report.service;

import com.gdin.report.dao.DistributeConsignmentMapper;
import com.gdin.report.entity.DistributeConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DistributeConsignmentService {
    @Autowired
    private DistributeConsignmentMapper distributeConsignmentMapper;


    int deleteByPrimaryKey(BigDecimal distributeConsignmentId){
        return  distributeConsignmentMapper.deleteByPrimaryKey(distributeConsignmentId);
    }

    int insert(DistributeConsignment record){
        return  distributeConsignmentMapper.insert(record);
    }

    int insertSelective(DistributeConsignment record){
        return  distributeConsignmentMapper.insertSelective(record);
    }

    DistributeConsignment selectByPrimaryKey(BigDecimal distributeConsignmentId){
        return  distributeConsignmentMapper.selectByPrimaryKey(distributeConsignmentId);
    }

    int updateByPrimaryKeySelective(DistributeConsignment record){
        return  distributeConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(DistributeConsignment record){
        return  distributeConsignmentMapper.updateByPrimaryKey(record);
    }
}