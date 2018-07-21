package com.gdin.report.dao;

import com.gdin.report.entity.ChgTransportConsignment;
import java.math.BigDecimal;

public interface ChgTransportConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal chgTransportConsignmentId);

    int insert(ChgTransportConsignment record);

    int insertSelective(ChgTransportConsignment record);

    ChgTransportConsignment selectByPrimaryKey(BigDecimal chgTransportConsignmentId);

    int updateByPrimaryKeySelective(ChgTransportConsignment record);

    int updateByPrimaryKey(ChgTransportConsignment record);
}