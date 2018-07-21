package com.gdin.report.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * Created by Wilson on 2017/5/2.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig   {
    @Bean
    public Docket commonDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("通用API接口文档")
                .apiInfo(apiInfo("提供通用接口"))
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gdin.report.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    //设置文档信息
    private ApiInfo apiInfo(String desc) {
        return new ApiInfo(
                "Test Website",				//标题名称
                desc,					//文档描述
                "1.0.1",				//版本号，自定义
                "http://gdin.gdwz.com:8080/ekp/login.jsp",	//许可人URL
                contact(),				//联系方式实体类
                "Wilson",				//许可人，许可证
                "http://gdin.gdwz.com:8080/ekp/login.jsp", Collections.EMPTY_LIST);	//许可URL
    }


    //设置联系方式
    private Contact contact() {
        return new Contact("Wilson", "http://gdin.gdwz.com:8080/ekp/login.jsp", "888@163.com");
    }


}
