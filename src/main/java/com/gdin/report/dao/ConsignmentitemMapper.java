package com.gdin.report.dao;

import com.gdin.report.entity.Consignmentitem;
import java.math.BigDecimal;

public interface ConsignmentitemMapper {
    int deleteByPrimaryKey(BigDecimal consignmentitemId);

    int insert(Consignmentitem record);

    int insertSelective(Consignmentitem record);

    Consignmentitem selectByPrimaryKey(BigDecimal consignmentitemId);

    int updateByPrimaryKeySelective(Consignmentitem record);

    int updateByPrimaryKey(Consignmentitem record);
}