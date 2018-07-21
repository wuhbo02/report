package com.gdin.report.dao;

import com.gdin.report.entity.TallyEquipment;
import java.math.BigDecimal;

public interface TallyEquipmentMapper {
    int deleteByPrimaryKey(BigDecimal tallyEquipmentId);

    int insert(TallyEquipment record);

    int insertSelective(TallyEquipment record);

    TallyEquipment selectByPrimaryKey(BigDecimal tallyEquipmentId);

    int updateByPrimaryKeySelective(TallyEquipment record);

    int updateByPrimaryKey(TallyEquipment record);
}