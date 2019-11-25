package com.qf.j1906.common.po;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctor_name like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDoImgIsNull() {
            addCriterion("do_img is null");
            return (Criteria) this;
        }

        public Criteria andDoImgIsNotNull() {
            addCriterion("do_img is not null");
            return (Criteria) this;
        }

        public Criteria andDoImgEqualTo(String value) {
            addCriterion("do_img =", value, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgNotEqualTo(String value) {
            addCriterion("do_img <>", value, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgGreaterThan(String value) {
            addCriterion("do_img >", value, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgGreaterThanOrEqualTo(String value) {
            addCriterion("do_img >=", value, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgLessThan(String value) {
            addCriterion("do_img <", value, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgLessThanOrEqualTo(String value) {
            addCriterion("do_img <=", value, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgLike(String value) {
            addCriterion("do_img like", value, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgNotLike(String value) {
            addCriterion("do_img not like", value, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgIn(List<String> values) {
            addCriterion("do_img in", values, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgNotIn(List<String> values) {
            addCriterion("do_img not in", values, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgBetween(String value1, String value2) {
            addCriterion("do_img between", value1, value2, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoImgNotBetween(String value1, String value2) {
            addCriterion("do_img not between", value1, value2, "doImg");
            return (Criteria) this;
        }

        public Criteria andDoInfoIsNull() {
            addCriterion("do_info is null");
            return (Criteria) this;
        }

        public Criteria andDoInfoIsNotNull() {
            addCriterion("do_info is not null");
            return (Criteria) this;
        }

        public Criteria andDoInfoEqualTo(String value) {
            addCriterion("do_info =", value, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoNotEqualTo(String value) {
            addCriterion("do_info <>", value, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoGreaterThan(String value) {
            addCriterion("do_info >", value, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoGreaterThanOrEqualTo(String value) {
            addCriterion("do_info >=", value, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoLessThan(String value) {
            addCriterion("do_info <", value, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoLessThanOrEqualTo(String value) {
            addCriterion("do_info <=", value, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoLike(String value) {
            addCriterion("do_info like", value, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoNotLike(String value) {
            addCriterion("do_info not like", value, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoIn(List<String> values) {
            addCriterion("do_info in", values, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoNotIn(List<String> values) {
            addCriterion("do_info not in", values, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoBetween(String value1, String value2) {
            addCriterion("do_info between", value1, value2, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoInfoNotBetween(String value1, String value2) {
            addCriterion("do_info not between", value1, value2, "doInfo");
            return (Criteria) this;
        }

        public Criteria andDoStatusIsNull() {
            addCriterion("do_status is null");
            return (Criteria) this;
        }

        public Criteria andDoStatusIsNotNull() {
            addCriterion("do_status is not null");
            return (Criteria) this;
        }

        public Criteria andDoStatusEqualTo(String value) {
            addCriterion("do_status =", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusNotEqualTo(String value) {
            addCriterion("do_status <>", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusGreaterThan(String value) {
            addCriterion("do_status >", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("do_status >=", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusLessThan(String value) {
            addCriterion("do_status <", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusLessThanOrEqualTo(String value) {
            addCriterion("do_status <=", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusLike(String value) {
            addCriterion("do_status like", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusNotLike(String value) {
            addCriterion("do_status not like", value, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusIn(List<String> values) {
            addCriterion("do_status in", values, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusNotIn(List<String> values) {
            addCriterion("do_status not in", values, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusBetween(String value1, String value2) {
            addCriterion("do_status between", value1, value2, "doStatus");
            return (Criteria) this;
        }

        public Criteria andDoStatusNotBetween(String value1, String value2) {
            addCriterion("do_status not between", value1, value2, "doStatus");
            return (Criteria) this;
        }

        public Criteria andPaNameIsNull() {
            addCriterion("pa_name is null");
            return (Criteria) this;
        }

        public Criteria andPaNameIsNotNull() {
            addCriterion("pa_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaNameEqualTo(String value) {
            addCriterion("pa_name =", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameNotEqualTo(String value) {
            addCriterion("pa_name <>", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameGreaterThan(String value) {
            addCriterion("pa_name >", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameGreaterThanOrEqualTo(String value) {
            addCriterion("pa_name >=", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameLessThan(String value) {
            addCriterion("pa_name <", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameLessThanOrEqualTo(String value) {
            addCriterion("pa_name <=", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameLike(String value) {
            addCriterion("pa_name like", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameNotLike(String value) {
            addCriterion("pa_name not like", value, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameIn(List<String> values) {
            addCriterion("pa_name in", values, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameNotIn(List<String> values) {
            addCriterion("pa_name not in", values, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameBetween(String value1, String value2) {
            addCriterion("pa_name between", value1, value2, "paName");
            return (Criteria) this;
        }

        public Criteria andPaNameNotBetween(String value1, String value2) {
            addCriterion("pa_name not between", value1, value2, "paName");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
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