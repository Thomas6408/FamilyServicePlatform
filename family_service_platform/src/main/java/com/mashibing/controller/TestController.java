package com.mashibing.controller;

import com.alibaba.fastjson.JSONObject;
import com.mashibing.bean.TblUserRecord;
import com.mashibing.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Thomas_LittleTrain
 * @date 2020/7/12
 */
@RestController  //@RestController=@Controller+@ResponseBody
public class TestController {

    private LoginService loginService;

    @RequestMapping("/auth/login")
    public String test() {
        System.out.println("test");
        return "";
    }

    @RequestMapping("/auth/login")
//    public String login(@RequestBody Map<String,Object> map) {
    public Object login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("login");
        TblUserRecord tblUserRecord = loginService.login(username,password);
        return JSONObject.parse(JSONObject.toJSONString(tblUserRecord));
    }

}
