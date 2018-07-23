package com.gdin.report.service;

import com.gdin.report.dao.ChgTransportMapper;
import com.gdin.report.dto.exp.Manifest;
import com.gdin.report.entity.ChgTransport;
import com.gdin.report.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChgTransportService {
    @Autowired
    private ChgTransportMapper chgTransportMapper;

    @Transactional
    int deleteByPrimaryKey(String chgTransportId){
        return  chgTransportMapper.deleteByPrimaryKey(chgTransportId);
    }
    @Transactional
    int insert(ChgTransport record){
        return  chgTransportMapper.insert(record);
    }
    @Transactional
    int insertSelective(ChgTransport record){
        return  chgTransportMapper.insertSelective(record);
    }

    ChgTransport selectByPrimaryKey(String chgTransportId){
        return  chgTransportMapper.selectByPrimaryKey(chgTransportId);
    }
    @Transactional
    int updateByPrimaryKeySelective(ChgTransport record){
        return  chgTransportMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(ChgTransport record){
        return  chgTransportMapper.updateByPrimaryKey(record);
    }

    public JSONResult save(String copMsgId, String msgType, Manifest manifest) {
        JSONResult rs = new JSONResult();
        rs.setResultFlag("1");
        return rs;
    }
}