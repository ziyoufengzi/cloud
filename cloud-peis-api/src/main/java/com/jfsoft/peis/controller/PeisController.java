package com.jfsoft.peis.controller;

import com.jfsoft.peis.service.IPeisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by web on 2017/6/28.
 */
@RestController
public class PeisController {

    @Autowired
    private IPeisService peisService;

    @Value("${server.port}")
    String port;
    @RequestMapping("/peis")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @PostMapping(value = "/save")
    public HttpEntity save(@ModelAttribute Map map) {
        try {
            System.out.println(map.get("abc"));
            peisService.insertPeisPercheckinfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
