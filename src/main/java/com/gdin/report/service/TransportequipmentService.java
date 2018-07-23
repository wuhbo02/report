package com.gdin.report.service;

import com.gdin.report.dao.TransportequipmentMapper;
import com.gdin.report.entity.Transportequipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransportequipmentService {

    @Autowired
    private TransportequipmentMapper transportequipmentMapper;

    @Transactional
    int deleteByPrimaryKey(String transportequipmentId){
        return  transportequipmentMapper.deleteByPrimaryKey(transportequipmentId);
    }
    @Transactional
    int insert(Transportequipment record){
        return  transportequipmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(Transportequipment record){
        return  transportequipmentMapper.insertSelective(record);
    }

    Transportequipment selectByPrimaryKey(String transportequipmentId){
        return  transportequipmentMapper.selectByPrimaryKey(transportequipmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(Transportequipment record){
        return transportequipmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(Transportequipment record){
        return  transportequipmentMapper.updateByPrimaryKey(record);
    }
}