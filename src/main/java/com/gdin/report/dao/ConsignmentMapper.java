package com.gdin.report.dao;

import com.gdin.report.entity.Consignment;
import java.math.BigDecimal;

public interface ConsignmentMapper {
    int deleteByPrimaryKey(BigDecimal consignmentId);

    int insert(Consignment record);

    int insertSelective(Consignment record);

    Consignment selectByPrimaryKey(BigDecimal consignmentId);

    int updateByPrimaryKeySelective(Consignment record);

    int updateByPrimaryKey(Consignment record);
}