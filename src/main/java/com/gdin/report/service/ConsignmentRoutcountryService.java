package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentRoutcountryMapper;
import com.gdin.report.entity.ConsignmentRoutcountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsignmentRoutcountryService {
    @Autowired
    private ConsignmentRoutcountryMapper consignmentRoutcountryMapper;


    int deleteByPrimaryKey(BigDecimal consignmentRoutcountryId){
        return  consignmentRoutcountryMapper.deleteByPrimaryKey(consignmentRoutcountryId);
    }

    int insert(ConsignmentRoutcountry record){
        return  consignmentRoutcountryMapper.insert(record);
    }

    int insertSelective(ConsignmentRoutcountry record){
        return  consignmentRoutcountryMapper.insertSelective(record);
    }

    ConsignmentRoutcountry selectByPrimaryKey(BigDecimal consignmentRoutcountryId){
        return  consignmentRoutcountryMapper.selectByPrimaryKey(consignmentRoutcountryId);
    }

    int updateByPrimaryKeySelective(ConsignmentRoutcountry record){
        return  consignmentRoutcountryMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ConsignmentRoutcountry record){
        return  consignmentRoutcountryMapper.updateByPrimaryKey(record);
    }
}