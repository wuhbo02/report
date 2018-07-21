package com.gdin.report.service;

import com.gdin.report.dao.ChgTransportMapper;
import com.gdin.report.entity.ChgTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChgTransportService {
    @Autowired
    private ChgTransportMapper chgTransportMapper;


    int deleteByPrimaryKey(String chgTransportId){
        return  chgTransportMapper.deleteByPrimaryKey(chgTransportId);
    }

    int insert(ChgTransport record){
        return  chgTransportMapper.insert(record);
    }

    int insertSelective(ChgTransport record){
        return  chgTransportMapper.insertSelective(record);
    }

    ChgTransport selectByPrimaryKey(String chgTransportId){
        return  chgTransportMapper.selectByPrimaryKey(chgTransportId);
    }

    int updateByPrimaryKeySelective(ChgTransport record){
        return  chgTransportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ChgTransport record){
        return  chgTransportMapper.updateByPrimaryKey(record);
    }
}