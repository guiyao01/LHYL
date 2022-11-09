package com.insp.cloudtest.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface POExtendMapper {

    String getRange(@Param("supplier") String supplier, @Param("company") String company);

    List<String> getTypeIds(@Param("materialids") List<String> materialids);

}
