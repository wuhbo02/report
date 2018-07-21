package com.gdin.report.service;

import com.gdin.report.dao.TransportequipmentMapper;
import com.gdin.report.entity.Transportequipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportequipmentService {

    @Autowired
    private TransportequipmentMapper transportequipmentMapper;

    int deleteByPrimaryKey(String transportequipmentId){
        return  transportequipmentMapper.deleteByPrimaryKey(transportequipmentId);
    }

    int insert(Transportequipment record){
        return  transportequipmentMapper.insert(record);
    }

    int insertSelective(Transportequipment record){
        return  transportequipmentMapper.insertSelective(record);
    }

    Transportequipment selectByPrimaryKey(String transportequipmentId){
        return  transportequipmentMapper.selectByPrimaryKey(transportequipmentId);
    }

    int updateByPrimaryKeySelective(Transportequipment record){
        return transportequipmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Transportequipment record){
        return  transportequipmentMapper.updateByPrimaryKey(record);
    }
}