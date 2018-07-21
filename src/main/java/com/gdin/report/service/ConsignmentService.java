package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentMapper;
import com.gdin.report.entity.Consignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsignmentService {
    @Autowired
    private ConsignmentMapper consignmentMapper;


    int deleteByPrimaryKey(BigDecimal consignmentId){
        return  consignmentMapper.deleteByPrimaryKey(consignmentId);
    }

    int insert(Consignment record){
        return  consignmentMapper.insert(record);
    }

    int insertSelective(Consignment record){
        return  consignmentMapper.insertSelective(record);
    }

    Consignment selectByPrimaryKey(BigDecimal consignmentId){
        return  consignmentMapper.selectByPrimaryKey(consignmentId);
    }

    int updateByPrimaryKeySelective(Consignment record){
        return  consignmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Consignment record){
        return  consignmentMapper.updateByPrimaryKey(record);
    }
}