package com.gdin.report.service;

import com.gdin.report.dao.TransportequipmentSealidMapper;
import com.gdin.report.entity.TransportequipmentSealid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class TransportequipmentSealidService {
    @Autowired
    private TransportequipmentSealidMapper transportequipmentSealidMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal transportequipmentSealidId){
        return  transportequipmentSealidMapper.deleteByPrimaryKey(transportequipmentSealidId);
    }
    @Transactional
    int insert(TransportequipmentSealid record){
        return  transportequipmentSealidMapper.insert(record);
    }
    @Transactional
    int insertSelective(TransportequipmentSealid record){
        return  transportequipmentSealidMapper.insertSelective(record);
    }

    TransportequipmentSealid selectByPrimaryKey(BigDecimal transportequipmentSealidId){
        return  transportequipmentSealidMapper.selectByPrimaryKey(transportequipmentSealidId);
    }
    @Transactional
    int updateByPrimaryKeySelective(TransportequipmentSealid record){
        return  transportequipmentSealidMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(TransportequipmentSealid record){
        return  transportequipmentSealidMapper.updateByPrimaryKey(record);
    }
}