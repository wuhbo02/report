package com.gdin.report.dao;

import com.gdin.report.entity.ExportReport;

public interface ExportReportMapper {
    int deleteByPrimaryKey(String exportReportId);

    int insert(ExportReport record);

    int insertSelective(ExportReport record);

    ExportReport selectByPrimaryKey(String exportReportId);

    int updateByPrimaryKeySelective(ExportReport record);

    int updateByPrimaryKey(ExportReport record);
}