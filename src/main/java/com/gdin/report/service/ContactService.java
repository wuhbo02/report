package com.gdin.report.service;

import com.gdin.report.dao.ContactMapper;
import com.gdin.report.entity.Contact;
import com.gdin.report.entity.ContactCommunication;
import com.gdin.report.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactMapper contactMapper;
    @Autowired
    private CommunicationService communicationService;
    @Autowired
    private ContactCommunicationService contactCommunicationService;



    int deleteByPrimaryKey(String contactId){
        return contactMapper.deleteByPrimaryKey(contactId);
    }

    int insert(Contact record){
        return contactMapper.insert(record);
    }

    int insertSelective(Contact record){
        return contactMapper.insertSelective(record);
    }

    Contact selectByPrimaryKey(String contactId){
        return contactMapper.selectByPrimaryKey(contactId);
    }

    int updateByPrimaryKeySelective(Contact record){
        return contactMapper.updateByPrimaryKeySelective(record);
    }

    int updateByPrimaryKey(Contact record){
        return contactMapper.updateByPrimaryKey(record);
    }

    /**
     *  保存 人员信息及其 通讯信息
     * @param record
     * @param list
     * @return
     */
    public Contact save(Contact record, List<com.gdin.report.dto.exp.Communication> list){
        if(record==null){
            return record;
        }
        if(record.getContactId()==null){
            int num = (int) (Math.random() * 2000);
            String randomstr = DateUtils.parseDateToString(new Date(),"yyyyMMddHHmmssSS")+num;
            record.setContactId(randomstr);
        }

        Contact contact = this.selectByPrimaryKey(record.getContactId());

        if(contact==null){
            this.insert(record);
        }

        if(list!=null && list.size()>0){
            for(com.gdin.report.dto.exp.Communication obj:list){
                com.gdin.report.entity.Communication communicationEntity = communicationService.selectByPrimaryKey(obj.getID());

                if(communicationEntity==null){
                    communicationEntity = new  com.gdin.report.entity.Communication();
                    communicationEntity.setCommunicationId(obj.getID());
                    communicationEntity.setTypeid(obj.getTypeID());
                    communicationService.insert(communicationEntity);
                }

                ContactCommunication contactCommunication = new ContactCommunication();
                contactCommunication.setCommunicationId(obj.getID());
                contactCommunication.setContactId(record.getContactId());
                contactCommunicationService.insert(contactCommunication);
            }
        }

        return record;
    }
}