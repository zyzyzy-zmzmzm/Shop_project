package com.third.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPimgIsNull() {
            addCriterion("pimg is null");
            return (Criteria) this;
        }

        public Criteria andPimgIsNotNull() {
            addCriterion("pimg is not null");
            return (Criteria) this;
        }

        public Criteria andPimgEqualTo(String value) {
            addCriterion("pimg =", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgNotEqualTo(String value) {
            addCriterion("pimg <>", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgGreaterThan(String value) {
            addCriterion("pimg >", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgGreaterThanOrEqualTo(String value) {
            addCriterion("pimg >=", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgLessThan(String value) {
            addCriterion("pimg <", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgLessThanOrEqualTo(String value) {
            addCriterion("pimg <=", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgLike(String value) {
            addCriterion("pimg like", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgNotLike(String value) {
            addCriterion("pimg not like", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgIn(List<String> values) {
            addCriterion("pimg in", values, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgNotIn(List<String> values) {
            addCriterion("pimg not in", values, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgBetween(String value1, String value2) {
            addCriterion("pimg between", value1, value2, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgNotBetween(String value1, String value2) {
            addCriterion("pimg not between", value1, value2, "pimg");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andDosingIsNull() {
            addCriterion("dosing is null");
            return (Criteria) this;
        }

        public Criteria andDosingIsNotNull() {
            addCriterion("dosing is not null");
            return (Criteria) this;
        }

        public Criteria andDosingEqualTo(String value) {
            addCriterion("dosing =", value, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingNotEqualTo(String value) {
            addCriterion("dosing <>", value, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingGreaterThan(String value) {
            addCriterion("dosing >", value, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingGreaterThanOrEqualTo(String value) {
            addCriterion("dosing >=", value, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingLessThan(String value) {
            addCriterion("dosing <", value, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingLessThanOrEqualTo(String value) {
            addCriterion("dosing <=", value, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingLike(String value) {
            addCriterion("dosing like", value, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingNotLike(String value) {
            addCriterion("dosing not like", value, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingIn(List<String> values) {
            addCriterion("dosing in", values, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingNotIn(List<String> values) {
            addCriterion("dosing not in", values, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingBetween(String value1, String value2) {
            addCriterion("dosing between", value1, value2, "dosing");
            return (Criteria) this;
        }

        public Criteria andDosingNotBetween(String value1, String value2) {
            addCriterion("dosing not between", value1, value2, "dosing");
            return (Criteria) this;
        }

        public Criteria andDpriceIsNull() {
            addCriterion("dprice is null");
            return (Criteria) this;
        }

        public Criteria andDpriceIsNotNull() {
            addCriterion("dprice is not null");
            return (Criteria) this;
        }

        public Criteria andDpriceEqualTo(Double value) {
            addCriterion("dprice =", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceNotEqualTo(Double value) {
            addCriterion("dprice <>", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceGreaterThan(Double value) {
            addCriterion("dprice >", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dprice >=", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceLessThan(Double value) {
            addCriterion("dprice <", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceLessThanOrEqualTo(Double value) {
            addCriterion("dprice <=", value, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceIn(List<Double> values) {
            addCriterion("dprice in", values, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceNotIn(List<Double> values) {
            addCriterion("dprice not in", values, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceBetween(Double value1, Double value2) {
            addCriterion("dprice between", value1, value2, "dprice");
            return (Criteria) this;
        }

        public Criteria andDpriceNotBetween(Double value1, Double value2) {
            addCriterion("dprice not between", value1, value2, "dprice");
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