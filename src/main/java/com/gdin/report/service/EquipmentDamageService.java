package com.gdin.report.service;

import com.gdin.report.dao.EquipmentDamageMapper;
import com.gdin.report.entity.EquipmentDamage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class EquipmentDamageService {
    @Autowired
    private EquipmentDamageMapper equipmentDamageMapper;


    int deleteByPrimaryKey(BigDecimal equipmentDamageId){
        return  equipmentDamageMapper.deleteByPrimaryKey(equipmentDamageId);
    }

    int insert(EquipmentDamage record){
        return  equipmentDamageMapper.insert(record);
    }

    int insertSelective(EquipmentDamage record){
        return  equipmentDamageMapper.insertSelective(record);
    }

    EquipmentDamage selectByPrimaryKey(BigDecimal equipmentDamageId){
        return  equipmentDamageMapper.selectByPrimaryKey(equipmentDamageId);
    }

    int updateByPrimaryKeySelective(EquipmentDamage record){
        return  equipmentDamageMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(EquipmentDamage record){
        return  equipmentDamageMapper.updateByPrimaryKey(record);
    }


}
