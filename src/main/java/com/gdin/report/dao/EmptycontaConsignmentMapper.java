package com.gdin.report.dao;

import com.gdin.report.entity.EmptycontaConsignment;
import java.math.BigDecimal;

public interface EmptycontaConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal emptycontaConsignmentId);

    int insert(EmptycontaConsignment record);

    int insertSelective(EmptycontaConsignment record);

    EmptycontaConsignment selectByPrimaryKey(BigDecimal emptycontaConsignmentId);

    int updateByPrimaryKeySelective(EmptycontaConsignment record);

    int updateByPrimaryKey(EmptycontaConsignment record);
}