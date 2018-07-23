package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentEquipmentsMapper;
import com.gdin.report.entity.ConsignmentEquipments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentEquipmentsService {
    @Autowired
    private ConsignmentEquipmentsMapper consignmentEquipmentsMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentEquipmentId){
        return consignmentEquipmentsMapper.deleteByPrimaryKey(consignmentEquipmentId);
    }
    @Transactional
    int insert(ConsignmentEquipments record){
        return consignmentEquipmentsMapper.insert(record);
    }
    @Transactional
    int insertSelective(ConsignmentEquipments record){
        return consignmentEquipmentsMapper.insertSelective(record);
    }

    ConsignmentEquipments selectByPrimaryKey(BigDecimal consignmentEquipmentId){
        return consignmentEquipmentsMapper.selectByPrimaryKey(consignmentEquipmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ConsignmentEquipments record){
        return consignmentEquipmentsMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ConsignmentEquipments record){
        return consignmentEquipmentsMapper.updateByPrimaryKey(record);
    }
}