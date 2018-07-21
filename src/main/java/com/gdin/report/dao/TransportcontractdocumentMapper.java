package com.gdin.report.dao;

import com.gdin.report.entity.Transportcontractdocument;

public interface TransportcontractdocumentMapper {
    int deleteByPrimaryKey(String transportcontractdocumentId);

    int insert(Transportcontractdocument record);

    int insertSelective(Transportcontractdocument record);

    Transportcontractdocument selectByPrimaryKey(String transportcontractdocumentId);

    int updateByPrimaryKeySelective(Transportcontractdocument record);

    int updateByPrimaryKey(Transportcontractdocument record);
}