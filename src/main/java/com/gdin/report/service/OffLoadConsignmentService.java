package com.gdin.report.service;

import com.gdin.report.dao.OffLoadConsignmentMapper;
import com.gdin.report.entity.OffLoadConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class OffLoadConsignmentService {
    @Autowired
    private OffLoadConsignmentMapper offLoadConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal offLoadConsignmentId){
        return offLoadConsignmentMapper.deleteByPrimaryKey(offLoadConsignmentId);
    }
    @Transactional
    int insert(OffLoadConsignment record){
        return offLoadConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(OffLoadConsignment record){
        return offLoadConsignmentMapper.insertSelective(record);
    }

    OffLoadConsignment selectByPrimaryKey(BigDecimal offLoadConsignmentId){
        return offLoadConsignmentMapper.selectByPrimaryKey(offLoadConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(OffLoadConsignment record){
        return offLoadConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(OffLoadConsignment record){
        return offLoadConsignmentMapper.updateByPrimaryKey(record);
    }
}