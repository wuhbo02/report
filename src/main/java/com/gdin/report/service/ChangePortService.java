package com.gdin.report.service;

import com.gdin.report.dao.ChangePortMapper;
import com.gdin.report.dto.exp.*;
import com.gdin.report.dto.exp.Consignment;
import com.gdin.report.entity.*;
import com.gdin.report.entity.Contact;
import com.gdin.report.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChangePortService {
    @Autowired
    private ChangePortMapper changePortMapper;

    @Autowired
    private BordertransportmeansService bordertransportmeansService;
    @Autowired
    private TransportcontractdocumentService transportcontractdocumentService;
    @Autowired
    private DeliverydestinationService deliverydestinationService;
    @Autowired
    private ConsignmentService consignmentService;
    @Autowired
    private DispatchConsignmentService dispatchConsignmentService;
    @Autowired
    private ContactService contactService;
    @Autowired
    private  AddressService addressService;
    @Autowired
    private  ConsignmentRoutcountryService consignmentRoutcountryService;
    @Autowired
    private ConsignmentCuststatuscodeService consignmentCuststatuscodeService;
    @Autowired
    private EquipmentDamageService equipmentDamageService;
    @Autowired
    private TransportequipmentService transportequipmentService;
    @Autowired
    private TransportequipmentSealidService  transportequipmentSealidService;
    @Autowired
    private ConsignmentEquipmentsService consignmentEquipmentsService;
    @Autowired
    private ConsignmentitemService consignmentitemService;
    @Autowired
    private ConsignmentItemsService consignmentItemsService;
    @Autowired
    private ConsignmentitemUcrService consignmentitemUcrService;
    @Autowired
    private  ConsignmentitemEquipmentService consignmentitemEquipmentService;
    @Autowired
    private ConsignmentTransportService consignmentTransportService;
    @Autowired
    private ChangePortConsignmentService changePortConsignmentService;



    @Transactional
    int deleteByPrimaryKey(String changePortId){
        return changePortMapper.deleteByPrimaryKey(changePortId);
    }

    @Transactional
    int insert(ChangePort record){
        return changePortMapper.insert(record);
    }

    @Transactional
    int insertSelective(ChangePort record){
        return changePortMapper.insertSelective(record);
    }

    ChangePort selectByPrimaryKey(String changePortId){
        return changePortMapper.selectByPrimaryKey(changePortId);
    }

    @Transactional
    int updateByPrimaryKeySelective(ChangePort record){
        return changePortMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(ChangePort record){
        return changePortMapper.updateByPrimaryKey(record);
    }

    @Transactional
    public JSONResult save(String copMsgId, String msgType, Manifest manifest) throws Exception{
        Manifest.Declaration declaration =  manifest.getDeclaration();
        JSONResult<Object> rs = new JSONResult<Object>();
        rs.setResultFlag("1");
        //运输工具
        BigDecimal bordertransportmeansId = null;
        BorderTransportMeans borderTransportMeans = declaration.getBorderTransportMeans();
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

            entBordertransportmeans.setUnloadingdatetime(borderTransportMeans.getUnloading()==null?""
                    :borderTransportMeans.getUnloading().getUnloadingDatetime());
            entBordertransportmeans.setDespatchdatetime(borderTransportMeans.getDespatchdatetime());
            entBordertransportmeans.setCargofacilitylocation(borderTransportMeans.getCargofacilitylocation());

            bordertransportmeansService.insert(entBordertransportmeans);
            bordertransportmeansId = entBordertransportmeans.getBordertransportmeansId();

        }

        //变更部分
        BigDecimal changebordertransportmeansId = null;
        if(declaration.getChangePortOfArrival()!=null){
            ChangePortOfArrival changePortOfArrival = declaration.getChangePortOfArrival();
            Bordertransportmeans bordertransportmeansEntity = new Bordertransportmeans();

            bordertransportmeansEntity.setJourneyid(changePortOfArrival.getJourneyID());
            bordertransportmeansEntity.setUnloadinglocationid(changePortOfArrival.getUnloadingLocation()==null?""
                        :changePortOfArrival.getUnloadingLocation().getID());
            bordertransportmeansService.insert(bordertransportmeansEntity);
            changebordertransportmeansId = bordertransportmeansEntity.getBordertransportmeansId();
        }

        //报文主表
        ChangePort changePort= new ChangePort();
        changePort.setChangePortId(copMsgId);
        changePort.setMessageid(copMsgId);
        changePort.setMessagetype(msgType);
        changePort.setAdditionalinformation(declaration.getAdditionalInformation()==null?"":declaration.getAdditionalInformation().getContent());
        changePort.setBordertransportmeansId(bordertransportmeansId);//变更前
        changePort.setChangebordertransportmeansId(changebordertransportmeansId); //变更后
        this.insert(changePort);

        List<String> peopleids = new ArrayList<String>();

        //提运单
        List<Consignment> listConsignment = declaration.getConsignment();

        if(listConsignment!=null && listConsignment.size()>0){
            for(Consignment consignment:listConsignment){
                //运输合同
                TransportContractDocument transportContractDocument = consignment.getTransportContractDocument();
                Transportcontractdocument transportcontractdocumentEnt = transportcontractdocumentService.selectByPrimaryKey(transportContractDocument.getID());
                if(transportcontractdocumentEnt==null || transportcontractdocumentEnt.getTransportcontractdocumentId()==null){
                    transportcontractdocumentEnt = new Transportcontractdocument();
                    transportcontractdocumentEnt.setTransportcontractdocumentId(transportContractDocument.getID());
                    transportcontractdocumentEnt.setConditioncode(transportContractDocument.getConditionCode());
                    transportcontractdocumentEnt.setDeconsolidator(transportContractDocument.getDeconsolidator()==null?""
                            :transportContractDocument.getDeconsolidator().getID());
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
                    transportcontractdocumentService.insert(transportcontractdocumentEnt);
                }
                //运输合同end


                com.gdin.report.entity.Consignment consignmentEntity = new com.gdin.report.entity.Consignment();

                //运输合同id
                consignmentEntity.setTransportcontractdocumentId(consignment.getTransportContractDocument()==null?"":consignment.getTransportContractDocument().getID());

                //运输合同附加信息
                consignmentEntity.setAssociatedtransportdocument(consignment.getAssociatedTransportDocument()==null?"":consignment.getAssociatedTransportDocument().getID());

                //保存提运单
                consignmentService.insert(consignmentEntity);

                //保存关系表
                ChangePortConsignment changePortConsignment = new ChangePortConsignment();
                changePortConsignment.setConsignmentId(consignmentEntity.getConsignmentId());
                changePortConsignment.setChangePortId(changePort.getChangePortId());
                changePortConsignmentService.insert(changePortConsignment);

            }
        }

        return  rs;

    }

}
