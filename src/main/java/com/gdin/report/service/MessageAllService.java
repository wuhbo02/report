package com.gdin.report.service;

import com.gdin.report.dao.MessageAllMapper;
import com.gdin.report.entity.MessageAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageAllService {
    @Autowired
    private MessageAllMapper messageAllMapper;


    int deleteByPrimaryKey(String messageAllId){
        return messageAllMapper.deleteByPrimaryKey(messageAllId);
    }

    int insert(MessageAll record){
        return messageAllMapper.insert(record);
    }

    int insertSelective(MessageAll record){
        return messageAllMapper.insertSelective(record);
    }

    MessageAll selectByPrimaryKey(String messageAllId){
        return messageAllMapper.selectByPrimaryKey(messageAllId);
    }

    int updateByPrimaryKeySelective(MessageAll record){
        return messageAllMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(MessageAll record){
        return messageAllMapper.updateByPrimaryKey(record);
    }
}