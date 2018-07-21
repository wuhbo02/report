package com.gdin.report.service;

import com.gdin.report.dao.ArrivalConsignmentMapper;
import com.gdin.report.entity.ArrivalConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ArrivalConsignmentService {
    @Autowired
    private ArrivalConsignmentMapper arrivalConsignmentMapper;

    int deleteByPrimaryKey(BigDecimal arrivalConsignmentId){
        return arrivalConsignmentMapper.deleteByPrimaryKey(arrivalConsignmentId);
    }

    int insert(ArrivalConsignment record){
        return arrivalConsignmentMapper.insert(record);
    }

    int insertSelective(ArrivalConsignment record){
        return arrivalConsignmentMapper.insertSelective(record);
    }

    ArrivalConsignment selectByPrimaryKey(BigDecimal arrivalConsignmentId){
        return arrivalConsignmentMapper.selectByPrimaryKey(arrivalConsignmentId);
    }

    int updateByPrimaryKeySelective(ArrivalConsignment record){
        return arrivalConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ArrivalConsignment record){
        return arrivalConsignmentMapper.updateByPrimaryKey(record);
    }
}
