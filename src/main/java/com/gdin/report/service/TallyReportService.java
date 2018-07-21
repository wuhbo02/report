package com.gdin.report.service;

import com.gdin.report.dao.TallyReportMapper;
import com.gdin.report.entity.TallyReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TallyReportService {
    @Autowired
    private TallyReportMapper tallyReportMapper;


    int deleteByPrimaryKey(String tallyReportId){
        return tallyReportMapper.deleteByPrimaryKey(tallyReportId);
    }

    int insert(TallyReport record){
        return tallyReportMapper.insert(record);
    }

    int insertSelective(TallyReport record){
        return tallyReportMapper.insertSelective(record);
    }

    TallyReport selectByPrimaryKey(String tallyReportId){
        return tallyReportMapper.selectByPrimaryKey(tallyReportId);
    }

    int updateByPrimaryKeySelective(TallyReport record){
        return tallyReportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(TallyReport record){
        return tallyReportMapper.updateByPrimaryKey(record);
    }
}