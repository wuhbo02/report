package com.gdin.report.dao;

import com.gdin.report.entity.LoadReport;

public interface LoadReportMapper {
    int deleteByPrimaryKey(String loadReportId);

    int insert(LoadReport record);

    int insertSelective(LoadReport record);

    LoadReport selectByPrimaryKey(String loadReportId);

    int updateByPrimaryKeySelective(LoadReport record);

    int updateByPrimaryKey(LoadReport record);
}