package com.mingda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JzBizcheckExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	public JzBizcheckExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	protected JzBizcheckExample(JzBizcheckExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.JZ_BIZCHECK
	 * @ibatorgenerated  Tue Jun 25 18:42:38 CST 2013
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andBizcheckIsNull() {
			addCriterion("BIZCHECK is null");
			return this;
		}

		public Criteria andBizcheckIsNotNull() {
			addCriterion("BIZCHECK is not null");
			return this;
		}

		public Criteria andBizcheckEqualTo(BigDecimal value) {
			addCriterion("BIZCHECK =", value, "bizcheck");
			return this;
		}

		public Criteria andBizcheckNotEqualTo(BigDecimal value) {
			addCriterion("BIZCHECK <>", value, "bizcheck");
			return this;
		}

		public Criteria andBizcheckGreaterThan(BigDecimal value) {
			addCriterion("BIZCHECK >", value, "bizcheck");
			return this;
		}

		public Criteria andBizcheckGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("BIZCHECK >=", value, "bizcheck");
			return this;
		}

		public Criteria andBizcheckLessThan(BigDecimal value) {
			addCriterion("BIZCHECK <", value, "bizcheck");
			return this;
		}

		public Criteria andBizcheckLessThanOrEqualTo(BigDecimal value) {
			addCriterion("BIZCHECK <=", value, "bizcheck");
			return this;
		}

		public Criteria andBizcheckIn(List<BigDecimal> values) {
			addCriterion("BIZCHECK in", values, "bizcheck");
			return this;
		}

		public Criteria andBizcheckNotIn(List<BigDecimal> values) {
			addCriterion("BIZCHECK not in", values, "bizcheck");
			return this;
		}

		public Criteria andBizcheckBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("BIZCHECK between", value1, value2, "bizcheck");
			return this;
		}

		public Criteria andBizcheckNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("BIZCHECK not between", value1, value2, "bizcheck");
			return this;
		}

		public Criteria andBizIdIsNull() {
			addCriterion("BIZ_ID is null");
			return this;
		}

		public Criteria andBizIdIsNotNull() {
			addCriterion("BIZ_ID is not null");
			return this;
		}

		public Criteria andBizIdEqualTo(Integer value) {
			addCriterion("BIZ_ID =", value, "bizId");
			return this;
		}

		public Criteria andBizIdNotEqualTo(Integer value) {
			addCriterion("BIZ_ID <>", value, "bizId");
			return this;
		}

		public Criteria andBizIdGreaterThan(Integer value) {
			addCriterion("BIZ_ID >", value, "bizId");
			return this;
		}

		public Criteria andBizIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("BIZ_ID >=", value, "bizId");
			return this;
		}

		public Criteria andBizIdLessThan(Integer value) {
			addCriterion("BIZ_ID <", value, "bizId");
			return this;
		}

		public Criteria andBizIdLessThanOrEqualTo(Integer value) {
			addCriterion("BIZ_ID <=", value, "bizId");
			return this;
		}

		public Criteria andBizIdIn(List<Integer> values) {
			addCriterion("BIZ_ID in", values, "bizId");
			return this;
		}

		public Criteria andBizIdNotIn(List<Integer> values) {
			addCriterion("BIZ_ID not in", values, "bizId");
			return this;
		}

		public Criteria andBizIdBetween(Integer value1, Integer value2) {
			addCriterion("BIZ_ID between", value1, value2, "bizId");
			return this;
		}

		public Criteria andBizIdNotBetween(Integer value1, Integer value2) {
			addCriterion("BIZ_ID not between", value1, value2, "bizId");
			return this;
		}

		public Criteria andChecked1IsNull() {
			addCriterion("CHECKED1 is null");
			return this;
		}

		public Criteria andChecked1IsNotNull() {
			addCriterion("CHECKED1 is not null");
			return this;
		}

		public Criteria andChecked1EqualTo(BigDecimal value) {
			addCriterion("CHECKED1 =", value, "checked1");
			return this;
		}

		public Criteria andChecked1NotEqualTo(BigDecimal value) {
			addCriterion("CHECKED1 <>", value, "checked1");
			return this;
		}

		public Criteria andChecked1GreaterThan(BigDecimal value) {
			addCriterion("CHECKED1 >", value, "checked1");
			return this;
		}

		public Criteria andChecked1GreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("CHECKED1 >=", value, "checked1");
			return this;
		}

		public Criteria andChecked1LessThan(BigDecimal value) {
			addCriterion("CHECKED1 <", value, "checked1");
			return this;
		}

		public Criteria andChecked1LessThanOrEqualTo(BigDecimal value) {
			addCriterion("CHECKED1 <=", value, "checked1");
			return this;
		}

		public Criteria andChecked1In(List<BigDecimal> values) {
			addCriterion("CHECKED1 in", values, "checked1");
			return this;
		}

		public Criteria andChecked1NotIn(List<BigDecimal> values) {
			addCriterion("CHECKED1 not in", values, "checked1");
			return this;
		}

		public Criteria andChecked1Between(BigDecimal value1, BigDecimal value2) {
			addCriterion("CHECKED1 between", value1, value2, "checked1");
			return this;
		}

		public Criteria andChecked1NotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("CHECKED1 not between", value1, value2, "checked1");
			return this;
		}

		public Criteria andDetail1IsNull() {
			addCriterion("DETAIL1 is null");
			return this;
		}

		public Criteria andDetail1IsNotNull() {
			addCriterion("DETAIL1 is not null");
			return this;
		}

		public Criteria andDetail1EqualTo(String value) {
			addCriterion("DETAIL1 =", value, "detail1");
			return this;
		}

		public Criteria andDetail1NotEqualTo(String value) {
			addCriterion("DETAIL1 <>", value, "detail1");
			return this;
		}

		public Criteria andDetail1GreaterThan(String value) {
			addCriterion("DETAIL1 >", value, "detail1");
			return this;
		}

		public Criteria andDetail1GreaterThanOrEqualTo(String value) {
			addCriterion("DETAIL1 >=", value, "detail1");
			return this;
		}

		public Criteria andDetail1LessThan(String value) {
			addCriterion("DETAIL1 <", value, "detail1");
			return this;
		}

		public Criteria andDetail1LessThanOrEqualTo(String value) {
			addCriterion("DETAIL1 <=", value, "detail1");
			return this;
		}

		public Criteria andDetail1Like(String value) {
			addCriterion("DETAIL1 like", value, "detail1");
			return this;
		}

		public Criteria andDetail1NotLike(String value) {
			addCriterion("DETAIL1 not like", value, "detail1");
			return this;
		}

		public Criteria andDetail1In(List<String> values) {
			addCriterion("DETAIL1 in", values, "detail1");
			return this;
		}

		public Criteria andDetail1NotIn(List<String> values) {
			addCriterion("DETAIL1 not in", values, "detail1");
			return this;
		}

		public Criteria andDetail1Between(String value1, String value2) {
			addCriterion("DETAIL1 between", value1, value2, "detail1");
			return this;
		}

		public Criteria andDetail1NotBetween(String value1, String value2) {
			addCriterion("DETAIL1 not between", value1, value2, "detail1");
			return this;
		}

		public Criteria andChecktimeIsNull() {
			addCriterion("CHECKTIME is null");
			return this;
		}

		public Criteria andChecktimeIsNotNull() {
			addCriterion("CHECKTIME is not null");
			return this;
		}

		public Criteria andChecktimeEqualTo(Date value) {
			addCriterion("CHECKTIME =", value, "checktime");
			return this;
		}

		public Criteria andChecktimeNotEqualTo(Date value) {
			addCriterion("CHECKTIME <>", value, "checktime");
			return this;
		}

		public Criteria andChecktimeGreaterThan(Date value) {
			addCriterion("CHECKTIME >", value, "checktime");
			return this;
		}

		public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
			addCriterion("CHECKTIME >=", value, "checktime");
			return this;
		}

		public Criteria andChecktimeLessThan(Date value) {
			addCriterion("CHECKTIME <", value, "checktime");
			return this;
		}

		public Criteria andChecktimeLessThanOrEqualTo(Date value) {
			addCriterion("CHECKTIME <=", value, "checktime");
			return this;
		}

		public Criteria andChecktimeIn(List<Date> values) {
			addCriterion("CHECKTIME in", values, "checktime");
			return this;
		}

		public Criteria andChecktimeNotIn(List<Date> values) {
			addCriterion("CHECKTIME not in", values, "checktime");
			return this;
		}

		public Criteria andChecktimeBetween(Date value1, Date value2) {
			addCriterion("CHECKTIME between", value1, value2, "checktime");
			return this;
		}

		public Criteria andChecktimeNotBetween(Date value1, Date value2) {
			addCriterion("CHECKTIME not between", value1, value2, "checktime");
			return this;
		}

		public Criteria andOperatorIsNull() {
			addCriterion("OPERATOR is null");
			return this;
		}

		public Criteria andOperatorIsNotNull() {
			addCriterion("OPERATOR is not null");
			return this;
		}

		public Criteria andOperatorEqualTo(String value) {
			addCriterion("OPERATOR =", value, "operator");
			return this;
		}

		public Criteria andOperatorNotEqualTo(String value) {
			addCriterion("OPERATOR <>", value, "operator");
			return this;
		}

		public Criteria andOperatorGreaterThan(String value) {
			addCriterion("OPERATOR >", value, "operator");
			return this;
		}

		public Criteria andOperatorGreaterThanOrEqualTo(String value) {
			addCriterion("OPERATOR >=", value, "operator");
			return this;
		}

		public Criteria andOperatorLessThan(String value) {
			addCriterion("OPERATOR <", value, "operator");
			return this;
		}

		public Criteria andOperatorLessThanOrEqualTo(String value) {
			addCriterion("OPERATOR <=", value, "operator");
			return this;
		}

		public Criteria andOperatorLike(String value) {
			addCriterion("OPERATOR like", value, "operator");
			return this;
		}

		public Criteria andOperatorNotLike(String value) {
			addCriterion("OPERATOR not like", value, "operator");
			return this;
		}

		public Criteria andOperatorIn(List<String> values) {
			addCriterion("OPERATOR in", values, "operator");
			return this;
		}

		public Criteria andOperatorNotIn(List<String> values) {
			addCriterion("OPERATOR not in", values, "operator");
			return this;
		}

		public Criteria andOperatorBetween(String value1, String value2) {
			addCriterion("OPERATOR between", value1, value2, "operator");
			return this;
		}

		public Criteria andOperatorNotBetween(String value1, String value2) {
			addCriterion("OPERATOR not between", value1, value2, "operator");
			return this;
		}

		public Criteria andOpttimeIsNull() {
			addCriterion("OPTTIME is null");
			return this;
		}

		public Criteria andOpttimeIsNotNull() {
			addCriterion("OPTTIME is not null");
			return this;
		}

		public Criteria andOpttimeEqualTo(Date value) {
			addCriterion("OPTTIME =", value, "opttime");
			return this;
		}

		public Criteria andOpttimeNotEqualTo(Date value) {
			addCriterion("OPTTIME <>", value, "opttime");
			return this;
		}

		public Criteria andOpttimeGreaterThan(Date value) {
			addCriterion("OPTTIME >", value, "opttime");
			return this;
		}

		public Criteria andOpttimeGreaterThanOrEqualTo(Date value) {
			addCriterion("OPTTIME >=", value, "opttime");
			return this;
		}

		public Criteria andOpttimeLessThan(Date value) {
			addCriterion("OPTTIME <", value, "opttime");
			return this;
		}

		public Criteria andOpttimeLessThanOrEqualTo(Date value) {
			addCriterion("OPTTIME <=", value, "opttime");
			return this;
		}

		public Criteria andOpttimeIn(List<Date> values) {
			addCriterion("OPTTIME in", values, "opttime");
			return this;
		}

		public Criteria andOpttimeNotIn(List<Date> values) {
			addCriterion("OPTTIME not in", values, "opttime");
			return this;
		}

		public Criteria andOpttimeBetween(Date value1, Date value2) {
			addCriterion("OPTTIME between", value1, value2, "opttime");
			return this;
		}

		public Criteria andOpttimeNotBetween(Date value1, Date value2) {
			addCriterion("OPTTIME not between", value1, value2, "opttime");
			return this;
		}

		public Criteria andChecked2IsNull() {
			addCriterion("CHECKED2 is null");
			return this;
		}

		public Criteria andChecked2IsNotNull() {
			addCriterion("CHECKED2 is not null");
			return this;
		}

		public Criteria andChecked2EqualTo(BigDecimal value) {
			addCriterion("CHECKED2 =", value, "checked2");
			return this;
		}

		public Criteria andChecked2NotEqualTo(BigDecimal value) {
			addCriterion("CHECKED2 <>", value, "checked2");
			return this;
		}

		public Criteria andChecked2GreaterThan(BigDecimal value) {
			addCriterion("CHECKED2 >", value, "checked2");
			return this;
		}

		public Criteria andChecked2GreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("CHECKED2 >=", value, "checked2");
			return this;
		}

		public Criteria andChecked2LessThan(BigDecimal value) {
			addCriterion("CHECKED2 <", value, "checked2");
			return this;
		}

		public Criteria andChecked2LessThanOrEqualTo(BigDecimal value) {
			addCriterion("CHECKED2 <=", value, "checked2");
			return this;
		}

		public Criteria andChecked2In(List<BigDecimal> values) {
			addCriterion("CHECKED2 in", values, "checked2");
			return this;
		}

		public Criteria andChecked2NotIn(List<BigDecimal> values) {
			addCriterion("CHECKED2 not in", values, "checked2");
			return this;
		}

		public Criteria andChecked2Between(BigDecimal value1, BigDecimal value2) {
			addCriterion("CHECKED2 between", value1, value2, "checked2");
			return this;
		}

		public Criteria andChecked2NotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("CHECKED2 not between", value1, value2, "checked2");
			return this;
		}

		public Criteria andDetail2IsNull() {
			addCriterion("DETAIL2 is null");
			return this;
		}

		public Criteria andDetail2IsNotNull() {
			addCriterion("DETAIL2 is not null");
			return this;
		}

		public Criteria andDetail2EqualTo(String value) {
			addCriterion("DETAIL2 =", value, "detail2");
			return this;
		}

		public Criteria andDetail2NotEqualTo(String value) {
			addCriterion("DETAIL2 <>", value, "detail2");
			return this;
		}

		public Criteria andDetail2GreaterThan(String value) {
			addCriterion("DETAIL2 >", value, "detail2");
			return this;
		}

		public Criteria andDetail2GreaterThanOrEqualTo(String value) {
			addCriterion("DETAIL2 >=", value, "detail2");
			return this;
		}

		public Criteria andDetail2LessThan(String value) {
			addCriterion("DETAIL2 <", value, "detail2");
			return this;
		}

		public Criteria andDetail2LessThanOrEqualTo(String value) {
			addCriterion("DETAIL2 <=", value, "detail2");
			return this;
		}

		public Criteria andDetail2Like(String value) {
			addCriterion("DETAIL2 like", value, "detail2");
			return this;
		}

		public Criteria andDetail2NotLike(String value) {
			addCriterion("DETAIL2 not like", value, "detail2");
			return this;
		}

		public Criteria andDetail2In(List<String> values) {
			addCriterion("DETAIL2 in", values, "detail2");
			return this;
		}

		public Criteria andDetail2NotIn(List<String> values) {
			addCriterion("DETAIL2 not in", values, "detail2");
			return this;
		}

		public Criteria andDetail2Between(String value1, String value2) {
			addCriterion("DETAIL2 between", value1, value2, "detail2");
			return this;
		}

		public Criteria andDetail2NotBetween(String value1, String value2) {
			addCriterion("DETAIL2 not between", value1, value2, "detail2");
			return this;
		}

		public Criteria andChecktime2IsNull() {
			addCriterion("CHECKTIME2 is null");
			return this;
		}

		public Criteria andChecktime2IsNotNull() {
			addCriterion("CHECKTIME2 is not null");
			return this;
		}

		public Criteria andChecktime2EqualTo(Date value) {
			addCriterion("CHECKTIME2 =", value, "checktime2");
			return this;
		}

		public Criteria andChecktime2NotEqualTo(Date value) {
			addCriterion("CHECKTIME2 <>", value, "checktime2");
			return this;
		}

		public Criteria andChecktime2GreaterThan(Date value) {
			addCriterion("CHECKTIME2 >", value, "checktime2");
			return this;
		}

		public Criteria andChecktime2GreaterThanOrEqualTo(Date value) {
			addCriterion("CHECKTIME2 >=", value, "checktime2");
			return this;
		}

		public Criteria andChecktime2LessThan(Date value) {
			addCriterion("CHECKTIME2 <", value, "checktime2");
			return this;
		}

		public Criteria andChecktime2LessThanOrEqualTo(Date value) {
			addCriterion("CHECKTIME2 <=", value, "checktime2");
			return this;
		}

		public Criteria andChecktime2In(List<Date> values) {
			addCriterion("CHECKTIME2 in", values, "checktime2");
			return this;
		}

		public Criteria andChecktime2NotIn(List<Date> values) {
			addCriterion("CHECKTIME2 not in", values, "checktime2");
			return this;
		}

		public Criteria andChecktime2Between(Date value1, Date value2) {
			addCriterion("CHECKTIME2 between", value1, value2, "checktime2");
			return this;
		}

		public Criteria andChecktime2NotBetween(Date value1, Date value2) {
			addCriterion("CHECKTIME2 not between", value1, value2, "checktime2");
			return this;
		}

		public Criteria andOperator2IsNull() {
			addCriterion("OPERATOR2 is null");
			return this;
		}

		public Criteria andOperator2IsNotNull() {
			addCriterion("OPERATOR2 is not null");
			return this;
		}

		public Criteria andOperator2EqualTo(String value) {
			addCriterion("OPERATOR2 =", value, "operator2");
			return this;
		}

		public Criteria andOperator2NotEqualTo(String value) {
			addCriterion("OPERATOR2 <>", value, "operator2");
			return this;
		}

		public Criteria andOperator2GreaterThan(String value) {
			addCriterion("OPERATOR2 >", value, "operator2");
			return this;
		}

		public Criteria andOperator2GreaterThanOrEqualTo(String value) {
			addCriterion("OPERATOR2 >=", value, "operator2");
			return this;
		}

		public Criteria andOperator2LessThan(String value) {
			addCriterion("OPERATOR2 <", value, "operator2");
			return this;
		}

		public Criteria andOperator2LessThanOrEqualTo(String value) {
			addCriterion("OPERATOR2 <=", value, "operator2");
			return this;
		}

		public Criteria andOperator2Like(String value) {
			addCriterion("OPERATOR2 like", value, "operator2");
			return this;
		}

		public Criteria andOperator2NotLike(String value) {
			addCriterion("OPERATOR2 not like", value, "operator2");
			return this;
		}

		public Criteria andOperator2In(List<String> values) {
			addCriterion("OPERATOR2 in", values, "operator2");
			return this;
		}

		public Criteria andOperator2NotIn(List<String> values) {
			addCriterion("OPERATOR2 not in", values, "operator2");
			return this;
		}

		public Criteria andOperator2Between(String value1, String value2) {
			addCriterion("OPERATOR2 between", value1, value2, "operator2");
			return this;
		}

		public Criteria andOperator2NotBetween(String value1, String value2) {
			addCriterion("OPERATOR2 not between", value1, value2, "operator2");
			return this;
		}

		public Criteria andOpttime2IsNull() {
			addCriterion("OPTTIME2 is null");
			return this;
		}

		public Criteria andOpttime2IsNotNull() {
			addCriterion("OPTTIME2 is not null");
			return this;
		}

		public Criteria andOpttime2EqualTo(Date value) {
			addCriterion("OPTTIME2 =", value, "opttime2");
			return this;
		}

		public Criteria andOpttime2NotEqualTo(Date value) {
			addCriterion("OPTTIME2 <>", value, "opttime2");
			return this;
		}

		public Criteria andOpttime2GreaterThan(Date value) {
			addCriterion("OPTTIME2 >", value, "opttime2");
			return this;
		}

		public Criteria andOpttime2GreaterThanOrEqualTo(Date value) {
			addCriterion("OPTTIME2 >=", value, "opttime2");
			return this;
		}

		public Criteria andOpttime2LessThan(Date value) {
			addCriterion("OPTTIME2 <", value, "opttime2");
			return this;
		}

		public Criteria andOpttime2LessThanOrEqualTo(Date value) {
			addCriterion("OPTTIME2 <=", value, "opttime2");
			return this;
		}

		public Criteria andOpttime2In(List<Date> values) {
			addCriterion("OPTTIME2 in", values, "opttime2");
			return this;
		}

		public Criteria andOpttime2NotIn(List<Date> values) {
			addCriterion("OPTTIME2 not in", values, "opttime2");
			return this;
		}

		public Criteria andOpttime2Between(Date value1, Date value2) {
			addCriterion("OPTTIME2 between", value1, value2, "opttime2");
			return this;
		}

		public Criteria andOpttime2NotBetween(Date value1, Date value2) {
			addCriterion("OPTTIME2 not between", value1, value2, "opttime2");
			return this;
		}

		public Criteria andOperatornameIsNull() {
			addCriterion("OPERATORNAME is null");
			return this;
		}

		public Criteria andOperatornameIsNotNull() {
			addCriterion("OPERATORNAME is not null");
			return this;
		}

		public Criteria andOperatornameEqualTo(String value) {
			addCriterion("OPERATORNAME =", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameNotEqualTo(String value) {
			addCriterion("OPERATORNAME <>", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameGreaterThan(String value) {
			addCriterion("OPERATORNAME >", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
			addCriterion("OPERATORNAME >=", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameLessThan(String value) {
			addCriterion("OPERATORNAME <", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameLessThanOrEqualTo(String value) {
			addCriterion("OPERATORNAME <=", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameLike(String value) {
			addCriterion("OPERATORNAME like", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameNotLike(String value) {
			addCriterion("OPERATORNAME not like", value, "operatorname");
			return this;
		}

		public Criteria andOperatornameIn(List<String> values) {
			addCriterion("OPERATORNAME in", values, "operatorname");
			return this;
		}

		public Criteria andOperatornameNotIn(List<String> values) {
			addCriterion("OPERATORNAME not in", values, "operatorname");
			return this;
		}

		public Criteria andOperatornameBetween(String value1, String value2) {
			addCriterion("OPERATORNAME between", value1, value2, "operatorname");
			return this;
		}

		public Criteria andOperatornameNotBetween(String value1, String value2) {
			addCriterion("OPERATORNAME not between", value1, value2,
					"operatorname");
			return this;
		}

		public Criteria andOperator2nameIsNull() {
			addCriterion("OPERATOR2NAME is null");
			return this;
		}

		public Criteria andOperator2nameIsNotNull() {
			addCriterion("OPERATOR2NAME is not null");
			return this;
		}

		public Criteria andOperator2nameEqualTo(String value) {
			addCriterion("OPERATOR2NAME =", value, "operator2name");
			return this;
		}

		public Criteria andOperator2nameNotEqualTo(String value) {
			addCriterion("OPERATOR2NAME <>", value, "operator2name");
			return this;
		}

		public Criteria andOperator2nameGreaterThan(String value) {
			addCriterion("OPERATOR2NAME >", value, "operator2name");
			return this;
		}

		public Criteria andOperator2nameGreaterThanOrEqualTo(String value) {
			addCriterion("OPERATOR2NAME >=", value, "operator2name");
			return this;
		}

		public Criteria andOperator2nameLessThan(String value) {
			addCriterion("OPERATOR2NAME <", value, "operator2name");
			return this;
		}

		public Criteria andOperator2nameLessThanOrEqualTo(String value) {
			addCriterion("OPERATOR2NAME <=", value, "operator2name");
			return this;
		}

		public Criteria andOperator2nameLike(String value) {
			addCriterion("OPERATOR2NAME like", value, "operator2name");
			return this;
		}

		public Criteria andOperator2nameNotLike(String value) {
			addCriterion("OPERATOR2NAME not like", value, "operator2name");
			return this;
		}

		public Criteria andOperator2nameIn(List<String> values) {
			addCriterion("OPERATOR2NAME in", values, "operator2name");
			return this;
		}

		public Criteria andOperator2nameNotIn(List<String> values) {
			addCriterion("OPERATOR2NAME not in", values, "operator2name");
			return this;
		}

		public Criteria andOperator2nameBetween(String value1, String value2) {
			addCriterion("OPERATOR2NAME between", value1, value2,
					"operator2name");
			return this;
		}

		public Criteria andOperator2nameNotBetween(String value1, String value2) {
			addCriterion("OPERATOR2NAME not between", value1, value2,
					"operator2name");
			return this;
		}

		public Criteria andDsIsNull() {
			addCriterion("DS is null");
			return this;
		}

		public Criteria andDsIsNotNull() {
			addCriterion("DS is not null");
			return this;
		}

		public Criteria andDsEqualTo(String value) {
			addCriterion("DS =", value, "ds");
			return this;
		}

		public Criteria andDsNotEqualTo(String value) {
			addCriterion("DS <>", value, "ds");
			return this;
		}

		public Criteria andDsGreaterThan(String value) {
			addCriterion("DS >", value, "ds");
			return this;
		}

		public Criteria andDsGreaterThanOrEqualTo(String value) {
			addCriterion("DS >=", value, "ds");
			return this;
		}

		public Criteria andDsLessThan(String value) {
			addCriterion("DS <", value, "ds");
			return this;
		}

		public Criteria andDsLessThanOrEqualTo(String value) {
			addCriterion("DS <=", value, "ds");
			return this;
		}

		public Criteria andDsLike(String value) {
			addCriterion("DS like", value, "ds");
			return this;
		}

		public Criteria andDsNotLike(String value) {
			addCriterion("DS not like", value, "ds");
			return this;
		}

		public Criteria andDsIn(List<String> values) {
			addCriterion("DS in", values, "ds");
			return this;
		}

		public Criteria andDsNotIn(List<String> values) {
			addCriterion("DS not in", values, "ds");
			return this;
		}

		public Criteria andDsBetween(String value1, String value2) {
			addCriterion("DS between", value1, value2, "ds");
			return this;
		}

		public Criteria andDsNotBetween(String value1, String value2) {
			addCriterion("DS not between", value1, value2, "ds");
			return this;
		}
	}
}