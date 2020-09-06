package com.point.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionCodeExample() {
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

        public Criteria andPermissioncodeidIsNull() {
            addCriterion("permissioncodeid is null");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidIsNotNull() {
            addCriterion("permissioncodeid is not null");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidEqualTo(Integer value) {
            addCriterion("permissioncodeid =", value, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidNotEqualTo(Integer value) {
            addCriterion("permissioncodeid <>", value, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidGreaterThan(Integer value) {
            addCriterion("permissioncodeid >", value, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("permissioncodeid >=", value, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidLessThan(Integer value) {
            addCriterion("permissioncodeid <", value, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidLessThanOrEqualTo(Integer value) {
            addCriterion("permissioncodeid <=", value, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidIn(List<Integer> values) {
            addCriterion("permissioncodeid in", values, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidNotIn(List<Integer> values) {
            addCriterion("permissioncodeid not in", values, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidBetween(Integer value1, Integer value2) {
            addCriterion("permissioncodeid between", value1, value2, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("permissioncodeid not between", value1, value2, "permissioncodeid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
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

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCheckflagIsNull() {
            addCriterion("checkFlag is null");
            return (Criteria) this;
        }

        public Criteria andCheckflagIsNotNull() {
            addCriterion("checkFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCheckflagEqualTo(Integer value) {
            addCriterion("checkFlag =", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotEqualTo(Integer value) {
            addCriterion("checkFlag <>", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagGreaterThan(Integer value) {
            addCriterion("checkFlag >", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkFlag >=", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagLessThan(Integer value) {
            addCriterion("checkFlag <", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagLessThanOrEqualTo(Integer value) {
            addCriterion("checkFlag <=", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagIn(List<Integer> values) {
            addCriterion("checkFlag in", values, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotIn(List<Integer> values) {
            addCriterion("checkFlag not in", values, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagBetween(Integer value1, Integer value2) {
            addCriterion("checkFlag between", value1, value2, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotBetween(Integer value1, Integer value2) {
            addCriterion("checkFlag not between", value1, value2, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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