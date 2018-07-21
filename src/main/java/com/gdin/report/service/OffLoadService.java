package com.gdin.report.service;

import com.gdin.report.dao.OffLoadMapper;
import com.gdin.report.entity.OffLoad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffLoadService {
    @Autowired
    private OffLoadMapper offLoadMapper;


    int deleteByPrimaryKey(String offLoadId){
        return offLoadMapper.deleteByPrimaryKey(offLoadId);
    }

    int insert(OffLoad record){
        return offLoadMapper.insert(record);
    }

    int insertSelective(OffLoad record){
        return offLoadMapper.insertSelective(record);
    }

    OffLoad selectByPrimaryKey(String offLoadId){
        return offLoadMapper.selectByPrimaryKey(offLoadId);
    }

    int updateByPrimaryKeySelective(OffLoad record){
        return offLoadMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(OffLoad record){
        return offLoadMapper.updateByPrimaryKey(record);
    }
}