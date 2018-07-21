package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentCuststatuscodeMapper;
import com.gdin.report.entity.ConsignmentCuststatuscode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsignmentCuststatuscodeService {
    @Autowired
    private ConsignmentCuststatuscodeMapper consignmentCuststatuscodeMapper;


    int deleteByPrimaryKey(BigDecimal consignmentCuststatuscodeId){
        return consignmentCuststatuscodeMapper.deleteByPrimaryKey(consignmentCuststatuscodeId);
    }

    int insert(ConsignmentCuststatuscode record){
        return consignmentCuststatuscodeMapper.insert(record);
    }

    int insertSelective(ConsignmentCuststatuscode record){
        return consignmentCuststatuscodeMapper.insertSelective(record);
    }

    ConsignmentCuststatuscode selectByPrimaryKey(BigDecimal consignmentCuststatuscodeId){
        return consignmentCuststatuscodeMapper.selectByPrimaryKey(consignmentCuststatuscodeId);
    }

    int updateByPrimaryKeySelective(ConsignmentCuststatuscode record){
        return consignmentCuststatuscodeMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ConsignmentCuststatuscode record){
        return consignmentCuststatuscodeMapper.updateByPrimaryKey(record);
    }
}