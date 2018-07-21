package com.gdin.report.dao;

import com.gdin.report.entity.Contact;

public interface ContactMapper {
    int deleteByPrimaryKey(String contactId);

    int insert(Contact record);

    int insertSelective(Contact record);

    Contact selectByPrimaryKey(String contactId);

    int updateByPrimaryKeySelective(Contact record);

    int updateByPrimaryKey(Contact record);
}