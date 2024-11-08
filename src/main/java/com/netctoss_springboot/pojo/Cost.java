package com.netctoss_springboot.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Cost {
    /**
     * 资费列表的
     */
    private Integer costId;
    private String name;
    private Integer baseDuration;
    private Double baseCost;
    private Double unitCost;
    private String status;
    private String descr;
    private Timestamp creatime;
    private Timestamp startime;
    private String costType;

    public Cost() {}

    public Cost(Integer costId, String name, Integer baseDuration, Double baseCost, Double unitCost, String status, String descr, Timestamp creatime, Timestamp startime, String costType) {
        this.costId = costId;
        this.name = name;
        this.baseDuration = baseDuration;
        this.baseCost = baseCost;
        this.unitCost = unitCost;
        this.status = status;
        this.descr = descr;
        this.creatime = creatime;
        this.startime = startime;
        this.costType = costType;
    }

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(Integer baseDuration) {
        this.baseDuration = baseDuration;
    }

    public Double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(Double baseCost) {
        this.baseCost = baseCost;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

    public Timestamp getStartime() {
        return startime;
    }

    public void setStartime(Timestamp startime) {
        this.startime = startime;
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
        Cost cost = (Cost) o;
        return Objects.equals(costId, cost.costId) && Objects.equals(name, cost.name) && Objects.equals(baseDuration, cost.baseDuration) && Objects.equals(baseCost, cost.baseCost) && Objects.equals(unitCost, cost.unitCost) && Objects.equals(status, cost.status) && Objects.equals(descr, cost.descr) && Objects.equals(creatime, cost.creatime) && Objects.equals(startime, cost.startime) && Objects.equals(costType, cost.costType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costId, name, baseDuration, baseCost, unitCost, status, descr, creatime, startime, costType);
    }

    @Override
    public String toString() {
        return "Cost{" +
                "costId=" + costId +
                ", name='" + name + '\'' +
                ", baseDuration=" + baseDuration +
                ", baseCost=" + baseCost +
                ", unitCost=" + unitCost +
                ", status='" + status + '\'' +
                ", descr='" + descr + '\'' +
                ", creatime=" + creatime +
                ", startime=" + startime +
                ", costType='" + costType + '\'' +
                '}';
    }
}
