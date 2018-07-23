package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentMapper;
import com.gdin.report.entity.Consignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentService {
    @Autowired
    private ConsignmentMapper consignmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentId){
        return  consignmentMapper.deleteByPrimaryKey(consignmentId);
    }
    @Transactional
    int insert(Consignment record){
        return  consignmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(Consignment record){
        return  consignmentMapper.insertSelective(record);
    }

    Consignment selectByPrimaryKey(BigDecimal consignmentId){
        return  consignmentMapper.selectByPrimaryKey(consignmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(Consignment record){
        return  consignmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(Consignment record){
        return  consignmentMapper.updateByPrimaryKey(record);
    }
}