package com.insp.cloudtest.controller;

import com.insp.cloudtest.entity.GOODSLICENSE;
import com.insp.cloudtest.service.OaOpService;
import com.insp.cloudtest.util.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class OaOpController {
    @Resource
    private OaOpService oaOpService;

    /**
     * ceshi
     * @return
     */
//    @GetMapping(path = "/one")
//    public ResponseModel<String> chTd(){
//        return  new ResponseModel<>(HttpStatus.OK,true,"执行成功",this.oaOpService.demoOne());
//    }

    @GetMapping(path = "/test")
    public ResponseModel<GOODSLICENSE> test(){
        return  new ResponseModel<>(HttpStatus.OK,true,"执行成功",this.oaOpService.demoOne());
    }


}
