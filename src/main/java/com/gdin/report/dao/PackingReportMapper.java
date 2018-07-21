package com.gdin.report.dao;

import com.gdin.report.entity.PackingReport;

public interface PackingReportMapper {
    int deleteByPrimaryKey(String packingReportId);

    int insert(PackingReport record);

    int insertSelective(PackingReport record);

    PackingReport selectByPrimaryKey(String packingReportId);

    int updateByPrimaryKeySelective(PackingReport record);

    int updateByPrimaryKey(PackingReport record);
}