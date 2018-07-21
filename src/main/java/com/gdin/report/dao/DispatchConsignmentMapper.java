package com.gdin.report.dao;

import com.gdin.report.entity.DispatchConsignment;
import java.math.BigDecimal;

public interface DispatchConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal dispatchConsignmentId);

    int insert(DispatchConsignment record);

    int insertSelective(DispatchConsignment record);

    DispatchConsignment selectByPrimaryKey(BigDecimal dispatchConsignmentId);

    int updateByPrimaryKeySelective(DispatchConsignment record);

    int updateByPrimaryKey(DispatchConsignment record);
}