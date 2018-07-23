package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentRoutcountryMapper;
import com.gdin.report.entity.ConsignmentRoutcountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentRoutcountryService {
    @Autowired
    private ConsignmentRoutcountryMapper consignmentRoutcountryMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentRoutcountryId){
        return  consignmentRoutcountryMapper.deleteByPrimaryKey(consignmentRoutcountryId);
    }
    @Transactional
    int insert(ConsignmentRoutcountry record){
        return  consignmentRoutcountryMapper.insert(record);
    }
    @Transactional
    int insertSelective(ConsignmentRoutcountry record){
        return  consignmentRoutcountryMapper.insertSelective(record);
    }

    ConsignmentRoutcountry selectByPrimaryKey(BigDecimal consignmentRoutcountryId){
        return  consignmentRoutcountryMapper.selectByPrimaryKey(consignmentRoutcountryId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ConsignmentRoutcountry record){
        return  consignmentRoutcountryMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ConsignmentRoutcountry record){
        return  consignmentRoutcountryMapper.updateByPrimaryKey(record);
    }
}