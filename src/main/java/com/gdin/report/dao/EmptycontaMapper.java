package com.gdin.report.dao;

import com.gdin.report.entity.Emptyconta;

public interface EmptycontaMapper {
    int deleteByPrimaryKey(String emptycontaId);

    int insert(Emptyconta record);

    int insertSelective(Emptyconta record);

    Emptyconta selectByPrimaryKey(String emptycontaId);

    int updateByPrimaryKeySelective(Emptyconta record);

    int updateByPrimaryKey(Emptyconta record);
}