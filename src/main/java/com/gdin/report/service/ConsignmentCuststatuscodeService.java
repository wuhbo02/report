package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentCuststatuscodeMapper;
import com.gdin.report.entity.ConsignmentCuststatuscode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentCuststatuscodeService {
    @Autowired
    private ConsignmentCuststatuscodeMapper consignmentCuststatuscodeMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentCuststatuscodeId){
        return consignmentCuststatuscodeMapper.deleteByPrimaryKey(consignmentCuststatuscodeId);
    }
    @Transactional
    int insert(ConsignmentCuststatuscode record){
        return consignmentCuststatuscodeMapper.insert(record);
    }
    @Transactional
    int insertSelective(ConsignmentCuststatuscode record){
        return consignmentCuststatuscodeMapper.insertSelective(record);
    }

    ConsignmentCuststatuscode selectByPrimaryKey(BigDecimal consignmentCuststatuscodeId){
        return consignmentCuststatuscodeMapper.selectByPrimaryKey(consignmentCuststatuscodeId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ConsignmentCuststatuscode record){
        return consignmentCuststatuscodeMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ConsignmentCuststatuscode record){
        return consignmentCuststatuscodeMapper.updateByPrimaryKey(record);
    }
}