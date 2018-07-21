package com.gdin.report.dao;

import com.gdin.report.entity.ConsignmentItems;
import java.math.BigDecimal;

public interface ConsignmentItemsMapper {
    int deleteByPrimaryKey(BigDecimal consignmentItemsId);

    int insert(ConsignmentItems record);

    int insertSelective(ConsignmentItems record);

    ConsignmentItems selectByPrimaryKey(BigDecimal consignmentItemsId);

    int updateByPrimaryKeySelective(ConsignmentItems record);

    int updateByPrimaryKey(ConsignmentItems record);
}