package com.gdin.report.service;

import com.gdin.report.dao.ChangePortMapper;
import com.gdin.report.entity.ChangePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangePortService {
    @Autowired
    private ChangePortMapper changePortMapper;

    int deleteByPrimaryKey(String changePortId){
        return changePortMapper.deleteByPrimaryKey(changePortId);
    }

    int insert(ChangePort record){
        return changePortMapper.insert(record);
    }

    int insertSelective(ChangePort record){
        return changePortMapper.insertSelective(record);
    }

    ChangePort selectByPrimaryKey(String changePortId){
        return changePortMapper.selectByPrimaryKey(changePortId);
    }

    int updateByPrimaryKeySelective(ChangePort record){
        return changePortMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(ChangePort record){
        return changePortMapper.updateByPrimaryKey(record);
    }
}
