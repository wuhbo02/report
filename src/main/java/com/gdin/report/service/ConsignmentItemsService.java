package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentItemsMapper;
import com.gdin.report.entity.ConsignmentItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentItemsService {
    @Autowired
    private ConsignmentItemsMapper consignmentItemsMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentItemsId){
        return  consignmentItemsMapper.deleteByPrimaryKey(consignmentItemsId);
    }
    @Transactional
    int insert(ConsignmentItems record){
        return  consignmentItemsMapper.insert(record);
    }
    @Transactional
    int insertSelective(ConsignmentItems record){
        return  consignmentItemsMapper.insertSelective(record);
    }

    ConsignmentItems selectByPrimaryKey(BigDecimal consignmentItemsId){
        return  consignmentItemsMapper.selectByPrimaryKey(consignmentItemsId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ConsignmentItems record){
        return  consignmentItemsMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ConsignmentItems record){
        return  consignmentItemsMapper.updateByPrimaryKey(record);
    }
}