package com.point.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperateLogExample() {
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

        public Criteria andOperatelogIsNull() {
            addCriterion("OperateLog is null");
            return (Criteria) this;
        }

        public Criteria andOperatelogIsNotNull() {
            addCriterion("OperateLog is not null");
            return (Criteria) this;
        }

        public Criteria andOperatelogEqualTo(Integer value) {
            addCriterion("OperateLog =", value, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogNotEqualTo(Integer value) {
            addCriterion("OperateLog <>", value, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogGreaterThan(Integer value) {
            addCriterion("OperateLog >", value, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperateLog >=", value, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogLessThan(Integer value) {
            addCriterion("OperateLog <", value, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogLessThanOrEqualTo(Integer value) {
            addCriterion("OperateLog <=", value, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogIn(List<Integer> values) {
            addCriterion("OperateLog in", values, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogNotIn(List<Integer> values) {
            addCriterion("OperateLog not in", values, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogBetween(Integer value1, Integer value2) {
            addCriterion("OperateLog between", value1, value2, "operatelog");
            return (Criteria) this;
        }

        public Criteria andOperatelogNotBetween(Integer value1, Integer value2) {
            addCriterion("OperateLog not between", value1, value2, "operatelog");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNull() {
            addCriterion("UserRealName is null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIsNotNull() {
            addCriterion("UserRealName is not null");
            return (Criteria) this;
        }

        public Criteria andUserrealnameEqualTo(String value) {
            addCriterion("UserRealName =", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotEqualTo(String value) {
            addCriterion("UserRealName <>", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThan(String value) {
            addCriterion("UserRealName >", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("UserRealName >=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThan(String value) {
            addCriterion("UserRealName <", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLessThanOrEqualTo(String value) {
            addCriterion("UserRealName <=", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameLike(String value) {
            addCriterion("UserRealName like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotLike(String value) {
            addCriterion("UserRealName not like", value, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameIn(List<String> values) {
            addCriterion("UserRealName in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotIn(List<String> values) {
            addCriterion("UserRealName not in", values, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameBetween(String value1, String value2) {
            addCriterion("UserRealName between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andUserrealnameNotBetween(String value1, String value2) {
            addCriterion("UserRealName not between", value1, value2, "userrealname");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("Operation is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("Operation is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("Operation =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("Operation <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("Operation >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("Operation >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("Operation <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("Operation <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("Operation like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("Operation not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("Operation in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("Operation not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("Operation between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("Operation not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeIsNull() {
            addCriterion("ChangeLastTime is null");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeIsNotNull() {
            addCriterion("ChangeLastTime is not null");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeEqualTo(Date value) {
            addCriterion("ChangeLastTime =", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeNotEqualTo(Date value) {
            addCriterion("ChangeLastTime <>", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeGreaterThan(Date value) {
            addCriterion("ChangeLastTime >", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ChangeLastTime >=", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeLessThan(Date value) {
            addCriterion("ChangeLastTime <", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeLessThanOrEqualTo(Date value) {
            addCriterion("ChangeLastTime <=", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeIn(List<Date> values) {
            addCriterion("ChangeLastTime in", values, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeNotIn(List<Date> values) {
            addCriterion("ChangeLastTime not in", values, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeBetween(Date value1, Date value2) {
            addCriterion("ChangeLastTime between", value1, value2, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeNotBetween(Date value1, Date value2) {
            addCriterion("ChangeLastTime not between", value1, value2, "changelasttime");
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