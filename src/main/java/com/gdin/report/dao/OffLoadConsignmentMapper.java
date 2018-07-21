package com.gdin.report.dao;

import com.gdin.report.entity.OffLoadConsignment;
import java.math.BigDecimal;

public interface OffLoadConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal offLoadConsignmentId);

    int insert(OffLoadConsignment record);

    int insertSelective(OffLoadConsignment record);

    OffLoadConsignment selectByPrimaryKey(BigDecimal offLoadConsignmentId);

    int updateByPrimaryKeySelective(OffLoadConsignment record);

    int updateByPrimaryKey(OffLoadConsignment record);
}