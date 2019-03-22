package com.example.SpringBootstart.autoMabatis.bean;

import java.util.ArrayList;
import java.util.List;

public class TnTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public TnTeacherExample() {
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

        public Criteria andTea_nameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTea_nameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTea_nameEqualTo(String value) {
            addCriterion("tea_name =", value, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameGreaterThan(String value) {
            addCriterion("tea_name >", value, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameLessThan(String value) {
            addCriterion("tea_name <", value, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameLike(String value) {
            addCriterion("tea_name like", value, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameNotLike(String value) {
            addCriterion("tea_name not like", value, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameIn(List<String> values) {
            addCriterion("tea_name in", values, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_nameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "tea_name");
            return (Criteria) this;
        }

        public Criteria andTea_ageIsNull() {
            addCriterion("tea_age is null");
            return (Criteria) this;
        }

        public Criteria andTea_ageIsNotNull() {
            addCriterion("tea_age is not null");
            return (Criteria) this;
        }

        public Criteria andTea_ageEqualTo(Integer value) {
            addCriterion("tea_age =", value, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageNotEqualTo(Integer value) {
            addCriterion("tea_age <>", value, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageGreaterThan(Integer value) {
            addCriterion("tea_age >", value, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_age >=", value, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageLessThan(Integer value) {
            addCriterion("tea_age <", value, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageLessThanOrEqualTo(Integer value) {
            addCriterion("tea_age <=", value, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageIn(List<Integer> values) {
            addCriterion("tea_age in", values, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageNotIn(List<Integer> values) {
            addCriterion("tea_age not in", values, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageBetween(Integer value1, Integer value2) {
            addCriterion("tea_age between", value1, value2, "tea_age");
            return (Criteria) this;
        }

        public Criteria andTea_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_age not between", value1, value2, "tea_age");
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