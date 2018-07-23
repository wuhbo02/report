package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentitemMapper;
import com.gdin.report.entity.Consignmentitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentitemService {
    @Autowired
    private ConsignmentitemMapper consignmentitemMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentitemId){
        return consignmentitemMapper.deleteByPrimaryKey(consignmentitemId);
    }
    @Transactional
    int insert(Consignmentitem record){
        return consignmentitemMapper.insert(record);
    }
    @Transactional
    int insertSelective(Consignmentitem record){
        return consignmentitemMapper.insertSelective(record);
    }

    Consignmentitem selectByPrimaryKey(BigDecimal consignmentitemId){
        return consignmentitemMapper.selectByPrimaryKey(consignmentitemId);
    }
    @Transactional
    int updateByPrimaryKeySelective(Consignmentitem record){
        return consignmentitemMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(Consignmentitem record){
        return consignmentitemMapper.updateByPrimaryKey(record);
    }
}