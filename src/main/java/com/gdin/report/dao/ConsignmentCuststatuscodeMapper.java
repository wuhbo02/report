package com.gdin.report.dao;

import com.gdin.report.entity.ConsignmentCuststatuscode;
import java.math.BigDecimal;

public interface ConsignmentCuststatuscodeMapper {
    int deleteByPrimaryKey(BigDecimal consignmentCuststatuscodeId);

    int insert(ConsignmentCuststatuscode record);

    int insertSelective(ConsignmentCuststatuscode record);

    ConsignmentCuststatuscode selectByPrimaryKey(BigDecimal consignmentCuststatuscodeId);

    int updateByPrimaryKeySelective(ConsignmentCuststatuscode record);

    int updateByPrimaryKey(ConsignmentCuststatuscode record);
}