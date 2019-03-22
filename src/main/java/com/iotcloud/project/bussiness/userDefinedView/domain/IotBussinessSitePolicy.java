package com.iotcloud.project.bussiness.userDefinedView.domain;

import java.util.Date;

public class IotBussinessSitePolicy {
    private Integer id;

    private Integer siteId;

    private String originalReferenceDay;

    private String saveReferenceDay;

    private Integer status;

    private String dataTime;

    private String name;

    private String groupName;

    private String remark;

    private Integer createById;

    private Integer updateById;

    private String createBy;

    private String updateBy;

    private Date createTime;

    private Date updateTime;

    private Integer dataStatus;

    private String custom1;

    private String custom2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getOriginalReferenceDay() {
        return originalReferenceDay;
    }

    public void setOriginalReferenceDay(String originalReferenceDay) {
        this.originalReferenceDay = originalReferenceDay == null ? null : originalReferenceDay.trim();
    }

    public String getSaveReferenceDay() {
        return saveReferenceDay;
    }

    public void setSaveReferenceDay(String saveReferenceDay) {
        this.saveReferenceDay = saveReferenceDay == null ? null : saveReferenceDay.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime == null ? null : dataTime.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreateById() {
        return createById;
    }

    public void setCreateById(Integer createById) {
        this.createById = createById;
    }

    public Integer getUpdateById() {
        return updateById;
    }

    public void setUpdateById(Integer updateById) {
        this.updateById = updateById;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }
}