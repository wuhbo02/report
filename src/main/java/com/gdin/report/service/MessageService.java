package com.gdin.report.service;

import com.gdin.report.dao.MessageMapper;
import com.gdin.report.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Transactional
    int deleteByPrimaryKey(String messageid){
        return messageMapper.deleteByPrimaryKey(messageid);
    }
    @Transactional
    int insert(Message record){
        return messageMapper.insert(record);
    }
    @Transactional
    int insertSelective(Message record){
        return messageMapper.insertSelective(record);
    }

    Message selectByPrimaryKey(String messageid){
        return messageMapper.selectByPrimaryKey(messageid);
    }
    @Transactional
    int updateByPrimaryKeySelective(Message record){
        return messageMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKeyWithBLOBs(Message record){
        return messageMapper.updateByPrimaryKeyWithBLOBs(record);
    }
    @Transactional
    int updateByPrimaryKey(Message record){
        return messageMapper.updateByPrimaryKey(record);
    }
}