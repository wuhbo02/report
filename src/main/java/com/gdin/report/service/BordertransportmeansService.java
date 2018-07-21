package com.gdin.report.service;

import com.gdin.report.dao.BordertransportmeansMapper;
import com.gdin.report.entity.Bordertransportmeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BordertransportmeansService {
    @Autowired
    private BordertransportmeansMapper bordertransportmeansMapper;

    int deleteByPrimaryKey(BigDecimal bordertransportmeansId){
        return bordertransportmeansMapper.deleteByPrimaryKey(bordertransportmeansId);
    }

    int insert(Bordertransportmeans record){
        return bordertransportmeansMapper.insert(record);
    }

    Bordertransportmeans save(Bordertransportmeans record){
         bordertransportmeansMapper.insert(record);
        return record;
    }

    int insertSelective(Bordertransportmeans record){
        return bordertransportmeansMapper.insertSelective(record);
    }

    Bordertransportmeans selectByPrimaryKey(BigDecimal bordertransportmeansId){
        return bordertransportmeansMapper.selectByPrimaryKey(bordertransportmeansId);
    }

    int updateByPrimaryKeySelective(Bordertransportmeans record){
        return bordertransportmeansMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Bordertransportmeans record){
        return bordertransportmeansMapper.updateByPrimaryKey(record);
    }
}
