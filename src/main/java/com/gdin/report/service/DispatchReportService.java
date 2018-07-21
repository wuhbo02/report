package com.gdin.report.service;

import com.gdin.report.dao.DispatchReportMapper;
import com.gdin.report.entity.DispatchReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DispatchReportService {
    @Autowired
    private DispatchReportMapper dispatchReportMapper;


    int deleteByPrimaryKey(String dispatchReportId){
        return  dispatchReportMapper.deleteByPrimaryKey(dispatchReportId);
    }

    int insert(DispatchReport record){
        return  dispatchReportMapper.insert(record);
    }

    int insertSelective(DispatchReport record){
        return  dispatchReportMapper.insertSelective(record);
    }

    DispatchReport selectByPrimaryKey(String dispatchReportId){
        return  dispatchReportMapper.selectByPrimaryKey(dispatchReportId);
    }

    int updateByPrimaryKeySelective(DispatchReport record){
        return  dispatchReportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(DispatchReport record){
        return  dispatchReportMapper.updateByPrimaryKey(record);
    }
}