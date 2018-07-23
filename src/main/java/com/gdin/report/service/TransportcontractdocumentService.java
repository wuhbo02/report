package com.gdin.report.service;

import com.gdin.report.dao.TransportcontractdocumentMapper;
import com.gdin.report.entity.Transportcontractdocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransportcontractdocumentService {
    @Autowired
    private TransportcontractdocumentMapper transportcontractdocumentMapper;

    @Transactional
    int deleteByPrimaryKey(String transportcontractdocumentId){
        return  transportcontractdocumentMapper.deleteByPrimaryKey(transportcontractdocumentId);
    }
    @Transactional
    int insert(Transportcontractdocument record){
        return  transportcontractdocumentMapper.insert(record);
    }
    @Transactional
    int insertSelective(Transportcontractdocument record){
        return  transportcontractdocumentMapper.insertSelective(record);
    }

    Transportcontractdocument selectByPrimaryKey(String transportcontractdocumentId){
        return transportcontractdocumentMapper.selectByPrimaryKey(transportcontractdocumentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(Transportcontractdocument record){
        return  transportcontractdocumentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(Transportcontractdocument record){
        return  transportcontractdocumentMapper.updateByPrimaryKey(record);
    }
}