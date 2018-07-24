package com.gdin.report.service;

import com.gdin.report.config.MsgType;
import com.gdin.report.dao.TransferCheckMapper;
import com.gdin.report.dto.exp.*;
import com.gdin.report.dto.exp.Consignment;
import com.gdin.report.dto.exp.Contact;
import com.gdin.report.dto.exp.ExportConsignment;
import com.gdin.report.dto.exp.ImportConsignment;
import com.gdin.report.entity.*;
import com.gdin.report.util.DateUtils;
import com.gdin.report.vo.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TransferCheckService {
    @Autowired
    private TransferCheckMapper transferCheckMapper;
    @Autowired
    private TransferCheckRelationService transferCheckRelationService;
    @Autowired
    private TransferCheckEquipmentService transferCheckEquipmentService;
    @Autowired
    private ImportReportService importReportService;
    @Autowired
    private ExportReportService exportReportService;
    @Autowired
    private BordertransportmeansService bordertransportmeansService;
    @Autowired
    private TransportcontractdocumentService transportcontractdocumentService;
    @Autowired
    private DeliverydestinationService deliverydestinationService;
    @Autowired
    private ConsignmentService consignmentService;
    @Autowired
    private ImportConsignmentService importConsignmentService;
    @Autowired
    private ExportConsignmentService exportConsignmentService;
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
    int deleteByPrimaryKey(String transferCheckId){
        return  transferCheckMapper.deleteByPrimaryKey(transferCheckId);
    }
    @Transactional
    int insert(TransferCheck record){
        return  transferCheckMapper.insert(record);
    }
    @Transactional
    int insertSelective(TransferCheck record){
        return  transferCheckMapper.insertSelective(record);
    }

    TransferCheck selectByPrimaryKey(String transferCheckId){
        return  transferCheckMapper.selectByPrimaryKey(transferCheckId);
    }
    @Transactional
    int updateByPrimaryKeySelective(TransferCheck record){
        return  transferCheckMapper.updateByPrimaryKeySelective(record);
    }
    @Transactional
    int updateByPrimaryKey(TransferCheck record){
        return  transferCheckMapper.updateByPrimaryKey(record);
    }

    public JSONResult save(String copMsgId, String msgType, Manifest manifest) {
        JSONResult rs = new JSONResult();
        rs.setResultFlag("1");

        Manifest.Declaration declaration =  manifest.getDeclaration();
        List<Relation> relationList = declaration.getRelation();


        TransferCheck transferCheckEntity = new TransferCheck();
        //申报地海关代码
        transferCheckEntity.setDeclarationofficeid(declaration.getDeclarationOfficeID());

        transferCheckEntity.setTransferCheckId(copMsgId);
        transferCheckEntity.setMessageid(copMsgId);
        transferCheckEntity.setMessagetype(msgType);
        this.insert(transferCheckEntity);

        if(relationList!=null && relationList.size()>0){
            for(Relation relation:relationList){
                String importReportId = null; //原始舱单
                String exportReportId = null; //预配舱单

                ImportInformation importInformation = relation.getImportInformation();
                ExportInformation exportInformation = relation.getExportInformation();

                //原始舱单
                if(importInformation!=null){
                    BorderTransportMeans borderTransportMeans = importInformation.getBorderTransportMeans();
                    RepresentativePerson representativePerson = importInformation.getRepresentativePerson();
                    ImportConsignment importConsignmentObj = importInformation.getConsignment();

                    //保存运输工具
                    Bordertransportmeans entBordertransportmeans = bordertransportmeansService.save(borderTransportMeans);

                    //报文主表
                    //生成的key
                    int num = (int)(Math.random()*(9999-1000+1))+1000;
                    String randomstr = DateUtils.parseDateToString(new Date(),"yyyyMMddHHmmsss")+num;

                    ImportReport importReport = new ImportReport();
                    importReport.setImportReportId(randomstr);
                    importReport.setMessageid(randomstr);
                    importReport.setMessagetype(MsgType.IMPORT_SHIP);
                    importReport.setRepresentativepersonname(representativePerson==null?"":representativePerson.getName());
                    //运输工具
                    if(entBordertransportmeans!=null){
                        importReport.setBordertransportmeansId(entBordertransportmeans.getBordertransportmeansId());
                    }

                    importReportService.insert(importReport);
                    importReportId = importReport.getImportReportId();

                    //提运单
                    if(importConsignmentObj!=null){

                        //运输合同
                        transportcontractdocumentService.saveOrUpdate(importConsignmentObj.getTransportContractDocument());
                        //运输合同end

                        com.gdin.report.entity.Consignment consignmentEntity = new com.gdin.report.entity.Consignment();

                        //运输合同id
                        consignmentEntity.setTransportcontractdocumentId(importConsignmentObj.getTransportContractDocument()==null?"":importConsignmentObj.getTransportContractDocument().getID());

                        //货物总件数/包装种类代码
                        if(importConsignmentObj.getConsignmentPackaging()!=null){
                            consignmentEntity.setPackagingquantity(importConsignmentObj.getConsignmentPackaging().getQuantityQuantity());
                            consignmentEntity.setPackagingtypecode(importConsignmentObj.getConsignmentPackaging().getTypeCode());
                        }


                        //货物装载运输工具时间
                        consignmentEntity.setLoadingdate(importConsignmentObj.getLoadingLocation()==null?"":importConsignmentObj.getLoadingLocation().getLoadingDate());
                        //装货地代码
                        consignmentEntity.setLoadinglocationid(importConsignmentObj.getLoadingLocation()==null?"":importConsignmentObj.getLoadingLocation().getID());

                        //货物总毛重
                        consignmentEntity.setTotalgrossmassmeasure(importConsignmentObj.getTotalGrossMassMeasure());


                        //保存提运单
                        consignmentService.insert(consignmentEntity);

                        //保存关系表
                        com.gdin.report.entity.ImportConsignment importConsignmentEntity = new com.gdin.report.entity.ImportConsignment();
                        importConsignmentEntity.setConsignmentId(consignmentEntity.getConsignmentId());
                        importConsignmentEntity.setImportReportId(importReport.getImportReportId());
                        importConsignmentService.insert(importConsignmentEntity);

                        //商品货物
                        ConsignmentItem consignmentItemObj = importConsignmentObj.getConsignmentItem();
                        if(consignmentItemObj!=null){
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
                                    ConsignmentitemEquipment consignmentitemEquipment = new ConsignmentitemEquipment();
                                    consignmentitemEquipment.setConsignmentitemId(consignmentitemEntity.getConsignmentitemId());
                                    consignmentitemEquipment.setTransportequipmentId(equipmentIdentification.getID());
                                    consignmentitemEquipmentService.insert(consignmentitemEquipment);
                                }
                            }
                            /**** 商品集装箱关系 end ****/

                        }

                    } //提运单end


                }



                //预配舱单
                if(exportInformation!=null){
                    RepresentativePerson representativePerson = exportInformation.getRepresentativePerson();
                    BorderTransportMeans borderTransportMeans = exportInformation.getBorderTransportMeans();
                    ExportConsignment exportConsignmentObj = exportInformation.getConsignment();

                    //保存运输工具
                    Bordertransportmeans entBordertransportmeans = bordertransportmeansService.save(borderTransportMeans);

                    //报文主表
                    //生成的key
                    int num = (int)(Math.random()*(9999-1000+1))+1000;
                    String randomstr = DateUtils.parseDateToString(new Date(),"yyyyMMddHHmmsss")+num;

                    ExportReport exportReport = new ExportReport();
                    exportReport.setExportReportId(randomstr);
                    exportReport.setMessageid(randomstr);
                    exportReport.setMessagetype(MsgType.EXPORT_SHIP);
                    exportReport.setRepresentativepersonname(representativePerson==null?"":representativePerson.getName());
                    //运输工具
                    if(entBordertransportmeans!=null){
                        exportReport.setBordertransportmeansId(entBordertransportmeans.getBordertransportmeansId());
                    }

                    exportReportService.insert(exportReport);
                    exportReportId = exportReport.getExportReportId();


                    if(exportConsignmentObj!=null){
                        //运输合同
                        transportcontractdocumentService.saveOrUpdate(exportConsignmentObj.getTransportContractDocument());
                        //运输合同end

                        com.gdin.report.entity.Consignment consignmentEntity = new com.gdin.report.entity.Consignment();

                        //运输合同id
                        consignmentEntity.setTransportcontractdocumentId(exportConsignmentObj.getTransportContractDocument()==null?"":exportConsignmentObj.getTransportContractDocument().getID());

                        //货物总件数/包装种类代码
                        if(exportConsignmentObj.getConsignmentPackaging()!=null){
                            consignmentEntity.setPackagingquantity(exportConsignmentObj.getConsignmentPackaging().getQuantityQuantity());
                            consignmentEntity.setPackagingtypecode(exportConsignmentObj.getConsignmentPackaging().getTypeCode());
                        }

                        //到达卸货地日期
                        consignmentEntity.setArrivaldate(exportConsignmentObj.getUnloadingLocation()==null?"":exportConsignmentObj.getUnloadingLocation().getArrivalDate());
                        //卸货地代码
                        consignmentEntity.setUnloadinglocationid(exportConsignmentObj.getUnloadingLocation()==null?"":exportConsignmentObj.getUnloadingLocation().getID());

                        //货物总毛重
                        consignmentEntity.setTotalgrossmassmeasure(exportConsignmentObj.getTotalGrossMassMeasure());

                        //保存提运单
                        consignmentService.insert(consignmentEntity);

                        //保存关系表
                        com.gdin.report.entity.ExportConsignment exportConsignmentEntity = new com.gdin.report.entity.ExportConsignment();
                        exportConsignmentEntity.setConsignmentId(consignmentEntity.getConsignmentId());
                        exportConsignmentEntity.setExportReportId(exportReport.getExportReportId());
                        exportConsignmentService.insert(exportConsignmentEntity);

                    }
                }


                TransferCheckRelation transferCheckRelation = new TransferCheckRelation();

                transferCheckRelation.setAdditionalinformation(relation.getAdditionalInformation()==null?"":relation.getAdditionalInformation().getContent());
                transferCheckRelation.setTransferCheckId(transferCheckEntity.getTransferCheckId());
                transferCheckRelation.setImportReportId(importReportId);
                transferCheckRelation.setExportReportId(exportReportId);
                // 报文与舱单关系
                transferCheckRelationService.insert(transferCheckRelation);

                //集装箱（器）更换数据
                List<ChangeTransportEquipment> equipmentList = relation.getTransportEquipment();
                if(equipmentList!=null && equipmentList.size()>0){
                    for(ChangeTransportEquipment changeTransportEquipment:equipmentList){
                        TransferCheckEquipment transferCheckEquipmentEntity = new TransferCheckEquipment();

                        // 外键关联transferCheckRelation
                        transferCheckEquipmentEntity.setTransferCheckRelationId(transferCheckRelation.getTransferCheckRelationId());
                        //进口集装箱
                        transferCheckEquipmentEntity.setImporttransportequipmentid(changeTransportEquipment.getImportTransportEquipment()==null?""
                            : changeTransportEquipment.getImportTransportEquipment().getID());
                        //出口集装箱
                        transferCheckEquipmentEntity.setExporttransportequipmentid(changeTransportEquipment.getExportTransportEquipment()==null?""
                            : changeTransportEquipment.getExportTransportEquipment().getID() );

                        transferCheckEquipmentService.insert(transferCheckEquipmentEntity);

                    }
                }

            }
        }

        return rs;
    }
}