package com.iotcloud.project.bussiness.userDefinedView.domain;

import java.math.BigDecimal;
import java.util.Date;

public class DayReport {
    private Date dataTime;

    private Integer siteId;

    private String deviceCode;

    private BigDecimal first;

    private BigDecimal last;

    private BigDecimal max;

    private BigDecimal min;

    private BigDecimal energyUsed;

    private String dpCode;

    private String dpName;

    private String dpType;

    private BigDecimal tpMax;

    private BigDecimal tpMin;

    private BigDecimal tpAvg;

    private String tpDpCode;

    private String tpDpName;

    private String tpDpType;

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    public BigDecimal getFirst() {
        return first;
    }

    public void setFirst(BigDecimal first) {
        this.first = first;
    }

    public BigDecimal getLast() {
        return last;
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getEnergyUsed() {
        return energyUsed;
    }

    public void setEnergyUsed(BigDecimal energyUsed) {
        this.energyUsed = energyUsed;
    }

    public String getDpCode() {
        return dpCode;
    }

    public void setDpCode(String dpCode) {
        this.dpCode = dpCode == null ? null : dpCode.trim();
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName == null ? null : dpName.trim();
    }

    public String getDpType() {
        return dpType;
    }

    public void setDpType(String dpType) {
        this.dpType = dpType == null ? null : dpType.trim();
    }

    public BigDecimal getTpMax() {
        return tpMax;
    }

    public void setTpMax(BigDecimal tpMax) {
        this.tpMax = tpMax;
    }

    public BigDecimal getTpMin() {
        return tpMin;
    }

    public void setTpMin(BigDecimal tpMin) {
        this.tpMin = tpMin;
    }

    public BigDecimal getTpAvg() {
        return tpAvg;
    }

    public void setTpAvg(BigDecimal tpAvg) {
        this.tpAvg = tpAvg;
    }

    public String getTpDpCode() {
        return tpDpCode;
    }

    public void setTpDpCode(String tpDpCode) {
        this.tpDpCode = tpDpCode == null ? null : tpDpCode.trim();
    }

    public String getTpDpName() {
        return tpDpName;
    }

    public void setTpDpName(String tpDpName) {
        this.tpDpName = tpDpName == null ? null : tpDpName.trim();
    }

    public String getTpDpType() {
        return tpDpType;
    }

    public void setTpDpType(String tpDpType) {
        this.tpDpType = tpDpType == null ? null : tpDpType.trim();
    }
}