package com.insp.cloudtest.service;

import com.insp.cloudtest.entity.GOODSLICENSE;
import com.insp.cloudtest.repository.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OaOpService {

    @Resource
    private GOODSLICENSERepository goodslicenseRepository;

    /**
     * 执行成功
     * @return 直接结果
     */
    public GOODSLICENSE demoOne(){
//        BfEntity byfId = bfEntityRepository.findByfId("组织主键");
//        System.out.println(byfId);
        GOODSLICENSE goodslicense = goodslicenseRepository.findByfId("001");
        return goodslicense;
    }
}
