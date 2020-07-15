package com.mashibing.service;

import com.mashibing.bean.TblCompany;
import com.mashibing.mapper.TblCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Thomas_LittleTrain
 * @date 2020/7/14
 */
@Service
public class EstateService {
    @Autowired
    private TblCompanyMapper tblCompanyMapper;

    public List<TblCompany> selectCompany() {
        List<TblCompany> company = tblCompanyMapper.selectCompany();
        return company;
    }
}
