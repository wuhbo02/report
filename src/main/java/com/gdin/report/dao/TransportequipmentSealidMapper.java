package com.gdin.report.dao;

import com.gdin.report.entity.TransportequipmentSealid;
import java.math.BigDecimal;

public interface TransportequipmentSealidMapper {
    int deleteByPrimaryKey(BigDecimal transportequipmentSealidId);

    int insert(TransportequipmentSealid record);

    int insertSelective(TransportequipmentSealid record);

    TransportequipmentSealid selectByPrimaryKey(BigDecimal transportequipmentSealidId);

    int updateByPrimaryKeySelective(TransportequipmentSealid record);

    int updateByPrimaryKey(TransportequipmentSealid record);
}