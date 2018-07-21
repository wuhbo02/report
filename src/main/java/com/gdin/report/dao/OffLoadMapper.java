package com.gdin.report.dao;

import com.gdin.report.entity.OffLoad;

public interface OffLoadMapper {
    int deleteByPrimaryKey(String offLoadId);

    int insert(OffLoad record);

    int insertSelective(OffLoad record);

    OffLoad selectByPrimaryKey(String offLoadId);

    int updateByPrimaryKeySelective(OffLoad record);

    int updateByPrimaryKey(OffLoad record);
}