package cn.zhku.amenity.po.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AskleaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AskleaveExample() {
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

        public Criteria andYbSchoolnameIsNull() {
            addCriterion("yb_schoolname is null");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameIsNotNull() {
            addCriterion("yb_schoolname is not null");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameEqualTo(String value) {
            addCriterion("yb_schoolname =", value, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameNotEqualTo(String value) {
            addCriterion("yb_schoolname <>", value, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameGreaterThan(String value) {
            addCriterion("yb_schoolname >", value, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("yb_schoolname >=", value, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameLessThan(String value) {
            addCriterion("yb_schoolname <", value, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("yb_schoolname <=", value, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameLike(String value) {
            addCriterion("yb_schoolname like", value, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameNotLike(String value) {
            addCriterion("yb_schoolname not like", value, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameIn(List<String> values) {
            addCriterion("yb_schoolname in", values, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameNotIn(List<String> values) {
            addCriterion("yb_schoolname not in", values, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameBetween(String value1, String value2) {
            addCriterion("yb_schoolname between", value1, value2, "ybSchoolname");
            return (Criteria) this;
        }

        public Criteria andYbSchoolnameNotBetween(String value1, String value2) {
            addCriterion("yb_schoolname not between", value1, value2, "ybSchoolname");
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

        public Criteria andYbStudentidIsNull() {
            addCriterion("yb_studentid is null");
            return (Criteria) this;
        }

        public Criteria andYbStudentidIsNotNull() {
            addCriterion("yb_studentid is not null");
            return (Criteria) this;
        }

        public Criteria andYbStudentidEqualTo(String value) {
            addCriterion("yb_studentid =", value, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidNotEqualTo(String value) {
            addCriterion("yb_studentid <>", value, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidGreaterThan(String value) {
            addCriterion("yb_studentid >", value, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("yb_studentid >=", value, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidLessThan(String value) {
            addCriterion("yb_studentid <", value, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidLessThanOrEqualTo(String value) {
            addCriterion("yb_studentid <=", value, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidLike(String value) {
            addCriterion("yb_studentid like", value, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidNotLike(String value) {
            addCriterion("yb_studentid not like", value, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidIn(List<String> values) {
            addCriterion("yb_studentid in", values, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidNotIn(List<String> values) {
            addCriterion("yb_studentid not in", values, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidBetween(String value1, String value2) {
            addCriterion("yb_studentid between", value1, value2, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andYbStudentidNotBetween(String value1, String value2) {
            addCriterion("yb_studentid not between", value1, value2, "ybStudentid");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIsNull() {
            addCriterion("leave_type is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIsNotNull() {
            addCriterion("leave_type is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeEqualTo(Integer value) {
            addCriterion("leave_type =", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotEqualTo(Integer value) {
            addCriterion("leave_type <>", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeGreaterThan(Integer value) {
            addCriterion("leave_type >", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_type >=", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLessThan(Integer value) {
            addCriterion("leave_type <", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLessThanOrEqualTo(Integer value) {
            addCriterion("leave_type <=", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIn(List<Integer> values) {
            addCriterion("leave_type in", values, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotIn(List<Integer> values) {
            addCriterion("leave_type not in", values, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeBetween(Integer value1, Integer value2) {
            addCriterion("leave_type between", value1, value2, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_type not between", value1, value2, "leaveType");
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

        public Criteria andSinceTimeIsNull() {
            addCriterion("since_time is null");
            return (Criteria) this;
        }

        public Criteria andSinceTimeIsNotNull() {
            addCriterion("since_time is not null");
            return (Criteria) this;
        }

        public Criteria andSinceTimeEqualTo(Date value) {
            addCriterionForJDBCDate("since_time =", value, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("since_time <>", value, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("since_time >", value, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("since_time >=", value, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeLessThan(Date value) {
            addCriterionForJDBCDate("since_time <", value, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("since_time <=", value, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("since_time in", values, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("since_time not in", values, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("since_time between", value1, value2, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andSinceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("since_time not between", value1, value2, "sinceTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
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