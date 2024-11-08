package com.netctoss_springboot.mapper;


import com.netctoss_springboot.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    Admin findLoginInfoByAdminId(Integer adminId);

    boolean updateInfo(Admin admin);

    Admin Checklogin(Admin admin);
    Admin Checklogin2(Admin admin);
}
