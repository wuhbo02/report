package com.gdin.report.service;

import com.gdin.report.dao.PackingReportMapper;
import com.gdin.report.entity.PackingReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackingReportService {
    @Autowired
    private PackingReportMapper packingReportMapper;


    int deleteByPrimaryKey(String packingReportId){
        return packingReportMapper.deleteByPrimaryKey(packingReportId);
    }

    int insert(PackingReport record){
        return packingReportMapper.insert(record);
    }

    int insertSelective(PackingReport record){
        return packingReportMapper.insertSelective(record);
    }

    PackingReport selectByPrimaryKey(String packingReportId){
        return packingReportMapper.selectByPrimaryKey(packingReportId);
    }

    int updateByPrimaryKeySelective(PackingReport record){
        return packingReportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(PackingReport record){
        return packingReportMapper.updateByPrimaryKey(record);
    }
}