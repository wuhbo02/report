package com.gdin.report.dao;

import com.gdin.report.entity.ConsignmentTransport;
import java.math.BigDecimal;

public interface ConsignmentTransportMapper {
    int deleteByPrimaryKey(BigDecimal consignmentTransportId);

    int insert(ConsignmentTransport record);

    int insertSelective(ConsignmentTransport record);

    ConsignmentTransport selectByPrimaryKey(BigDecimal consignmentTransportId);

    int updateByPrimaryKeySelective(ConsignmentTransport record);

    int updateByPrimaryKey(ConsignmentTransport record);
}