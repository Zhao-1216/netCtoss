package com.netctoss_springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.netctoss_springboot.mapper.AdminMapper;
import com.netctoss_springboot.pojo.Admin;
import com.netctoss_springboot.pojo.SearchCondition;
import com.netctoss_springboot.service.AdminService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    private int pageSize=5;
    private int navigatePages=5;

    @Override
    public PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Admin> admins= adminMapper.findAll(condition);
        PageInfo pageInfo=new PageInfo(admins,navigatePages);
        return pageInfo;
    }

    @Override
    public boolean deleteAdmin(Integer adminId) {
        return adminMapper.deleteAdmin(adminId);
    }

    @Override
    public Admin findByAdminId(Integer adminId) {
        return adminMapper.findByAdminId(adminId);
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }

    @Override
    public void addAdmin(Admin admin) {
        adminMapper.addAdmin(admin);
    }


}
