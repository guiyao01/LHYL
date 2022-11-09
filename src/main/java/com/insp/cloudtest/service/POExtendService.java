package com.insp.cloudtest.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.insp.cloudtest.dao.POExtendMapper;
import com.insp.cloudtest.util.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class POExtendService {

    @Autowired
    POExtendMapper poExtendMapper;

    public ResponseModel beforeSave(JSONObject jsonObject) {
        System.out.println(jsonObject);
        //获取采购订单的主表 供应商，公司，并查询范围
        String supplier = jsonObject.getJSONObject("").getString("");
        String company = jsonObject.getJSONObject("").getString("");

        String ranges = poExtendMapper.getRange(supplier, company);
        //获取子表 物料id，及取值范围
        JSONArray POitems = jsonObject.getJSONArray("");
        List<String> materialids = new ArrayList<>();

        for (Object pOitem : POitems) {
            JSONObject jsonObject1 = (JSONObject) pOitem;
            String materialid = jsonObject1.getString("MATERIALID");
            materialids.add(materialid);
        }

        List<String> itemRange = poExtendMapper.getTypeIds(materialids);
        //判断范围
        for (String item : itemRange) {
            if (!ranges.contains(item)) {
                return new ResponseModel<>(HttpStatus.INTERNAL_SERVER_ERROR,false,"明细范围中存在不在经营范围内的项目",null);
            }
        }

        return new ResponseModel<>(HttpStatus.OK,true,"OK",null);
    }
}
