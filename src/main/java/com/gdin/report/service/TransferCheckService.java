package com.gdin.report.service;

import com.gdin.report.dao.TransferCheckMapper;
import com.gdin.report.entity.TransferCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferCheckService {
    @Autowired
    private TransferCheckMapper transferCheckMapper;

    int deleteByPrimaryKey(String transferCheckId){
        return  transferCheckMapper.deleteByPrimaryKey(transferCheckId);
    }

    int insert(TransferCheck record){
        return  transferCheckMapper.insert(record);
    }

    int insertSelective(TransferCheck record){
        return  transferCheckMapper.insertSelective(record);
    }

    TransferCheck selectByPrimaryKey(String transferCheckId){
        return  transferCheckMapper.selectByPrimaryKey(transferCheckId);
    }

    int updateByPrimaryKeySelective(TransferCheck record){
        return  transferCheckMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(TransferCheck record){
        return  transferCheckMapper.updateByPrimaryKey(record);
    }
}