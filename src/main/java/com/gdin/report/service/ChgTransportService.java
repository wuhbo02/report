package com.gdin.report.service;

import com.gdin.report.dao.ChgTransportMapper;
import com.gdin.report.dto.exp.*;
import com.gdin.report.dto.exp.Consignment;
import com.gdin.report.entity.*;
import com.gdin.report.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChgTransportService {
    @Autowired
    private ChgTransportMapper chgTransportMapper;


    @Autowired
    private BordertransportmeansService bordertransportmeansService;
    @Autowired
    private TransportcontractdocumentService transportcontractdocumentService;
    @Autowired
    private DeliverydestinationService deliverydestinationService;
    @Autowired
    private ConsignmentService consignmentService;
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
    private ChgTransportConsignmentService chgTransportConsignmentService;

    @Transactional
    int deleteByPrimaryKey(String chgTransportId){
        return  chgTransportMapper.deleteByPrimaryKey(chgTransportId);
    }
    @Transactional
    int insert(ChgTransport record){
        return  chgTransportMapper.insert(record);
    }
    @Transactional
    int insertSelective(ChgTransport record){
        return  chgTransportMapper.insertSelective(record);
    }

    ChgTransport selectByPrimaryKey(String chgTransportId){
        return  chgTransportMapper.selectByPrimaryKey(chgTransportId);
    }

    @Transactional
    int updateByPrimaryKeySelective(ChgTransport record){
        return  chgTransportMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    int updateByPrimaryKey(ChgTransport record){
        return  chgTransportMapper.updateByPrimaryKey(record);
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

        //变更后运输工具数据（其实就航班和运输工具代码）
        BigDecimal changebordertransportmeansId = null;
        if(declaration.getChangeBorderTransportMeans()!=null){
            borderTransportMeans = null;
            borderTransportMeans = declaration.getChangeBorderTransportMeans();
            Bordertransportmeans bordertransportmeansEntity = new Bordertransportmeans();
            bordertransportmeansEntity.setId(borderTransportMeans.getId());
            bordertransportmeansEntity.setJourneyid(borderTransportMeans.getJourneyID());
            bordertransportmeansEntity.setTypecode(borderTransportMeans.getTypeCode());
            bordertransportmeansEntity.setName(borderTransportMeans.getName());
            bordertransportmeansEntity.setFirstarrivallocationid(borderTransportMeans.getFirstArrivalLocationID());
            bordertransportmeansEntity.setArrivaldatetime(borderTransportMeans.getArrivalDateTime());
            bordertransportmeansEntity.setDeparturedatetime(borderTransportMeans.getDepartureDateTime());
            bordertransportmeansEntity.setActualdatetime(borderTransportMeans.getActualDateTime());
            bordertransportmeansEntity.setCompleteddatetime(borderTransportMeans.getCompletedDateTime());
            bordertransportmeansEntity.setLoadinglocationid(borderTransportMeans.getLoadingLocation()==null?""
                    :borderTransportMeans.getLoadingLocation().getID());
            bordertransportmeansEntity.setUnloadinglocationid(borderTransportMeans.getUnloadingLocation()==null?""
                    :borderTransportMeans.getUnloadingLocation().getID());
            bordertransportmeansEntity.setFreetext(borderTransportMeans.getFreetext());

            bordertransportmeansEntity.setUnloadingdatetime(borderTransportMeans.getUnloading()==null?""
                    :borderTransportMeans.getUnloading().getUnloadingDatetime());
            bordertransportmeansEntity.setDespatchdatetime(borderTransportMeans.getDespatchdatetime());
            bordertransportmeansEntity.setCargofacilitylocation(borderTransportMeans.getCargofacilitylocation());


            bordertransportmeansService.insert(bordertransportmeansEntity);
            changebordertransportmeansId = bordertransportmeansEntity.getBordertransportmeansId();
        }

        //报文主表
        ChgTransport chgTransport= new ChgTransport();
        chgTransport.setChgTransportId(copMsgId);
        chgTransport.setMessageid(copMsgId);
        chgTransport.setMessagetype(msgType);
        chgTransport.setAdditionalinformation(declaration.getAdditionalInformation()==null?"":declaration.getAdditionalInformation().getContent());
        chgTransport.setBordertransportmeansId(bordertransportmeansId);//变更前
        chgTransport.setChangebordertransportmeansId(changebordertransportmeansId); //变更后
        this.insert(chgTransport);

        List<String> peopleids = new ArrayList<String>();

        //提运单
        List<Consignment> listConsignment = declaration.getConsignment();

        if(listConsignment!=null && listConsignment.size()>0){
            for(Consignment consignment:listConsignment){
                //运输合同
                TransportContractDocument transportContractDocument = consignment.getTransportContractDocument();
                Transportcontractdocument transportcontractdocumentEnt = transportcontractdocumentService.selectByPrimaryKey(transportContractDocument.getID());
                if(transportcontractdocumentEnt==null && transportContractDocument!=null){
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


                com.gdin.report.entity.Consignment consignmentOriginEntity = new com.gdin.report.entity.Consignment();

                //运输合同id
                consignmentOriginEntity.setTransportcontractdocumentId(consignment.getTransportContractDocument()==null?"":consignment.getTransportContractDocument().getID());

                //运输合同附加信息
                consignmentOriginEntity.setAssociatedtransportdocument(consignment.getAssociatedTransportDocument()==null?"":consignment.getAssociatedTransportDocument().getID());


                /*******  !! 变更后的提运单 *******/
                ChangeConsignment changeConsignment = consignment.getChangeConsignment();
                if(changeConsignment!=null){
                    com.gdin.report.entity.Consignment consignmentChangeEntity = new com.gdin.report.entity.Consignment();

                    //变更后的提运单包含的内容
                    TransportContractDocument transportContractDocumentChg = changeConsignment.getTransportContractDocument();
                    AssociatedTransportDocument associatedTransportDocument = changeConsignment.getAssociatedTransportDocument();
                    List<TransportEquipment> transportEquipmentList = changeConsignment.getTransportEquipment();
                    List<ConsignmentItem> consignmentItemList = changeConsignment.getConsignmentItem();
                    //变更后的提运单包含的内容 end

                    //运输合同id
                    consignmentChangeEntity.setTransportcontractdocumentId(transportContractDocumentChg==null?"":transportContractDocumentChg.getID());
                    //运输合同附加信息
                    consignmentChangeEntity.setAssociatedtransportdocument(associatedTransportDocument==null?"":associatedTransportDocument.getID());

                    //插入变更后的提运单
                    consignmentService.insert(consignmentChangeEntity);
                    consignmentOriginEntity.setChangeconsignmentId(consignmentChangeEntity.getConsignmentId());//变更新与变更后的提运单关系

                    /*** 变更后的提运单包含 的 集装箱 start **/
                    if(transportEquipmentList!=null){
                        for(TransportEquipment transportEquipment:transportEquipmentList){
                            String equipmentid = transportEquipment.getEquipmentIdentification().getID();

                            boolean exists = false;
                            Transportequipment transportequipmentEnt = transportequipmentService.selectByPrimaryKey(equipmentid);
                            if(transportequipmentEnt==null){
                                transportequipmentEnt = new Transportequipment();
                            }else{
                                exists = true;
                            }
                            transportequipmentEnt.setCharacteristiccode(transportEquipment.getCharacteristicCode());
                            transportequipmentEnt.setFullnesscode(transportEquipment.getFullnessCode());

                            transportequipmentEnt.setLoadinglocationid(transportEquipment.getLoadingLocation()==null?""
                                    :transportEquipment.getLoadingLocation().getID());
                            transportequipmentEnt.setLoadingdate(transportEquipment.getLoadingLocation()==null?""
                                    :transportEquipment.getLoadingLocation().getLoadingDate());

                            transportequipmentEnt.setStowagelocationid(transportEquipment.getTransportMeans()==null?""
                                    :transportEquipment.getTransportMeans().getStowageLocationID());
                            transportequipmentEnt.setSupplierpartytypecode(transportEquipment.getSupplierPartyTypeCode());
                            transportequipmentEnt.setTransportequipmentId(equipmentid);
                            if(!exists){
                                transportequipmentService.insert(transportequipmentEnt);
                            }else{
                                transportequipmentService.updateByPrimaryKeySelective(transportequipmentEnt);
                            }

                            //变更后的提运单与集装箱关联表
                            ConsignmentEquipments consignmentEquipmentsEntity = new ConsignmentEquipments();
                            consignmentEquipmentsEntity.setConsignmentId(consignmentChangeEntity.getConsignmentId());//
                            consignmentEquipmentsEntity.setTransportequipmentId(transportequipmentEnt.getTransportequipmentId());
                            consignmentEquipmentsService.insert(consignmentEquipmentsEntity);

                            if(transportEquipment.getSealIDList()!=null){
                                for(TransportEquipment.SealID obj:transportEquipment.getSealIDList()){
                                    TransportequipmentSealid transportequipmentSealidEntity = new TransportequipmentSealid();
                                    transportequipmentSealidEntity.setAgencycode(obj.getAgencyCode());
                                    transportequipmentSealidEntity.setTransportequipmentId(transportequipmentEnt.getTransportequipmentId());
                                    transportequipmentSealidEntity.setCopmsgid(copMsgId);
                                    transportequipmentSealidEntity.setSealid(obj.getSealid());
                                    transportequipmentSealidService.insert(transportequipmentSealidEntity);
                                }
                            }

                            if(transportEquipment.getDamage()!=null){
                                for(Damage damage:transportEquipment.getDamage()){
                                    EquipmentDamage equipmentDamageEntity = new EquipmentDamage();
                                    equipmentDamageEntity.setDamageareacode(damage.getDamageArea()==null?"":damage.getDamageArea().getCode());
                                    equipmentDamageEntity.setDamageareatext(damage.getDamageArea()==null?"":damage.getDamageArea().getText());
                                    equipmentDamageEntity.setDamageseverity(damage.getSeverity());
                                    equipmentDamageEntity.setDamagetypecode(damage.getDamageType()==null?"":damage.getDamageType().getCode());
                                    equipmentDamageEntity.setDamagetypetext(damage.getDamageType()==null?"":damage.getDamageType().getText());
                                    equipmentDamageEntity.setTransportequipmentId(transportequipmentEnt.getTransportequipmentId());
                                    equipmentDamageService.insert(equipmentDamageEntity);
                                }
                            }

                        }
                    }
                    /*** 变更后的提运单包含 的 集装箱over **/



                    /*** 商品项信息 start **/
                    if(consignmentItemList!=null && consignmentItemList.size()>0){
                        for(ConsignmentItem consignmentItemObj:consignmentItemList){
                            Consignmentitem consignmentitemEntity = new Consignmentitem();
                            //商品项序号
                            consignmentitemEntity.setSequencenumeric(consignmentItemObj.getSequenceNumeric());

                            //商品项包装信息
                            if(consignmentItemObj.getConsignmentItemPackaging()!=null) {
                                consignmentitemEntity.setPackageMarksnumbers( consignmentItemObj.getConsignmentItemPackaging().getMarksNumbers() );
                                consignmentitemEntity.setPackageQuantity(consignmentItemObj.getConsignmentItemPackaging().getQuantityQuantity());
                                consignmentitemEntity.setPackageTypecode(consignmentItemObj.getConsignmentItemPackaging().getTypeCode());
                            }

                            //商品项简要描述
                            if(consignmentItemObj.getCommodity()!=null){
                                consignmentitemEntity.setCargodescription( consignmentItemObj.getCommodity().getCargoDescription() );
                                consignmentitemEntity.setUndgcode( consignmentItemObj.getCommodity().getUNDGCode() );
                                consignmentitemEntity.setTariffclassificationcode( consignmentItemObj.getCommodity().getTariffClassificationCode() );
                            }


                            //商品项补充描述
                            consignmentitemEntity.setAdditionalinformation(consignmentItemObj.getAdditionalInformation()==null?""
                                    :consignmentItemObj.getAdditionalInformation().getContent());

                            //商品项货物毛重
                            consignmentitemEntity.setGoodsmeasure(consignmentItemObj.getGoodsMeasure()==null?"":consignmentItemObj.getGoodsMeasure().getGrossMassMeasure());

                            //海关手续信息
                            consignmentitemEntity.setCustomsprocedure(consignmentItemObj.getCustomsProcedure()==null?"":consignmentItemObj.getCustomsProcedure().getCurrentCode());

                            //原产国信息
                            consignmentitemEntity.setOrigincountrycode(consignmentItemObj.getOrigin()==null?"":consignmentItemObj.getOrigin().getOriginCountryCode());

                            //添加商品项目
                            consignmentitemService.insert(consignmentitemEntity);

                            /**** 提运单与商品关系  ****/
                            ConsignmentItems consignmentItemsEnt = new ConsignmentItems();
                            consignmentItemsEnt.setConsignmentId(consignmentChangeEntity.getConsignmentId());
                            consignmentItemsEnt.setConsignmentitemId(consignmentitemEntity.getConsignmentitemId());
                            consignmentItemsService.insert(consignmentItemsEnt);
                            /**** 提运单与商品关系 end ****/


                            /**** 商品UCR 唯一托运编号 ****/
                            if(consignmentItemObj.getUCR()!=null && consignmentItemObj.getUCR().size()>0){
                                for(UCR ucr : consignmentItemObj.getUCR() ){
                                    if(ucr!=null && ucr.getID()!=null ){
                                        ConsignmentitemUcr consignmentitemUcr = new ConsignmentitemUcr();
                                        consignmentitemUcr.setConsignmentitemId(consignmentitemEntity.getConsignmentitemId());
                                        consignmentitemUcr.setUrcId(ucr.getID());
                                        consignmentitemUcrService.insert(consignmentitemUcr);
                                    }
                                }
                            }

                            /**** 商品集装箱关系 ****/
                            if( consignmentItemObj.getEquipmentIdentification()!=null && consignmentItemObj.getEquipmentIdentification().size()>0  ){
                                List<EquipmentIdentification> quimentList = consignmentItemObj.getEquipmentIdentification();
                                for(EquipmentIdentification equipmentIdentification:quimentList){

                              /*Transportequipment transportequipmentEnt = transportequipmentService.selectByPrimaryKey(equipmentIdentification.getID());
                              if(transportequipmentEnt==null){
                                  transportequipmentEnt = new Transportequipment();
                                  transportequipmentEnt.setTransportequipmentId(equipmentIdentification.getID());
                                  transportequipmentService.insert(transportequipmentEnt);
                              }*/

                                    ConsignmentitemEquipment consignmentitemEquipment = new ConsignmentitemEquipment();
                                    consignmentitemEquipment.setConsignmentitemId(consignmentitemEntity.getConsignmentitemId());
                                    consignmentitemEquipment.setTransportequipmentId(equipmentIdentification.getID());
                                    consignmentitemEquipmentService.insert(consignmentitemEquipment);
                                }

                            }
                            /**** 商品集装箱关系 end ****/

                        }
                    }

                    /*** 商品项信息 over **/

                }


                /*******  !! 变更后的提运单 *******/

                //保存提运单
                consignmentService.insert(consignmentOriginEntity);

                //保存关系表
                ChgTransportConsignment chgTransportConsignment = new ChgTransportConsignment();
                chgTransportConsignment.setConsignmentId(consignmentOriginEntity.getConsignmentId());
                chgTransportConsignment.setChgTransportId(chgTransport.getChgTransportId());
                chgTransportConsignmentService.insert(chgTransportConsignment);

            }
        }

        return  rs;

    }

}