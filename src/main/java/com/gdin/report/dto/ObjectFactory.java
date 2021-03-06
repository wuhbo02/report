//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.1-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 02:58:11 下午 CST 
//


package com.gdin.report.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gdin.report.dto2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SenderId_QNAME = new QName("http://www.chinaport.gov.cn/dxp", "SenderId");
    private final static QName _CopMsgId_QNAME = new QName("http://www.chinaport.gov.cn/dxp", "CopMsgId");
    private final static QName _Data_QNAME = new QName("http://www.chinaport.gov.cn/dxp", "Data");
    private final static QName _MsgType_QNAME = new QName("http://www.chinaport.gov.cn/dxp", "MsgType");
    private final static QName _ReceiverId_QNAME = new QName("http://www.chinaport.gov.cn/dxp", "ReceiverId");
    private final static QName _CreatTime_QNAME = new QName("http://www.chinaport.gov.cn/dxp", "CreatTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gdin.report.dto2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddInfo }
     * 
     */
    public AddInfo createAddInfo() {
        return new AddInfo();
    }

    /**
     * Create an instance of {@link BizKey }
     * 
     */
    public BizKey createBizKey() {
        return new BizKey();
    }

    /**
     * Create an instance of {@link DxpMsg }
     * 
     */
    public DxpMsg createDxpMsg() {
        return new DxpMsg();
    }

    /**
     * Create an instance of {@link FileName }
     * 
     */
    public FileName createFileName() {
        return new FileName();
    }

    /**
     * Create an instance of {@link IcCard }
     * 
     */
    public IcCard createIcCard() {
        return new IcCard();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new Key();
    }

    /**
     * Create an instance of {@link TransInfo }
     * 
     */
    public TransInfo createTransInfo() {
        return new TransInfo();
    }

    /**
     * Create an instance of {@link ReceiverIds }
     * 
     */
    public ReceiverIds createReceiverIds() {
        return new ReceiverIds();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.chinaport.gov.cn/dxp", name = "SenderId")
    public JAXBElement<String> createSenderId(String value) {
        return new JAXBElement<String>(_SenderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.chinaport.gov.cn/dxp", name = "CopMsgId")
    public JAXBElement<Long> createCopMsgId(Long value) {
        return new JAXBElement<Long>(_CopMsgId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.chinaport.gov.cn/dxp", name = "Data")
    public JAXBElement<String> createData(String value) {
        return new JAXBElement<String>(_Data_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.chinaport.gov.cn/dxp", name = "MsgType")
    public JAXBElement<String> createMsgType(String value) {
        return new JAXBElement<String>(_MsgType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.chinaport.gov.cn/dxp", name = "ReceiverId")
    public JAXBElement<String> createReceiverId(String value) {
        return new JAXBElement<String>(_ReceiverId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.chinaport.gov.cn/dxp", name = "CreatTime")
    public JAXBElement<XMLGregorianCalendar> createCreatTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreatTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

}
