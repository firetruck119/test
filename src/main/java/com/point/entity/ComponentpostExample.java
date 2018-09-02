package com.point.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComponentpostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComponentpostExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(BigDecimal value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(BigDecimal value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(BigDecimal value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(BigDecimal value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<BigDecimal> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<BigDecimal> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterIsNull() {
            addCriterion("WeightPerMeter is null");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterIsNotNull() {
            addCriterion("WeightPerMeter is not null");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterEqualTo(BigDecimal value) {
            addCriterion("WeightPerMeter =", value, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterNotEqualTo(BigDecimal value) {
            addCriterion("WeightPerMeter <>", value, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterGreaterThan(BigDecimal value) {
            addCriterion("WeightPerMeter >", value, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WeightPerMeter >=", value, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterLessThan(BigDecimal value) {
            addCriterion("WeightPerMeter <", value, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WeightPerMeter <=", value, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterIn(List<BigDecimal> values) {
            addCriterion("WeightPerMeter in", values, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterNotIn(List<BigDecimal> values) {
            addCriterion("WeightPerMeter not in", values, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WeightPerMeter between", value1, value2, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andWeightpermeterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WeightPerMeter not between", value1, value2, "weightpermeter");
            return (Criteria) this;
        }

        public Criteria andStructurehoursIsNull() {
            addCriterion("StructureHours is null");
            return (Criteria) this;
        }

        public Criteria andStructurehoursIsNotNull() {
            addCriterion("StructureHours is not null");
            return (Criteria) this;
        }

        public Criteria andStructurehoursEqualTo(BigDecimal value) {
            addCriterion("StructureHours =", value, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursNotEqualTo(BigDecimal value) {
            addCriterion("StructureHours <>", value, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursGreaterThan(BigDecimal value) {
            addCriterion("StructureHours >", value, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StructureHours >=", value, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursLessThan(BigDecimal value) {
            addCriterion("StructureHours <", value, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StructureHours <=", value, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursIn(List<BigDecimal> values) {
            addCriterion("StructureHours in", values, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursNotIn(List<BigDecimal> values) {
            addCriterion("StructureHours not in", values, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StructureHours between", value1, value2, "structurehours");
            return (Criteria) this;
        }

        public Criteria andStructurehoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StructureHours not between", value1, value2, "structurehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursIsNull() {
            addCriterion("MultipleHours is null");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursIsNotNull() {
            addCriterion("MultipleHours is not null");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursEqualTo(BigDecimal value) {
            addCriterion("MultipleHours =", value, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursNotEqualTo(BigDecimal value) {
            addCriterion("MultipleHours <>", value, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursGreaterThan(BigDecimal value) {
            addCriterion("MultipleHours >", value, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MultipleHours >=", value, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursLessThan(BigDecimal value) {
            addCriterion("MultipleHours <", value, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MultipleHours <=", value, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursIn(List<BigDecimal> values) {
            addCriterion("MultipleHours in", values, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursNotIn(List<BigDecimal> values) {
            addCriterion("MultipleHours not in", values, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MultipleHours between", value1, value2, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andMultiplehoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MultipleHours not between", value1, value2, "multiplehours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursIsNull() {
            addCriterion("FitterHours is null");
            return (Criteria) this;
        }

        public Criteria andFitterhoursIsNotNull() {
            addCriterion("FitterHours is not null");
            return (Criteria) this;
        }

        public Criteria andFitterhoursEqualTo(BigDecimal value) {
            addCriterion("FitterHours =", value, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursNotEqualTo(BigDecimal value) {
            addCriterion("FitterHours <>", value, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursGreaterThan(BigDecimal value) {
            addCriterion("FitterHours >", value, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FitterHours >=", value, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursLessThan(BigDecimal value) {
            addCriterion("FitterHours <", value, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FitterHours <=", value, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursIn(List<BigDecimal> values) {
            addCriterion("FitterHours in", values, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursNotIn(List<BigDecimal> values) {
            addCriterion("FitterHours not in", values, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FitterHours between", value1, value2, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andFitterhoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FitterHours not between", value1, value2, "fitterhours");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTipsforselectIsNull() {
            addCriterion("TipsForSelect is null");
            return (Criteria) this;
        }

        public Criteria andTipsforselectIsNotNull() {
            addCriterion("TipsForSelect is not null");
            return (Criteria) this;
        }

        public Criteria andTipsforselectEqualTo(String value) {
            addCriterion("TipsForSelect =", value, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectNotEqualTo(String value) {
            addCriterion("TipsForSelect <>", value, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectGreaterThan(String value) {
            addCriterion("TipsForSelect >", value, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectGreaterThanOrEqualTo(String value) {
            addCriterion("TipsForSelect >=", value, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectLessThan(String value) {
            addCriterion("TipsForSelect <", value, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectLessThanOrEqualTo(String value) {
            addCriterion("TipsForSelect <=", value, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectLike(String value) {
            addCriterion("TipsForSelect like", value, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectNotLike(String value) {
            addCriterion("TipsForSelect not like", value, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectIn(List<String> values) {
            addCriterion("TipsForSelect in", values, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectNotIn(List<String> values) {
            addCriterion("TipsForSelect not in", values, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectBetween(String value1, String value2) {
            addCriterion("TipsForSelect between", value1, value2, "tipsforselect");
            return (Criteria) this;
        }

        public Criteria andTipsforselectNotBetween(String value1, String value2) {
            addCriterion("TipsForSelect not between", value1, value2, "tipsforselect");
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