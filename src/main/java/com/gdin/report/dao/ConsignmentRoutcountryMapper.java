package com.gdin.report.dao;

import com.gdin.report.entity.ConsignmentRoutcountry;
import java.math.BigDecimal;

public interface ConsignmentRoutcountryMapper {
    int deleteByPrimaryKey(BigDecimal consignmentRoutcountryId);

    int insert(ConsignmentRoutcountry record);

    int insertSelective(ConsignmentRoutcountry record);

    ConsignmentRoutcountry selectByPrimaryKey(BigDecimal consignmentRoutcountryId);

    int updateByPrimaryKeySelective(ConsignmentRoutcountry record);

    int updateByPrimaryKey(ConsignmentRoutcountry record);
}