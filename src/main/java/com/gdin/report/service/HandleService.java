package com.gdin.report.service;

import com.gdin.report.config.MsgType;
import com.gdin.report.dto.DxpMsg;
import com.gdin.report.dto.exp.*;
import com.gdin.report.entity.Bordertransportmeans;
import com.gdin.report.entity.ImportReport;
import com.gdin.report.entity.Message;
import com.gdin.report.util.JaxbUtil;
import com.gdin.report.vo.JSONResult;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import org.apache.commons.codec.binary.Base64;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.List;
import java.util.zip.ZipInputStream;

@Service
public class HandleService {
    private static Logger logger = LogManager.getLogger();

    @Autowired
    private MessageService messageService;
    @Autowired
    private BordertransportmeansService bordertransportmeansService;
    @Autowired
    private ImportReportService importReportService;

    public JSONResult handle(String xmlstr){
        JSONResult<Object> rs = new JSONResult<Object>();
        rs.setResultFlag("1");
        DxpMsg dxpMsg = JaxbUtil.xmlToBean(xmlstr,DxpMsg.class);
        if(dxpMsg!=null && dxpMsg.getTransInfo()!=null){
            String copMsgId = dxpMsg.getTransInfo().getCopMsgId();
            String msgType = dxpMsg.getTransInfo().getMsgType();
            String data = dxpMsg.getData();
            byte[] encodeBase64=null;
            try {
                encodeBase64 = Base64.decodeBase64(data.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                logger.error("舱单数据Base64解码失败,data为:"+xmlstr);
                e.printStackTrace();
                rs.setResultFlag("0");
                rs.setFailInfo("舱单数据Base64解码失败");
                return  rs;
            }

            try {
                data=new String(encodeBase64,"UTF-8");
            } catch (UnsupportedEncodingException e) {
                logger.error("舱单数据Base64编码生成String失败,data为:"+encodeBase64);
                e.printStackTrace();
                rs.setResultFlag("0");
                rs.setFailInfo("舱单数据Base64编码生成String失败");
                return  rs;
            }


            if(data.contains("<Zip>")) {
                try {
                    data=data.substring(data.indexOf("<Zip>")+5, data.lastIndexOf("</Zip>"));
                    encodeBase64 = Base64.decodeBase64(data.getBytes("UTF-8"));
                    data= new String(UnZipData(encodeBase64),"UTF-8");
                } catch (UnsupportedEncodingException e) {
                    logger.error("舱单数据zip解码失败,data为:"+data);
                    e.printStackTrace();
                    rs.setResultFlag("0");
                    rs.setFailInfo("舱单数据zip解码失败");
                    return  rs;
                }
            }

            Message msg = messageService.selectByPrimaryKey(copMsgId);
            if(msg!=null && msg.getMessageid()!=null){
                rs.setResultFlag("0");
                rs.setFailInfo("报文已经处理");
                return rs;
            }

            try {
                Manifest manifest = null;

                //data = data.replace("xmlns=\"urn:Declaration:datamodel:standard:CN:MT1101:1\"","");

                //运抵报告
                if(data.contains("<MessageType>"+MsgType.getArrivalData()))
                {

                }//分流运抵报告
                else if(data.contains("<MessageType>"+MsgType.getDistributeData()))
                {

                }
                //原始舱单
                else if(data.contains("<MessageType>"+MsgType.getImportData()))
                {
                    manifest = JaxbUtil.xmlToBean(data,Manifest.class);
                    importReportService.save(copMsgId,msgType,manifest);
                }
                //预配舱单
                else if(data.contains("<MessageType>"+MsgType.getExportData()))
                {
                     manifest = JaxbUtil.xmlToBean(data,Manifest.class);
                }
                else
                {
                    rs.setResultFlag("0");
                    rs.setFailInfo("未识别的报文类型");
                    return rs;
                }

                //保存报文
                Head head = manifest.getHead();
                Message message = new Message();
                message.setMsgtype(msgType);
                message.setCopmsgid(copMsgId);
                message.setFunctioncode(head.getFunctionCode());
                message.setMessageid(head.getMessageID());
                message.setMessagetype(head.getMessageType());
                message.setReceiverid(head.getReceiverID());
                message.setSenderid(head.getSenderID());
                message.setSendtime(head.getSendTime());
                message.setVersion(head.getVersion());
                message.setMessagebody(data);
                messageService.insert(message);

                rs.setData(manifest);
            }catch (Exception e){
                rs.setResultFlag("0");
                rs.setFailInfo("处理异常："+e.getMessage());
            }
        }else{
            rs.setResultFlag("0");
            rs.setFailInfo("报文格式错误");
        }

        return  rs;
    }


    private static String getElementVal(ElementNSImpl elementNS){
        if(elementNS==null){
            return "";
        }
        NodeList  list = elementNS.getChildNodes();
        if(list!=null && list.getLength()>0){
            Node node = list.item(0);
            return  node.getNodeValue();
        }else{
            return "";
        }
    }


    /**
     * 解压缩
     * @param data
     * @return
     */
    private static byte[] UnZipData(byte[] data){
        byte[] b = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ZipInputStream zip = new ZipInputStream(bis);
            while (zip.getNextEntry() != null) {
                byte[] buf = new byte[1024];
                int num = -1;
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                while ((num = zip.read(buf, 0, buf.length)) != -1) {
                    baos.write(buf, 0, num);
                }
                b = baos.toByteArray();
                baos.flush();
                baos.close();
            }
            zip.close();
            bis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return b;
    }

}
