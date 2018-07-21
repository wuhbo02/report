package com.gdin.report.dao;

import com.gdin.report.entity.ArrivalReport;

public interface ArrivalReportMapper {
    int deleteByPrimaryKey(String arrivalReportId);

    int insert(ArrivalReport record);

    int insertSelective(ArrivalReport record);

    ArrivalReport selectByPrimaryKey(String arrivalReportId);

    int updateByPrimaryKeySelective(ArrivalReport record);

    int updateByPrimaryKey(ArrivalReport record);
}