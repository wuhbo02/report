package com.gdin.report.dao;

import com.gdin.report.entity.ExportConsignment;
import java.math.BigDecimal;

public interface ExportConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal exportConsignmentId);

    int insert(ExportConsignment record);

    int insertSelective(ExportConsignment record);

    ExportConsignment selectByPrimaryKey(BigDecimal exportConsignmentId);

    int updateByPrimaryKeySelective(ExportConsignment record);

    int updateByPrimaryKey(ExportConsignment record);
}