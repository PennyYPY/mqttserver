package com.penny.mqttserver.po;

import java.util.ArrayList;
import java.util.List;

public class ProtocolConfigDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProtocolConfigDetailExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSnCodeIsNull() {
            addCriterion("sn_code is null");
            return (Criteria) this;
        }

        public Criteria andSnCodeIsNotNull() {
            addCriterion("sn_code is not null");
            return (Criteria) this;
        }

        public Criteria andSnCodeEqualTo(String value) {
            addCriterion("sn_code =", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeNotEqualTo(String value) {
            addCriterion("sn_code <>", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeGreaterThan(String value) {
            addCriterion("sn_code >", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sn_code >=", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeLessThan(String value) {
            addCriterion("sn_code <", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeLessThanOrEqualTo(String value) {
            addCriterion("sn_code <=", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeLike(String value) {
            addCriterion("sn_code like", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeNotLike(String value) {
            addCriterion("sn_code not like", value, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeIn(List<String> values) {
            addCriterion("sn_code in", values, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeNotIn(List<String> values) {
            addCriterion("sn_code not in", values, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeBetween(String value1, String value2) {
            addCriterion("sn_code between", value1, value2, "snCode");
            return (Criteria) this;
        }

        public Criteria andSnCodeNotBetween(String value1, String value2) {
            addCriterion("sn_code not between", value1, value2, "snCode");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionIsNull() {
            addCriterion("protocol_version is null");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionIsNotNull() {
            addCriterion("protocol_version is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionEqualTo(String value) {
            addCriterion("protocol_version =", value, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionNotEqualTo(String value) {
            addCriterion("protocol_version <>", value, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionGreaterThan(String value) {
            addCriterion("protocol_version >", value, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_version >=", value, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionLessThan(String value) {
            addCriterion("protocol_version <", value, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionLessThanOrEqualTo(String value) {
            addCriterion("protocol_version <=", value, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionLike(String value) {
            addCriterion("protocol_version like", value, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionNotLike(String value) {
            addCriterion("protocol_version not like", value, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionIn(List<String> values) {
            addCriterion("protocol_version in", values, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionNotIn(List<String> values) {
            addCriterion("protocol_version not in", values, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionBetween(String value1, String value2) {
            addCriterion("protocol_version between", value1, value2, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andProtocolVersionNotBetween(String value1, String value2) {
            addCriterion("protocol_version not between", value1, value2, "protocolVersion");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNull() {
            addCriterion("offset is null");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNotNull() {
            addCriterion("offset is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetEqualTo(Integer value) {
            addCriterion("offset =", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotEqualTo(Integer value) {
            addCriterion("offset <>", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThan(Integer value) {
            addCriterion("offset >", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("offset >=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThan(Integer value) {
            addCriterion("offset <", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThanOrEqualTo(Integer value) {
            addCriterion("offset <=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetIn(List<Integer> values) {
            addCriterion("offset in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotIn(List<Integer> values) {
            addCriterion("offset not in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetBetween(Integer value1, Integer value2) {
            addCriterion("offset between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotBetween(Integer value1, Integer value2) {
            addCriterion("offset not between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNull() {
            addCriterion("data_name is null");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNotNull() {
            addCriterion("data_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataNameEqualTo(String value) {
            addCriterion("data_name =", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotEqualTo(String value) {
            addCriterion("data_name <>", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThan(String value) {
            addCriterion("data_name >", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_name >=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThan(String value) {
            addCriterion("data_name <", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThanOrEqualTo(String value) {
            addCriterion("data_name <=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLike(String value) {
            addCriterion("data_name like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotLike(String value) {
            addCriterion("data_name not like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameIn(List<String> values) {
            addCriterion("data_name in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotIn(List<String> values) {
            addCriterion("data_name not in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameBetween(String value1, String value2) {
            addCriterion("data_name between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotBetween(String value1, String value2) {
            addCriterion("data_name not between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNull() {
            addCriterion("is_visible is null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIsNotNull() {
            addCriterion("is_visible is not null");
            return (Criteria) this;
        }

        public Criteria andIsVisibleEqualTo(Integer value) {
            addCriterion("is_visible =", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotEqualTo(Integer value) {
            addCriterion("is_visible <>", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThan(Integer value) {
            addCriterion("is_visible >", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_visible >=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThan(Integer value) {
            addCriterion("is_visible <", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleLessThanOrEqualTo(Integer value) {
            addCriterion("is_visible <=", value, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleIn(List<Integer> values) {
            addCriterion("is_visible in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotIn(List<Integer> values) {
            addCriterion("is_visible not in", values, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleBetween(Integer value1, Integer value2) {
            addCriterion("is_visible between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsVisibleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_visible not between", value1, value2, "isVisible");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedIsNull() {
            addCriterion("is_alarmed is null");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedIsNotNull() {
            addCriterion("is_alarmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedEqualTo(Integer value) {
            addCriterion("is_alarmed =", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedNotEqualTo(Integer value) {
            addCriterion("is_alarmed <>", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedGreaterThan(Integer value) {
            addCriterion("is_alarmed >", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_alarmed >=", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedLessThan(Integer value) {
            addCriterion("is_alarmed <", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedLessThanOrEqualTo(Integer value) {
            addCriterion("is_alarmed <=", value, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedIn(List<Integer> values) {
            addCriterion("is_alarmed in", values, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedNotIn(List<Integer> values) {
            addCriterion("is_alarmed not in", values, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedBetween(Integer value1, Integer value2) {
            addCriterion("is_alarmed between", value1, value2, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andIsAlarmedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_alarmed not between", value1, value2, "isAlarmed");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("deleted like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("deleted not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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