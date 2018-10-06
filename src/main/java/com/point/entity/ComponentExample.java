package com.point.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComponentExample() {
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

        public Criteria andComponenttypeIsNull() {
            addCriterion("ComponentType is null");
            return (Criteria) this;
        }

        public Criteria andComponenttypeIsNotNull() {
            addCriterion("ComponentType is not null");
            return (Criteria) this;
        }

        public Criteria andComponenttypeEqualTo(Integer value) {
            addCriterion("ComponentType =", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotEqualTo(Integer value) {
            addCriterion("ComponentType <>", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeGreaterThan(Integer value) {
            addCriterion("ComponentType >", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ComponentType >=", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeLessThan(Integer value) {
            addCriterion("ComponentType <", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeLessThanOrEqualTo(Integer value) {
            addCriterion("ComponentType <=", value, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeIn(List<Integer> values) {
            addCriterion("ComponentType in", values, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotIn(List<Integer> values) {
            addCriterion("ComponentType not in", values, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeBetween(Integer value1, Integer value2) {
            addCriterion("ComponentType between", value1, value2, "componenttype");
            return (Criteria) this;
        }

        public Criteria andComponenttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ComponentType not between", value1, value2, "componenttype");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentIsNull() {
            addCriterion("XXInertiaMoment is null");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentIsNotNull() {
            addCriterion("XXInertiaMoment is not null");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentEqualTo(BigDecimal value) {
            addCriterion("XXInertiaMoment =", value, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentNotEqualTo(BigDecimal value) {
            addCriterion("XXInertiaMoment <>", value, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentGreaterThan(BigDecimal value) {
            addCriterion("XXInertiaMoment >", value, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XXInertiaMoment >=", value, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentLessThan(BigDecimal value) {
            addCriterion("XXInertiaMoment <", value, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XXInertiaMoment <=", value, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentIn(List<BigDecimal> values) {
            addCriterion("XXInertiaMoment in", values, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentNotIn(List<BigDecimal> values) {
            addCriterion("XXInertiaMoment not in", values, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XXInertiaMoment between", value1, value2, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxinertiamomentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XXInertiaMoment not between", value1, value2, "xxinertiamoment");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionIsNull() {
            addCriterion("XXCrossSection is null");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionIsNotNull() {
            addCriterion("XXCrossSection is not null");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionEqualTo(BigDecimal value) {
            addCriterion("XXCrossSection =", value, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionNotEqualTo(BigDecimal value) {
            addCriterion("XXCrossSection <>", value, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionGreaterThan(BigDecimal value) {
            addCriterion("XXCrossSection >", value, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XXCrossSection >=", value, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionLessThan(BigDecimal value) {
            addCriterion("XXCrossSection <", value, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XXCrossSection <=", value, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionIn(List<BigDecimal> values) {
            addCriterion("XXCrossSection in", values, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionNotIn(List<BigDecimal> values) {
            addCriterion("XXCrossSection not in", values, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XXCrossSection between", value1, value2, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andXxcrosssectionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XXCrossSection not between", value1, value2, "xxcrosssection");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentIsNull() {
            addCriterion("YYInertiaMoment is null");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentIsNotNull() {
            addCriterion("YYInertiaMoment is not null");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentEqualTo(BigDecimal value) {
            addCriterion("YYInertiaMoment =", value, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentNotEqualTo(BigDecimal value) {
            addCriterion("YYInertiaMoment <>", value, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentGreaterThan(BigDecimal value) {
            addCriterion("YYInertiaMoment >", value, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YYInertiaMoment >=", value, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentLessThan(BigDecimal value) {
            addCriterion("YYInertiaMoment <", value, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YYInertiaMoment <=", value, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentIn(List<BigDecimal> values) {
            addCriterion("YYInertiaMoment in", values, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentNotIn(List<BigDecimal> values) {
            addCriterion("YYInertiaMoment not in", values, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YYInertiaMoment between", value1, value2, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYyinertiamomentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YYInertiaMoment not between", value1, value2, "yyinertiamoment");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionIsNull() {
            addCriterion("YYCrossSection is null");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionIsNotNull() {
            addCriterion("YYCrossSection is not null");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionEqualTo(BigDecimal value) {
            addCriterion("YYCrossSection =", value, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionNotEqualTo(BigDecimal value) {
            addCriterion("YYCrossSection <>", value, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionGreaterThan(BigDecimal value) {
            addCriterion("YYCrossSection >", value, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YYCrossSection >=", value, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionLessThan(BigDecimal value) {
            addCriterion("YYCrossSection <", value, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YYCrossSection <=", value, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionIn(List<BigDecimal> values) {
            addCriterion("YYCrossSection in", values, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionNotIn(List<BigDecimal> values) {
            addCriterion("YYCrossSection not in", values, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YYCrossSection between", value1, value2, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andYycrosssectionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YYCrossSection not between", value1, value2, "yycrosssection");
            return (Criteria) this;
        }

        public Criteria andRopediameterIsNull() {
            addCriterion("RopeDiameter is null");
            return (Criteria) this;
        }

        public Criteria andRopediameterIsNotNull() {
            addCriterion("RopeDiameter is not null");
            return (Criteria) this;
        }

        public Criteria andRopediameterEqualTo(BigDecimal value) {
            addCriterion("RopeDiameter =", value, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterNotEqualTo(BigDecimal value) {
            addCriterion("RopeDiameter <>", value, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterGreaterThan(BigDecimal value) {
            addCriterion("RopeDiameter >", value, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RopeDiameter >=", value, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterLessThan(BigDecimal value) {
            addCriterion("RopeDiameter <", value, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RopeDiameter <=", value, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterIn(List<BigDecimal> values) {
            addCriterion("RopeDiameter in", values, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterNotIn(List<BigDecimal> values) {
            addCriterion("RopeDiameter not in", values, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RopeDiameter between", value1, value2, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andRopediameterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RopeDiameter not between", value1, value2, "ropediameter");
            return (Criteria) this;
        }

        public Criteria andHightIsNull() {
            addCriterion("Hight is null");
            return (Criteria) this;
        }

        public Criteria andHightIsNotNull() {
            addCriterion("Hight is not null");
            return (Criteria) this;
        }

        public Criteria andHightEqualTo(BigDecimal value) {
            addCriterion("Hight =", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightNotEqualTo(BigDecimal value) {
            addCriterion("Hight <>", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightGreaterThan(BigDecimal value) {
            addCriterion("Hight >", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Hight >=", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightLessThan(BigDecimal value) {
            addCriterion("Hight <", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Hight <=", value, "hight");
            return (Criteria) this;
        }

        public Criteria andHightIn(List<BigDecimal> values) {
            addCriterion("Hight in", values, "hight");
            return (Criteria) this;
        }

        public Criteria andHightNotIn(List<BigDecimal> values) {
            addCriterion("Hight not in", values, "hight");
            return (Criteria) this;
        }

        public Criteria andHightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Hight between", value1, value2, "hight");
            return (Criteria) this;
        }

        public Criteria andHightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Hight not between", value1, value2, "hight");
            return (Criteria) this;
        }

        public Criteria andTrackgapIsNull() {
            addCriterion("TrackGap is null");
            return (Criteria) this;
        }

        public Criteria andTrackgapIsNotNull() {
            addCriterion("TrackGap is not null");
            return (Criteria) this;
        }

        public Criteria andTrackgapEqualTo(BigDecimal value) {
            addCriterion("TrackGap =", value, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapNotEqualTo(BigDecimal value) {
            addCriterion("TrackGap <>", value, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapGreaterThan(BigDecimal value) {
            addCriterion("TrackGap >", value, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TrackGap >=", value, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapLessThan(BigDecimal value) {
            addCriterion("TrackGap <", value, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TrackGap <=", value, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapIn(List<BigDecimal> values) {
            addCriterion("TrackGap in", values, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapNotIn(List<BigDecimal> values) {
            addCriterion("TrackGap not in", values, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TrackGap between", value1, value2, "trackgap");
            return (Criteria) this;
        }

        public Criteria andTrackgapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TrackGap not between", value1, value2, "trackgap");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityIsNull() {
            addCriterion("AngularVelocity is null");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityIsNotNull() {
            addCriterion("AngularVelocity is not null");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityEqualTo(BigDecimal value) {
            addCriterion("AngularVelocity =", value, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityNotEqualTo(BigDecimal value) {
            addCriterion("AngularVelocity <>", value, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityGreaterThan(BigDecimal value) {
            addCriterion("AngularVelocity >", value, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AngularVelocity >=", value, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityLessThan(BigDecimal value) {
            addCriterion("AngularVelocity <", value, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AngularVelocity <=", value, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityIn(List<BigDecimal> values) {
            addCriterion("AngularVelocity in", values, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityNotIn(List<BigDecimal> values) {
            addCriterion("AngularVelocity not in", values, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AngularVelocity between", value1, value2, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andAngularvelocityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AngularVelocity not between", value1, value2, "angularvelocity");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("Width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("Width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(BigDecimal value) {
            addCriterion("Width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(BigDecimal value) {
            addCriterion("Width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(BigDecimal value) {
            addCriterion("Width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(BigDecimal value) {
            addCriterion("Width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<BigDecimal> values) {
            addCriterion("Width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<BigDecimal> values) {
            addCriterion("Width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWheelgapIsNull() {
            addCriterion("WheelGap is null");
            return (Criteria) this;
        }

        public Criteria andWheelgapIsNotNull() {
            addCriterion("WheelGap is not null");
            return (Criteria) this;
        }

        public Criteria andWheelgapEqualTo(BigDecimal value) {
            addCriterion("WheelGap =", value, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapNotEqualTo(BigDecimal value) {
            addCriterion("WheelGap <>", value, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapGreaterThan(BigDecimal value) {
            addCriterion("WheelGap >", value, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WheelGap >=", value, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapLessThan(BigDecimal value) {
            addCriterion("WheelGap <", value, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WheelGap <=", value, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapIn(List<BigDecimal> values) {
            addCriterion("WheelGap in", values, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapNotIn(List<BigDecimal> values) {
            addCriterion("WheelGap not in", values, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WheelGap between", value1, value2, "wheelgap");
            return (Criteria) this;
        }

        public Criteria andWheelgapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WheelGap not between", value1, value2, "wheelgap");
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

        public Criteria andArmlengthIsNull() {
            addCriterion("ArmLength is null");
            return (Criteria) this;
        }

        public Criteria andArmlengthIsNotNull() {
            addCriterion("ArmLength is not null");
            return (Criteria) this;
        }

        public Criteria andArmlengthEqualTo(BigDecimal value) {
            addCriterion("ArmLength =", value, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthNotEqualTo(BigDecimal value) {
            addCriterion("ArmLength <>", value, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthGreaterThan(BigDecimal value) {
            addCriterion("ArmLength >", value, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ArmLength >=", value, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthLessThan(BigDecimal value) {
            addCriterion("ArmLength <", value, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ArmLength <=", value, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthIn(List<BigDecimal> values) {
            addCriterion("ArmLength in", values, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthNotIn(List<BigDecimal> values) {
            addCriterion("ArmLength not in", values, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ArmLength between", value1, value2, "armlength");
            return (Criteria) this;
        }

        public Criteria andArmlengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ArmLength not between", value1, value2, "armlength");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeIsNull() {
            addCriterion("OutlineSize is null");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeIsNotNull() {
            addCriterion("OutlineSize is not null");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeEqualTo(BigDecimal value) {
            addCriterion("OutlineSize =", value, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeNotEqualTo(BigDecimal value) {
            addCriterion("OutlineSize <>", value, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeGreaterThan(BigDecimal value) {
            addCriterion("OutlineSize >", value, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OutlineSize >=", value, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeLessThan(BigDecimal value) {
            addCriterion("OutlineSize <", value, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OutlineSize <=", value, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeIn(List<BigDecimal> values) {
            addCriterion("OutlineSize in", values, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeNotIn(List<BigDecimal> values) {
            addCriterion("OutlineSize not in", values, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OutlineSize between", value1, value2, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andOutlinesizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OutlineSize not between", value1, value2, "outlinesize");
            return (Criteria) this;
        }

        public Criteria andFrontalareaIsNull() {
            addCriterion("FrontalArea is null");
            return (Criteria) this;
        }

        public Criteria andFrontalareaIsNotNull() {
            addCriterion("FrontalArea is not null");
            return (Criteria) this;
        }

        public Criteria andFrontalareaEqualTo(BigDecimal value) {
            addCriterion("FrontalArea =", value, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaNotEqualTo(BigDecimal value) {
            addCriterion("FrontalArea <>", value, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaGreaterThan(BigDecimal value) {
            addCriterion("FrontalArea >", value, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FrontalArea >=", value, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaLessThan(BigDecimal value) {
            addCriterion("FrontalArea <", value, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FrontalArea <=", value, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaIn(List<BigDecimal> values) {
            addCriterion("FrontalArea in", values, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaNotIn(List<BigDecimal> values) {
            addCriterion("FrontalArea not in", values, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FrontalArea between", value1, value2, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andFrontalareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FrontalArea not between", value1, value2, "frontalarea");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerIsNull() {
            addCriterion("HydroCylinderPower is null");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerIsNotNull() {
            addCriterion("HydroCylinderPower is not null");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerEqualTo(BigDecimal value) {
            addCriterion("HydroCylinderPower =", value, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerNotEqualTo(BigDecimal value) {
            addCriterion("HydroCylinderPower <>", value, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerGreaterThan(BigDecimal value) {
            addCriterion("HydroCylinderPower >", value, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HydroCylinderPower >=", value, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerLessThan(BigDecimal value) {
            addCriterion("HydroCylinderPower <", value, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HydroCylinderPower <=", value, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerIn(List<BigDecimal> values) {
            addCriterion("HydroCylinderPower in", values, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerNotIn(List<BigDecimal> values) {
            addCriterion("HydroCylinderPower not in", values, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HydroCylinderPower between", value1, value2, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andHydrocylinderpowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HydroCylinderPower not between", value1, value2, "hydrocylinderpower");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBarycenterIsNull() {
            addCriterion("BaryCenter is null");
            return (Criteria) this;
        }

        public Criteria andBarycenterIsNotNull() {
            addCriterion("BaryCenter is not null");
            return (Criteria) this;
        }

        public Criteria andBarycenterEqualTo(BigDecimal value) {
            addCriterion("BaryCenter =", value, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterNotEqualTo(BigDecimal value) {
            addCriterion("BaryCenter <>", value, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterGreaterThan(BigDecimal value) {
            addCriterion("BaryCenter >", value, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BaryCenter >=", value, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterLessThan(BigDecimal value) {
            addCriterion("BaryCenter <", value, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BaryCenter <=", value, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterIn(List<BigDecimal> values) {
            addCriterion("BaryCenter in", values, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterNotIn(List<BigDecimal> values) {
            addCriterion("BaryCenter not in", values, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BaryCenter between", value1, value2, "barycenter");
            return (Criteria) this;
        }

        public Criteria andBarycenterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BaryCenter not between", value1, value2, "barycenter");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceIsNull() {
            addCriterion("MaxDistance is null");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceIsNotNull() {
            addCriterion("MaxDistance is not null");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceEqualTo(BigDecimal value) {
            addCriterion("MaxDistance =", value, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceNotEqualTo(BigDecimal value) {
            addCriterion("MaxDistance <>", value, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceGreaterThan(BigDecimal value) {
            addCriterion("MaxDistance >", value, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxDistance >=", value, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceLessThan(BigDecimal value) {
            addCriterion("MaxDistance <", value, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxDistance <=", value, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceIn(List<BigDecimal> values) {
            addCriterion("MaxDistance in", values, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceNotIn(List<BigDecimal> values) {
            addCriterion("MaxDistance not in", values, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxDistance between", value1, value2, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxdistanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxDistance not between", value1, value2, "maxdistance");
            return (Criteria) this;
        }

        public Criteria andMaxloadingIsNull() {
            addCriterion("MaxLoading is null");
            return (Criteria) this;
        }

        public Criteria andMaxloadingIsNotNull() {
            addCriterion("MaxLoading is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloadingEqualTo(BigDecimal value) {
            addCriterion("MaxLoading =", value, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingNotEqualTo(BigDecimal value) {
            addCriterion("MaxLoading <>", value, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingGreaterThan(BigDecimal value) {
            addCriterion("MaxLoading >", value, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxLoading >=", value, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingLessThan(BigDecimal value) {
            addCriterion("MaxLoading <", value, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxLoading <=", value, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingIn(List<BigDecimal> values) {
            addCriterion("MaxLoading in", values, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingNotIn(List<BigDecimal> values) {
            addCriterion("MaxLoading not in", values, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxLoading between", value1, value2, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMaxloadingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxLoading not between", value1, value2, "maxloading");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceIsNull() {
            addCriterion("MinBreakageForce is null");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceIsNotNull() {
            addCriterion("MinBreakageForce is not null");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceEqualTo(BigDecimal value) {
            addCriterion("MinBreakageForce =", value, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceNotEqualTo(BigDecimal value) {
            addCriterion("MinBreakageForce <>", value, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceGreaterThan(BigDecimal value) {
            addCriterion("MinBreakageForce >", value, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MinBreakageForce >=", value, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceLessThan(BigDecimal value) {
            addCriterion("MinBreakageForce <", value, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MinBreakageForce <=", value, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceIn(List<BigDecimal> values) {
            addCriterion("MinBreakageForce in", values, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceNotIn(List<BigDecimal> values) {
            addCriterion("MinBreakageForce not in", values, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinBreakageForce between", value1, value2, "minbreakageforce");
            return (Criteria) this;
        }

        public Criteria andMinbreakageforceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinBreakageForce not between", value1, value2, "minbreakageforce");
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

        public Criteria andMaterialIsNull() {
            addCriterion("Material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("Material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("Material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("Material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("Material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("Material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("Material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("Material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("Material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("Material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("Material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("Material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("Material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("Material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeIsNull() {
            addCriterion("ElectricMecType is null");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeIsNotNull() {
            addCriterion("ElectricMecType is not null");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeEqualTo(String value) {
            addCriterion("ElectricMecType =", value, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeNotEqualTo(String value) {
            addCriterion("ElectricMecType <>", value, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeGreaterThan(String value) {
            addCriterion("ElectricMecType >", value, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeGreaterThanOrEqualTo(String value) {
            addCriterion("ElectricMecType >=", value, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeLessThan(String value) {
            addCriterion("ElectricMecType <", value, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeLessThanOrEqualTo(String value) {
            addCriterion("ElectricMecType <=", value, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeLike(String value) {
            addCriterion("ElectricMecType like", value, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeNotLike(String value) {
            addCriterion("ElectricMecType not like", value, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeIn(List<String> values) {
            addCriterion("ElectricMecType in", values, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeNotIn(List<String> values) {
            addCriterion("ElectricMecType not in", values, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeBetween(String value1, String value2) {
            addCriterion("ElectricMecType between", value1, value2, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andElectricmectypeNotBetween(String value1, String value2) {
            addCriterion("ElectricMecType not between", value1, value2, "electricmectype");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelIsNull() {
            addCriterion("RotationSustainModel is null");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelIsNotNull() {
            addCriterion("RotationSustainModel is not null");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelEqualTo(String value) {
            addCriterion("RotationSustainModel =", value, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelNotEqualTo(String value) {
            addCriterion("RotationSustainModel <>", value, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelGreaterThan(String value) {
            addCriterion("RotationSustainModel >", value, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelGreaterThanOrEqualTo(String value) {
            addCriterion("RotationSustainModel >=", value, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelLessThan(String value) {
            addCriterion("RotationSustainModel <", value, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelLessThanOrEqualTo(String value) {
            addCriterion("RotationSustainModel <=", value, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelLike(String value) {
            addCriterion("RotationSustainModel like", value, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelNotLike(String value) {
            addCriterion("RotationSustainModel not like", value, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelIn(List<String> values) {
            addCriterion("RotationSustainModel in", values, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelNotIn(List<String> values) {
            addCriterion("RotationSustainModel not in", values, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelBetween(String value1, String value2) {
            addCriterion("RotationSustainModel between", value1, value2, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andRotationsustainmodelNotBetween(String value1, String value2) {
            addCriterion("RotationSustainModel not between", value1, value2, "rotationsustainmodel");
            return (Criteria) this;
        }

        public Criteria andApapttypeIsNull() {
            addCriterion("ApaptType is null");
            return (Criteria) this;
        }

        public Criteria andApapttypeIsNotNull() {
            addCriterion("ApaptType is not null");
            return (Criteria) this;
        }

        public Criteria andApapttypeEqualTo(String value) {
            addCriterion("ApaptType =", value, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeNotEqualTo(String value) {
            addCriterion("ApaptType <>", value, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeGreaterThan(String value) {
            addCriterion("ApaptType >", value, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ApaptType >=", value, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeLessThan(String value) {
            addCriterion("ApaptType <", value, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeLessThanOrEqualTo(String value) {
            addCriterion("ApaptType <=", value, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeLike(String value) {
            addCriterion("ApaptType like", value, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeNotLike(String value) {
            addCriterion("ApaptType not like", value, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeIn(List<String> values) {
            addCriterion("ApaptType in", values, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeNotIn(List<String> values) {
            addCriterion("ApaptType not in", values, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeBetween(String value1, String value2) {
            addCriterion("ApaptType between", value1, value2, "apapttype");
            return (Criteria) this;
        }

        public Criteria andApapttypeNotBetween(String value1, String value2) {
            addCriterion("ApaptType not between", value1, value2, "apapttype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeIsNull() {
            addCriterion("HoisterType is null");
            return (Criteria) this;
        }

        public Criteria andHoistertypeIsNotNull() {
            addCriterion("HoisterType is not null");
            return (Criteria) this;
        }

        public Criteria andHoistertypeEqualTo(String value) {
            addCriterion("HoisterType =", value, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeNotEqualTo(String value) {
            addCriterion("HoisterType <>", value, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeGreaterThan(String value) {
            addCriterion("HoisterType >", value, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeGreaterThanOrEqualTo(String value) {
            addCriterion("HoisterType >=", value, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeLessThan(String value) {
            addCriterion("HoisterType <", value, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeLessThanOrEqualTo(String value) {
            addCriterion("HoisterType <=", value, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeLike(String value) {
            addCriterion("HoisterType like", value, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeNotLike(String value) {
            addCriterion("HoisterType not like", value, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeIn(List<String> values) {
            addCriterion("HoisterType in", values, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeNotIn(List<String> values) {
            addCriterion("HoisterType not in", values, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeBetween(String value1, String value2) {
            addCriterion("HoisterType between", value1, value2, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andHoistertypeNotBetween(String value1, String value2) {
            addCriterion("HoisterType not between", value1, value2, "hoistertype");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNull() {
            addCriterion("ModelType is null");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNotNull() {
            addCriterion("ModelType is not null");
            return (Criteria) this;
        }

        public Criteria andModeltypeEqualTo(String value) {
            addCriterion("ModelType =", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotEqualTo(String value) {
            addCriterion("ModelType <>", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThan(String value) {
            addCriterion("ModelType >", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThanOrEqualTo(String value) {
            addCriterion("ModelType >=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThan(String value) {
            addCriterion("ModelType <", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThanOrEqualTo(String value) {
            addCriterion("ModelType <=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLike(String value) {
            addCriterion("ModelType like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotLike(String value) {
            addCriterion("ModelType not like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeIn(List<String> values) {
            addCriterion("ModelType in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotIn(List<String> values) {
            addCriterion("ModelType not in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeBetween(String value1, String value2) {
            addCriterion("ModelType between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotBetween(String value1, String value2) {
            addCriterion("ModelType not between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andTipsIsNull() {
            addCriterion("Tips is null");
            return (Criteria) this;
        }

        public Criteria andTipsIsNotNull() {
            addCriterion("Tips is not null");
            return (Criteria) this;
        }

        public Criteria andTipsEqualTo(String value) {
            addCriterion("Tips =", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotEqualTo(String value) {
            addCriterion("Tips <>", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThan(String value) {
            addCriterion("Tips >", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThanOrEqualTo(String value) {
            addCriterion("Tips >=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThan(String value) {
            addCriterion("Tips <", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThanOrEqualTo(String value) {
            addCriterion("Tips <=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLike(String value) {
            addCriterion("Tips like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotLike(String value) {
            addCriterion("Tips not like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsIn(List<String> values) {
            addCriterion("Tips in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotIn(List<String> values) {
            addCriterion("Tips not in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsBetween(String value1, String value2) {
            addCriterion("Tips between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotBetween(String value1, String value2) {
            addCriterion("Tips not between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andMechanismIsNull() {
            addCriterion("Mechanism is null");
            return (Criteria) this;
        }

        public Criteria andMechanismIsNotNull() {
            addCriterion("Mechanism is not null");
            return (Criteria) this;
        }

        public Criteria andMechanismEqualTo(String value) {
            addCriterion("Mechanism =", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismNotEqualTo(String value) {
            addCriterion("Mechanism <>", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismGreaterThan(String value) {
            addCriterion("Mechanism >", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismGreaterThanOrEqualTo(String value) {
            addCriterion("Mechanism >=", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismLessThan(String value) {
            addCriterion("Mechanism <", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismLessThanOrEqualTo(String value) {
            addCriterion("Mechanism <=", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismLike(String value) {
            addCriterion("Mechanism like", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismNotLike(String value) {
            addCriterion("Mechanism not like", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismIn(List<String> values) {
            addCriterion("Mechanism in", values, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismNotIn(List<String> values) {
            addCriterion("Mechanism not in", values, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismBetween(String value1, String value2) {
            addCriterion("Mechanism between", value1, value2, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismNotBetween(String value1, String value2) {
            addCriterion("Mechanism not between", value1, value2, "mechanism");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientIsNull() {
            addCriterion("CostCoeffcient is null");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientIsNotNull() {
            addCriterion("CostCoeffcient is not null");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientEqualTo(BigDecimal value) {
            addCriterion("CostCoeffcient =", value, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientNotEqualTo(BigDecimal value) {
            addCriterion("CostCoeffcient <>", value, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientGreaterThan(BigDecimal value) {
            addCriterion("CostCoeffcient >", value, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CostCoeffcient >=", value, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientLessThan(BigDecimal value) {
            addCriterion("CostCoeffcient <", value, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CostCoeffcient <=", value, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientIn(List<BigDecimal> values) {
            addCriterion("CostCoeffcient in", values, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientNotIn(List<BigDecimal> values) {
            addCriterion("CostCoeffcient not in", values, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostCoeffcient between", value1, value2, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andCostcoeffcientNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostCoeffcient not between", value1, value2, "costcoeffcient");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceIsNull() {
            addCriterion("ElectricMecPrice is null");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceIsNotNull() {
            addCriterion("ElectricMecPrice is not null");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceEqualTo(BigDecimal value) {
            addCriterion("ElectricMecPrice =", value, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceNotEqualTo(BigDecimal value) {
            addCriterion("ElectricMecPrice <>", value, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceGreaterThan(BigDecimal value) {
            addCriterion("ElectricMecPrice >", value, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ElectricMecPrice >=", value, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceLessThan(BigDecimal value) {
            addCriterion("ElectricMecPrice <", value, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ElectricMecPrice <=", value, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceIn(List<BigDecimal> values) {
            addCriterion("ElectricMecPrice in", values, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceNotIn(List<BigDecimal> values) {
            addCriterion("ElectricMecPrice not in", values, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ElectricMecPrice between", value1, value2, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andElectricmecpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ElectricMecPrice not between", value1, value2, "electricmecprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceIsNull() {
            addCriterion("RotationSustainPrice is null");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceIsNotNull() {
            addCriterion("RotationSustainPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceEqualTo(BigDecimal value) {
            addCriterion("RotationSustainPrice =", value, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceNotEqualTo(BigDecimal value) {
            addCriterion("RotationSustainPrice <>", value, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceGreaterThan(BigDecimal value) {
            addCriterion("RotationSustainPrice >", value, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RotationSustainPrice >=", value, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceLessThan(BigDecimal value) {
            addCriterion("RotationSustainPrice <", value, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RotationSustainPrice <=", value, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceIn(List<BigDecimal> values) {
            addCriterion("RotationSustainPrice in", values, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceNotIn(List<BigDecimal> values) {
            addCriterion("RotationSustainPrice not in", values, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RotationSustainPrice between", value1, value2, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andRotationsustainpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RotationSustainPrice not between", value1, value2, "rotationsustainprice");
            return (Criteria) this;
        }

        public Criteria andPricepermeterIsNull() {
            addCriterion("PricePerMeter is null");
            return (Criteria) this;
        }

        public Criteria andPricepermeterIsNotNull() {
            addCriterion("PricePerMeter is not null");
            return (Criteria) this;
        }

        public Criteria andPricepermeterEqualTo(BigDecimal value) {
            addCriterion("PricePerMeter =", value, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterNotEqualTo(BigDecimal value) {
            addCriterion("PricePerMeter <>", value, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterGreaterThan(BigDecimal value) {
            addCriterion("PricePerMeter >", value, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PricePerMeter >=", value, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterLessThan(BigDecimal value) {
            addCriterion("PricePerMeter <", value, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PricePerMeter <=", value, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterIn(List<BigDecimal> values) {
            addCriterion("PricePerMeter in", values, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterNotIn(List<BigDecimal> values) {
            addCriterion("PricePerMeter not in", values, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PricePerMeter between", value1, value2, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andPricepermeterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PricePerMeter not between", value1, value2, "pricepermeter");
            return (Criteria) this;
        }

        public Criteria andOthercostIsNull() {
            addCriterion("OtherCost is null");
            return (Criteria) this;
        }

        public Criteria andOthercostIsNotNull() {
            addCriterion("OtherCost is not null");
            return (Criteria) this;
        }

        public Criteria andOthercostEqualTo(BigDecimal value) {
            addCriterion("OtherCost =", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotEqualTo(BigDecimal value) {
            addCriterion("OtherCost <>", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostGreaterThan(BigDecimal value) {
            addCriterion("OtherCost >", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OtherCost >=", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostLessThan(BigDecimal value) {
            addCriterion("OtherCost <", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OtherCost <=", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostIn(List<BigDecimal> values) {
            addCriterion("OtherCost in", values, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotIn(List<BigDecimal> values) {
            addCriterion("OtherCost not in", values, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OtherCost between", value1, value2, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OtherCost not between", value1, value2, "othercost");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceIsNull() {
            addCriterion("HoisterPrice is null");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceIsNotNull() {
            addCriterion("HoisterPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceEqualTo(BigDecimal value) {
            addCriterion("HoisterPrice =", value, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceNotEqualTo(BigDecimal value) {
            addCriterion("HoisterPrice <>", value, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceGreaterThan(BigDecimal value) {
            addCriterion("HoisterPrice >", value, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HoisterPrice >=", value, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceLessThan(BigDecimal value) {
            addCriterion("HoisterPrice <", value, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HoisterPrice <=", value, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceIn(List<BigDecimal> values) {
            addCriterion("HoisterPrice in", values, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceNotIn(List<BigDecimal> values) {
            addCriterion("HoisterPrice not in", values, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HoisterPrice between", value1, value2, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andHoisterpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HoisterPrice not between", value1, value2, "hoisterprice");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostIsNull() {
            addCriterion("CooperationPartCost is null");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostIsNotNull() {
            addCriterion("CooperationPartCost is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostEqualTo(BigDecimal value) {
            addCriterion("CooperationPartCost =", value, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostNotEqualTo(BigDecimal value) {
            addCriterion("CooperationPartCost <>", value, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostGreaterThan(BigDecimal value) {
            addCriterion("CooperationPartCost >", value, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CooperationPartCost >=", value, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostLessThan(BigDecimal value) {
            addCriterion("CooperationPartCost <", value, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CooperationPartCost <=", value, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostIn(List<BigDecimal> values) {
            addCriterion("CooperationPartCost in", values, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostNotIn(List<BigDecimal> values) {
            addCriterion("CooperationPartCost not in", values, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CooperationPartCost between", value1, value2, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andCooperationpartcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CooperationPartCost not between", value1, value2, "cooperationpartcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostIsNull() {
            addCriterion("FieldInstallCost is null");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostIsNotNull() {
            addCriterion("FieldInstallCost is not null");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostEqualTo(BigDecimal value) {
            addCriterion("FieldInstallCost =", value, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostNotEqualTo(BigDecimal value) {
            addCriterion("FieldInstallCost <>", value, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostGreaterThan(BigDecimal value) {
            addCriterion("FieldInstallCost >", value, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FieldInstallCost >=", value, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostLessThan(BigDecimal value) {
            addCriterion("FieldInstallCost <", value, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FieldInstallCost <=", value, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostIn(List<BigDecimal> values) {
            addCriterion("FieldInstallCost in", values, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostNotIn(List<BigDecimal> values) {
            addCriterion("FieldInstallCost not in", values, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FieldInstallCost between", value1, value2, "fieldinstallcost");
            return (Criteria) this;
        }

        public Criteria andFieldinstallcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FieldInstallCost not between", value1, value2, "fieldinstallcost");
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

        public Criteria andWeldinghoursIsNull() {
            addCriterion("WeldingHours is null");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursIsNotNull() {
            addCriterion("WeldingHours is not null");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursEqualTo(BigDecimal value) {
            addCriterion("WeldingHours =", value, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursNotEqualTo(BigDecimal value) {
            addCriterion("WeldingHours <>", value, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursGreaterThan(BigDecimal value) {
            addCriterion("WeldingHours >", value, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WeldingHours >=", value, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursLessThan(BigDecimal value) {
            addCriterion("WeldingHours <", value, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WeldingHours <=", value, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursIn(List<BigDecimal> values) {
            addCriterion("WeldingHours in", values, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursNotIn(List<BigDecimal> values) {
            addCriterion("WeldingHours not in", values, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WeldingHours between", value1, value2, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andWeldinghoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WeldingHours not between", value1, value2, "weldinghours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursIsNull() {
            addCriterion("StandardPartsHours is null");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursIsNotNull() {
            addCriterion("StandardPartsHours is not null");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursEqualTo(BigDecimal value) {
            addCriterion("StandardPartsHours =", value, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursNotEqualTo(BigDecimal value) {
            addCriterion("StandardPartsHours <>", value, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursGreaterThan(BigDecimal value) {
            addCriterion("StandardPartsHours >", value, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StandardPartsHours >=", value, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursLessThan(BigDecimal value) {
            addCriterion("StandardPartsHours <", value, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StandardPartsHours <=", value, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursIn(List<BigDecimal> values) {
            addCriterion("StandardPartsHours in", values, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursNotIn(List<BigDecimal> values) {
            addCriterion("StandardPartsHours not in", values, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandardPartsHours between", value1, value2, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andStandardpartshoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StandardPartsHours not between", value1, value2, "standardpartshours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursIsNull() {
            addCriterion("BigStructureHours is null");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursIsNotNull() {
            addCriterion("BigStructureHours is not null");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursEqualTo(BigDecimal value) {
            addCriterion("BigStructureHours =", value, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursNotEqualTo(BigDecimal value) {
            addCriterion("BigStructureHours <>", value, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursGreaterThan(BigDecimal value) {
            addCriterion("BigStructureHours >", value, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BigStructureHours >=", value, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursLessThan(BigDecimal value) {
            addCriterion("BigStructureHours <", value, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BigStructureHours <=", value, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursIn(List<BigDecimal> values) {
            addCriterion("BigStructureHours in", values, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursNotIn(List<BigDecimal> values) {
            addCriterion("BigStructureHours not in", values, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BigStructureHours between", value1, value2, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andBigstructurehoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BigStructureHours not between", value1, value2, "bigstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursIsNull() {
            addCriterion("SmallStructureHours is null");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursIsNotNull() {
            addCriterion("SmallStructureHours is not null");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursEqualTo(BigDecimal value) {
            addCriterion("SmallStructureHours =", value, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursNotEqualTo(BigDecimal value) {
            addCriterion("SmallStructureHours <>", value, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursGreaterThan(BigDecimal value) {
            addCriterion("SmallStructureHours >", value, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SmallStructureHours >=", value, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursLessThan(BigDecimal value) {
            addCriterion("SmallStructureHours <", value, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SmallStructureHours <=", value, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursIn(List<BigDecimal> values) {
            addCriterion("SmallStructureHours in", values, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursNotIn(List<BigDecimal> values) {
            addCriterion("SmallStructureHours not in", values, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SmallStructureHours between", value1, value2, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andSmallstructurehoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SmallStructureHours not between", value1, value2, "smallstructurehours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursIsNull() {
            addCriterion("ElectricalHours is null");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursIsNotNull() {
            addCriterion("ElectricalHours is not null");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursEqualTo(BigDecimal value) {
            addCriterion("ElectricalHours =", value, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursNotEqualTo(BigDecimal value) {
            addCriterion("ElectricalHours <>", value, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursGreaterThan(BigDecimal value) {
            addCriterion("ElectricalHours >", value, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ElectricalHours >=", value, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursLessThan(BigDecimal value) {
            addCriterion("ElectricalHours <", value, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ElectricalHours <=", value, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursIn(List<BigDecimal> values) {
            addCriterion("ElectricalHours in", values, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursNotIn(List<BigDecimal> values) {
            addCriterion("ElectricalHours not in", values, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ElectricalHours between", value1, value2, "electricalhours");
            return (Criteria) this;
        }

        public Criteria andElectricalhoursNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ElectricalHours not between", value1, value2, "electricalhours");
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