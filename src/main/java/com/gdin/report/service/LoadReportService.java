package com.gdin.report.service;

import com.gdin.report.dao.LoadReportMapper;
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
public class LoadReportService {
    @Autowired
    private LoadReportMapper loadReportMapper;

    @Autowired
    private BordertransportmeansService bordertransportmeansService;
    @Autowired
    private TransportcontractdocumentService transportcontractdocumentService;
    @Autowired
    private DeliverydestinationService deliverydestinationService;
    @Autowired
    private ConsignmentService consignmentService;
    @Autowired
    private LoadConsignmentService loadConsignmentService;
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

    @Transactional
    int deleteByPrimaryKey(String loadReportId){
        return loadReportMapper.deleteByPrimaryKey(loadReportId);
    }
    @Transactional
    int insert(LoadReport record){
        return loadReportMapper.insert(record);
    }
    @Transactional
    int insertSelective(LoadReport record){
        return loadReportMapper.insertSelective(record);
    }

    LoadReport selectByPrimaryKey(String loadReportId){
        return loadReportMapper.selectByPrimaryKey(loadReportId);
    }
    @Transactional
    int updateByPrimaryKeySelective(LoadReport record){
        return loadReportMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(LoadReport record){
        return loadReportMapper.updateByPrimaryKey(record);
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
            bordertransportmeansId = entBordertransportmeans.getBordertransportmeansId();

        }

        //报文主表
        LoadReport loadReport = new LoadReport();
        loadReport.setLoadReportId(copMsgId);
        loadReport.setMessageid(copMsgId);
        loadReport.setMessagetype(msgType);
        /*loadReport.setRepresentativepersonname(declaration.getRepresentativePerson()==null?"":declaration.getRepresentativePerson().getName());
        loadReport.setAgentid(declaration.getAgent()==null?"":declaration.getAgent().getID());
        loadReport.setExitcustomsofficeid(declaration.getExitCustomsOffice()==null?"":declaration.getExitCustomsOffice().getID());*/

        loadReport.setAdditionalinformation(declaration.getAdditionalInformation()==null?"":declaration.getAdditionalInformation().getContent());
        loadReport.setCarrierid(declaration.getCarrier()==null?"":declaration.getCarrier().getID());
        loadReport.setBordertransportmeansId(bordertransportmeansId);

        this.insert(loadReport);

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


                //consignmentEntity.setChangeconsignmentId(); //变更后提运单


                /****人员信息******/
                //收货人
                consignmentEntity.setConsigneeId(consignment.getConsignee()==null?"":consignment.getConsignee().getID());

                //发货人
                consignmentEntity.setConsignorId(consignment.getConsignor()==null?"":consignment.getConsignor().getID());

                if(consignment.getConsignee()!=null){
                    Consignee consignee = consignment.getConsignee();
                    if(consignee.getID()!=null && !peopleids.contains(consignee.getID())) {
                        Contact contactEntiry = new Contact();
                        contactEntiry.setName(consignee.getName());
                        contactEntiry.setContactId(consignee.getID());
                        contactEntiry.setAeo(consignee.getAEO());
                        if (consignee.getAddress() != null) {
                            Address address = addressService.saveAddress(consignee.getAddress());
                            contactEntiry.setAddressId(address.getAddressId());
                        }

                        Contact contact = contactService.save(contactEntiry, consignee.getCommunication());
                        peopleids.add(consignee.getID()); // //临时存放人员id，免重复添加
                    }

                    //收货具体联系人
                    if(consignee.getContact()!=null){
                        Contact contactEntiry = new Contact();
                        contactEntiry.setName(consignee.getContact().getName());
                        Contact contact = contactService.save(contactEntiry, consignee.getContact().getCommunication());
                        consignmentEntity.setContactId(contact.getContactId());
                    }


                }


                if(consignment.getConsignor()!=null){
                    Consignor consignor = consignment.getConsignor();
                    if(consignor.getID()!=null && !peopleids.contains(consignor.getID())) {
                        Contact contactEntiry = new Contact();
                        contactEntiry.setName(consignor.getName());
                        contactEntiry.setContactId(consignor.getID());
                        contactEntiry.setAeo(consignor.getAEO());
                        if (consignor.getAddress() != null) {
                            Address address = addressService.saveAddress(consignor.getAddress());
                            contactEntiry.setAddressId(address.getAddressId());
                        }
                        Contact contact = contactService.save(contactEntiry, consignor.getCommunication());
                        peopleids.add(consignor.getID()); // //临时存放人员id，免重复添加
                    }
                }



                //中间承运人信息
                if(consignment.getIntermediateCarrier()!=null){
                    //todo 保存
                    if(consignment.getIntermediateCarrier().getID()!=null
                            && !peopleids.contains(consignment.getIntermediateCarrier().getID())) {
                        Contact contactEntiry = new Contact();
                        //contactEntiry.setName(consignment.getIntermediateCarrier().getID());
                        contactEntiry.setContactId(consignment.getIntermediateCarrier().getID());
                        Contact contact = contactService.save(contactEntiry, consignment.getIntermediateCarrier().getCommunication());

                        //临时存放人员id，免重复添加
                        peopleids.add(consignment.getIntermediateCarrier().getID());
                    }
                    //中间承运人id
                    consignmentEntity.setIntermediatecarrierId(consignment.getIntermediateCarrier().getID());
                }

                //危险品联系人
                if(consignment.getUNDGContact()!=null){

                    UNDGContact undgContact = consignment.getUNDGContact();
                    Contact contactEntiry = new Contact();
                    contactEntiry.setName(undgContact.getName());

                    Contact contact = contactService.save(contactEntiry,undgContact.getCommunication());
                    //危险品联系人id
                    consignmentEntity.setUndgcontactId(contact.getContactId());
                }

                //通知人
                if(consignment.getNotifyParty()!=null){
                    NotifyParty notifyParty = consignment.getNotifyParty();
                    if(notifyParty.getID()!=null && !peopleids.contains(notifyParty.getID())) {
                        Contact contactEntiry = new Contact();
                        contactEntiry.setName(notifyParty.getName());
                        contactEntiry.setContactId(notifyParty.getID());

                        if (notifyParty.getAddress() != null) {
                            Address address = addressService.saveAddress(notifyParty.getAddress());
                            contactEntiry.setAddressId(address.getAddressId());
                        }

                        Contact contact = contactService.save(contactEntiry, notifyParty.getCommunication());

                        peopleids.add(notifyParty.getID()); // //临时存放人员id，免重复添加
                    }

                    // 通知人id
                    consignmentEntity.setNotifypartyId(notifyParty.getID());
                }

                //货物总件数/包装种类代码
                if(consignment.getConsignmentPackaging()!=null){
                    consignmentEntity.setPackagingquantity(consignment.getConsignmentPackaging().getQuantityQuantity());
                    consignmentEntity.setPackagingtypecode(consignment.getConsignmentPackaging().getTypeCode());
                }

                //承运人货物分批到/发货标识
                //consignmentEntity.setTransportsplitindicator();

                //货物价值
                consignmentEntity.setValueamount(consignment.getValueAmount()==null?"":consignment.getValueAmount().getValueamount());
                //金额类型代码
                consignmentEntity.setCurrencytypecode(consignment.getValueAmount()==null?"":consignment.getValueAmount().getCurrencyTypeCode());

                //货物交付信息
                if(consignment.getDeliveryDestination()!=null){
                    Deliverydestination deliverydestinationEnt = new Deliverydestination();
                    deliverydestinationEnt.setCityname(consignment.getDeliveryDestination().getCityName());
                    deliverydestinationEnt.setCountrycode(consignment.getDeliveryDestination().getCountryCode());
                    deliverydestinationEnt.setLine(consignment.getDeliveryDestination().getLine());
                    deliverydestinationEnt.setCountrysubentityid(consignment.getDeliveryDestination().getCountrySubEntityID());
                    deliverydestinationEnt.setCountrysubentityname(consignment.getDeliveryDestination().getCountrySubEntityName());
                    deliverydestinationService.insert(deliverydestinationEnt);
                    consignmentEntity.setDeliverydestinationId(String.valueOf(deliverydestinationEnt.getDeliverydestinationId()));
                }

                //运费支付方法代码
                consignmentEntity.setFreightpayment(consignment.getFreightPayment()==null?"":consignment.getFreightPayment().getMethodCode());

                //货物托运的地点或者国家代码
                consignmentEntity.setGoodsconsignedplaceid(consignment.getGoodsConsignedPlace()==null?"":consignment.getGoodsConsignedPlace().getID());

                //收货地点代码
                consignmentEntity.setGoodsreceiptplaceid(consignment.getGoodsReceiptPlace()==null?"":consignment.getGoodsReceiptPlace().getID());
                //收货地点名称
                consignmentEntity.setGoodsreceiptplacename(consignment.getGoodsReceiptPlace()==null?"":consignment.getGoodsReceiptPlace().getName());
                //货物体积
                consignmentEntity.setGrossvolumemeasure(consignment.getGrossVolumeMeasure());

                //
                consignmentEntity.setHandlinginstructionscode(consignment.getHandling()==null?"":consignment.getHandling().getInstructionsCodeCode());

                consignmentEntity.setIntermediatecarrierId(consignment.getIntermediateCarrier()==null?"":consignment.getIntermediateCarrier().getID());
                //货物装载运输工具时间
                consignmentEntity.setLoadingdate(consignment.getLoadingLocation()==null?"":consignment.getLoadingLocation().getLoadingDate());
                //装货地代码
                consignmentEntity.setLoadinglocationid(consignment.getLoadingLocation()==null?"":consignment.getLoadingLocation().getID());

                //前一海关单证号
                consignmentEntity.setPrecustdocumentid(consignment.getPreviousCustomsDocument()==null?"":consignment.getPreviousCustomsDocument().getID());
                //前一海关单证类型代码
                consignmentEntity.setPrecustdocumenttypecode(consignment.getPreviousCustomsDocument()==null?"":consignment.getPreviousCustomsDocument().getTypeCode());

                //货物总毛重
                consignmentEntity.setTotalgrossmassmeasure(consignment.getTotalGrossMassMeasure());

                //中转地点代码
                consignmentEntity.setTranshipmentlocationid(consignment.getTranshipmentLocation()==null?"":consignment.getTranshipmentLocation().getID());

                //中转目的地代码
                consignmentEntity.setTransitdestinationid(consignment.getTransitDestination()==null?"":consignment.getTransitDestination().getID());

                //到达卸货地日期
                consignmentEntity.setArrivaldate(consignment.getUnloadingLocation()==null?"":consignment.getUnloadingLocation().getArrivalDate());
                //卸货地代码
                consignmentEntity.setUnloadinglocationid(consignment.getUnloadingLocation()==null?"":consignment.getUnloadingLocation().getID());

                //保存提运单
                consignmentService.insert(consignmentEntity);

                //保存关系表
                LoadConsignment loadConsignment = new LoadConsignment();
                loadConsignment.setConsignmentId(consignmentEntity.getConsignmentId());
                loadConsignment.setLoadReportId(loadReport.getLoadReportId());
                loadConsignmentService.insert(loadConsignment);

                //途经的国家代码
                if(consignment.getRoutingCountryCode()!=null && consignment.getRoutingCountryCode().size()>0){
                    for(String routingCountryCode:consignment.getRoutingCountryCode()){
                        ConsignmentRoutcountry consignmentRoutcountry = new ConsignmentRoutcountry();
                        consignmentRoutcountry.setConsignmentId(consignmentEntity.getConsignmentId());
                        consignmentRoutcountry.setRoutcountrycode(routingCountryCode);
                        consignmentRoutcountryService.insert(consignmentRoutcountry);
                    }
                }

                //货物海关状态代码
                if(consignment.getCustomsStatusCode()!=null ){
                    for(String customsStatusCode: consignment.getCustomsStatusCode()){
                        ConsignmentCuststatuscode consignmentCuststatuscode = new ConsignmentCuststatuscode();
                        consignmentCuststatuscode.setConsignmentId(consignmentEntity.getConsignmentId());
                        consignmentCuststatuscode.setCustomsstatuscode(customsStatusCode);
                        consignmentCuststatuscodeService.insert(consignmentCuststatuscode);
                    }
                }

                /*** 集装箱 start **/
                List<TransportEquipment> equipmentslist = consignment.getTransportEquipment();
                if(equipmentslist!=null){
                    for(TransportEquipment transportEquipment:equipmentslist){
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

                        //提运单与集装箱关联表
                        ConsignmentEquipments consignmentEquipmentsEntity = new ConsignmentEquipments();
                        consignmentEquipmentsEntity.setConsignmentId(consignmentEntity.getConsignmentId());//
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
                /*** 集装箱 over **/



                /*** 商品项信息 start **/
                List<ConsignmentItem> goodslist = consignment.getConsignmentItem();
                if(goodslist!=null && goodslist.size()>0){
                    for(ConsignmentItem consignmentItemObj:goodslist){
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
                        consignmentItemsEnt.setConsignmentId(consignmentEntity.getConsignmentId());
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
        }

        return  rs;

    }

}