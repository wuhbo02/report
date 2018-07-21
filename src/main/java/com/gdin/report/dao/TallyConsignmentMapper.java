package com.gdin.report.dao;

import com.gdin.report.entity.TallyConsignment;
import java.math.BigDecimal;

public interface TallyConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal tallyConsignmentId);

    int insert(TallyConsignment record);

    int insertSelective(TallyConsignment record);

    TallyConsignment selectByPrimaryKey(BigDecimal tallyConsignmentId);

    int updateByPrimaryKeySelective(TallyConsignment record);

    int updateByPrimaryKey(TallyConsignment record);
}