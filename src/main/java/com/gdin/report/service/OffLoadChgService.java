package com.gdin.report.service;

import com.gdin.report.dao.OffLoadChgMapper;
import com.gdin.report.dto.exp.Manifest;
import com.gdin.report.entity.OffLoadChg;
import com.gdin.report.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OffLoadChgService {
    @Autowired
    private OffLoadChgMapper offLoadChgMapper;

    @Transactional
    int deleteByPrimaryKey(String offLoadChgId){
        return offLoadChgMapper.deleteByPrimaryKey(offLoadChgId);
    }
    @Transactional
    int insert(OffLoadChg record){
        return offLoadChgMapper.insert(record);
    }
    @Transactional
    int insertSelective(OffLoadChg record){
        return offLoadChgMapper.insertSelective(record);
    }

    OffLoadChg selectByPrimaryKey(String offLoadChgId){
        return offLoadChgMapper.selectByPrimaryKey(offLoadChgId);
    }
    @Transactional
    int updateByPrimaryKeySelective(OffLoadChg record){
        return offLoadChgMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(OffLoadChg record){
        return offLoadChgMapper.updateByPrimaryKey(record);
    }

    public JSONResult save(String copMsgId, String msgType, Manifest manifest) {
        JSONResult rs = new JSONResult();
        rs.setResultFlag("1");
        return rs;
    }
}