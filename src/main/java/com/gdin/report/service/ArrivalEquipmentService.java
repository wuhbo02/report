package com.gdin.report.service;

import com.gdin.report.dao.ArrivalEquipmentMapper;
import com.gdin.report.entity.ArrivalEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ArrivalEquipmentService {
    @Autowired
    private ArrivalEquipmentMapper arrivalEquipmentMapper;

    int deleteByPrimaryKey(BigDecimal arrivalEquipmentId){
        return arrivalEquipmentMapper.deleteByPrimaryKey(arrivalEquipmentId);
    }

    int insert(ArrivalEquipment record){
        return arrivalEquipmentMapper.insert(record);
    }

    int insertSelective(ArrivalEquipment record){
        return arrivalEquipmentMapper.insertSelective(record);
    }

    ArrivalEquipment selectByPrimaryKey(BigDecimal arrivalEquipmentId){
        return arrivalEquipmentMapper.selectByPrimaryKey(arrivalEquipmentId);
    }

    int updateByPrimaryKeySelective(ArrivalEquipment record){
        return arrivalEquipmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ArrivalEquipment record){
        return arrivalEquipmentMapper.updateByPrimaryKey(record);
    }
}
