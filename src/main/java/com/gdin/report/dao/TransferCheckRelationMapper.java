package com.gdin.report.dao;

import com.gdin.report.entity.TransferCheckRelation;
import java.math.BigDecimal;

public interface TransferCheckRelationMapper {
    int deleteByPrimaryKey(BigDecimal transferCheckRelationId);

    int insert(TransferCheckRelation record);

    int insertSelective(TransferCheckRelation record);

    TransferCheckRelation selectByPrimaryKey(BigDecimal transferCheckRelationId);

    int updateByPrimaryKeySelective(TransferCheckRelation record);

    int updateByPrimaryKey(TransferCheckRelation record);
}