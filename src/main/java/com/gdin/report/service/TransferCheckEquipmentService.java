package com.gdin.report.service;

import com.gdin.report.dao.TransferCheckEquipmentMapper;
import com.gdin.report.entity.TransferCheckEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferCheckEquipmentService {
    @Autowired
    private TransferCheckEquipmentMapper transferCheckEquipmentMapper;

    int deleteByPrimaryKey(BigDecimal transferCheckEquipmentId){
        return transferCheckEquipmentMapper.deleteByPrimaryKey(transferCheckEquipmentId);
    }

    int insert(TransferCheckEquipment record){
        return transferCheckEquipmentMapper.insert(record);
    }

    int insertSelective(TransferCheckEquipment record){
        return transferCheckEquipmentMapper.insertSelective(record);
    }

    TransferCheckEquipment selectByPrimaryKey(BigDecimal transferCheckEquipmentId){
        return transferCheckEquipmentMapper.selectByPrimaryKey(transferCheckEquipmentId);
    }

    int updateByPrimaryKeySelective(TransferCheckEquipment record){
        return transferCheckEquipmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(TransferCheckEquipment record){
        return transferCheckEquipmentMapper.updateByPrimaryKey(record);
    }
}