package com.netctoss_springboot.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Service {
    private Integer serviceId;
    private Integer accountId;
    private String unixHost;
    private String osUsername;
    private String loginPasswd;
    private String status;
    private Timestamp createDate;
    private Timestamp pauseDate;
    private Timestamp closeDate;
    private Integer costId;
    private String realName;
    private String idCardNo;
    private String name;
    private String descr;
    private String loginName;
    private String costType;

    public Service() {}

    public Service(Integer serviceId, Integer accountId, String unixHost, String osUsername, String loginPasswd, String status, Timestamp createDate, Timestamp pauseDate, Timestamp closeDate, Integer costId, String realName, String idCardNo, String name, String descr, String loginName, String costType) {
        this.serviceId = serviceId;
        this.accountId = accountId;
        this.unixHost = unixHost;
        this.osUsername = osUsername;
        this.loginPasswd = loginPasswd;
        this.status = status;
        this.createDate = createDate;
        this.pauseDate = pauseDate;
        this.closeDate = closeDate;
        this.costId = costId;
        this.realName = realName;
        this.idCardNo = idCardNo;
        this.name = name;
        this.descr = descr;
        this.loginName = loginName;
        this.costType = costType;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getUnixHost() {
        return unixHost;
    }

    public void setUnixHost(String unixHost) {
        this.unixHost = unixHost;
    }

    public String getOsUsername() {
        return osUsername;
    }

    public void setOsUsername(String osUsername) {
        this.osUsername = osUsername;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getPauseDate() {
        return pauseDate;
    }

    public void setPauseDate(Timestamp pauseDate) {
        this.pauseDate = pauseDate;
    }

    public Timestamp getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Timestamp closeDate) {
        this.closeDate = closeDate;
    }

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(serviceId, service.serviceId) && Objects.equals(accountId, service.accountId) && Objects.equals(unixHost, service.unixHost) && Objects.equals(osUsername, service.osUsername) && Objects.equals(loginPasswd, service.loginPasswd) && Objects.equals(status, service.status) && Objects.equals(createDate, service.createDate) && Objects.equals(pauseDate, service.pauseDate) && Objects.equals(closeDate, service.closeDate) && Objects.equals(costId, service.costId) && Objects.equals(realName, service.realName) && Objects.equals(idCardNo, service.idCardNo) && Objects.equals(name, service.name) && Objects.equals(descr, service.descr) && Objects.equals(loginName, service.loginName) && Objects.equals(costType, service.costType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, accountId, unixHost, osUsername, loginPasswd, status, createDate, pauseDate, closeDate, costId, realName, idCardNo, name, descr, loginName, costType);
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", accountId=" + accountId +
                ", unixHost='" + unixHost + '\'' +
                ", osUsername='" + osUsername + '\'' +
                ", loginPasswd='" + loginPasswd + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                ", pauseDate=" + pauseDate +
                ", closeDate=" + closeDate +
                ", costId=" + costId +
                ", realName='" + realName + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", name='" + name + '\'' +
                ", descr='" + descr + '\'' +
                ", loginName='" + loginName + '\'' +
                ", costType='" + costType + '\'' +
                '}';
    }
}
