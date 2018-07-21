package com.gdin.report.dao;

import com.gdin.report.entity.TransferCheck;

public interface TransferCheckMapper {
    int deleteByPrimaryKey(String transferCheckId);

    int insert(TransferCheck record);

    int insertSelective(TransferCheck record);

    TransferCheck selectByPrimaryKey(String transferCheckId);

    int updateByPrimaryKeySelective(TransferCheck record);

    int updateByPrimaryKey(TransferCheck record);
}