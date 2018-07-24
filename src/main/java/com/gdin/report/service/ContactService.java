package com.gdin.report.service;

import com.gdin.report.dao.ContactMapper;
import com.gdin.report.entity.Contact;
import com.gdin.report.entity.ContactCommunication;
import com.gdin.report.util.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ContactService {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    private ContactMapper contactMapper;
    @Autowired
    private CommunicationService communicationService;
    @Autowired
    private ContactCommunicationService contactCommunicationService;


    @Transactional
    int deleteByPrimaryKey(String contactId){
        return contactMapper.deleteByPrimaryKey(contactId);
    }

    @Transactional
    int insert(Contact record){
        return contactMapper.insert(record);
    }

    @Transactional
    int insertSelective(Contact record){
        return contactMapper.insertSelective(record);
    }

    Contact selectByPrimaryKey(String contactId){
        return contactMapper.selectByPrimaryKey(contactId);
    }

    @Transactional
    int updateByPrimaryKeySelective(Contact record){
        return contactMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(Contact record){
        return contactMapper.updateByPrimaryKey(record);
    }

    /**
     *  保存 人员信息及其 通讯信息
     * @param record
     * @param list
     * @return
     */
    @Transactional
    public Contact save(Contact record, List<com.gdin.report.dto.exp.Communication> list){
        if(record==null){
            return record;
        }
        if(record.getContactId()==null){
            int num = (int)(Math.random()*(9999-1000+1))+1000;
            String randomstr = DateUtils.parseDateToString(new Date(),"yyyyMMddHHmmsss")+num;
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
                try {
                    contactCommunicationService.insert(contactCommunication);
                }catch (Exception e){
                    logger.error("--添加联系人通信工具关系表Exception:"+e.getMessage());
                }
            }
        }

        return record;
    }
}