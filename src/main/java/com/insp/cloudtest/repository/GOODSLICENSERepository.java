package com.insp.cloudtest.repository;

import com.insp.cloudtest.entity.GOODSLICENSE;
import com.insp.cloudtest.util.sevice.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GOODSLICENSERepository extends BaseRepository<GOODSLICENSE,String> {
    @Query(nativeQuery = true, value = "select * from zgspgoodslicense where id = ?1 ")
    GOODSLICENSE findByfId(String id);


}
