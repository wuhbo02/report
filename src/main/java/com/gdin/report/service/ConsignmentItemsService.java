package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentItemsMapper;
import com.gdin.report.entity.ConsignmentItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsignmentItemsService {
    @Autowired
    private ConsignmentItemsMapper consignmentItemsMapper;


    int deleteByPrimaryKey(BigDecimal consignmentItemsId){
        return  consignmentItemsMapper.deleteByPrimaryKey(consignmentItemsId);
    }

    int insert(ConsignmentItems record){
        return  consignmentItemsMapper.insert(record);
    }

    int insertSelective(ConsignmentItems record){
        return  consignmentItemsMapper.insertSelective(record);
    }

    ConsignmentItems selectByPrimaryKey(BigDecimal consignmentItemsId){
        return  consignmentItemsMapper.selectByPrimaryKey(consignmentItemsId);
    }

    int updateByPrimaryKeySelective(ConsignmentItems record){
        return  consignmentItemsMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ConsignmentItems record){
        return  consignmentItemsMapper.updateByPrimaryKey(record);
    }
}