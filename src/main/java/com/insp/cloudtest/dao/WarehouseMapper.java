package com.insp.cloudtest.dao;

import com.insp.cloudtest.entity.ZgspPrepareWarehouseEntity;
import com.insp.cloudtest.entity.ZgspPrepareWarehouseItemEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseMapper {

    int insert(ZgspPrepareWarehouseEntity zgspPrepareWarehouseEntity);

    int insertWHItem(ZgspPrepareWarehouseItemEntity prepareWarehouseItem);

}
