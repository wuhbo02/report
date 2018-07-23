package com.gdin.report.service;

import com.gdin.report.dao.PackingEquipmentMapper;
import com.gdin.report.entity.PackingEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class PackingEquipmentService {
    @Autowired
    private PackingEquipmentMapper packingEquipmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal packingEquipmentId){
        return packingEquipmentMapper.deleteByPrimaryKey(packingEquipmentId);
    }
    @Transactional
    int insert(PackingEquipment record){
        return packingEquipmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(PackingEquipment record){
        return packingEquipmentMapper.insertSelective(record);
    }

    PackingEquipment selectByPrimaryKey(BigDecimal packingEquipmentId){
        return packingEquipmentMapper.selectByPrimaryKey(packingEquipmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(PackingEquipment record){
        return packingEquipmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(PackingEquipment record){
        return packingEquipmentMapper.updateByPrimaryKey(record);
    }
}