package com.gdin.report.dao;

import com.gdin.report.entity.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(String copmsgid);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(String copmsgid);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKeyWithBLOBs(Message record);

    int updateByPrimaryKey(Message record);
}