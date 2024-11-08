package com.netctoss_springboot.service.impl;


import com.netctoss_springboot.mapper.LoginMapper;
import com.netctoss_springboot.pojo.Admin;
import com.netctoss_springboot.service.LoginService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;



@Component
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public Admin Checklogin(Admin admin) {
        return loginMapper.Checklogin(admin);
    }

    @Override
    public Admin Checklogin2(Admin admin) {
        return loginMapper.Checklogin2(admin);
    }

    @Override
    public Admin findLoginInfoByAdminId(Integer adminId) {
        return loginMapper.findLoginInfoByAdminId(adminId);
    }

    @Override
    public boolean updateInfo(Admin admin) {
        return loginMapper.updateInfo(admin);
    }
}
