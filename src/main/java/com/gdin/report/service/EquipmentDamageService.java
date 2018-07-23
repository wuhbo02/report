package com.gdin.report.service;

import com.gdin.report.dao.EquipmentDamageMapper;
import com.gdin.report.entity.EquipmentDamage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class EquipmentDamageService {
    @Autowired
    private EquipmentDamageMapper equipmentDamageMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal equipmentDamageId){
        return  equipmentDamageMapper.deleteByPrimaryKey(equipmentDamageId);
    }
    @Transactional
    int insert(EquipmentDamage record){
        return  equipmentDamageMapper.insert(record);
    }
    @Transactional
    int insertSelective(EquipmentDamage record){
        return  equipmentDamageMapper.insertSelective(record);
    }

    EquipmentDamage selectByPrimaryKey(BigDecimal equipmentDamageId){
        return  equipmentDamageMapper.selectByPrimaryKey(equipmentDamageId);
    }
    @Transactional
    int updateByPrimaryKeySelective(EquipmentDamage record){
        return  equipmentDamageMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(EquipmentDamage record){
        return  equipmentDamageMapper.updateByPrimaryKey(record);
    }


}
