package com.netctoss_springboot.mapper;


import com.netctoss_springboot.pojo.Admin;
import com.netctoss_springboot.pojo.SearchCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AdminMapper {

    Admin Checklogin(Admin admin);

    Admin Checklogin2(Admin admin);

    List<Admin> findAll(SearchCondition condition);

    boolean deleteAdmin(Integer adminId);

    Admin findByAdminId(Integer adminId);

    boolean updateAdmin(Admin admin);

    void addAdmin(Admin admin);


}
