package com.gdin.report.dao;

import com.gdin.report.entity.EquipmentDamage;
import java.math.BigDecimal;

public interface EquipmentDamageMapper {
    int deleteByPrimaryKey(BigDecimal equipmentDamageId);

    int insert(EquipmentDamage record);

    int insertSelective(EquipmentDamage record);

    EquipmentDamage selectByPrimaryKey(BigDecimal equipmentDamageId);

    int updateByPrimaryKeySelective(EquipmentDamage record);

    int updateByPrimaryKey(EquipmentDamage record);
}