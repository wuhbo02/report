package com.gdin.report.dao;

import com.gdin.report.entity.MessageAll;

public interface MessageAllMapper {
    int deleteByPrimaryKey(String messageAllId);

    int insert(MessageAll record);

    int insertSelective(MessageAll record);

    MessageAll selectByPrimaryKey(String messageAllId);

    int updateByPrimaryKeySelective(MessageAll record);

    int updateByPrimaryKey(MessageAll record);
}