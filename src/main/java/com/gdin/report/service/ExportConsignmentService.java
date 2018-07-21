package com.gdin.report.service;

import com.gdin.report.dao.ExportConsignmentMapper;
import com.gdin.report.entity.ExportConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ExportConsignmentService {
    @Autowired
    private ExportConsignmentMapper exportConsignmentMapper;


    int deleteByPrimaryKey(BigDecimal exportConsignmentId){
        return exportConsignmentMapper.deleteByPrimaryKey(exportConsignmentId);
    }

    int insert(ExportConsignment record){
        return exportConsignmentMapper.insert(record);
    }

    int insertSelective(ExportConsignment record){
        return exportConsignmentMapper.insertSelective(record);
    }

    ExportConsignment selectByPrimaryKey(BigDecimal exportConsignmentId){
        return exportConsignmentMapper.selectByPrimaryKey(exportConsignmentId);
    }

    int updateByPrimaryKeySelective(ExportConsignment record){
        return exportConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ExportConsignment record){
        return exportConsignmentMapper.updateByPrimaryKey(record);
    }
}