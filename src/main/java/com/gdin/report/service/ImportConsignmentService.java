package com.gdin.report.service;

import com.gdin.report.dao.ImportConsignmentMapper;
import com.gdin.report.entity.ImportConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ImportConsignmentService {
    @Autowired
    private ImportConsignmentMapper importConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal importConsignmentId){
        return importConsignmentMapper.deleteByPrimaryKey(importConsignmentId);
    }
    @Transactional
    int insert(ImportConsignment record){
        return importConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(ImportConsignment record){
        return importConsignmentMapper.insertSelective(record);
    }

    ImportConsignment selectByPrimaryKey(BigDecimal importConsignmentId){
        return importConsignmentMapper.selectByPrimaryKey(importConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ImportConsignment record){
        return importConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ImportConsignment record){
        return importConsignmentMapper.updateByPrimaryKey(record);
    }
}