package com.gdin.report.dao;

import com.gdin.report.entity.Communication;

public interface CommunicationMapper {
    int deleteByPrimaryKey(String communicationId);

    int insert(Communication record);

    int insertSelective(Communication record);

    Communication selectByPrimaryKey(String communicationId);

    int updateByPrimaryKeySelective(Communication record);

    int updateByPrimaryKey(Communication record);
}