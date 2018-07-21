package com.gdin.report.dao;

import com.gdin.report.entity.ConsignmentitemUcr;
import java.math.BigDecimal;

public interface ConsignmentitemUcrMapper {
    int deleteByPrimaryKey(BigDecimal consignmentitemUcrId);

    int insert(ConsignmentitemUcr record);

    int insertSelective(ConsignmentitemUcr record);

    ConsignmentitemUcr selectByPrimaryKey(BigDecimal consignmentitemUcrId);

    int updateByPrimaryKeySelective(ConsignmentitemUcr record);

    int updateByPrimaryKey(ConsignmentitemUcr record);
}