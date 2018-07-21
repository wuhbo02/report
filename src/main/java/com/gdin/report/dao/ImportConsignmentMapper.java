package com.gdin.report.dao;

import com.gdin.report.entity.ImportConsignment;
import java.math.BigDecimal;

public interface ImportConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal importConsignmentId);

    int insert(ImportConsignment record);

    int insertSelective(ImportConsignment record);

    ImportConsignment selectByPrimaryKey(BigDecimal importConsignmentId);

    int updateByPrimaryKeySelective(ImportConsignment record);

    int updateByPrimaryKey(ImportConsignment record);
}