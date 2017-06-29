package com.jfsoft.lis.controller;

import com.jfsoft.lis.entity.TcLisPatientinfo;
import com.jfsoft.lis.service.ILisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author ChenXc
 * @version V1.0
 * @Date 2017/6/29  11:39
 * @Description TODO(一句话描述类作用)
 */
@RestController
public class LisController {
    @Autowired
    private ILisService lisService;

    /**
     * spring cloud测试
     */
    @Value("${server.port}")
    String port;
    @RequestMapping("/test")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }


    /**
     * 检验人员信息保存接口
     * @param tcLisPatientinfo
     * @return
     */
    @PostMapping(value = "/lisSave")
    public HttpEntity peisSave(@ModelAttribute TcLisPatientinfo tcLisPatientinfo){
        lisService.insertLisPercheckinfo(tcLisPatientinfo);
        return new ResponseEntity<>(tcLisPatientinfo, HttpStatus.ACCEPTED);
    }
}
