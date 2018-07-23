package com.gdin.report.service;

import com.gdin.report.dao.ArrivalConsignmentMapper;
import com.gdin.report.entity.ArrivalConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ArrivalConsignmentService {
    @Autowired
    private ArrivalConsignmentMapper arrivalConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal arrivalConsignmentId){
        return arrivalConsignmentMapper.deleteByPrimaryKey(arrivalConsignmentId);
    }

    @Transactional
    int insert(ArrivalConsignment record){
        return arrivalConsignmentMapper.insert(record);
    }

    @Transactional
    int insertSelective(ArrivalConsignment record){
        return arrivalConsignmentMapper.insertSelective(record);
    }

    ArrivalConsignment selectByPrimaryKey(BigDecimal arrivalConsignmentId){
        return arrivalConsignmentMapper.selectByPrimaryKey(arrivalConsignmentId);
    }

    @Transactional
    int updateByPrimaryKeySelective(ArrivalConsignment record){
        return arrivalConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(ArrivalConsignment record){
        return arrivalConsignmentMapper.updateByPrimaryKey(record);
    }
}
