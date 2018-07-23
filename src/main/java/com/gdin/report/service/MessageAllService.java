package com.gdin.report.service;

import com.gdin.report.dao.MessageAllMapper;
import com.gdin.report.entity.MessageAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageAllService {
    @Autowired
    private MessageAllMapper messageAllMapper;

    @Transactional
    int deleteByPrimaryKey(String messageAllId){
        return messageAllMapper.deleteByPrimaryKey(messageAllId);
    }
    @Transactional
    int insert(MessageAll record){
        return messageAllMapper.insert(record);
    }
    @Transactional
    int insertSelective(MessageAll record){
        return messageAllMapper.insertSelective(record);
    }

    MessageAll selectByPrimaryKey(String messageAllId){
        return messageAllMapper.selectByPrimaryKey(messageAllId);
    }
    @Transactional
    int updateByPrimaryKeySelective(MessageAll record){
        return messageAllMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(MessageAll record){
        return messageAllMapper.updateByPrimaryKey(record);
    }
}