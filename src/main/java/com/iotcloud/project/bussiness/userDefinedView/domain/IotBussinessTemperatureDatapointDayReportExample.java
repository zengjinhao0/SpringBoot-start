package com.iotcloud.project.bussiness.userDefinedView.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IotBussinessTemperatureDatapointDayReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public IotBussinessTemperatureDatapointDayReportExample() {
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

        public Criteria andDataTimeIsNull() {
            addCriterion("data_time is null");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNotNull() {
            addCriterion("data_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimeEqualTo(Date value) {
            addCriterion("data_time =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(Date value) {
            addCriterion("data_time <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(Date value) {
            addCriterion("data_time >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_time >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(Date value) {
            addCriterion("data_time <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_time <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<Date> values) {
            addCriterion("data_time in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<Date> values) {
            addCriterion("data_time not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(Date value1, Date value2) {
            addCriterion("data_time between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_time not between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(Integer value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(Integer value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(Integer value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(Integer value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(Integer value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<Integer> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<Integer> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(Integer value1, Integer value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(Integer value1, Integer value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andFirstIsNull() {
            addCriterion("first is null");
            return (Criteria) this;
        }

        public Criteria andFirstIsNotNull() {
            addCriterion("first is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEqualTo(BigDecimal value) {
            addCriterion("first =", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotEqualTo(BigDecimal value) {
            addCriterion("first <>", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThan(BigDecimal value) {
            addCriterion("first >", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first >=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThan(BigDecimal value) {
            addCriterion("first <", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first <=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstIn(List<BigDecimal> values) {
            addCriterion("first in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotIn(List<BigDecimal> values) {
            addCriterion("first not in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first not between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andMaxIsNull() {
            addCriterion("max is null");
            return (Criteria) this;
        }

        public Criteria andMaxIsNotNull() {
            addCriterion("max is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEqualTo(BigDecimal value) {
            addCriterion("max =", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotEqualTo(BigDecimal value) {
            addCriterion("max <>", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThan(BigDecimal value) {
            addCriterion("max >", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max >=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThan(BigDecimal value) {
            addCriterion("max <", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max <=", value, "max");
            return (Criteria) this;
        }

        public Criteria andMaxIn(List<BigDecimal> values) {
            addCriterion("max in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotIn(List<BigDecimal> values) {
            addCriterion("max not in", values, "max");
            return (Criteria) this;
        }

        public Criteria andMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max not between", value1, value2, "max");
            return (Criteria) this;
        }

        public Criteria andMinIsNull() {
            addCriterion("min is null");
            return (Criteria) this;
        }

        public Criteria andMinIsNotNull() {
            addCriterion("min is not null");
            return (Criteria) this;
        }

        public Criteria andMinEqualTo(BigDecimal value) {
            addCriterion("min =", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotEqualTo(BigDecimal value) {
            addCriterion("min <>", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinGreaterThan(BigDecimal value) {
            addCriterion("min >", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min >=", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinLessThan(BigDecimal value) {
            addCriterion("min <", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min <=", value, "min");
            return (Criteria) this;
        }

        public Criteria andMinIn(List<BigDecimal> values) {
            addCriterion("min in", values, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotIn(List<BigDecimal> values) {
            addCriterion("min not in", values, "min");
            return (Criteria) this;
        }

        public Criteria andMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min between", value1, value2, "min");
            return (Criteria) this;
        }

        public Criteria andMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min not between", value1, value2, "min");
            return (Criteria) this;
        }

        public Criteria andAvgIsNull() {
            addCriterion("avg is null");
            return (Criteria) this;
        }

        public Criteria andAvgIsNotNull() {
            addCriterion("avg is not null");
            return (Criteria) this;
        }

        public Criteria andAvgEqualTo(BigDecimal value) {
            addCriterion("avg =", value, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgNotEqualTo(BigDecimal value) {
            addCriterion("avg <>", value, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgGreaterThan(BigDecimal value) {
            addCriterion("avg >", value, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg >=", value, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgLessThan(BigDecimal value) {
            addCriterion("avg <", value, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg <=", value, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgIn(List<BigDecimal> values) {
            addCriterion("avg in", values, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgNotIn(List<BigDecimal> values) {
            addCriterion("avg not in", values, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg between", value1, value2, "avg");
            return (Criteria) this;
        }

        public Criteria andAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg not between", value1, value2, "avg");
            return (Criteria) this;
        }

        public Criteria andLastIsNull() {
            addCriterion("last is null");
            return (Criteria) this;
        }

        public Criteria andLastIsNotNull() {
            addCriterion("last is not null");
            return (Criteria) this;
        }

        public Criteria andLastEqualTo(BigDecimal value) {
            addCriterion("last =", value, "last");
            return (Criteria) this;
        }

        public Criteria andLastNotEqualTo(BigDecimal value) {
            addCriterion("last <>", value, "last");
            return (Criteria) this;
        }

        public Criteria andLastGreaterThan(BigDecimal value) {
            addCriterion("last >", value, "last");
            return (Criteria) this;
        }

        public Criteria andLastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("last >=", value, "last");
            return (Criteria) this;
        }

        public Criteria andLastLessThan(BigDecimal value) {
            addCriterion("last <", value, "last");
            return (Criteria) this;
        }

        public Criteria andLastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("last <=", value, "last");
            return (Criteria) this;
        }

        public Criteria andLastIn(List<BigDecimal> values) {
            addCriterion("last in", values, "last");
            return (Criteria) this;
        }

        public Criteria andLastNotIn(List<BigDecimal> values) {
            addCriterion("last not in", values, "last");
            return (Criteria) this;
        }

        public Criteria andLastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last between", value1, value2, "last");
            return (Criteria) this;
        }

        public Criteria andLastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("last not between", value1, value2, "last");
            return (Criteria) this;
        }

        public Criteria andDpCodeIsNull() {
            addCriterion("dp_code is null");
            return (Criteria) this;
        }

        public Criteria andDpCodeIsNotNull() {
            addCriterion("dp_code is not null");
            return (Criteria) this;
        }

        public Criteria andDpCodeEqualTo(String value) {
            addCriterion("dp_code =", value, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeNotEqualTo(String value) {
            addCriterion("dp_code <>", value, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeGreaterThan(String value) {
            addCriterion("dp_code >", value, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dp_code >=", value, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeLessThan(String value) {
            addCriterion("dp_code <", value, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeLessThanOrEqualTo(String value) {
            addCriterion("dp_code <=", value, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeLike(String value) {
            addCriterion("dp_code like", value, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeNotLike(String value) {
            addCriterion("dp_code not like", value, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeIn(List<String> values) {
            addCriterion("dp_code in", values, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeNotIn(List<String> values) {
            addCriterion("dp_code not in", values, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeBetween(String value1, String value2) {
            addCriterion("dp_code between", value1, value2, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDpCodeNotBetween(String value1, String value2) {
            addCriterion("dp_code not between", value1, value2, "dpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDpNameIsNull() {
            addCriterion("dp_name is null");
            return (Criteria) this;
        }

        public Criteria andDpNameIsNotNull() {
            addCriterion("dp_name is not null");
            return (Criteria) this;
        }

        public Criteria andDpNameEqualTo(String value) {
            addCriterion("dp_name =", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameNotEqualTo(String value) {
            addCriterion("dp_name <>", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameGreaterThan(String value) {
            addCriterion("dp_name >", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameGreaterThanOrEqualTo(String value) {
            addCriterion("dp_name >=", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameLessThan(String value) {
            addCriterion("dp_name <", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameLessThanOrEqualTo(String value) {
            addCriterion("dp_name <=", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameLike(String value) {
            addCriterion("dp_name like", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameNotLike(String value) {
            addCriterion("dp_name not like", value, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameIn(List<String> values) {
            addCriterion("dp_name in", values, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameNotIn(List<String> values) {
            addCriterion("dp_name not in", values, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameBetween(String value1, String value2) {
            addCriterion("dp_name between", value1, value2, "dpName");
            return (Criteria) this;
        }

        public Criteria andDpNameNotBetween(String value1, String value2) {
            addCriterion("dp_name not between", value1, value2, "dpName");
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andDpTypeIsNull() {
            addCriterion("dp_type is null");
            return (Criteria) this;
        }

        public Criteria andDpTypeIsNotNull() {
            addCriterion("dp_type is not null");
            return (Criteria) this;
        }

        public Criteria andDpTypeEqualTo(String value) {
            addCriterion("dp_type =", value, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeNotEqualTo(String value) {
            addCriterion("dp_type <>", value, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeGreaterThan(String value) {
            addCriterion("dp_type >", value, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dp_type >=", value, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeLessThan(String value) {
            addCriterion("dp_type <", value, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeLessThanOrEqualTo(String value) {
            addCriterion("dp_type <=", value, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeLike(String value) {
            addCriterion("dp_type like", value, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeNotLike(String value) {
            addCriterion("dp_type not like", value, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeIn(List<String> values) {
            addCriterion("dp_type in", values, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeNotIn(List<String> values) {
            addCriterion("dp_type not in", values, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeBetween(String value1, String value2) {
            addCriterion("dp_type between", value1, value2, "dpType");
            return (Criteria) this;
        }

        public Criteria andDpTypeNotBetween(String value1, String value2) {
            addCriterion("dp_type not between", value1, value2, "dpType");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
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