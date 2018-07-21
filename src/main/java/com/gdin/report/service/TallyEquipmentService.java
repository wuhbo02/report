package com.gdin.report.service;

import com.gdin.report.dao.TallyEquipmentMapper;
import com.gdin.report.entity.TallyEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TallyEquipmentService {
    @Autowired
    private TallyEquipmentMapper tallyEquipmentMapper;


    int deleteByPrimaryKey(BigDecimal tallyEquipmentId){
        return tallyEquipmentMapper.deleteByPrimaryKey(tallyEquipmentId);
    }

    int insert(TallyEquipment record){
        return tallyEquipmentMapper.insert(record);
    }

    int insertSelective(TallyEquipment record){
        return tallyEquipmentMapper.insertSelective(record);
    }

    TallyEquipment selectByPrimaryKey(BigDecimal tallyEquipmentId){
        return tallyEquipmentMapper.selectByPrimaryKey(tallyEquipmentId);
    }

    int updateByPrimaryKeySelective(TallyEquipment record){
        return tallyEquipmentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(TallyEquipment record){
        return tallyEquipmentMapper.updateByPrimaryKey(record);
    }
}