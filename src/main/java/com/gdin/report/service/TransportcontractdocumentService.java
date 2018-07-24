package com.gdin.report.service;

import com.gdin.report.dao.TransportcontractdocumentMapper;
import com.gdin.report.dto.exp.TransportContractDocument;
import com.gdin.report.entity.Transportcontractdocument;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.swing.StringUIClientPropertyKey;

import java.util.List;

@Service
public class TransportcontractdocumentService {
    @Autowired
    private TransportcontractdocumentMapper transportcontractdocumentMapper;

    @Transactional
    int deleteByPrimaryKey(String transportcontractdocumentId){
        return  transportcontractdocumentMapper.deleteByPrimaryKey(transportcontractdocumentId);
    }
    @Transactional
    int insert(Transportcontractdocument record){
        return  transportcontractdocumentMapper.insert(record);
    }
    @Transactional
    int insertSelective(Transportcontractdocument record){
        return  transportcontractdocumentMapper.insertSelective(record);
    }

    Transportcontractdocument selectByPrimaryKey(String transportcontractdocumentId){
        return transportcontractdocumentMapper.selectByPrimaryKey(transportcontractdocumentId);
    }
    @Transactional
    int updateByPrimaryKeySelective(Transportcontractdocument record){
        return  transportcontractdocumentMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(Transportcontractdocument record){
        return  transportcontractdocumentMapper.updateByPrimaryKey(record);
    }

    @Transactional
    public Transportcontractdocument saveOrUpdate(TransportContractDocument transportContractDocument ){
        if(transportContractDocument==null||StringUtils.isBlank(transportContractDocument.getID())){
            return null;
        }

        Transportcontractdocument transportcontractdocumentEnt = this.selectByPrimaryKey(transportContractDocument.getID());
        boolean exists = false;
        if(transportcontractdocumentEnt==null){
            transportcontractdocumentEnt = new Transportcontractdocument();
        }else{
            exists = true;
        }

        transportcontractdocumentEnt.setTransportcontractdocumentId(transportContractDocument.getID());
        transportcontractdocumentEnt.setConditioncode(transportContractDocument.getConditionCode());
        transportcontractdocumentEnt.setDeconsolidator(transportContractDocument.getDeconsolidator()==null?"" :transportContractDocument.getDeconsolidator().getID());
        List<String> reasonlist = transportContractDocument.getChangeReasonCode();

        //更改原因代码
        String temp = "";
        if(reasonlist!=null){
            for( String reasoncode:reasonlist){
                temp += reasoncode+",";
            }
            if(temp.endsWith(",")){
                temp.substring(0,temp.length()-1);
            }
        }

        transportcontractdocumentEnt.setChangereasoncode(temp);

        if( !exists ){
            this.insert(transportcontractdocumentEnt);
        }else{
            //this.updateByPrimaryKeySelective(transportcontractdocumentEnt);
        }

        return  transportcontractdocumentEnt;
    }

}