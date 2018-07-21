package com.gdin.report.service;

import com.gdin.report.dao.DistributeReportMapper;
import com.gdin.report.entity.DistributeReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistributeReportService {
    @Autowired
    private DistributeReportMapper distributeReportMapper;


    int deleteByPrimaryKey(String distributeReportId){
        return distributeReportMapper.deleteByPrimaryKey(distributeReportId);
    }

    int insert(DistributeReport record){
        return distributeReportMapper.insert(record);
    }

    int insertSelective(DistributeReport record){
        return distributeReportMapper.insertSelective(record);
    }

    DistributeReport selectByPrimaryKey(String distributeReportId){
        return distributeReportMapper.selectByPrimaryKey(distributeReportId);
    }

    int updateByPrimaryKeySelective(DistributeReport record){
        return distributeReportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(DistributeReport record){
        return distributeReportMapper.updateByPrimaryKey(record);
    }
}