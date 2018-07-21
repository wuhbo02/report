package com.gdin.report.dao;

import com.gdin.report.entity.Address;
import java.math.BigDecimal;

public interface AddressMapper {
    int deleteByPrimaryKey(BigDecimal addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(BigDecimal addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}