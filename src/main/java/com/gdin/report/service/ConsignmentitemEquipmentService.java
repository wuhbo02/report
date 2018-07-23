package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentitemEquipmentMapper;
import com.gdin.report.entity.ConsignmentitemEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentitemEquipmentService {
    @Autowired
    private ConsignmentitemEquipmentMapper consignmentitemEquipmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentitemEquipmentId){
        return  consignmentitemEquipmentMapper.deleteByPrimaryKey(consignmentitemEquipmentId);
    }
    @Transactional
    int insert(ConsignmentitemEquipment record){
        return  consignmentitemEquipmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(ConsignmentitemEquipment record){
        return  consignmentitemEquipmentMapper.insertSelective(record);
    }

    ConsignmentitemEquipment selectByPrimaryKey(BigDecimal consignmentitemEquipmentId){
        return  consignmentitemEquipmentMapper.selectByPrimaryKey(consignmentitemEquipmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ConsignmentitemEquipment record){
        return  consignmentitemEquipmentMapper.updateByPrimaryKeySelective(record);}
    @Transactional
    int updateByPrimaryKey(ConsignmentitemEquipment record){
        return  consignmentitemEquipmentMapper.updateByPrimaryKey(record);
    }
}