package com.gdin.report.dao;

import com.gdin.report.entity.TallyReport;

public interface TallyReportMapper {
    int deleteByPrimaryKey(String tallyReportId);

    int insert(TallyReport record);

    int insertSelective(TallyReport record);

    TallyReport selectByPrimaryKey(String tallyReportId);

    int updateByPrimaryKeySelective(TallyReport record);

    int updateByPrimaryKey(TallyReport record);
}