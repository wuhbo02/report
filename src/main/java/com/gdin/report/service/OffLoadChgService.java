package com.gdin.report.service;

import com.gdin.report.dao.OffLoadChgMapper;
import com.gdin.report.entity.OffLoadChg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffLoadChgService {
    @Autowired
    private OffLoadChgMapper offLoadChgMapper;


    int deleteByPrimaryKey(String offLoadChgId){
        return offLoadChgMapper.deleteByPrimaryKey(offLoadChgId);
    }

    int insert(OffLoadChg record){
        return offLoadChgMapper.insert(record);
    }

    int insertSelective(OffLoadChg record){
        return offLoadChgMapper.insertSelective(record);
    }

    OffLoadChg selectByPrimaryKey(String offLoadChgId){
        return offLoadChgMapper.selectByPrimaryKey(offLoadChgId);
    }

    int updateByPrimaryKeySelective(OffLoadChg record){
        return offLoadChgMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(OffLoadChg record){
        return offLoadChgMapper.updateByPrimaryKey(record);
    }
}