package com.gdin.report.service;

import com.gdin.report.dao.TransportcontractdocumentMapper;
import com.gdin.report.entity.Transportcontractdocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportcontractdocumentService {
    @Autowired
    private TransportcontractdocumentMapper transportcontractdocumentMapper;

    int deleteByPrimaryKey(String transportcontractdocumentId){
        return  transportcontractdocumentMapper.deleteByPrimaryKey(transportcontractdocumentId);
    }

    int insert(Transportcontractdocument record){
        return  transportcontractdocumentMapper.insert(record);
    }

    int insertSelective(Transportcontractdocument record){
        return  transportcontractdocumentMapper.insertSelective(record);
    }

    Transportcontractdocument selectByPrimaryKey(String transportcontractdocumentId){
        return transportcontractdocumentMapper.selectByPrimaryKey(transportcontractdocumentId);
    }

    int updateByPrimaryKeySelective(Transportcontractdocument record){
        return  transportcontractdocumentMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Transportcontractdocument record){
        return  transportcontractdocumentMapper.updateByPrimaryKey(record);
    }
}