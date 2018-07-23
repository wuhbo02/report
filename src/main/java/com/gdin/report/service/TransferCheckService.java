package com.gdin.report.service;

import com.gdin.report.dao.TransferCheckMapper;
import com.gdin.report.dto.exp.Manifest;
import com.gdin.report.entity.TransferCheck;
import com.gdin.report.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransferCheckService {
    @Autowired
    private TransferCheckMapper transferCheckMapper;


    @Transactional
    int deleteByPrimaryKey(String transferCheckId){
        return  transferCheckMapper.deleteByPrimaryKey(transferCheckId);
    }
    @Transactional
    int insert(TransferCheck record){
        return  transferCheckMapper.insert(record);
    }
    @Transactional
    int insertSelective(TransferCheck record){
        return  transferCheckMapper.insertSelective(record);
    }

    TransferCheck selectByPrimaryKey(String transferCheckId){
        return  transferCheckMapper.selectByPrimaryKey(transferCheckId);
    }
    @Transactional
    int updateByPrimaryKeySelective(TransferCheck record){
        return  transferCheckMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(TransferCheck record){
        return  transferCheckMapper.updateByPrimaryKey(record);
    }

    public JSONResult save(String copMsgId, String msgType, Manifest manifest) {
        JSONResult rs = new JSONResult();
        rs.setResultFlag("1");
        return rs;
    }
}