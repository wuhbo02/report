package com.gdin.report.dao;

import com.gdin.report.entity.TransferCheckEquipment;
import java.math.BigDecimal;

public interface TransferCheckEquipmentMapper {
    int deleteByPrimaryKey(BigDecimal transferCheckEquipmentId);

    int insert(TransferCheckEquipment record);

    int insertSelective(TransferCheckEquipment record);

    TransferCheckEquipment selectByPrimaryKey(BigDecimal transferCheckEquipmentId);

    int updateByPrimaryKeySelective(TransferCheckEquipment record);

    int updateByPrimaryKey(TransferCheckEquipment record);
}