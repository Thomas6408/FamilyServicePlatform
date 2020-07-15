package com.mashibing.service;

import com.mashibing.bean.TblUserRecord;
import com.mashibing.mapper.TblUserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Thomas_LittleTrain
 * @date 2020/7/13
 */
@Service
public class LoginService {
    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;

    public TblUserRecord login(String username, String password) {
        return tblUserRecordMapper.login(username,password);
    }
}
