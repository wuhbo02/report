package com.gdin.report.dao;

import com.gdin.report.entity.ConsignmentitemEquipment;
import java.math.BigDecimal;

public interface ConsignmentitemEquipmentMapper {
    int deleteByPrimaryKey(BigDecimal consignmentitemEquipmentId);

    int insert(ConsignmentitemEquipment record);

    int insertSelective(ConsignmentitemEquipment record);

    ConsignmentitemEquipment selectByPrimaryKey(BigDecimal consignmentitemEquipmentId);

    int updateByPrimaryKeySelective(ConsignmentitemEquipment record);

    int updateByPrimaryKey(ConsignmentitemEquipment record);
}