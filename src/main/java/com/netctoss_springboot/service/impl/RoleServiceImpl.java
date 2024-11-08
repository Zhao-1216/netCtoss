package com.netctoss_springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.netctoss_springboot.mapper.RoleMapper;
import com.netctoss_springboot.pojo.Role;
import com.netctoss_springboot.service.RoleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;
    private int pageSize=5;
    private int navigatePages=5;

    @Override
    public PageInfo findByPage(int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Role> roles= roleMapper.findAll();
        PageInfo pageInfo=new PageInfo(roles,navigatePages);
        return pageInfo;
    }

    @Override
    public Role findByRoleId(Integer roleId) {
        return roleMapper.findByRoleId(roleId);
    }

    @Override
    public Role findRoleAndPri(Integer roleId) {
        return roleMapper.findRoleAndPri(roleId);
    }

//    @Override
//    public void addRoleAndPrivilege(String roleName, List<Privilege> privilegeIds) {
//        Integer roleId =roleMapper.addRole(roleName);
//        roleMapper.addPrivilegeName(roleId, privilegeIds);
//    }

    @Override
    public boolean addprivilege(String roleName) {
        return roleMapper.addPrivilege(roleName);
    }

    @Override
    public boolean addprivilege2(Integer privilegeId) {
        return roleMapper.addPrivilege2(privilegeId);
    }



    @Override
    public boolean updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public boolean deleteRole(Integer roleId) {
        return roleMapper.deleteRole(roleId);
    }
}
