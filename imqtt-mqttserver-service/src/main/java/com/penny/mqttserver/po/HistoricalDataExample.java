package com.penny.mqttserver.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HistoricalDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoricalDataExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDeviceDataIsNull() {
            addCriterion("device_data is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDataIsNotNull() {
            addCriterion("device_data is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDataEqualTo(String value) {
            addCriterion("device_data =", value, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataNotEqualTo(String value) {
            addCriterion("device_data <>", value, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataGreaterThan(String value) {
            addCriterion("device_data >", value, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataGreaterThanOrEqualTo(String value) {
            addCriterion("device_data >=", value, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataLessThan(String value) {
            addCriterion("device_data <", value, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataLessThanOrEqualTo(String value) {
            addCriterion("device_data <=", value, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataLike(String value) {
            addCriterion("device_data like", value, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataNotLike(String value) {
            addCriterion("device_data not like", value, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataIn(List<String> values) {
            addCriterion("device_data in", values, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataNotIn(List<String> values) {
            addCriterion("device_data not in", values, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataBetween(String value1, String value2) {
            addCriterion("device_data between", value1, value2, "deviceData");
            return (Criteria) this;
        }

        public Criteria andDeviceDataNotBetween(String value1, String value2) {
            addCriterion("device_data not between", value1, value2, "deviceData");
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
            addCriterionForJDBCDate("data_time =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("data_time <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("data_time >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_time >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(Date value) {
            addCriterionForJDBCDate("data_time <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("data_time <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<Date> values) {
            addCriterionForJDBCDate("data_time in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("data_time not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_time between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("data_time not between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberIsNull() {
            addCriterion("offset_number is null");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberIsNotNull() {
            addCriterion("offset_number is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberEqualTo(Integer value) {
            addCriterion("offset_number =", value, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberNotEqualTo(Integer value) {
            addCriterion("offset_number <>", value, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberGreaterThan(Integer value) {
            addCriterion("offset_number >", value, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("offset_number >=", value, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberLessThan(Integer value) {
            addCriterion("offset_number <", value, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberLessThanOrEqualTo(Integer value) {
            addCriterion("offset_number <=", value, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberIn(List<Integer> values) {
            addCriterion("offset_number in", values, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberNotIn(List<Integer> values) {
            addCriterion("offset_number not in", values, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberBetween(Integer value1, Integer value2) {
            addCriterion("offset_number between", value1, value2, "offsetNumber");
            return (Criteria) this;
        }

        public Criteria andOffsetNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("offset_number not between", value1, value2, "offsetNumber");
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