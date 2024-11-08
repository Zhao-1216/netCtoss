package com.netctoss_springboot.pojo;

import java.util.List;
import java.util.Objects;

public class Role {
    private Integer roleId;
    private String roleName;
    private List<Privilege> privilegeIds;
    private String privilegeName;

    public Role() {}

    public Role(Integer roleId, String roleName, List<Privilege> privilegeIds, String privilegeName) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.privilegeIds = privilegeIds;
        this.privilegeName = privilegeName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Privilege> getPrivilegeIds() {
        return privilegeIds;
    }

    public void setPrivilegeIds(List<Privilege> privilegeIds) {
        this.privilegeIds = privilegeIds;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(roleId, role.roleId) && Objects.equals(roleName, role.roleName) && Objects.equals(privilegeIds, role.privilegeIds) && Objects.equals(privilegeName, role.privilegeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, privilegeIds, privilegeName);
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", privilegeIds=" + privilegeIds +
                ", privilegeName=" + privilegeName +
                '}';
    }
}
