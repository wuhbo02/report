package com.gdin.report.service;

import com.gdin.report.dao.ChgTransportConsignmentMapper;
import com.gdin.report.entity.ChgTransportConsignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ChgTransportConsignmentService {
    @Autowired
    private ChgTransportConsignmentMapper chgTransportConsignmentMapper;

    int deleteByPrimaryKey(BigDecimal chgTransportConsignmentId){
        return chgTransportConsignmentMapper.deleteByPrimaryKey(chgTransportConsignmentId);
    }

    int insert(ChgTransportConsignment record){
        return chgTransportConsignmentMapper.insert(record);
    }

    int insertSelective(ChgTransportConsignment record){
        return  chgTransportConsignmentMapper.insertSelective(record);
    }

    ChgTransportConsignment selectByPrimaryKey(BigDecimal chgTransportConsignmentId){
        return chgTransportConsignmentMapper.selectByPrimaryKey(chgTransportConsignmentId);
    }

    int updateByPrimaryKeySelective(ChgTransportConsignment record){
        return  chgTransportConsignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ChgTransportConsignment record){
        return chgTransportConsignmentMapper.updateByPrimaryKey(record);
    }
}