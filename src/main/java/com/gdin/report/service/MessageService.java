package com.gdin.report.service;

import com.gdin.report.dao.MessageMapper;
import com.gdin.report.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageMapper messageMapper;


    int deleteByPrimaryKey(String messageid){
        return messageMapper.deleteByPrimaryKey(messageid);
    }

    int insert(Message record){
        return messageMapper.insert(record);
    }

    int insertSelective(Message record){
        return messageMapper.insertSelective(record);
    }

    Message selectByPrimaryKey(String messageid){
        return messageMapper.selectByPrimaryKey(messageid);
    }

    int updateByPrimaryKeySelective(Message record){
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKeyWithBLOBs(Message record){
        return messageMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    int updateByPrimaryKey(Message record){
        return messageMapper.updateByPrimaryKey(record);
    }
}