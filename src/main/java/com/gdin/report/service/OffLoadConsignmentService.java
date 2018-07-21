package com.gdin.report.service;

import com.gdin.report.dao.OffLoadConsignmentMapper;
import com.gdin.report.entity.OffLoadConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OffLoadConsignmentService {
    @Autowired
    private OffLoadConsignmentMapper offLoadConsignmentMapper;


    int deleteByPrimaryKey(BigDecimal offLoadConsignmentId){
        return offLoadConsignmentMapper.deleteByPrimaryKey(offLoadConsignmentId);
    }

    int insert(OffLoadConsignment record){
        return offLoadConsignmentMapper.insert(record);
    }

    int insertSelective(OffLoadConsignment record){
        return offLoadConsignmentMapper.insertSelective(record);
    }

    OffLoadConsignment selectByPrimaryKey(BigDecimal offLoadConsignmentId){
        return offLoadConsignmentMapper.selectByPrimaryKey(offLoadConsignmentId);
    }

    int updateByPrimaryKeySelective(OffLoadConsignment record){
        return offLoadConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(OffLoadConsignment record){
        return offLoadConsignmentMapper.updateByPrimaryKey(record);
    }
}