package com.gdin.report.service;

import com.gdin.report.dao.ExportConsignmentMapper;
import com.gdin.report.entity.ExportConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ExportConsignmentService {
    @Autowired
    private ExportConsignmentMapper exportConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal exportConsignmentId){
        return exportConsignmentMapper.deleteByPrimaryKey(exportConsignmentId);
    }
    @Transactional
    int insert(ExportConsignment record){
        return exportConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(ExportConsignment record){
        return exportConsignmentMapper.insertSelective(record);
    }

    ExportConsignment selectByPrimaryKey(BigDecimal exportConsignmentId){
        return exportConsignmentMapper.selectByPrimaryKey(exportConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ExportConsignment record){
        return exportConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ExportConsignment record){
        return exportConsignmentMapper.updateByPrimaryKey(record);
    }
}