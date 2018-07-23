package com.gdin.report.service;

import com.gdin.report.dao.OffLoadMapper;
import com.gdin.report.dto.exp.Manifest;
import com.gdin.report.entity.OffLoad;
import com.gdin.report.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OffLoadService {
    @Autowired
    private OffLoadMapper offLoadMapper;

    @Transactional
    int deleteByPrimaryKey(String offLoadId){
        return offLoadMapper.deleteByPrimaryKey(offLoadId);
    }
    @Transactional
    int insert(OffLoad record){
        return offLoadMapper.insert(record);
    }
    @Transactional
    int insertSelective(OffLoad record){
        return offLoadMapper.insertSelective(record);
    }

    OffLoad selectByPrimaryKey(String offLoadId){
        return offLoadMapper.selectByPrimaryKey(offLoadId);
    }
    @Transactional
    int updateByPrimaryKeySelective(OffLoad record){
        return offLoadMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(OffLoad record){
        return offLoadMapper.updateByPrimaryKey(record);
    }

    public JSONResult save(String copMsgId, String msgType, Manifest manifest) {
        JSONResult rs = new JSONResult();
        rs.setResultFlag("1");
        return rs;
    }
}