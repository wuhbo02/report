package com.gdin.report.service;

import com.gdin.report.dao.EmptycontaMapper;
import com.gdin.report.entity.Emptyconta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmptycontaService {
    @Autowired
    private EmptycontaMapper emptycontaMapper;


    int deleteByPrimaryKey(String emptycontaId){
        return emptycontaMapper.deleteByPrimaryKey(emptycontaId);
    }

    int insert(Emptyconta record){
        return emptycontaMapper.insert(record);
    }

    int insertSelective(Emptyconta record){
        return emptycontaMapper.insertSelective(record);
    }

    Emptyconta selectByPrimaryKey(String emptycontaId){
        return emptycontaMapper.selectByPrimaryKey(emptycontaId);
    }

    int updateByPrimaryKeySelective(Emptyconta record){
        return emptycontaMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Emptyconta record){
        return emptycontaMapper.updateByPrimaryKey(record);
    }
}