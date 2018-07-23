package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentTransportMapper;
import com.gdin.report.entity.ConsignmentTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class ConsignmentTransportService {
    @Autowired
    private ConsignmentTransportMapper consignmentTransportMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal consignmentTransportId){
        return  consignmentTransportMapper.deleteByPrimaryKey(consignmentTransportId);
    }
    @Transactional
    int insert(ConsignmentTransport record){
        return  consignmentTransportMapper.insert(record);
    }
    @Transactional
    int insertSelective(ConsignmentTransport record){
        return  consignmentTransportMapper.insertSelective(record);
    }

    ConsignmentTransport selectByPrimaryKey(BigDecimal consignmentTransportId){
        return  consignmentTransportMapper.selectByPrimaryKey(consignmentTransportId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ConsignmentTransport record){
        return  consignmentTransportMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ConsignmentTransport record){
        return  consignmentTransportMapper.updateByPrimaryKey(record);
    }
}