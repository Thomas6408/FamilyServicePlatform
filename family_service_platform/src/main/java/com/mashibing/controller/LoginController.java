package com.mashibing.controller;

import com.alibaba.fastjson.JSONObject;
import com.mashibing.bean.TblUserRecord;
import com.mashibing.returnjson.Permission;
import com.mashibing.returnjson.Permissions;
import com.mashibing.returnjson.ReturnObject;
import com.mashibing.returnjson.UserInfo;
import com.mashibing.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Thomas_LittleTrain
 * @date 2020/7/13
 */
@RestController
public class LoginController {

    private LoginService loginService;

    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        System.out.println("login");
        TblUserRecord tblUserRecord = loginService.login(username,password);
        tblUserRecord.setToken(tblUserRecord.getUserName());
        //将用户数据写入到session中
        session.setAttribute("userRecord",tblUserRecord);
        ReturnObject returnObject = new ReturnObject(tblUserRecord);
        return JSONObject.toJSONString(returnObject);
    }

    @RequestMapping("user/info")
    public String getInfo(HttpSession session) {
        TblUserRecord tblUserRecord = (TblUserRecord) session.getAttribute("userRecord");
        //获取模块信息
        String[] split = tblUserRecord.getTblRole().getTblRole().getRolePrivileges().split("-");
        //向权限集合对象中添加具体的权限
        Permissions permissions = new Permissions();
        List<Permission> permissionList = new ArrayList<>();
        for(String s : split) {
            permissionList.add(new Permission(s));
        }
        permissions.setPermissions(permissionList);
        UserInfo userinfo = new UserInfo(tblUserRecord.getUserName(),permissions);
        return JSONObject.toJSONString(new ReturnObject(userinfo));
    }

    @RequestMapping("auth/logout")
    public void logOut(HttpSession session) {
        System.out.println("logout");
        session.invalidate();
    }













}
