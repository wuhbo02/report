package com.gdin.report.service;

import com.gdin.report.dao.TransportequipmentSealidMapper;
import com.gdin.report.entity.TransportequipmentSealid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransportequipmentSealidService {
    @Autowired
    private TransportequipmentSealidMapper transportequipmentSealidMapper;

    int deleteByPrimaryKey(BigDecimal transportequipmentSealidId){
        return  transportequipmentSealidMapper.deleteByPrimaryKey(transportequipmentSealidId);
    }

    int insert(TransportequipmentSealid record){
        return  transportequipmentSealidMapper.insert(record);
    }

    int insertSelective(TransportequipmentSealid record){
        return  transportequipmentSealidMapper.insertSelective(record);
    }

    TransportequipmentSealid selectByPrimaryKey(BigDecimal transportequipmentSealidId){
        return  transportequipmentSealidMapper.selectByPrimaryKey(transportequipmentSealidId);
    }

    int updateByPrimaryKeySelective(TransportequipmentSealid record){
        return  transportequipmentSealidMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(TransportequipmentSealid record){
        return  transportequipmentSealidMapper.updateByPrimaryKey(record);
    }
}