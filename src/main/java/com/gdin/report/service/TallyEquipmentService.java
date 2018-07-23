package com.gdin.report.service;

import com.gdin.report.dao.TallyEquipmentMapper;
import com.gdin.report.entity.TallyEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class TallyEquipmentService {
    @Autowired
    private TallyEquipmentMapper tallyEquipmentMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal tallyEquipmentId){
        return tallyEquipmentMapper.deleteByPrimaryKey(tallyEquipmentId);
    }
    @Transactional
    int insert(TallyEquipment record){
        return tallyEquipmentMapper.insert(record);
    }
    @Transactional
    int insertSelective(TallyEquipment record){
        return tallyEquipmentMapper.insertSelective(record);
    }

    TallyEquipment selectByPrimaryKey(BigDecimal tallyEquipmentId){
        return tallyEquipmentMapper.selectByPrimaryKey(tallyEquipmentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(TallyEquipment record){
        return tallyEquipmentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(TallyEquipment record){
        return tallyEquipmentMapper.updateByPrimaryKey(record);
    }
}