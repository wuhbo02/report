package com.gdin.report.dao;

import com.gdin.report.entity.ArrivalEquipment;
import java.math.BigDecimal;

public interface ArrivalEquipmentMapper {
    int deleteByPrimaryKey(BigDecimal arrivalEquipmentId);

    int insert(ArrivalEquipment record);

    int insertSelective(ArrivalEquipment record);

    ArrivalEquipment selectByPrimaryKey(BigDecimal arrivalEquipmentId);

    int updateByPrimaryKeySelective(ArrivalEquipment record);

    int updateByPrimaryKey(ArrivalEquipment record);
}