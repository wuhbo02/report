package com.gdin.report.dao;

import com.gdin.report.entity.PackingEquipment;
import java.math.BigDecimal;

public interface PackingEquipmentMapper {
    int deleteByPrimaryKey(BigDecimal packingEquipmentId);

    int insert(PackingEquipment record);

    int insertSelective(PackingEquipment record);

    PackingEquipment selectByPrimaryKey(BigDecimal packingEquipmentId);

    int updateByPrimaryKeySelective(PackingEquipment record);

    int updateByPrimaryKey(PackingEquipment record);
}