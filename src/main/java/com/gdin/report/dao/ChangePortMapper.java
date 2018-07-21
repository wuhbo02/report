package com.gdin.report.dao;

import com.gdin.report.entity.ChangePort;

public interface ChangePortMapper {
    int deleteByPrimaryKey(String changePortId);

    int insert(ChangePort record);

    int insertSelective(ChangePort record);

    ChangePort selectByPrimaryKey(String changePortId);

    int updateByPrimaryKeySelective(ChangePort record);

    int updateByPrimaryKey(ChangePort record);
}