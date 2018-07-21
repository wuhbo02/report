package com.gdin.report.service;

import com.gdin.report.dao.LoadConsignmentMapper;
import com.gdin.report.entity.LoadConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LoadConsignmentService {
    @Autowired
    private LoadConsignmentMapper loadConsignmentMapper;


    int deleteByPrimaryKey(BigDecimal loadConsignmentId){
        return loadConsignmentMapper.deleteByPrimaryKey(loadConsignmentId);
    }

    int insert(LoadConsignment record){
        return loadConsignmentMapper.insert(record);
    }

    int insertSelective(LoadConsignment record){
        return loadConsignmentMapper.insertSelective(record);
    }

    LoadConsignment selectByPrimaryKey(BigDecimal loadConsignmentId){
        return loadConsignmentMapper.selectByPrimaryKey(loadConsignmentId);
    }

    int updateByPrimaryKeySelective(LoadConsignment record){
        return loadConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(LoadConsignment record){
        return loadConsignmentMapper.updateByPrimaryKey(record);
    }
}