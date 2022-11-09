package com.insp.cloudtest.repository;

import com.insp.cloudtest.entity.ZgspReceiveVerifyItemEntity;
import com.insp.cloudtest.util.sevice.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceiveVerifyItemRepository extends BaseRepository<ZgspReceiveVerifyItemEntity,String> {

    @Query(nativeQuery = true, value = "select * from zgspreceivevirifyitem where id = ?1 ")
    ZgspReceiveVerifyItemEntity findByfId(String id);

    @Query(nativeQuery = true,value = "select * from zgspreceivevirifyitem where parentId = ?1 ")
    List<ZgspReceiveVerifyItemEntity> findByParentId(String parentId);
}
