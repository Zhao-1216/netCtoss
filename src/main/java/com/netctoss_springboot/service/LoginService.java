package com.netctoss_springboot.service;


import com.netctoss_springboot.pojo.Admin;

public interface LoginService {

    Admin Checklogin(Admin admin);
    Admin Checklogin2(Admin admin);


    Admin findLoginInfoByAdminId(Integer adminId);


    boolean updateInfo(Admin admin);
}
