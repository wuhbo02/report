package com.gdin.report.service;

import com.gdin.report.dao.LoadConsignmentMapper;
import com.gdin.report.entity.LoadConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LoadConsignmentService {
    @Autowired
    private LoadConsignmentMapper loadConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal loadConsignmentId){
        return loadConsignmentMapper.deleteByPrimaryKey(loadConsignmentId);
    }
    @Transactional
    int insert(LoadConsignment record){
        return loadConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(LoadConsignment record){
        return loadConsignmentMapper.insertSelective(record);
    }

    LoadConsignment selectByPrimaryKey(BigDecimal loadConsignmentId){
        return loadConsignmentMapper.selectByPrimaryKey(loadConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(LoadConsignment record){
        return loadConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(LoadConsignment record){
        return loadConsignmentMapper.updateByPrimaryKey(record);
    }
}