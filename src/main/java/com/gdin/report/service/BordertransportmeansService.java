package com.gdin.report.service;

import com.gdin.report.dao.BordertransportmeansMapper;
import com.gdin.report.dto.exp.BorderTransportMeans;
import com.gdin.report.dto.exp.Captain;
import com.gdin.report.entity.Bordertransportmeans;
import com.gdin.report.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class BordertransportmeansService {
    @Autowired
    private BordertransportmeansMapper bordertransportmeansMapper;

    @Autowired
    private ContactService contactService;
    @Autowired
    private BordertransportmeansService bordertransportmeansService;

    @Transactional
    int deleteByPrimaryKey(BigDecimal bordertransportmeansId){
        return bordertransportmeansMapper.deleteByPrimaryKey(bordertransportmeansId);
    }

    @Transactional
    int insert(Bordertransportmeans record){
        return bordertransportmeansMapper.insert(record);
    }

    Bordertransportmeans save(Bordertransportmeans record){
         bordertransportmeansMapper.insert(record);
        return record;
    }

    @Transactional
    int insertSelective(Bordertransportmeans record){
        return bordertransportmeansMapper.insertSelective(record);
    }

    Bordertransportmeans selectByPrimaryKey(BigDecimal bordertransportmeansId){
        return bordertransportmeansMapper.selectByPrimaryKey(bordertransportmeansId);
    }

    @Transactional
    int updateByPrimaryKeySelective(Bordertransportmeans record){
        return bordertransportmeansMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(Bordertransportmeans record){
        return bordertransportmeansMapper.updateByPrimaryKey(record);
    }

    @Transactional
    public Bordertransportmeans save(BorderTransportMeans borderTransportMeans){
        if(borderTransportMeans!=null) {
            Bordertransportmeans entBordertransportmeans = new Bordertransportmeans();
            entBordertransportmeans.setId(borderTransportMeans.getId());
            entBordertransportmeans.setJourneyid(borderTransportMeans.getJourneyID());
            entBordertransportmeans.setTypecode(borderTransportMeans.getTypeCode());
            entBordertransportmeans.setName(borderTransportMeans.getName());
            entBordertransportmeans.setFirstarrivallocationid(borderTransportMeans.getFirstArrivalLocationID());
            entBordertransportmeans.setArrivaldatetime(borderTransportMeans.getArrivalDateTime());
            entBordertransportmeans.setDeparturedatetime(borderTransportMeans.getDepartureDateTime());
            entBordertransportmeans.setActualdatetime(borderTransportMeans.getActualDateTime());
            entBordertransportmeans.setCompleteddatetime(borderTransportMeans.getCompletedDateTime());
            entBordertransportmeans.setLoadinglocationid(borderTransportMeans.getLoadingLocation()==null?""
                    :borderTransportMeans.getLoadingLocation().getID());
            entBordertransportmeans.setUnloadinglocationid(borderTransportMeans.getUnloadingLocation()==null?""
                    :borderTransportMeans.getUnloadingLocation().getID());
            entBordertransportmeans.setFreetext(borderTransportMeans.getFreetext());

            //船长，如果有数据
            Captain captain = borderTransportMeans.getMaster();
            if(captain!=null && captain.getName()!=null){
                Contact contactEntiry = new Contact();
                contactEntiry.setName(captain.getName());
                Contact contact = contactService.save(contactEntiry,captain.getCommunication());
                entBordertransportmeans.setMaster(contact.getContactId());
            }


            entBordertransportmeans.setUnloadingdatetime(borderTransportMeans.getUnloading()==null?""
                    :borderTransportMeans.getUnloading().getUnloadingDatetime());
            entBordertransportmeans.setDespatchdatetime(borderTransportMeans.getDespatchdatetime());
            entBordertransportmeans.setCargofacilitylocation(borderTransportMeans.getCargofacilitylocation());

            bordertransportmeansService.insert(entBordertransportmeans);

            return  entBordertransportmeans;
        }

        return  null;
    }


}
