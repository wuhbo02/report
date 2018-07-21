package com.gdin.report.dao;

import com.gdin.report.entity.ArrivalConsignment;
import java.math.BigDecimal;

public interface ArrivalConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal arrivalConsignmentId);

    int insert(ArrivalConsignment record);

    int insertSelective(ArrivalConsignment record);

    ArrivalConsignment selectByPrimaryKey(BigDecimal arrivalConsignmentId);

    int updateByPrimaryKeySelective(ArrivalConsignment record);

    int updateByPrimaryKey(ArrivalConsignment record);
}