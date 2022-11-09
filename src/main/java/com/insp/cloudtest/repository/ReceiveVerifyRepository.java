package com.insp.cloudtest.repository;

import com.insp.cloudtest.entity.ZgspReceiveVerifyEntity;
import com.insp.cloudtest.util.sevice.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiveVerifyRepository extends BaseRepository<ZgspReceiveVerifyEntity,String> {
    @Query(nativeQuery = true, value = "select * from zgspreceivevirify where id = ?1 ")
    ZgspReceiveVerifyEntity findByfId(String id);


}
