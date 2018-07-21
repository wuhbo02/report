package com.gdin.report.service;

import com.gdin.report.dao.ImportConsignmentMapper;
import com.gdin.report.entity.ImportConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ImportConsignmentService {
    @Autowired
    private ImportConsignmentMapper importConsignmentMapper;


    int deleteByPrimaryKey(BigDecimal importConsignmentId){
        return importConsignmentMapper.deleteByPrimaryKey(importConsignmentId);
    }

    int insert(ImportConsignment record){
        return importConsignmentMapper.insert(record);
    }

    int insertSelective(ImportConsignment record){
        return importConsignmentMapper.insertSelective(record);
    }

    ImportConsignment selectByPrimaryKey(BigDecimal importConsignmentId){
        return importConsignmentMapper.selectByPrimaryKey(importConsignmentId);
    }

    int updateByPrimaryKeySelective(ImportConsignment record){
        return importConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ImportConsignment record){
        return importConsignmentMapper.updateByPrimaryKey(record);
    }
}