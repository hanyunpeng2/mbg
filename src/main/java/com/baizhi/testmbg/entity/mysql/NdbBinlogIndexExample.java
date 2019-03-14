package com.baizhi.testmbg.entity.mysql;

import java.util.ArrayList;
import java.util.List;

public class NdbBinlogIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NdbBinlogIndexExample() {
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

        public Criteria andEpochIsNull() {
            addCriterion("epoch is null");
            return (Criteria) this;
        }

        public Criteria andEpochIsNotNull() {
            addCriterion("epoch is not null");
            return (Criteria) this;
        }

        public Criteria andEpochEqualTo(Long value) {
            addCriterion("epoch =", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochNotEqualTo(Long value) {
            addCriterion("epoch <>", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochGreaterThan(Long value) {
            addCriterion("epoch >", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochGreaterThanOrEqualTo(Long value) {
            addCriterion("epoch >=", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochLessThan(Long value) {
            addCriterion("epoch <", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochLessThanOrEqualTo(Long value) {
            addCriterion("epoch <=", value, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochIn(List<Long> values) {
            addCriterion("epoch in", values, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochNotIn(List<Long> values) {
            addCriterion("epoch not in", values, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochBetween(Long value1, Long value2) {
            addCriterion("epoch between", value1, value2, "epoch");
            return (Criteria) this;
        }

        public Criteria andEpochNotBetween(Long value1, Long value2) {
            addCriterion("epoch not between", value1, value2, "epoch");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Long value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Long value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Long value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Long value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Long value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Long value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Long> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Long> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Long value1, Long value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Long value1, Long value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andFileIsNull() {
            addCriterion("File is null");
            return (Criteria) this;
        }

        public Criteria andFileIsNotNull() {
            addCriterion("File is not null");
            return (Criteria) this;
        }

        public Criteria andFileEqualTo(String value) {
            addCriterion("File =", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotEqualTo(String value) {
            addCriterion("File <>", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThan(String value) {
            addCriterion("File >", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThanOrEqualTo(String value) {
            addCriterion("File >=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThan(String value) {
            addCriterion("File <", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThanOrEqualTo(String value) {
            addCriterion("File <=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLike(String value) {
            addCriterion("File like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotLike(String value) {
            addCriterion("File not like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileIn(List<String> values) {
            addCriterion("File in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotIn(List<String> values) {
            addCriterion("File not in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileBetween(String value1, String value2) {
            addCriterion("File between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotBetween(String value1, String value2) {
            addCriterion("File not between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andInsertsIsNull() {
            addCriterion("inserts is null");
            return (Criteria) this;
        }

        public Criteria andInsertsIsNotNull() {
            addCriterion("inserts is not null");
            return (Criteria) this;
        }

        public Criteria andInsertsEqualTo(Long value) {
            addCriterion("inserts =", value, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsNotEqualTo(Long value) {
            addCriterion("inserts <>", value, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsGreaterThan(Long value) {
            addCriterion("inserts >", value, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsGreaterThanOrEqualTo(Long value) {
            addCriterion("inserts >=", value, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsLessThan(Long value) {
            addCriterion("inserts <", value, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsLessThanOrEqualTo(Long value) {
            addCriterion("inserts <=", value, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsIn(List<Long> values) {
            addCriterion("inserts in", values, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsNotIn(List<Long> values) {
            addCriterion("inserts not in", values, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsBetween(Long value1, Long value2) {
            addCriterion("inserts between", value1, value2, "inserts");
            return (Criteria) this;
        }

        public Criteria andInsertsNotBetween(Long value1, Long value2) {
            addCriterion("inserts not between", value1, value2, "inserts");
            return (Criteria) this;
        }

        public Criteria andUpdatesIsNull() {
            addCriterion("updates is null");
            return (Criteria) this;
        }

        public Criteria andUpdatesIsNotNull() {
            addCriterion("updates is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatesEqualTo(Long value) {
            addCriterion("updates =", value, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesNotEqualTo(Long value) {
            addCriterion("updates <>", value, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesGreaterThan(Long value) {
            addCriterion("updates >", value, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesGreaterThanOrEqualTo(Long value) {
            addCriterion("updates >=", value, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesLessThan(Long value) {
            addCriterion("updates <", value, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesLessThanOrEqualTo(Long value) {
            addCriterion("updates <=", value, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesIn(List<Long> values) {
            addCriterion("updates in", values, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesNotIn(List<Long> values) {
            addCriterion("updates not in", values, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesBetween(Long value1, Long value2) {
            addCriterion("updates between", value1, value2, "updates");
            return (Criteria) this;
        }

        public Criteria andUpdatesNotBetween(Long value1, Long value2) {
            addCriterion("updates not between", value1, value2, "updates");
            return (Criteria) this;
        }

        public Criteria andDeletesIsNull() {
            addCriterion("deletes is null");
            return (Criteria) this;
        }

        public Criteria andDeletesIsNotNull() {
            addCriterion("deletes is not null");
            return (Criteria) this;
        }

        public Criteria andDeletesEqualTo(Long value) {
            addCriterion("deletes =", value, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesNotEqualTo(Long value) {
            addCriterion("deletes <>", value, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesGreaterThan(Long value) {
            addCriterion("deletes >", value, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesGreaterThanOrEqualTo(Long value) {
            addCriterion("deletes >=", value, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesLessThan(Long value) {
            addCriterion("deletes <", value, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesLessThanOrEqualTo(Long value) {
            addCriterion("deletes <=", value, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesIn(List<Long> values) {
            addCriterion("deletes in", values, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesNotIn(List<Long> values) {
            addCriterion("deletes not in", values, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesBetween(Long value1, Long value2) {
            addCriterion("deletes between", value1, value2, "deletes");
            return (Criteria) this;
        }

        public Criteria andDeletesNotBetween(Long value1, Long value2) {
            addCriterion("deletes not between", value1, value2, "deletes");
            return (Criteria) this;
        }

        public Criteria andSchemaopsIsNull() {
            addCriterion("schemaops is null");
            return (Criteria) this;
        }

        public Criteria andSchemaopsIsNotNull() {
            addCriterion("schemaops is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaopsEqualTo(Long value) {
            addCriterion("schemaops =", value, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsNotEqualTo(Long value) {
            addCriterion("schemaops <>", value, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsGreaterThan(Long value) {
            addCriterion("schemaops >", value, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsGreaterThanOrEqualTo(Long value) {
            addCriterion("schemaops >=", value, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsLessThan(Long value) {
            addCriterion("schemaops <", value, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsLessThanOrEqualTo(Long value) {
            addCriterion("schemaops <=", value, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsIn(List<Long> values) {
            addCriterion("schemaops in", values, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsNotIn(List<Long> values) {
            addCriterion("schemaops not in", values, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsBetween(Long value1, Long value2) {
            addCriterion("schemaops between", value1, value2, "schemaops");
            return (Criteria) this;
        }

        public Criteria andSchemaopsNotBetween(Long value1, Long value2) {
            addCriterion("schemaops not between", value1, value2, "schemaops");
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