package com.gdin.report.service;

import com.gdin.report.dao.TransferCheckEquipmentMapper;
import com.gdin.report.entity.TransferCheckEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class TransferCheckEquipmentService {
    @Autowired
    private TransferCheckEquipmentMapper transferCheckEquipmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal transferCheckEquipmentId){
        return transferCheckEquipmentMapper.deleteByPrimaryKey(transferCheckEquipmentId);
    }

    @Transactional
    int insert(TransferCheckEquipment record){
        return transferCheckEquipmentMapper.insert(record);
    }

    @Transactional
    int insertSelective(TransferCheckEquipment record){
        return transferCheckEquipmentMapper.insertSelective(record);
    }

    TransferCheckEquipment selectByPrimaryKey(BigDecimal transferCheckEquipmentId){
        return transferCheckEquipmentMapper.selectByPrimaryKey(transferCheckEquipmentId);
    }

    @Transactional
    int updateByPrimaryKeySelective(TransferCheckEquipment record){
        return transferCheckEquipmentMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(TransferCheckEquipment record){
        return transferCheckEquipmentMapper.updateByPrimaryKey(record);
    }
}