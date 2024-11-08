package com.netctoss_springboot.pojo;

import java.util.Objects;

public class Privilege {
    private Integer privilegeId;


    public Privilege(){}

    public Privilege(Integer privilegeId) {
        this.privilegeId = privilegeId;
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
        Privilege privilege = (Privilege) o;
        return Objects.equals(privilegeId, privilege.privilegeId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(privilegeId);
    }

    @Override
    public String toString() {
        return "Privilege{" +
                "privilegeId=" + privilegeId +
                '}';
    }
}
