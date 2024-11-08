package com.netctoss_springboot.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Account {
    private Integer accountId;
    private Integer recommenderId;
    private String loginName;
    private String loginPasswd;
    private String status;
    private Timestamp createDate;
    private Timestamp pauseDate;
    private Timestamp closeDate;
    private String realName;
    private String idCardNo;
    private Timestamp birthDate;
    private String gender;
    private String occupation;
    private String telephone;
    private String email;
    private String mailAddress;
    private String zipCode;
    private String qq;
    private Timestamp lastLoginTime;
    private String lastLoginIp;
    private String recommendIdCardNo;

    public Account() {}

    public Account(Integer accountId, Integer recommenderId, String loginName, String loginPasswd, String status, Timestamp createDate, Timestamp pauseDate, Timestamp closeDate, String realName, String idCardNo, Timestamp birthDate, String gender, String occupation, String telephone, String email, String mailAddress, String zipCode, String qq, Timestamp lastLoginTime, String lastLoginIp, String recommendIdCardNo) {
        this.accountId = accountId;
        this.recommenderId = recommenderId;
        this.loginName = loginName;
        this.loginPasswd = loginPasswd;
        this.status = status;
        this.createDate = createDate;
        this.pauseDate = pauseDate;
        this.closeDate = closeDate;
        this.realName = realName;
        this.idCardNo = idCardNo;
        this.birthDate = birthDate;
        this.gender = gender;
        this.occupation = occupation;
        this.telephone = telephone;
        this.email = email;
        this.mailAddress = mailAddress;
        this.zipCode = zipCode;
        this.qq = qq;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
        this.recommendIdCardNo = recommendIdCardNo;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getRecommenderId() {
        return recommenderId;
    }

    public void setRecommenderId(Integer recommenderId) {
        this.recommenderId = recommenderId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
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

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getRecommendIdCardNo() {
        return recommendIdCardNo;
    }

    public void setRecommendIdCardNo(String recommendIdCardNo) {
        this.recommendIdCardNo = recommendIdCardNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId) && Objects.equals(recommenderId, account.recommenderId) && Objects.equals(loginName, account.loginName) && Objects.equals(loginPasswd, account.loginPasswd) && Objects.equals(status, account.status) && Objects.equals(createDate, account.createDate) && Objects.equals(pauseDate, account.pauseDate) && Objects.equals(closeDate, account.closeDate) && Objects.equals(realName, account.realName) && Objects.equals(idCardNo, account.idCardNo) && Objects.equals(birthDate, account.birthDate) && Objects.equals(gender, account.gender) && Objects.equals(occupation, account.occupation) && Objects.equals(telephone, account.telephone) && Objects.equals(email, account.email) && Objects.equals(mailAddress, account.mailAddress) && Objects.equals(zipCode, account.zipCode) && Objects.equals(qq, account.qq) && Objects.equals(lastLoginTime, account.lastLoginTime) && Objects.equals(lastLoginIp, account.lastLoginIp) && Objects.equals(recommendIdCardNo, account.recommendIdCardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, recommenderId, loginName, loginPasswd, status, createDate, pauseDate, closeDate, realName, idCardNo, birthDate, gender, occupation, telephone, email, mailAddress, zipCode, qq, lastLoginTime, lastLoginIp, recommendIdCardNo);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", recommenderId=" + recommenderId +
                ", loginName='" + loginName + '\'' +
                ", loginPasswd='" + loginPasswd + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                ", pauseDate=" + pauseDate +
                ", closeDate=" + closeDate +
                ", realName='" + realName + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", qq='" + qq + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", recommendIdCardNo='" + recommendIdCardNo + '\'' +
                '}';
    }
}
