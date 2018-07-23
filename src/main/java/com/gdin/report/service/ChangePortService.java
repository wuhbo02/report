package com.gdin.report.service;

import com.gdin.report.dao.ChangePortMapper;
import com.gdin.report.dto.exp.Manifest;
import com.gdin.report.entity.ChangePort;
import com.gdin.report.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChangePortService {
    @Autowired
    private ChangePortMapper changePortMapper;

    @Transactional
    int deleteByPrimaryKey(String changePortId){
        return changePortMapper.deleteByPrimaryKey(changePortId);
    }

    @Transactional
    int insert(ChangePort record){
        return changePortMapper.insert(record);
    }

    @Transactional
    int insertSelective(ChangePort record){
        return changePortMapper.insertSelective(record);
    }

    ChangePort selectByPrimaryKey(String changePortId){
        return changePortMapper.selectByPrimaryKey(changePortId);
    }

    @Transactional
    int updateByPrimaryKeySelective(ChangePort record){
        return changePortMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(ChangePort record){
        return changePortMapper.updateByPrimaryKey(record);
    }

    public JSONResult save(String copMsgId, String msgType, Manifest manifest) {
        JSONResult rs = new JSONResult();
        rs.setResultFlag("1");
        return rs;
    }
}
