package com.netctoss_springboot.service;


import com.github.pagehelper.PageInfo;
import com.netctoss_springboot.pojo.Role;


public interface RoleService {

    PageInfo findByPage(int pageNum);

    Role findByRoleId(Integer roleId);

    boolean addprivilege(String roleName);

    boolean addprivilege2(Integer privilegeId);

    //void addRoleAndPrivilege(String roleName, List<Privilege> privilegeIds);

    Role findRoleAndPri(Integer roleId);

    boolean updateRole(Role role);

    boolean deleteRole(Integer roleId);

}
