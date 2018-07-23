package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentitemUcrMapper;
import com.gdin.report.entity.ConsignmentitemUcr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentitemUcrService {
    @Autowired
    private ConsignmentitemUcrMapper consignmentitemUcrMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentitemUcrId){
        return  consignmentitemUcrMapper.deleteByPrimaryKey(consignmentitemUcrId);
    }
    @Transactional
    int insert(ConsignmentitemUcr record){
        return  consignmentitemUcrMapper.insert(record);
    }
    @Transactional
    int insertSelective(ConsignmentitemUcr record){
        return  consignmentitemUcrMapper.insertSelective(record);
    }

    ConsignmentitemUcr selectByPrimaryKey(BigDecimal consignmentitemUcrId){
        return  consignmentitemUcrMapper.selectByPrimaryKey(consignmentitemUcrId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ConsignmentitemUcr record){
        return  consignmentitemUcrMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ConsignmentitemUcr record){
        return  consignmentitemUcrMapper.updateByPrimaryKey(record);
    }
}