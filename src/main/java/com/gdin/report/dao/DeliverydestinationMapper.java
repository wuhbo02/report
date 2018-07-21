package com.gdin.report.dao;

import com.gdin.report.entity.Deliverydestination;
import java.math.BigDecimal;

public interface DeliverydestinationMapper {
    int deleteByPrimaryKey(BigDecimal deliverydestinationId);

    int insert(Deliverydestination record);

    int insertSelective(Deliverydestination record);

    Deliverydestination selectByPrimaryKey(BigDecimal deliverydestinationId);

    int updateByPrimaryKeySelective(Deliverydestination record);

    int updateByPrimaryKey(Deliverydestination record);
}