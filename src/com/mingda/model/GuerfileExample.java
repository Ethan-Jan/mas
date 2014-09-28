package com.mingda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuerfileExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    public GuerfileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    protected GuerfileExample(GuerfileExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.GUERFILE
     *
     * @ibatorgenerated Tue May 21 15:44:30 CST 2013
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andBizIdIsNull() {
            addCriterion("BIZ_ID is null");
            return this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("BIZ_ID is not null");
            return this;
        }

        public Criteria andBizIdEqualTo(BigDecimal value) {
            addCriterion("BIZ_ID =", value, "bizId");
            return this;
        }

        public Criteria andBizIdNotEqualTo(BigDecimal value) {
            addCriterion("BIZ_ID <>", value, "bizId");
            return this;
        }

        public Criteria andBizIdGreaterThan(BigDecimal value) {
            addCriterion("BIZ_ID >", value, "bizId");
            return this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIZ_ID >=", value, "bizId");
            return this;
        }

        public Criteria andBizIdLessThan(BigDecimal value) {
            addCriterion("BIZ_ID <", value, "bizId");
            return this;
        }

        public Criteria andBizIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIZ_ID <=", value, "bizId");
            return this;
        }

        public Criteria andBizIdIn(List<BigDecimal> values) {
            addCriterion("BIZ_ID in", values, "bizId");
            return this;
        }

        public Criteria andBizIdNotIn(List<BigDecimal> values) {
            addCriterion("BIZ_ID not in", values, "bizId");
            return this;
        }

        public Criteria andBizIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIZ_ID between", value1, value2, "bizId");
            return this;
        }

        public Criteria andBizIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIZ_ID not between", value1, value2, "bizId");
            return this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return this;
        }

        public Criteria andRealpathIsNull() {
            addCriterion("REALPATH is null");
            return this;
        }

        public Criteria andRealpathIsNotNull() {
            addCriterion("REALPATH is not null");
            return this;
        }

        public Criteria andRealpathEqualTo(String value) {
            addCriterion("REALPATH =", value, "realpath");
            return this;
        }

        public Criteria andRealpathNotEqualTo(String value) {
            addCriterion("REALPATH <>", value, "realpath");
            return this;
        }

        public Criteria andRealpathGreaterThan(String value) {
            addCriterion("REALPATH >", value, "realpath");
            return this;
        }

        public Criteria andRealpathGreaterThanOrEqualTo(String value) {
            addCriterion("REALPATH >=", value, "realpath");
            return this;
        }

        public Criteria andRealpathLessThan(String value) {
            addCriterion("REALPATH <", value, "realpath");
            return this;
        }

        public Criteria andRealpathLessThanOrEqualTo(String value) {
            addCriterion("REALPATH <=", value, "realpath");
            return this;
        }

        public Criteria andRealpathLike(String value) {
            addCriterion("REALPATH like", value, "realpath");
            return this;
        }

        public Criteria andRealpathNotLike(String value) {
            addCriterion("REALPATH not like", value, "realpath");
            return this;
        }

        public Criteria andRealpathIn(List<String> values) {
            addCriterion("REALPATH in", values, "realpath");
            return this;
        }

        public Criteria andRealpathNotIn(List<String> values) {
            addCriterion("REALPATH not in", values, "realpath");
            return this;
        }

        public Criteria andRealpathBetween(String value1, String value2) {
            addCriterion("REALPATH between", value1, value2, "realpath");
            return this;
        }

        public Criteria andRealpathNotBetween(String value1, String value2) {
            addCriterion("REALPATH not between", value1, value2, "realpath");
            return this;
        }

        public Criteria andRealfilenameIsNull() {
            addCriterion("REALFILENAME is null");
            return this;
        }

        public Criteria andRealfilenameIsNotNull() {
            addCriterion("REALFILENAME is not null");
            return this;
        }

        public Criteria andRealfilenameEqualTo(String value) {
            addCriterion("REALFILENAME =", value, "realfilename");
            return this;
        }

        public Criteria andRealfilenameNotEqualTo(String value) {
            addCriterion("REALFILENAME <>", value, "realfilename");
            return this;
        }

        public Criteria andRealfilenameGreaterThan(String value) {
            addCriterion("REALFILENAME >", value, "realfilename");
            return this;
        }

        public Criteria andRealfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("REALFILENAME >=", value, "realfilename");
            return this;
        }

        public Criteria andRealfilenameLessThan(String value) {
            addCriterion("REALFILENAME <", value, "realfilename");
            return this;
        }

        public Criteria andRealfilenameLessThanOrEqualTo(String value) {
            addCriterion("REALFILENAME <=", value, "realfilename");
            return this;
        }

        public Criteria andRealfilenameLike(String value) {
            addCriterion("REALFILENAME like", value, "realfilename");
            return this;
        }

        public Criteria andRealfilenameNotLike(String value) {
            addCriterion("REALFILENAME not like", value, "realfilename");
            return this;
        }

        public Criteria andRealfilenameIn(List<String> values) {
            addCriterion("REALFILENAME in", values, "realfilename");
            return this;
        }

        public Criteria andRealfilenameNotIn(List<String> values) {
            addCriterion("REALFILENAME not in", values, "realfilename");
            return this;
        }

        public Criteria andRealfilenameBetween(String value1, String value2) {
            addCriterion("REALFILENAME between", value1, value2, "realfilename");
            return this;
        }

        public Criteria andRealfilenameNotBetween(String value1, String value2) {
            addCriterion("REALFILENAME not between", value1, value2, "realfilename");
            return this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return this;
        }

        public Criteria andFileIdEqualTo(BigDecimal value) {
            addCriterion("FILE_ID =", value, "fileId");
            return this;
        }

        public Criteria andFileIdNotEqualTo(BigDecimal value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return this;
        }

        public Criteria andFileIdGreaterThan(BigDecimal value) {
            addCriterion("FILE_ID >", value, "fileId");
            return this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return this;
        }

        public Criteria andFileIdLessThan(BigDecimal value) {
            addCriterion("FILE_ID <", value, "fileId");
            return this;
        }

        public Criteria andFileIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return this;
        }

        public Criteria andFileIdIn(List<BigDecimal> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return this;
        }

        public Criteria andFileIdNotIn(List<BigDecimal> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return this;
        }

        public Criteria andFileIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return this;
        }

        public Criteria andFileIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
            return this;
        }
    }
}