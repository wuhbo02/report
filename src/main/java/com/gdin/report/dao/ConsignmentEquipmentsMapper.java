package com.gdin.report.dao;

import com.gdin.report.entity.ConsignmentEquipments;
import java.math.BigDecimal;

public interface ConsignmentEquipmentsMapper {
    int deleteByPrimaryKey(BigDecimal consignmentEquipmentId);

    int insert(ConsignmentEquipments record);

    int insertSelective(ConsignmentEquipments record);

    ConsignmentEquipments selectByPrimaryKey(BigDecimal consignmentEquipmentId);

    int updateByPrimaryKeySelective(ConsignmentEquipments record);

    int updateByPrimaryKey(ConsignmentEquipments record);
}