package com.gdin.report.service;

import com.gdin.report.dao.DeliverydestinationMapper;
import com.gdin.report.entity.Deliverydestination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DeliverydestinationService {
    @Autowired
    private DeliverydestinationMapper deliverydestinationMapper;


    int deleteByPrimaryKey(BigDecimal deliverydestinationId){
        return  deliverydestinationMapper.deleteByPrimaryKey(deliverydestinationId);
    }

    int insert(Deliverydestination record){
        return  deliverydestinationMapper.insert(record);
    }

    int insertSelective(Deliverydestination record){
        return  deliverydestinationMapper.insertSelective(record);
    }

    Deliverydestination selectByPrimaryKey(BigDecimal deliverydestinationId){
        return  deliverydestinationMapper.selectByPrimaryKey(deliverydestinationId);
    }

    int updateByPrimaryKeySelective(Deliverydestination record){
        return  deliverydestinationMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Deliverydestination record){
        return  deliverydestinationMapper.updateByPrimaryKey(record);
    }
}