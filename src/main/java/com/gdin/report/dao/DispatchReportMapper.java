package com.gdin.report.dao;

import com.gdin.report.entity.DispatchReport;

public interface DispatchReportMapper {
    int deleteByPrimaryKey(String dispatchReportId);

    int insert(DispatchReport record);

    int insertSelective(DispatchReport record);

    DispatchReport selectByPrimaryKey(String dispatchReportId);

    int updateByPrimaryKeySelective(DispatchReport record);

    int updateByPrimaryKey(DispatchReport record);
}