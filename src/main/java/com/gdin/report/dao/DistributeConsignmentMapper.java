package com.gdin.report.dao;

import com.gdin.report.entity.DistributeConsignment;
import java.math.BigDecimal;

public interface DistributeConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal distributeConsignmentId);

    int insert(DistributeConsignment record);

    int insertSelective(DistributeConsignment record);

    DistributeConsignment selectByPrimaryKey(BigDecimal distributeConsignmentId);

    int updateByPrimaryKeySelective(DistributeConsignment record);

    int updateByPrimaryKey(DistributeConsignment record);
}