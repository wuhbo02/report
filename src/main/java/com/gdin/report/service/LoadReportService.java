package com.gdin.report.service;

import com.gdin.report.dao.LoadReportMapper;
import com.gdin.report.entity.LoadReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadReportService {
    @Autowired
    private LoadReportMapper loadReportMapper;


    int deleteByPrimaryKey(String loadReportId){
        return loadReportMapper.deleteByPrimaryKey(loadReportId);
    }

    int insert(LoadReport record){
        return loadReportMapper.insert(record);
    }

    int insertSelective(LoadReport record){
        return loadReportMapper.insertSelective(record);
    }

    LoadReport selectByPrimaryKey(String loadReportId){
        return loadReportMapper.selectByPrimaryKey(loadReportId);
    }

    int updateByPrimaryKeySelective(LoadReport record){
        return loadReportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(LoadReport record){
        return loadReportMapper.updateByPrimaryKey(record);
    }
}