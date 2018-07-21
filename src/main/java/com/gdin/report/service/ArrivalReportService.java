package com.gdin.report.service;

import com.gdin.report.dao.ArrivalReportMapper;
import com.gdin.report.entity.ArrivalReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArrivalReportService {
    @Autowired
    private ArrivalReportMapper arrivalReportMapper;

    int deleteByPrimaryKey(String arrivalReportId){
        return arrivalReportMapper.deleteByPrimaryKey(arrivalReportId);
    }

    int insert(ArrivalReport record){
        return arrivalReportMapper.insert(record);
    }

    int insertSelective(ArrivalReport record){
        return arrivalReportMapper.insertSelective(record);
    }

    ArrivalReport selectByPrimaryKey(String arrivalReportId){
        return arrivalReportMapper.selectByPrimaryKey(arrivalReportId);
    }

    int updateByPrimaryKeySelective(ArrivalReport record){
        return arrivalReportMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ArrivalReport record){
        return arrivalReportMapper.updateByPrimaryKey(record);
    }
}
