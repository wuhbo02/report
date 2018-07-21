package com.gdin.report.service;

import com.gdin.report.dao.TransferCheckRelationMapper;
import com.gdin.report.entity.TransferCheckRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferCheckRelationService {
    @Autowired
    private TransferCheckRelationMapper transferCheckRelationMapper;

    int deleteByPrimaryKey(BigDecimal transferCheckRelationId){
        return  transferCheckRelationMapper.deleteByPrimaryKey(transferCheckRelationId);
    }

    int insert(TransferCheckRelation record){
        return transferCheckRelationMapper.insert(record);
    }

    int insertSelective(TransferCheckRelation record){
        return  transferCheckRelationMapper.insertSelective(record);
    }

    TransferCheckRelation selectByPrimaryKey(BigDecimal transferCheckRelationId){
        return  transferCheckRelationMapper.selectByPrimaryKey(transferCheckRelationId);
    }

    int updateByPrimaryKeySelective(TransferCheckRelation record){
        return  transferCheckRelationMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(TransferCheckRelation record){
        return  transferCheckRelationMapper.updateByPrimaryKey(record);
    }
}