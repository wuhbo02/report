package com.gdin.report.service;

import com.gdin.report.dao.AddressMapper;
import com.gdin.report.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AddressService {
    @Autowired
    private AddressMapper addressMapper;

    int deleteByPrimaryKey(BigDecimal addressId){
        return addressMapper.deleteByPrimaryKey(addressId);
    }

    int insert(Address record){
        return addressMapper.insert(record);
    }

    int insertSelective(Address record){
        return addressMapper.insertSelective(record);
    }

    Address selectByPrimaryKey(BigDecimal addressId){
        return addressMapper.selectByPrimaryKey(addressId);
    }

    int updateByPrimaryKeySelective(Address record){
        return addressMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Address record){
        return addressMapper.updateByPrimaryKey(record);
    }
}
