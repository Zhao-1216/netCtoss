package com.netctoss_springboot.pojo;

import java.util.Objects;

public class SearchCondition {
    private String idCardNo; //身份证号
    private String realName; //姓名
    private String loginName; //登录名
    private String status; //状态
    private String osUsername; //os账号
    private String unixHost; //IP
    private Integer privilegeId; //模块ID权限
    private String roleName; //角色ID

    public SearchCondition() {}

    public SearchCondition(String idCardNo, String realName, String loginName, String status, String osUsername, String unixHost, Integer privilegeId, String roleName) {
        this.idCardNo = idCardNo;
        this.realName = realName;
        this.loginName = loginName;
        this.status = status;
        this.osUsername = osUsername;
        this.unixHost = unixHost;
        this.privilegeId = privilegeId;
        this.roleName = roleName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOsUsername() {
        return osUsername;
    }

    public void setOsUsername(String osUsername) {
        this.osUsername = osUsername;
    }

    public String getUnixHost() {
        return unixHost;
    }

    public void setUnixHost(String unixHost) {
        this.unixHost = unixHost;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCondition that = (SearchCondition) o;
        return Objects.equals(idCardNo, that.idCardNo) && Objects.equals(realName, that.realName) && Objects.equals(loginName, that.loginName) && Objects.equals(status, that.status) && Objects.equals(osUsername, that.osUsername) && Objects.equals(unixHost, that.unixHost) && Objects.equals(privilegeId, that.privilegeId) && Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCardNo, realName, loginName, status, osUsername, unixHost, privilegeId, roleName);
    }

    @Override
    public String toString() {
        return "SearchCondition{" +
                "idCardNo='" + idCardNo + '\'' +
                ", realName='" + realName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", status='" + status + '\'' +
                ", osUsername='" + osUsername + '\'' +
                ", unixHost='" + unixHost + '\'' +
                ", privilegeId=" + privilegeId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
