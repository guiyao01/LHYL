package com.insp.cloudtest.controller;

import com.insp.cloudtest.entity.ZgspPrepareWarehouseEntity;
import com.insp.cloudtest.entity.ZgspReceiveVerifyEntity;
import com.insp.cloudtest.entity.ZgspReceiveVerifyItemEntity;
import com.insp.cloudtest.service.ReceiveAcceptanceService;
import com.insp.cloudtest.service.WareHouseService;
import com.insp.cloudtest.util.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/RV")
public class ReceiveAcceptanceController {
    @Autowired
    private ReceiveAcceptanceService receiveAcceptanceService;

    @Autowired
    private WareHouseService wareHouseService;

    /**
     * 收货验收
     * @param id
     * @return
     */
    @GetMapping(path = "/getReceiveVerify")
    public ResponseModel<ZgspReceiveVerifyEntity> getReceiveVerify(@RequestParam String id){
        return new ResponseModel<>(HttpStatus.OK,true,"执行成功",this.receiveAcceptanceService.getReceiveVerify(id));
    }

    /**
     * 收货验收详情
     * @param id
     * @return
     */
    @GetMapping(path = "/getReceiveVerifyItem")
    public ResponseModel<ZgspReceiveVerifyItemEntity> getReceiveVerifyItem(@RequestParam String id){
        return new ResponseModel<>(HttpStatus.OK, true, "执行成功", this.receiveAcceptanceService.getReceiveVerifyItem(id));
    }

    @GetMapping(path = "/getWH")
    public ResponseModel<ZgspPrepareWarehouseEntity> getWH(@RequestParam String id) {
        return new ResponseModel<>(HttpStatus.OK, true, "成功", this.wareHouseService.getWH(id));
    }

    @PostMapping(path = "/insertWH")
    public ResponseModel<String> insertWH(@RequestParam String id) {
        return new ResponseModel<>(HttpStatus.OK, true, "成功", this.wareHouseService.inStorage(id));
    }




}
