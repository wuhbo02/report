package com.gdin.report.service;

import com.gdin.report.dao.ChangePortConsignmentMapper;
import com.gdin.report.entity.ChangePortConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ChangePortConsignmentService {
    @Autowired
    private ChangePortConsignmentMapper changePortConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal changePortConsignmentId){
        return changePortConsignmentMapper.deleteByPrimaryKey(changePortConsignmentId);
    }

    @Transactional
    int insert(ChangePortConsignment record){
        return changePortConsignmentMapper.insert(record);
    }

    @Transactional
    int insertSelective(ChangePortConsignment record){
        return changePortConsignmentMapper.insertSelective(record);
    }

    ChangePortConsignment selectByPrimaryKey(BigDecimal changePortConsignmentId){
        return changePortConsignmentMapper.selectByPrimaryKey(changePortConsignmentId);
    }

    @Transactional
    int updateByPrimaryKeySelective(ChangePortConsignment record){
        return changePortConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(ChangePortConsignment record){
        return changePortConsignmentMapper.updateByPrimaryKey(record);
    }
}
