package com.iotcloud.project.bussiness.userDefinedView.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IotBussinessTagReltExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public IotBussinessTagReltExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setCount(int count) {
        this.count=count;
    }

    public int getCount() {
        return count;
    }

    public Criteria getCriteria() {
        if (oredCriteria.size() != 0) {return oredCriteria.get(0);}
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIsNull() {
            addCriterion("device_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIsNotNull() {
            addCriterion("device_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeEqualTo(String value) {
            addCriterion("device_code =", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotEqualTo(String value) {
            addCriterion("device_code <>", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThan(String value) {
            addCriterion("device_code >", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_code >=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThan(String value) {
            addCriterion("device_code <", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThanOrEqualTo(String value) {
            addCriterion("device_code <=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLike(String value) {
            addCriterion("device_code like", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotLike(String value) {
            addCriterion("device_code not like", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIn(List<String> values) {
            addCriterion("device_code in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotIn(List<String> values) {
            addCriterion("device_code not in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeBetween(String value1, String value2) {
            addCriterion("device_code between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotBetween(String value1, String value2) {
            addCriterion("device_code not between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeIsNull() {
            addCriterion("dx_code is null");
            return (Criteria) this;
        }

        public Criteria andDxCodeIsNotNull() {
            addCriterion("dx_code is not null");
            return (Criteria) this;
        }

        public Criteria andDxCodeEqualTo(Integer value) {
            addCriterion("dx_code =", value, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeNotEqualTo(Integer value) {
            addCriterion("dx_code <>", value, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeGreaterThan(Integer value) {
            addCriterion("dx_code >", value, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dx_code >=", value, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeLessThan(Integer value) {
            addCriterion("dx_code <", value, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dx_code <=", value, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeIn(List<Integer> values) {
            addCriterion("dx_code in", values, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeNotIn(List<Integer> values) {
            addCriterion("dx_code not in", values, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeBetween(Integer value1, Integer value2) {
            addCriterion("dx_code between", value1, value2, "dxCode");
            return (Criteria) this;
        }

        public Criteria andDxCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dx_code not between", value1, value2, "dxCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTagCodeIsNull() {
            addCriterion("tag_code is null");
            return (Criteria) this;
        }

        public Criteria andTagCodeIsNotNull() {
            addCriterion("tag_code is not null");
            return (Criteria) this;
        }

        public Criteria andTagCodeEqualTo(String value) {
            addCriterion("tag_code =", value, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeNotEqualTo(String value) {
            addCriterion("tag_code <>", value, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeGreaterThan(String value) {
            addCriterion("tag_code >", value, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tag_code >=", value, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeLessThan(String value) {
            addCriterion("tag_code <", value, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeLessThanOrEqualTo(String value) {
            addCriterion("tag_code <=", value, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeLike(String value) {
            addCriterion("tag_code like", value, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeNotLike(String value) {
            addCriterion("tag_code not like", value, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeIn(List<String> values) {
            addCriterion("tag_code in", values, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeNotIn(List<String> values) {
            addCriterion("tag_code not in", values, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeBetween(String value1, String value2) {
            addCriterion("tag_code between", value1, value2, "tagCode");
            return (Criteria) this;
        }

        public Criteria andTagCodeNotBetween(String value1, String value2) {
            addCriterion("tag_code not between", value1, value2, "tagCode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateByIdIsNull() {
            addCriterion("create_by_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIdIsNotNull() {
            addCriterion("create_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByIdEqualTo(Integer value) {
            addCriterion("create_by_id =", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotEqualTo(Integer value) {
            addCriterion("create_by_id <>", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdGreaterThan(Integer value) {
            addCriterion("create_by_id >", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_by_id >=", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdLessThan(Integer value) {
            addCriterion("create_by_id <", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_by_id <=", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdIn(List<Integer> values) {
            addCriterion("create_by_id in", values, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotIn(List<Integer> values) {
            addCriterion("create_by_id not in", values, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdBetween(Integer value1, Integer value2) {
            addCriterion("create_by_id between", value1, value2, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_by_id not between", value1, value2, "createById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdIsNull() {
            addCriterion("update_by_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdIsNotNull() {
            addCriterion("update_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdEqualTo(Integer value) {
            addCriterion("update_by_id =", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotEqualTo(Integer value) {
            addCriterion("update_by_id <>", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdGreaterThan(Integer value) {
            addCriterion("update_by_id >", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by_id >=", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdLessThan(Integer value) {
            addCriterion("update_by_id <", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_by_id <=", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdIn(List<Integer> values) {
            addCriterion("update_by_id in", values, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotIn(List<Integer> values) {
            addCriterion("update_by_id not in", values, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdBetween(Integer value1, Integer value2) {
            addCriterion("update_by_id between", value1, value2, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by_id not between", value1, value2, "updateById");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(Integer value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(Integer value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(Integer value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(Integer value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(Integer value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<Integer> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<Integer> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(Integer value1, Integer value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNull() {
            addCriterion("custom1 is null");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNotNull() {
            addCriterion("custom1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom1EqualTo(String value) {
            addCriterion("custom1 =", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotEqualTo(String value) {
            addCriterion("custom1 <>", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThan(String value) {
            addCriterion("custom1 >", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("custom1 >=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThan(String value) {
            addCriterion("custom1 <", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThanOrEqualTo(String value) {
            addCriterion("custom1 <=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Like(String value) {
            addCriterion("custom1 like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotLike(String value) {
            addCriterion("custom1 not like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1In(List<String> values) {
            addCriterion("custom1 in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotIn(List<String> values) {
            addCriterion("custom1 not in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Between(String value1, String value2) {
            addCriterion("custom1 between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotBetween(String value1, String value2) {
            addCriterion("custom1 not between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNull() {
            addCriterion("custom2 is null");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNotNull() {
            addCriterion("custom2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom2EqualTo(String value) {
            addCriterion("custom2 =", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotEqualTo(String value) {
            addCriterion("custom2 <>", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThan(String value) {
            addCriterion("custom2 >", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("custom2 >=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThan(String value) {
            addCriterion("custom2 <", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThanOrEqualTo(String value) {
            addCriterion("custom2 <=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Like(String value) {
            addCriterion("custom2 like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotLike(String value) {
            addCriterion("custom2 not like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2In(List<String> values) {
            addCriterion("custom2 in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotIn(List<String> values) {
            addCriterion("custom2 not in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Between(String value1, String value2) {
            addCriterion("custom2 between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotBetween(String value1, String value2) {
            addCriterion("custom2 not between", value1, value2, "custom2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}