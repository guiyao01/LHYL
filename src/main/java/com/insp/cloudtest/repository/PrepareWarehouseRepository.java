package com.insp.cloudtest.repository;

import com.insp.cloudtest.entity.ZgspPrepareWarehouseEntity;
import com.insp.cloudtest.util.sevice.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PrepareWarehouseRepository extends BaseRepository<ZgspPrepareWarehouseEntity,String> {
    @Query(nativeQuery = true, value = "select * from QUALIFIEDWH where id = ?1 ")
    ZgspPrepareWarehouseEntity findByfId(String id);

//    @Query(nativeQuery = true, value = "insert into QUALIFIEDWH(" +
//            "acceptancetype,batchid,billcode,checkdate,commonname,prodenter,supplier,transportmode,whmark,checkdateend) " +
//            "values(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10) ");
//    int insertBy

}
