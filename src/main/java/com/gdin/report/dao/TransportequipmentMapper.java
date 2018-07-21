package com.gdin.report.dao;

import com.gdin.report.entity.Transportequipment;

public interface TransportequipmentMapper {
    int deleteByPrimaryKey(String transportequipmentId);

    int insert(Transportequipment record);

    int insertSelective(Transportequipment record);

    Transportequipment selectByPrimaryKey(String transportequipmentId);

    int updateByPrimaryKeySelective(Transportequipment record);

    int updateByPrimaryKey(Transportequipment record);
}