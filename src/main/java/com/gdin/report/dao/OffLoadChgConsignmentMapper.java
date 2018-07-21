package com.gdin.report.dao;

import com.gdin.report.entity.OffLoadChgConsignment;
import java.math.BigDecimal;

public interface OffLoadChgConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal offLoadChgConsignmentId);

    int insert(OffLoadChgConsignment record);

    int insertSelective(OffLoadChgConsignment record);

    OffLoadChgConsignment selectByPrimaryKey(BigDecimal offLoadChgConsignmentId);

    int updateByPrimaryKeySelective(OffLoadChgConsignment record);

    int updateByPrimaryKey(OffLoadChgConsignment record);
}