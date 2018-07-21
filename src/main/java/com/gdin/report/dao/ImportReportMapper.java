package com.gdin.report.dao;

import com.gdin.report.entity.ImportReport;

public interface ImportReportMapper {
    int deleteByPrimaryKey(String importReportId);

    int insert(ImportReport record);

    int insertSelective(ImportReport record);

    ImportReport selectByPrimaryKey(String importReportId);

    int updateByPrimaryKeySelective(ImportReport record);

    int updateByPrimaryKey(ImportReport record);
}