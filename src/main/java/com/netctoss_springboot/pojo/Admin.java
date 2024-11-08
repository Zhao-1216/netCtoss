package com.netctoss_springboot.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Admin {
    private Integer adminId;
    private String adminCode;
    private String password;
    private String adminName;
    private String telephone;
    private String email;
    private Timestamp enrollDate;
    private Integer roleId;
    private String roleName;
    private Integer privilegeId;


    public Admin() {}

    public Admin(Integer adminId, String adminCode, String password, String adminName, String telephone, String email, Timestamp enrollDate, Integer roleId, String roleName, Integer privilegeId) {
        this.adminId = adminId;
        this.adminCode = adminCode;
        this.password = password;
        this.adminName = adminName;
        this.telephone = telephone;
        this.email = email;
        this.enrollDate = enrollDate;
        this.roleId = roleId;
        this.roleName = roleName;
        this.privilegeId = privilegeId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Timestamp enrollDate) {
        this.enrollDate = enrollDate;
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

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminId, admin.adminId) && Objects.equals(adminCode, admin.adminCode) && Objects.equals(password, admin.password) && Objects.equals(adminName, admin.adminName) && Objects.equals(telephone, admin.telephone) && Objects.equals(email, admin.email) && Objects.equals(enrollDate, admin.enrollDate) && Objects.equals(roleId, admin.roleId) && Objects.equals(roleName, admin.roleName) && Objects.equals(privilegeId, admin.privilegeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, adminCode, password, adminName, telephone, email, enrollDate, roleId, roleName, privilegeId);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminCode='" + adminCode + '\'' +
                ", password='" + password + '\'' +
                ", adminName='" + adminName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", enrollDate=" + enrollDate +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", privilegeId=" + privilegeId +
                '}';
    }
}
