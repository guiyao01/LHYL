package com.insp.cloudtest.service;

import com.insp.cloudtest.entity.ZgspReceiveVerifyEntity;
import com.insp.cloudtest.entity.ZgspReceiveVerifyItemEntity;
import com.insp.cloudtest.repository.ReceiveVerifyItemRepository;
import com.insp.cloudtest.repository.ReceiveVerifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiveAcceptanceService {

    @Autowired
    private ReceiveVerifyRepository receiveVerifyRepository;

    @Autowired
    private ReceiveVerifyItemRepository receiveVerifyItemRepository;


    public ZgspReceiveVerifyEntity getReceiveVerify(String id){
        return receiveVerifyRepository.findByfId(id);
    }

    public ZgspReceiveVerifyItemEntity getReceiveVerifyItem(String id){
        return receiveVerifyItemRepository.findByfId(id);
    }


}
