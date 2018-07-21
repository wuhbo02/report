package com.gdin.report.controller;

import com.gdin.report.dto.DxpMsg;
import com.gdin.report.service.HandleService;
import com.gdin.report.util.JaxbUtil;
import com.gdin.report.vo.JSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {
    @Autowired
    private HandleService handleService;


    @PostMapping("/report/receive")
    public JSONResult dealMes(@RequestBody String data){
        JSONResult<Object> rs = new JSONResult<Object>();
        rs.setResultFlag("1");
        if(StringUtils.isNoneBlank(data)){
            return handleService.handle(data);
        }else{
            rs.setResultFlag("0");
            rs.setFailInfo("输入参数空值");
        }

        return  rs;
    }
}
