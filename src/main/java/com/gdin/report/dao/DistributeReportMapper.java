package com.gdin.report.dao;

import com.gdin.report.entity.DistributeReport;

public interface DistributeReportMapper {
    int deleteByPrimaryKey(String distributeReportId);

    int insert(DistributeReport record);

    int insertSelective(DistributeReport record);

    DistributeReport selectByPrimaryKey(String distributeReportId);

    int updateByPrimaryKeySelective(DistributeReport record);

    int updateByPrimaryKey(DistributeReport record);
}