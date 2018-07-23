package com.gdin.report.util;

import com.gdin.report.dto.exp.Manifest;

import java.io.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Jaxb2工具类
 * @author
 * @create
 */
public class JaxbUtil {
    public static void main(String arg[]){
        InputStream fis = JaxbUtil.class.getResourceAsStream("/2.xml");
        String rs = "";
        try {
            //最后的"GBK"根据文件属性而定，如果不行，改成"UTF-8"试试
            InputStreamReader reader = new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                rs += line;
            }
            br.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        Manifest manifest = JaxbUtil.xmlToBean(rs,Manifest.class);
        System.out.println(11111);
    }

    /**
     * JavaBean转换成xml
     * 默认编码UTF-8
     * @param obj
     * @param
     * @return
     */
    public static String beanToXml(Object obj) {
        return beanToXml(obj, "UTF-8");
    }

    /**
     * JavaBean转换成xml
     * @param obj
     * @param encoding
     * @return
     */
    public static String beanToXml(Object obj, String encoding) {
        String result = null;
        try {
            JAXBContext context = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);

            StringWriter writer = new StringWriter();
            marshaller.marshal(obj, writer);
            result = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * xml转换成JavaBean
     * @param xml
     * @param c
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T xmlToBean(String xml, Class<T> c) {
        T t = null;
        try {
            JAXBContext context = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            t = (T) unmarshaller.unmarshal(new StringReader(xml));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }
}
