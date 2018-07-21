package com.gdin.report.dao;

import com.gdin.report.entity.ChgTransport;

public interface ChgTransportMapper {
    int deleteByPrimaryKey(String chgTransportId);

    int insert(ChgTransport record);

    int insertSelective(ChgTransport record);

    ChgTransport selectByPrimaryKey(String chgTransportId);

    int updateByPrimaryKeySelective(ChgTransport record);

    int updateByPrimaryKey(ChgTransport record);
}