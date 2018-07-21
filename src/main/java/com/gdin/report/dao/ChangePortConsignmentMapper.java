package com.gdin.report.dao;

import com.gdin.report.entity.ChangePortConsignment;
import java.math.BigDecimal;

public interface ChangePortConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal changePortConsignmentId);

    int insert(ChangePortConsignment record);

    int insertSelective(ChangePortConsignment record);

    ChangePortConsignment selectByPrimaryKey(BigDecimal changePortConsignmentId);

    int updateByPrimaryKeySelective(ChangePortConsignment record);

    int updateByPrimaryKey(ChangePortConsignment record);
}