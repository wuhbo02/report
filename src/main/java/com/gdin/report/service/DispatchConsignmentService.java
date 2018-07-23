package com.gdin.report.service;

import com.gdin.report.dao.DispatchConsignmentMapper;
import com.gdin.report.entity.DispatchConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class DispatchConsignmentService {
    @Autowired
    private DispatchConsignmentMapper dispatchConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal dispatchConsignmentId){
        return  dispatchConsignmentMapper.deleteByPrimaryKey(dispatchConsignmentId);
    }
    @Transactional
    int insert(DispatchConsignment record){
        return  dispatchConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(DispatchConsignment record){
        return  dispatchConsignmentMapper.insertSelective(record);
    }


    DispatchConsignment selectByPrimaryKey(BigDecimal dispatchConsignmentId){
        return  dispatchConsignmentMapper.selectByPrimaryKey(dispatchConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(DispatchConsignment record){
        return  dispatchConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(DispatchConsignment record){
        return  dispatchConsignmentMapper.updateByPrimaryKey(record);
    }
}