package com.gdin.report.dao;

import com.gdin.report.entity.OffLoadChg;

public interface OffLoadChgMapper {
    int deleteByPrimaryKey(String offLoadChgId);

    int insert(OffLoadChg record);

    int insertSelective(OffLoadChg record);

    OffLoadChg selectByPrimaryKey(String offLoadChgId);

    int updateByPrimaryKeySelective(OffLoadChg record);

    int updateByPrimaryKey(OffLoadChg record);
}