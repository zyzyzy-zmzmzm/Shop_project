package com.third.pojo;

import java.util.ArrayList;
import java.util.List;

public class DianpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DianpuExample() {
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

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("sale is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("sale is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Integer value) {
            addCriterion("sale =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Integer value) {
            addCriterion("sale <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Integer value) {
            addCriterion("sale >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Integer value) {
            addCriterion("sale <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Integer value) {
            addCriterion("sale <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Integer> values) {
            addCriterion("sale in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Integer> values) {
            addCriterion("sale not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Integer value1, Integer value2) {
            addCriterion("sale between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("sale not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSimgIsNull() {
            addCriterion("simg is null");
            return (Criteria) this;
        }

        public Criteria andSimgIsNotNull() {
            addCriterion("simg is not null");
            return (Criteria) this;
        }

        public Criteria andSimgEqualTo(String value) {
            addCriterion("simg =", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgNotEqualTo(String value) {
            addCriterion("simg <>", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgGreaterThan(String value) {
            addCriterion("simg >", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgGreaterThanOrEqualTo(String value) {
            addCriterion("simg >=", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgLessThan(String value) {
            addCriterion("simg <", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgLessThanOrEqualTo(String value) {
            addCriterion("simg <=", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgLike(String value) {
            addCriterion("simg like", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgNotLike(String value) {
            addCriterion("simg not like", value, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgIn(List<String> values) {
            addCriterion("simg in", values, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgNotIn(List<String> values) {
            addCriterion("simg not in", values, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgBetween(String value1, String value2) {
            addCriterion("simg between", value1, value2, "simg");
            return (Criteria) this;
        }

        public Criteria andSimgNotBetween(String value1, String value2) {
            addCriterion("simg not between", value1, value2, "simg");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNull() {
            addCriterion("minprice is null");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNotNull() {
            addCriterion("minprice is not null");
            return (Criteria) this;
        }

        public Criteria andMinpriceEqualTo(Double value) {
            addCriterion("minprice =", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotEqualTo(Double value) {
            addCriterion("minprice <>", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThan(Double value) {
            addCriterion("minprice >", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("minprice >=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThan(Double value) {
            addCriterion("minprice <", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThanOrEqualTo(Double value) {
            addCriterion("minprice <=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceIn(List<Double> values) {
            addCriterion("minprice in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotIn(List<Double> values) {
            addCriterion("minprice not in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceBetween(Double value1, Double value2) {
            addCriterion("minprice between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotBetween(Double value1, Double value2) {
            addCriterion("minprice not between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andDispatchIsNull() {
            addCriterion("dispatch is null");
            return (Criteria) this;
        }

        public Criteria andDispatchIsNotNull() {
            addCriterion("dispatch is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchEqualTo(Double value) {
            addCriterion("dispatch =", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchNotEqualTo(Double value) {
            addCriterion("dispatch <>", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchGreaterThan(Double value) {
            addCriterion("dispatch >", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchGreaterThanOrEqualTo(Double value) {
            addCriterion("dispatch >=", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchLessThan(Double value) {
            addCriterion("dispatch <", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchLessThanOrEqualTo(Double value) {
            addCriterion("dispatch <=", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchIn(List<Double> values) {
            addCriterion("dispatch in", values, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchNotIn(List<Double> values) {
            addCriterion("dispatch not in", values, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchBetween(Double value1, Double value2) {
            addCriterion("dispatch between", value1, value2, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchNotBetween(Double value1, Double value2) {
            addCriterion("dispatch not between", value1, value2, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Double value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Double value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Double value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Double value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Double value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Double> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Double> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Double value1, Double value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Double value1, Double value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andBgimgIsNull() {
            addCriterion("bgimg is null");
            return (Criteria) this;
        }

        public Criteria andBgimgIsNotNull() {
            addCriterion("bgimg is not null");
            return (Criteria) this;
        }

        public Criteria andBgimgEqualTo(String value) {
            addCriterion("bgimg =", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgNotEqualTo(String value) {
            addCriterion("bgimg <>", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgGreaterThan(String value) {
            addCriterion("bgimg >", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgGreaterThanOrEqualTo(String value) {
            addCriterion("bgimg >=", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgLessThan(String value) {
            addCriterion("bgimg <", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgLessThanOrEqualTo(String value) {
            addCriterion("bgimg <=", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgLike(String value) {
            addCriterion("bgimg like", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgNotLike(String value) {
            addCriterion("bgimg not like", value, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgIn(List<String> values) {
            addCriterion("bgimg in", values, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgNotIn(List<String> values) {
            addCriterion("bgimg not in", values, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgBetween(String value1, String value2) {
            addCriterion("bgimg between", value1, value2, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBgimgNotBetween(String value1, String value2) {
            addCriterion("bgimg not between", value1, value2, "bgimg");
            return (Criteria) this;
        }

        public Criteria andBannerIsNull() {
            addCriterion("banner is null");
            return (Criteria) this;
        }

        public Criteria andBannerIsNotNull() {
            addCriterion("banner is not null");
            return (Criteria) this;
        }

        public Criteria andBannerEqualTo(String value) {
            addCriterion("banner =", value, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerNotEqualTo(String value) {
            addCriterion("banner <>", value, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerGreaterThan(String value) {
            addCriterion("banner >", value, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerGreaterThanOrEqualTo(String value) {
            addCriterion("banner >=", value, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerLessThan(String value) {
            addCriterion("banner <", value, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerLessThanOrEqualTo(String value) {
            addCriterion("banner <=", value, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerLike(String value) {
            addCriterion("banner like", value, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerNotLike(String value) {
            addCriterion("banner not like", value, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerIn(List<String> values) {
            addCriterion("banner in", values, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerNotIn(List<String> values) {
            addCriterion("banner not in", values, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerBetween(String value1, String value2) {
            addCriterion("banner between", value1, value2, "banner");
            return (Criteria) this;
        }

        public Criteria andBannerNotBetween(String value1, String value2) {
            addCriterion("banner not between", value1, value2, "banner");
            return (Criteria) this;
        }

        public Criteria andJtitleIsNull() {
            addCriterion("jtitle is null");
            return (Criteria) this;
        }

        public Criteria andJtitleIsNotNull() {
            addCriterion("jtitle is not null");
            return (Criteria) this;
        }

        public Criteria andJtitleEqualTo(String value) {
            addCriterion("jtitle =", value, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleNotEqualTo(String value) {
            addCriterion("jtitle <>", value, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleGreaterThan(String value) {
            addCriterion("jtitle >", value, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleGreaterThanOrEqualTo(String value) {
            addCriterion("jtitle >=", value, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleLessThan(String value) {
            addCriterion("jtitle <", value, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleLessThanOrEqualTo(String value) {
            addCriterion("jtitle <=", value, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleLike(String value) {
            addCriterion("jtitle like", value, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleNotLike(String value) {
            addCriterion("jtitle not like", value, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleIn(List<String> values) {
            addCriterion("jtitle in", values, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleNotIn(List<String> values) {
            addCriterion("jtitle not in", values, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleBetween(String value1, String value2) {
            addCriterion("jtitle between", value1, value2, "jtitle");
            return (Criteria) this;
        }

        public Criteria andJtitleNotBetween(String value1, String value2) {
            addCriterion("jtitle not between", value1, value2, "jtitle");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(Double value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(Double value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(Double value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(Double value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(Double value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(Double value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<Double> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<Double> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(Double value1, Double value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(Double value1, Double value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMainIsNull() {
            addCriterion("main is null");
            return (Criteria) this;
        }

        public Criteria andMainIsNotNull() {
            addCriterion("main is not null");
            return (Criteria) this;
        }

        public Criteria andMainEqualTo(String value) {
            addCriterion("main =", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotEqualTo(String value) {
            addCriterion("main <>", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainGreaterThan(String value) {
            addCriterion("main >", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainGreaterThanOrEqualTo(String value) {
            addCriterion("main >=", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLessThan(String value) {
            addCriterion("main <", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLessThanOrEqualTo(String value) {
            addCriterion("main <=", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainLike(String value) {
            addCriterion("main like", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotLike(String value) {
            addCriterion("main not like", value, "main");
            return (Criteria) this;
        }

        public Criteria andMainIn(List<String> values) {
            addCriterion("main in", values, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotIn(List<String> values) {
            addCriterion("main not in", values, "main");
            return (Criteria) this;
        }

        public Criteria andMainBetween(String value1, String value2) {
            addCriterion("main between", value1, value2, "main");
            return (Criteria) this;
        }

        public Criteria andMainNotBetween(String value1, String value2) {
            addCriterion("main not between", value1, value2, "main");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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