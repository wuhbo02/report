package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentEquipmentsMapper;
import com.gdin.report.entity.ConsignmentEquipments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsignmentEquipmentsService {
    @Autowired
    private ConsignmentEquipmentsMapper consignmentEquipmentsMapper;


    int deleteByPrimaryKey(BigDecimal consignmentEquipmentId){
        return consignmentEquipmentsMapper.deleteByPrimaryKey(consignmentEquipmentId);
    }

    int insert(ConsignmentEquipments record){
        return consignmentEquipmentsMapper.insert(record);
    }

    int insertSelective(ConsignmentEquipments record){
        return consignmentEquipmentsMapper.insertSelective(record);
    }

    ConsignmentEquipments selectByPrimaryKey(BigDecimal consignmentEquipmentId){
        return consignmentEquipmentsMapper.selectByPrimaryKey(consignmentEquipmentId);
    }

    int updateByPrimaryKeySelective(ConsignmentEquipments record){
        return consignmentEquipmentsMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ConsignmentEquipments record){
        return consignmentEquipmentsMapper.updateByPrimaryKey(record);
    }
}