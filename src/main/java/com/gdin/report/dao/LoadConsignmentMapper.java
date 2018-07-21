package com.gdin.report.dao;

import com.gdin.report.entity.LoadConsignment;
import java.math.BigDecimal;

public interface LoadConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal loadConsignmentId);

    int insert(LoadConsignment record);

    int insertSelective(LoadConsignment record);

    LoadConsignment selectByPrimaryKey(BigDecimal loadConsignmentId);

    int updateByPrimaryKeySelective(LoadConsignment record);

    int updateByPrimaryKey(LoadConsignment record);
}