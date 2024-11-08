package com.netctoss_springboot.service;

import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Admin;
import com.netctoss_springboot.pojo.SearchCondition;


public interface AdminService {

    PageInfo findByPageAndCondition(SearchCondition condition, Integer pageNum);

    boolean deleteAdmin(Integer adminId);

    Admin findByAdminId(Integer adminId);

    boolean updateAdmin(Admin admin);

    void addAdmin(Admin admin);





}
