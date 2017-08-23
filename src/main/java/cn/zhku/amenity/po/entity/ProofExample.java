package cn.zhku.amenity.po.entity;

import java.util.ArrayList;
import java.util.List;

public class ProofExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProofExample() {
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

        public Criteria andYbRealnameIsNull() {
            addCriterion("yb_realname is null");
            return (Criteria) this;
        }

        public Criteria andYbRealnameIsNotNull() {
            addCriterion("yb_realname is not null");
            return (Criteria) this;
        }

        public Criteria andYbRealnameEqualTo(String value) {
            addCriterion("yb_realname =", value, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameNotEqualTo(String value) {
            addCriterion("yb_realname <>", value, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameGreaterThan(String value) {
            addCriterion("yb_realname >", value, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("yb_realname >=", value, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameLessThan(String value) {
            addCriterion("yb_realname <", value, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameLessThanOrEqualTo(String value) {
            addCriterion("yb_realname <=", value, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameLike(String value) {
            addCriterion("yb_realname like", value, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameNotLike(String value) {
            addCriterion("yb_realname not like", value, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameIn(List<String> values) {
            addCriterion("yb_realname in", values, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameNotIn(List<String> values) {
            addCriterion("yb_realname not in", values, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameBetween(String value1, String value2) {
            addCriterion("yb_realname between", value1, value2, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbRealnameNotBetween(String value1, String value2) {
            addCriterion("yb_realname not between", value1, value2, "ybRealname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameIsNull() {
            addCriterion("yb_shoolname is null");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameIsNotNull() {
            addCriterion("yb_shoolname is not null");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameEqualTo(String value) {
            addCriterion("yb_shoolname =", value, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameNotEqualTo(String value) {
            addCriterion("yb_shoolname <>", value, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameGreaterThan(String value) {
            addCriterion("yb_shoolname >", value, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("yb_shoolname >=", value, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameLessThan(String value) {
            addCriterion("yb_shoolname <", value, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameLessThanOrEqualTo(String value) {
            addCriterion("yb_shoolname <=", value, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameLike(String value) {
            addCriterion("yb_shoolname like", value, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameNotLike(String value) {
            addCriterion("yb_shoolname not like", value, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameIn(List<String> values) {
            addCriterion("yb_shoolname in", values, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameNotIn(List<String> values) {
            addCriterion("yb_shoolname not in", values, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameBetween(String value1, String value2) {
            addCriterion("yb_shoolname between", value1, value2, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbShoolnameNotBetween(String value1, String value2) {
            addCriterion("yb_shoolname not between", value1, value2, "ybShoolname");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameIsNull() {
            addCriterion("yb_collegename is null");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameIsNotNull() {
            addCriterion("yb_collegename is not null");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameEqualTo(String value) {
            addCriterion("yb_collegename =", value, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameNotEqualTo(String value) {
            addCriterion("yb_collegename <>", value, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameGreaterThan(String value) {
            addCriterion("yb_collegename >", value, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameGreaterThanOrEqualTo(String value) {
            addCriterion("yb_collegename >=", value, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameLessThan(String value) {
            addCriterion("yb_collegename <", value, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameLessThanOrEqualTo(String value) {
            addCriterion("yb_collegename <=", value, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameLike(String value) {
            addCriterion("yb_collegename like", value, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameNotLike(String value) {
            addCriterion("yb_collegename not like", value, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameIn(List<String> values) {
            addCriterion("yb_collegename in", values, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameNotIn(List<String> values) {
            addCriterion("yb_collegename not in", values, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameBetween(String value1, String value2) {
            addCriterion("yb_collegename between", value1, value2, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbCollegenameNotBetween(String value1, String value2) {
            addCriterion("yb_collegename not between", value1, value2, "ybCollegename");
            return (Criteria) this;
        }

        public Criteria andYbClassnameIsNull() {
            addCriterion("yb_classname is null");
            return (Criteria) this;
        }

        public Criteria andYbClassnameIsNotNull() {
            addCriterion("yb_classname is not null");
            return (Criteria) this;
        }

        public Criteria andYbClassnameEqualTo(String value) {
            addCriterion("yb_classname =", value, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameNotEqualTo(String value) {
            addCriterion("yb_classname <>", value, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameGreaterThan(String value) {
            addCriterion("yb_classname >", value, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("yb_classname >=", value, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameLessThan(String value) {
            addCriterion("yb_classname <", value, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameLessThanOrEqualTo(String value) {
            addCriterion("yb_classname <=", value, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameLike(String value) {
            addCriterion("yb_classname like", value, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameNotLike(String value) {
            addCriterion("yb_classname not like", value, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameIn(List<String> values) {
            addCriterion("yb_classname in", values, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameNotIn(List<String> values) {
            addCriterion("yb_classname not in", values, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameBetween(String value1, String value2) {
            addCriterion("yb_classname between", value1, value2, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbClassnameNotBetween(String value1, String value2) {
            addCriterion("yb_classname not between", value1, value2, "ybClassname");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearIsNull() {
            addCriterion("yb_enteryear is null");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearIsNotNull() {
            addCriterion("yb_enteryear is not null");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearEqualTo(String value) {
            addCriterion("yb_enteryear =", value, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearNotEqualTo(String value) {
            addCriterion("yb_enteryear <>", value, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearGreaterThan(String value) {
            addCriterion("yb_enteryear >", value, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearGreaterThanOrEqualTo(String value) {
            addCriterion("yb_enteryear >=", value, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearLessThan(String value) {
            addCriterion("yb_enteryear <", value, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearLessThanOrEqualTo(String value) {
            addCriterion("yb_enteryear <=", value, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearLike(String value) {
            addCriterion("yb_enteryear like", value, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearNotLike(String value) {
            addCriterion("yb_enteryear not like", value, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearIn(List<String> values) {
            addCriterion("yb_enteryear in", values, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearNotIn(List<String> values) {
            addCriterion("yb_enteryear not in", values, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearBetween(String value1, String value2) {
            addCriterion("yb_enteryear between", value1, value2, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEnteryearNotBetween(String value1, String value2) {
            addCriterion("yb_enteryear not between", value1, value2, "ybEnteryear");
            return (Criteria) this;
        }

        public Criteria andYbEmployidIsNull() {
            addCriterion("yb_employid is null");
            return (Criteria) this;
        }

        public Criteria andYbEmployidIsNotNull() {
            addCriterion("yb_employid is not null");
            return (Criteria) this;
        }

        public Criteria andYbEmployidEqualTo(String value) {
            addCriterion("yb_employid =", value, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidNotEqualTo(String value) {
            addCriterion("yb_employid <>", value, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidGreaterThan(String value) {
            addCriterion("yb_employid >", value, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidGreaterThanOrEqualTo(String value) {
            addCriterion("yb_employid >=", value, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidLessThan(String value) {
            addCriterion("yb_employid <", value, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidLessThanOrEqualTo(String value) {
            addCriterion("yb_employid <=", value, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidLike(String value) {
            addCriterion("yb_employid like", value, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidNotLike(String value) {
            addCriterion("yb_employid not like", value, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidIn(List<String> values) {
            addCriterion("yb_employid in", values, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidNotIn(List<String> values) {
            addCriterion("yb_employid not in", values, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidBetween(String value1, String value2) {
            addCriterion("yb_employid between", value1, value2, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andYbEmployidNotBetween(String value1, String value2) {
            addCriterion("yb_employid not between", value1, value2, "ybEmployid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
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