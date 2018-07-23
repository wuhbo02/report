package com.gdin.report.service;

import com.gdin.report.dao.OffLoadChgConsignmentMapper;
import com.gdin.report.entity.OffLoadChgConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class OffLoadChgConsignmentService {
    @Autowired
    private OffLoadChgConsignmentMapper offLoadChgConsignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal offLoadChgConsignmentId){
        return  offLoadChgConsignmentMapper.deleteByPrimaryKey(offLoadChgConsignmentId);
    }
    @Transactional
    int insert(OffLoadChgConsignment record){
        return  offLoadChgConsignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(OffLoadChgConsignment record){
        return  offLoadChgConsignmentMapper.insertSelective(record);
    }

    OffLoadChgConsignment selectByPrimaryKey(BigDecimal offLoadChgConsignmentId){
        return  offLoadChgConsignmentMapper.selectByPrimaryKey(offLoadChgConsignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(OffLoadChgConsignment record){
        return  offLoadChgConsignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(OffLoadChgConsignment record){
        return  offLoadChgConsignmentMapper.updateByPrimaryKey(record);
    }
}