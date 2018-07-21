package com.gdin.report.service;

import com.gdin.report.dao.DispatchConsignmentMapper;
import com.gdin.report.entity.DispatchConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DispatchConsignmentService {
    @Autowired
    private DispatchConsignmentMapper dispatchConsignmentMapper;


    int deleteByPrimaryKey(BigDecimal dispatchConsignmentId){
        return  dispatchConsignmentMapper.deleteByPrimaryKey(dispatchConsignmentId);
    }

    int insert(DispatchConsignment record){
        return  dispatchConsignmentMapper.insert(record);
    }

    int insertSelective(DispatchConsignment record){
        return  dispatchConsignmentMapper.insertSelective(record);
    }


    DispatchConsignment selectByPrimaryKey(BigDecimal dispatchConsignmentId){
        return  dispatchConsignmentMapper.selectByPrimaryKey(dispatchConsignmentId);
    }

    int updateByPrimaryKeySelective(DispatchConsignment record){
        return  dispatchConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(DispatchConsignment record){
        return  dispatchConsignmentMapper.updateByPrimaryKey(record);
    }
}