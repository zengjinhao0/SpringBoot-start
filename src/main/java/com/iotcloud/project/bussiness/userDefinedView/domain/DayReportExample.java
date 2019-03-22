package com.iotcloud.project.bussiness.userDefinedView.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DayReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public DayReportExample() {
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

        public Criteria andEnergyUsedIsNull() {
            addCriterion("energy_used is null");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedIsNotNull() {
            addCriterion("energy_used is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedEqualTo(BigDecimal value) {
            addCriterion("energy_used =", value, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedNotEqualTo(BigDecimal value) {
            addCriterion("energy_used <>", value, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedGreaterThan(BigDecimal value) {
            addCriterion("energy_used >", value, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("energy_used >=", value, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedLessThan(BigDecimal value) {
            addCriterion("energy_used <", value, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("energy_used <=", value, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedIn(List<BigDecimal> values) {
            addCriterion("energy_used in", values, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedNotIn(List<BigDecimal> values) {
            addCriterion("energy_used not in", values, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("energy_used between", value1, value2, "energyUsed");
            return (Criteria) this;
        }

        public Criteria andEnergyUsedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("energy_used not between", value1, value2, "energyUsed");
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

        public Criteria andTpMaxIsNull() {
            addCriterion("tp_max is null");
            return (Criteria) this;
        }

        public Criteria andTpMaxIsNotNull() {
            addCriterion("tp_max is not null");
            return (Criteria) this;
        }

        public Criteria andTpMaxEqualTo(BigDecimal value) {
            addCriterion("tp_max =", value, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxNotEqualTo(BigDecimal value) {
            addCriterion("tp_max <>", value, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxGreaterThan(BigDecimal value) {
            addCriterion("tp_max >", value, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_max >=", value, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxLessThan(BigDecimal value) {
            addCriterion("tp_max <", value, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_max <=", value, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxIn(List<BigDecimal> values) {
            addCriterion("tp_max in", values, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxNotIn(List<BigDecimal> values) {
            addCriterion("tp_max not in", values, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_max between", value1, value2, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_max not between", value1, value2, "tpMax");
            return (Criteria) this;
        }

        public Criteria andTpMinIsNull() {
            addCriterion("tp_min is null");
            return (Criteria) this;
        }

        public Criteria andTpMinIsNotNull() {
            addCriterion("tp_min is not null");
            return (Criteria) this;
        }

        public Criteria andTpMinEqualTo(BigDecimal value) {
            addCriterion("tp_min =", value, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinNotEqualTo(BigDecimal value) {
            addCriterion("tp_min <>", value, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinGreaterThan(BigDecimal value) {
            addCriterion("tp_min >", value, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_min >=", value, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinLessThan(BigDecimal value) {
            addCriterion("tp_min <", value, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_min <=", value, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinIn(List<BigDecimal> values) {
            addCriterion("tp_min in", values, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinNotIn(List<BigDecimal> values) {
            addCriterion("tp_min not in", values, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_min between", value1, value2, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_min not between", value1, value2, "tpMin");
            return (Criteria) this;
        }

        public Criteria andTpAvgIsNull() {
            addCriterion("tp_avg is null");
            return (Criteria) this;
        }

        public Criteria andTpAvgIsNotNull() {
            addCriterion("tp_avg is not null");
            return (Criteria) this;
        }

        public Criteria andTpAvgEqualTo(BigDecimal value) {
            addCriterion("tp_avg =", value, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgNotEqualTo(BigDecimal value) {
            addCriterion("tp_avg <>", value, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgGreaterThan(BigDecimal value) {
            addCriterion("tp_avg >", value, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_avg >=", value, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgLessThan(BigDecimal value) {
            addCriterion("tp_avg <", value, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_avg <=", value, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgIn(List<BigDecimal> values) {
            addCriterion("tp_avg in", values, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgNotIn(List<BigDecimal> values) {
            addCriterion("tp_avg not in", values, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_avg between", value1, value2, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_avg not between", value1, value2, "tpAvg");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeIsNull() {
            addCriterion("tp_dp_code is null");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeIsNotNull() {
            addCriterion("tp_dp_code is not null");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeEqualTo(String value) {
            addCriterion("tp_dp_code =", value, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeNotEqualTo(String value) {
            addCriterion("tp_dp_code <>", value, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeGreaterThan(String value) {
            addCriterion("tp_dp_code >", value, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tp_dp_code >=", value, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeLessThan(String value) {
            addCriterion("tp_dp_code <", value, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeLessThanOrEqualTo(String value) {
            addCriterion("tp_dp_code <=", value, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeLike(String value) {
            addCriterion("tp_dp_code like", value, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeNotLike(String value) {
            addCriterion("tp_dp_code not like", value, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeIn(List<String> values) {
            addCriterion("tp_dp_code in", values, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeNotIn(List<String> values) {
            addCriterion("tp_dp_code not in", values, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeBetween(String value1, String value2) {
            addCriterion("tp_dp_code between", value1, value2, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpCodeNotBetween(String value1, String value2) {
            addCriterion("tp_dp_code not between", value1, value2, "tpDpCode");
            return (Criteria) this;
        }

        public Criteria andTpDpNameIsNull() {
            addCriterion("tp_dp_name is null");
            return (Criteria) this;
        }

        public Criteria andTpDpNameIsNotNull() {
            addCriterion("tp_dp_name is not null");
            return (Criteria) this;
        }

        public Criteria andTpDpNameEqualTo(String value) {
            addCriterion("tp_dp_name =", value, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameNotEqualTo(String value) {
            addCriterion("tp_dp_name <>", value, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameGreaterThan(String value) {
            addCriterion("tp_dp_name >", value, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameGreaterThanOrEqualTo(String value) {
            addCriterion("tp_dp_name >=", value, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameLessThan(String value) {
            addCriterion("tp_dp_name <", value, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameLessThanOrEqualTo(String value) {
            addCriterion("tp_dp_name <=", value, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameLike(String value) {
            addCriterion("tp_dp_name like", value, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameNotLike(String value) {
            addCriterion("tp_dp_name not like", value, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameIn(List<String> values) {
            addCriterion("tp_dp_name in", values, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameNotIn(List<String> values) {
            addCriterion("tp_dp_name not in", values, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameBetween(String value1, String value2) {
            addCriterion("tp_dp_name between", value1, value2, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpNameNotBetween(String value1, String value2) {
            addCriterion("tp_dp_name not between", value1, value2, "tpDpName");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeIsNull() {
            addCriterion("tp_dp_type is null");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeIsNotNull() {
            addCriterion("tp_dp_type is not null");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeEqualTo(String value) {
            addCriterion("tp_dp_type =", value, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeNotEqualTo(String value) {
            addCriterion("tp_dp_type <>", value, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeGreaterThan(String value) {
            addCriterion("tp_dp_type >", value, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tp_dp_type >=", value, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeLessThan(String value) {
            addCriterion("tp_dp_type <", value, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeLessThanOrEqualTo(String value) {
            addCriterion("tp_dp_type <=", value, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeLike(String value) {
            addCriterion("tp_dp_type like", value, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeNotLike(String value) {
            addCriterion("tp_dp_type not like", value, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeIn(List<String> values) {
            addCriterion("tp_dp_type in", values, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeNotIn(List<String> values) {
            addCriterion("tp_dp_type not in", values, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeBetween(String value1, String value2) {
            addCriterion("tp_dp_type between", value1, value2, "tpDpType");
            return (Criteria) this;
        }

        public Criteria andTpDpTypeNotBetween(String value1, String value2) {
            addCriterion("tp_dp_type not between", value1, value2, "tpDpType");
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