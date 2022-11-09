package com.insp.cloudtest.repository;

import com.insp.cloudtest.entity.ZgspPrepareWarehouseItemEntity;
import com.insp.cloudtest.util.sevice.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PrepareWarehouseItemRepository extends BaseRepository<ZgspPrepareWarehouseItemEntity,String> {
    @Query(nativeQuery = true, value = "select * from qualifiedwhitem where id = ?1 ")
    ZgspPrepareWarehouseItemEntity findByfId(String id);

    @Query(nativeQuery = true,value = "select * from qualifiedwhitem where parentId = ?1 ")
    ZgspPrepareWarehouseItemEntity findByParentId(String parentId);


}
