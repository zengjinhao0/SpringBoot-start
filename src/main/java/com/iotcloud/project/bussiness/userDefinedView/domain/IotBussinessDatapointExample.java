package com.iotcloud.project.bussiness.userDefinedView.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IotBussinessDatapointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int count = -1;

    public IotBussinessDatapointExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("parent_code =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("parent_code <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("parent_code >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_code >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("parent_code <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_code <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("parent_code like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("parent_code not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("parent_code in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("parent_code not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("parent_code between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("parent_code not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentTypeIsNull() {
            addCriterion("parent_type is null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIsNotNull() {
            addCriterion("parent_type is not null");
            return (Criteria) this;
        }

        public Criteria andParentTypeEqualTo(Integer value) {
            addCriterion("parent_type =", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotEqualTo(Integer value) {
            addCriterion("parent_type <>", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeGreaterThan(Integer value) {
            addCriterion("parent_type >", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_type >=", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeLessThan(Integer value) {
            addCriterion("parent_type <", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("parent_type <=", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeIn(List<Integer> values) {
            addCriterion("parent_type in", values, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotIn(List<Integer> values) {
            addCriterion("parent_type not in", values, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeBetween(Integer value1, Integer value2) {
            addCriterion("parent_type between", value1, value2, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_type not between", value1, value2, "parentType");
            return (Criteria) this;
        }

        public Criteria andDataUnitIsNull() {
            addCriterion("data_unit is null");
            return (Criteria) this;
        }

        public Criteria andDataUnitIsNotNull() {
            addCriterion("data_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDataUnitEqualTo(String value) {
            addCriterion("data_unit =", value, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitNotEqualTo(String value) {
            addCriterion("data_unit <>", value, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitGreaterThan(String value) {
            addCriterion("data_unit >", value, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitGreaterThanOrEqualTo(String value) {
            addCriterion("data_unit >=", value, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitLessThan(String value) {
            addCriterion("data_unit <", value, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitLessThanOrEqualTo(String value) {
            addCriterion("data_unit <=", value, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitLike(String value) {
            addCriterion("data_unit like", value, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitNotLike(String value) {
            addCriterion("data_unit not like", value, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitIn(List<String> values) {
            addCriterion("data_unit in", values, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitNotIn(List<String> values) {
            addCriterion("data_unit not in", values, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitBetween(String value1, String value2) {
            addCriterion("data_unit between", value1, value2, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataUnitNotBetween(String value1, String value2) {
            addCriterion("data_unit not between", value1, value2, "dataUnit");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionIsNull() {
            addCriterion("data_precision is null");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionIsNotNull() {
            addCriterion("data_precision is not null");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionEqualTo(Integer value) {
            addCriterion("data_precision =", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionNotEqualTo(Integer value) {
            addCriterion("data_precision <>", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionGreaterThan(Integer value) {
            addCriterion("data_precision >", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_precision >=", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionLessThan(Integer value) {
            addCriterion("data_precision <", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionLessThanOrEqualTo(Integer value) {
            addCriterion("data_precision <=", value, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionIn(List<Integer> values) {
            addCriterion("data_precision in", values, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionNotIn(List<Integer> values) {
            addCriterion("data_precision not in", values, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionBetween(Integer value1, Integer value2) {
            addCriterion("data_precision between", value1, value2, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andDataPrecisionNotBetween(Integer value1, Integer value2) {
            addCriterion("data_precision not between", value1, value2, "dataPrecision");
            return (Criteria) this;
        }

        public Criteria andMappingIsNull() {
            addCriterion("mapping is null");
            return (Criteria) this;
        }

        public Criteria andMappingIsNotNull() {
            addCriterion("mapping is not null");
            return (Criteria) this;
        }

        public Criteria andMappingEqualTo(String value) {
            addCriterion("mapping =", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingNotEqualTo(String value) {
            addCriterion("mapping <>", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingGreaterThan(String value) {
            addCriterion("mapping >", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingGreaterThanOrEqualTo(String value) {
            addCriterion("mapping >=", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingLessThan(String value) {
            addCriterion("mapping <", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingLessThanOrEqualTo(String value) {
            addCriterion("mapping <=", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingLike(String value) {
            addCriterion("mapping like", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingNotLike(String value) {
            addCriterion("mapping not like", value, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingIn(List<String> values) {
            addCriterion("mapping in", values, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingNotIn(List<String> values) {
            addCriterion("mapping not in", values, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingBetween(String value1, String value2) {
            addCriterion("mapping between", value1, value2, "mapping");
            return (Criteria) this;
        }

        public Criteria andMappingNotBetween(String value1, String value2) {
            addCriterion("mapping not between", value1, value2, "mapping");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeIsNull() {
            addCriterion("relation_dp_code is null");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeIsNotNull() {
            addCriterion("relation_dp_code is not null");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeEqualTo(String value) {
            addCriterion("relation_dp_code =", value, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeNotEqualTo(String value) {
            addCriterion("relation_dp_code <>", value, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeGreaterThan(String value) {
            addCriterion("relation_dp_code >", value, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("relation_dp_code >=", value, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeLessThan(String value) {
            addCriterion("relation_dp_code <", value, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeLessThanOrEqualTo(String value) {
            addCriterion("relation_dp_code <=", value, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeLike(String value) {
            addCriterion("relation_dp_code like", value, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeNotLike(String value) {
            addCriterion("relation_dp_code not like", value, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeIn(List<String> values) {
            addCriterion("relation_dp_code in", values, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeNotIn(List<String> values) {
            addCriterion("relation_dp_code not in", values, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeBetween(String value1, String value2) {
            addCriterion("relation_dp_code between", value1, value2, "relationDpCode");
            return (Criteria) this;
        }

        public Criteria andRelationDpCodeNotBetween(String value1, String value2) {
            addCriterion("relation_dp_code not between", value1, value2, "relationDpCode");
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

        public Criteria andReadWriteStatusIsNull() {
            addCriterion("read_write_status is null");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusIsNotNull() {
            addCriterion("read_write_status is not null");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusEqualTo(String value) {
            addCriterion("read_write_status =", value, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusNotEqualTo(String value) {
            addCriterion("read_write_status <>", value, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusGreaterThan(String value) {
            addCriterion("read_write_status >", value, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusGreaterThanOrEqualTo(String value) {
            addCriterion("read_write_status >=", value, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusLessThan(String value) {
            addCriterion("read_write_status <", value, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusLessThanOrEqualTo(String value) {
            addCriterion("read_write_status <=", value, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusLike(String value) {
            addCriterion("read_write_status like", value, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusNotLike(String value) {
            addCriterion("read_write_status not like", value, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusIn(List<String> values) {
            addCriterion("read_write_status in", values, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusNotIn(List<String> values) {
            addCriterion("read_write_status not in", values, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusBetween(String value1, String value2) {
            addCriterion("read_write_status between", value1, value2, "readWriteStatus");
            return (Criteria) this;
        }

        public Criteria andReadWriteStatusNotBetween(String value1, String value2) {
            addCriterion("read_write_status not between", value1, value2, "readWriteStatus");
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