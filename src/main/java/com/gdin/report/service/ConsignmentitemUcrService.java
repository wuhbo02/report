package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentitemUcrMapper;
import com.gdin.report.entity.ConsignmentitemUcr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsignmentitemUcrService {
    @Autowired
    private ConsignmentitemUcrMapper consignmentitemUcrMapper;


    int deleteByPrimaryKey(BigDecimal consignmentitemUcrId){
        return  consignmentitemUcrMapper.deleteByPrimaryKey(consignmentitemUcrId);
    }

    int insert(ConsignmentitemUcr record){
        return  consignmentitemUcrMapper.insert(record);
    }

    int insertSelective(ConsignmentitemUcr record){
        return  consignmentitemUcrMapper.insertSelective(record);
    }

    ConsignmentitemUcr selectByPrimaryKey(BigDecimal consignmentitemUcrId){
        return  consignmentitemUcrMapper.selectByPrimaryKey(consignmentitemUcrId);
    }

    int updateByPrimaryKeySelective(ConsignmentitemUcr record){
        return  consignmentitemUcrMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ConsignmentitemUcr record){
        return  consignmentitemUcrMapper.updateByPrimaryKey(record);
    }
}