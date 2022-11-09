package com.insp.cloudtest.service;

import com.insp.cloudtest.dao.WarehouseMapper;
import com.insp.cloudtest.entity.ZgspPrepareWarehouseEntity;
import com.insp.cloudtest.entity.ZgspPrepareWarehouseItemEntity;
import com.insp.cloudtest.entity.ZgspReceiveVerifyEntity;
import com.insp.cloudtest.entity.ZgspReceiveVerifyItemEntity;
import com.insp.cloudtest.repository.PrepareWarehouseItemRepository;
import com.insp.cloudtest.repository.PrepareWarehouseRepository;
import com.insp.cloudtest.repository.ReceiveVerifyItemRepository;
import com.insp.cloudtest.repository.ReceiveVerifyRepository;
import com.insp.cloudtest.util.Constant;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WareHouseService {

    @Autowired
    private ReceiveVerifyRepository receiveVerifyRepository;

    @Autowired
    private ReceiveVerifyItemRepository receiveVerifyItemRepository;

    @Autowired
    private PrepareWarehouseRepository prepareWarehouseRepository;

    @Autowired
    private PrepareWarehouseItemRepository prepareWarehouseItemRepository;

    @Autowired
    WarehouseMapper warehouseMapper;

    public ZgspPrepareWarehouseEntity getWH(String id){
        return prepareWarehouseRepository.findByfId(id);
    }

    @Transactional
    public String inStorage(String id) {
        ZgspReceiveVerifyEntity rv = receiveVerifyRepository.findByfId(id);
        if (null != rv) {
            //存主表
            ZgspPrepareWarehouseEntity zgspPrepareWarehouseEntity = new ZgspPrepareWarehouseEntity();
            BeanUtils.copyProperties(rv, zgspPrepareWarehouseEntity);
            warehouseMapper.insert(zgspPrepareWarehouseEntity);
            //存子表
            List<ZgspReceiveVerifyItemEntity> rvItems = receiveVerifyItemRepository.findByParentId(rv.getId());
            if (!rvItems.isEmpty()) {
                for (ZgspReceiveVerifyItemEntity rvItem : rvItems) {
                    ZgspPrepareWarehouseItemEntity prepareWarehouseItem = new ZgspPrepareWarehouseItemEntity();
                    BeanUtils.copyProperties(rvItem, prepareWarehouseItem);
                    prepareWarehouseItem.setWhname(rvItem.getWarehouse());
                    warehouseMapper.insertWHItem(prepareWarehouseItem);
                }
            }
            return Constant.warehouseEnum.SUCCESS.getValue();
        } else {
            return Constant.warehouseEnum.NOTFIND.getValue();
        }

    }

}
