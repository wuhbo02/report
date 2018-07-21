package com.gdin.report.dao;

import com.gdin.report.entity.Bordertransportmeans;
import java.math.BigDecimal;

public interface BordertransportmeansMapper {
    int deleteByPrimaryKey(BigDecimal bordertransportmeansId);

    int insert(Bordertransportmeans record);

    int insertSelective(Bordertransportmeans record);

    Bordertransportmeans selectByPrimaryKey(BigDecimal bordertransportmeansId);

    int updateByPrimaryKeySelective(Bordertransportmeans record);

    int updateByPrimaryKey(Bordertransportmeans record);
}