package com.netctoss_springboot.mapper;


import com.netctoss_springboot.pojo.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RoleMapper {

    List<Role> findAll();

    Role findByRoleId(Integer roleId);

    @Insert("INSERT into  role_info\n" +
            "        (role_name)values(#{roleName})")
    Boolean addPrivilege(@Param("roleName") String roleName);
    @Insert("INSERT INTO " +
            "role_privilege(role_id,privilege_id)" +
            "VALUES((SELECT role_id FROM role_info ORDER BY role_id DESC LIMIT 1),#{privilegeId});")
    Boolean addPrivilege2(@Param("privilegeId") Integer privilegeId);

    Role findRoleAndPri(Integer roleId);

    Integer addRole(String roleName);

    //void addPrivilegeName(@Param("a") Integer roleId, @Param("b") List<Privilege> privilegeId);

    boolean updateRole(Role role);

    boolean deleteRole(Integer roleId);

}
