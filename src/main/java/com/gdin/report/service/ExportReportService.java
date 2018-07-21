package com.gdin.report.service;

import com.gdin.report.dao.ExportReportMapper;
import com.gdin.report.entity.ExportReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExportReportService {
    @Autowired
    private ExportReportMapper exportReportMapper;


    int deleteByPrimaryKey(String exportReportId){
        return exportReportMapper.deleteByPrimaryKey(exportReportId);
    }

    int insert(ExportReport record){
        return exportReportMapper.insert(record);
    }

    int insertSelective(ExportReport record){
        return exportReportMapper.insertSelective(record);
    }

    ExportReport selectByPrimaryKey(String exportReportId){
        return exportReportMapper.selectByPrimaryKey(exportReportId);
    }

    int updateByPrimaryKeySelective(ExportReport record){
        return exportReportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ExportReport record){
        return exportReportMapper.updateByPrimaryKey(record);
    }
}