package com.gdin.report.service;

import com.gdin.report.dao.ConsignmentTransportMapper;
import com.gdin.report.entity.ConsignmentTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConsignmentTransportService {
    @Autowired
    private ConsignmentTransportMapper consignmentTransportMapper;


    int deleteByPrimaryKey(BigDecimal consignmentTransportId){
        return  consignmentTransportMapper.deleteByPrimaryKey(consignmentTransportId);
    }

    int insert(ConsignmentTransport record){
        return  consignmentTransportMapper.insert(record);
    }

    int insertSelective(ConsignmentTransport record){
        return  consignmentTransportMapper.insertSelective(record);
    }

    ConsignmentTransport selectByPrimaryKey(BigDecimal consignmentTransportId){
        return  consignmentTransportMapper.selectByPrimaryKey(consignmentTransportId);
    }

    int updateByPrimaryKeySelective(ConsignmentTransport record){
        return  consignmentTransportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ConsignmentTransport record){
        return  consignmentTransportMapper.updateByPrimaryKey(record);
    }
}