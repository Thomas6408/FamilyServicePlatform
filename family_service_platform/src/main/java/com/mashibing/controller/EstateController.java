package com.mashibing.controller;

import com.alibaba.fastjson.JSONObject;
import com.mashibing.bean.TblCompany;
import com.mashibing.returnjson.ReturnObject;
import com.mashibing.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Thomas_LittleTrain
 * @date 2020/7/14
 */
@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;

    @RequestMapping("/estate/selectCompany")
    public String selectCompany() {
        List<TblCompany> companies = estateService.selectCompany();
        return JSONObject.toJSONString(new ReturnObject(companies));
    }
}
