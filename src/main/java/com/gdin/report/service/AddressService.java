package com.gdin.report.service;

import com.gdin.report.dao.AddressMapper;
import com.gdin.report.dto.exp.ConsigneeAddress;
import com.gdin.report.dto.exp.ConsignorAddress;
import com.gdin.report.dto.exp.NotifypartyAddress;
import com.gdin.report.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Transactional
    int deleteByPrimaryKey(BigDecimal addressId){
        return addressMapper.deleteByPrimaryKey(addressId);
    }

    @Transactional
    int insert(Address record){
        return addressMapper.insert(record);
    }

    @Transactional
    public Address saveAddress(NotifypartyAddress notifypartyAddress){
        Address address = new Address();
        address.setCityname(notifypartyAddress.getCityName());
        address.setCountrysubentityname(notifypartyAddress.getCountrySubEntityName());
        address.setCountrycode(notifypartyAddress.getCountryCode());
        address.setCountrysubentityid(notifypartyAddress.getCountrySubEntityID());
        address.setLine(notifypartyAddress.getLine());
        address.setPostcodeid(notifypartyAddress.getPostcodeID());

        insert(address);

        return address;
    }

    @Transactional
    public Address saveAddress(ConsignorAddress consignorAddress){
        Address address = new Address();
        address.setCityname(consignorAddress.getCityName());
        address.setCountrysubentityname(consignorAddress.getCountrySubEntityName());
        address.setCountrycode(consignorAddress.getCountryCode());
        address.setCountrysubentityid(consignorAddress.getCountrySubEntityID());
        address.setLine(consignorAddress.getLine());
        address.setPostcodeid(consignorAddress.getPostcodeID());

        insert(address);

        return address;
    }


    @Transactional
    public Address saveAddress(ConsigneeAddress consigneeAddress){
        Address address = new Address();
        address.setCityname(consigneeAddress.getCityName());
        address.setCountrysubentityname(consigneeAddress.getCountrySubEntityName());
        address.setCountrycode(consigneeAddress.getCountryCode());
        address.setCountrysubentityid(consigneeAddress.getCountrySubEntityID());
        address.setLine(consigneeAddress.getLine());
        address.setPostcodeid(consigneeAddress.getPostcodeID());

        insert(address);

        return address;
    }



    @Transactional
    int insertSelective(Address record){
        return addressMapper.insertSelective(record);
    }

    Address selectByPrimaryKey(BigDecimal addressId){
        return addressMapper.selectByPrimaryKey(addressId);
    }

    @Transactional
    int updateByPrimaryKeySelective(Address record){
        return addressMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(Address record){
        return addressMapper.updateByPrimaryKey(record);
    }
}
