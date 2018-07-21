package com.gdin.report.service;

import com.gdin.report.dao.PackingEquipmentMapper;
import com.gdin.report.entity.PackingEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PackingEquipmentService {
    @Autowired
    private PackingEquipmentMapper packingEquipmentMapper;


    int deleteByPrimaryKey(BigDecimal packingEquipmentId){
        return packingEquipmentMapper.deleteByPrimaryKey(packingEquipmentId);
    }

    int insert(PackingEquipment record){
        return packingEquipmentMapper.insert(record);
    }

    int insertSelective(PackingEquipment record){
        return packingEquipmentMapper.insertSelective(record);
    }

    PackingEquipment selectByPrimaryKey(BigDecimal packingEquipmentId){
        return packingEquipmentMapper.selectByPrimaryKey(packingEquipmentId);
    }

    int updateByPrimaryKeySelective(PackingEquipment record){
        return packingEquipmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(PackingEquipment record){
        return packingEquipmentMapper.updateByPrimaryKey(record);
    }
}