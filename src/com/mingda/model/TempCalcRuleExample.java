package com.mingda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TempCalcRuleExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	public TempCalcRuleExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	protected TempCalcRuleExample(TempCalcRuleExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.TEMP_CALC_RULE
	 * @ibatorgenerated  Fri Feb 22 14:36:52 CST 2013
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

		public Criteria andRuletempIdIsNull() {
			addCriterion("RULETEMP_ID is null");
			return this;
		}

		public Criteria andRuletempIdIsNotNull() {
			addCriterion("RULETEMP_ID is not null");
			return this;
		}

		public Criteria andRuletempIdEqualTo(Integer value) {
			addCriterion("RULETEMP_ID =", value, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdNotEqualTo(Integer value) {
			addCriterion("RULETEMP_ID <>", value, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdGreaterThan(Integer value) {
			addCriterion("RULETEMP_ID >", value, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("RULETEMP_ID >=", value, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdLessThan(Integer value) {
			addCriterion("RULETEMP_ID <", value, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdLessThanOrEqualTo(Integer value) {
			addCriterion("RULETEMP_ID <=", value, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdIn(List<Integer> values) {
			addCriterion("RULETEMP_ID in", values, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdNotIn(List<Integer> values) {
			addCriterion("RULETEMP_ID not in", values, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdBetween(Integer value1, Integer value2) {
			addCriterion("RULETEMP_ID between", value1, value2, "ruletempId");
			return this;
		}

		public Criteria andRuletempIdNotBetween(Integer value1, Integer value2) {
			addCriterion("RULETEMP_ID not between", value1, value2,
					"ruletempId");
			return this;
		}

		public Criteria andOrganizationIdIsNull() {
			addCriterion("ORGANIZATION_ID is null");
			return this;
		}

		public Criteria andOrganizationIdIsNotNull() {
			addCriterion("ORGANIZATION_ID is not null");
			return this;
		}

		public Criteria andOrganizationIdEqualTo(String value) {
			addCriterion("ORGANIZATION_ID =", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdNotEqualTo(String value) {
			addCriterion("ORGANIZATION_ID <>", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdGreaterThan(String value) {
			addCriterion("ORGANIZATION_ID >", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
			addCriterion("ORGANIZATION_ID >=", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdLessThan(String value) {
			addCriterion("ORGANIZATION_ID <", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
			addCriterion("ORGANIZATION_ID <=", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdLike(String value) {
			addCriterion("ORGANIZATION_ID like", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdNotLike(String value) {
			addCriterion("ORGANIZATION_ID not like", value, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdIn(List<String> values) {
			addCriterion("ORGANIZATION_ID in", values, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdNotIn(List<String> values) {
			addCriterion("ORGANIZATION_ID not in", values, "organizationId");
			return this;
		}

		public Criteria andOrganizationIdBetween(String value1, String value2) {
			addCriterion("ORGANIZATION_ID between", value1, value2,
					"organizationId");
			return this;
		}

		public Criteria andOrganizationIdNotBetween(String value1, String value2) {
			addCriterion("ORGANIZATION_ID not between", value1, value2,
					"organizationId");
			return this;
		}

		public Criteria andPersonTypeIsNull() {
			addCriterion("PERSON_TYPE is null");
			return this;
		}

		public Criteria andPersonTypeIsNotNull() {
			addCriterion("PERSON_TYPE is not null");
			return this;
		}

		public Criteria andPersonTypeEqualTo(String value) {
			addCriterion("PERSON_TYPE =", value, "personType");
			return this;
		}

		public Criteria andPersonTypeNotEqualTo(String value) {
			addCriterion("PERSON_TYPE <>", value, "personType");
			return this;
		}

		public Criteria andPersonTypeGreaterThan(String value) {
			addCriterion("PERSON_TYPE >", value, "personType");
			return this;
		}

		public Criteria andPersonTypeGreaterThanOrEqualTo(String value) {
			addCriterion("PERSON_TYPE >=", value, "personType");
			return this;
		}

		public Criteria andPersonTypeLessThan(String value) {
			addCriterion("PERSON_TYPE <", value, "personType");
			return this;
		}

		public Criteria andPersonTypeLessThanOrEqualTo(String value) {
			addCriterion("PERSON_TYPE <=", value, "personType");
			return this;
		}

		public Criteria andPersonTypeLike(String value) {
			addCriterion("PERSON_TYPE like", value, "personType");
			return this;
		}

		public Criteria andPersonTypeNotLike(String value) {
			addCriterion("PERSON_TYPE not like", value, "personType");
			return this;
		}

		public Criteria andPersonTypeIn(List<String> values) {
			addCriterion("PERSON_TYPE in", values, "personType");
			return this;
		}

		public Criteria andPersonTypeNotIn(List<String> values) {
			addCriterion("PERSON_TYPE not in", values, "personType");
			return this;
		}

		public Criteria andPersonTypeBetween(String value1, String value2) {
			addCriterion("PERSON_TYPE between", value1, value2, "personType");
			return this;
		}

		public Criteria andPersonTypeNotBetween(String value1, String value2) {
			addCriterion("PERSON_TYPE not between", value1, value2,
					"personType");
			return this;
		}

		public Criteria andScaleIsNull() {
			addCriterion("SCALE is null");
			return this;
		}

		public Criteria andScaleIsNotNull() {
			addCriterion("SCALE is not null");
			return this;
		}

		public Criteria andScaleEqualTo(BigDecimal value) {
			addCriterion("SCALE =", value, "scale");
			return this;
		}

		public Criteria andScaleNotEqualTo(BigDecimal value) {
			addCriterion("SCALE <>", value, "scale");
			return this;
		}

		public Criteria andScaleGreaterThan(BigDecimal value) {
			addCriterion("SCALE >", value, "scale");
			return this;
		}

		public Criteria andScaleGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("SCALE >=", value, "scale");
			return this;
		}

		public Criteria andScaleLessThan(BigDecimal value) {
			addCriterion("SCALE <", value, "scale");
			return this;
		}

		public Criteria andScaleLessThanOrEqualTo(BigDecimal value) {
			addCriterion("SCALE <=", value, "scale");
			return this;
		}

		public Criteria andScaleIn(List<BigDecimal> values) {
			addCriterion("SCALE in", values, "scale");
			return this;
		}

		public Criteria andScaleNotIn(List<BigDecimal> values) {
			addCriterion("SCALE not in", values, "scale");
			return this;
		}

		public Criteria andScaleBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("SCALE between", value1, value2, "scale");
			return this;
		}

		public Criteria andScaleNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("SCALE not between", value1, value2, "scale");
			return this;
		}

		public Criteria andPersonTypeNjIsNull() {
			addCriterion("PERSON_TYPE_NJ is null");
			return this;
		}

		public Criteria andPersonTypeNjIsNotNull() {
			addCriterion("PERSON_TYPE_NJ is not null");
			return this;
		}

		public Criteria andPersonTypeNjEqualTo(String value) {
			addCriterion("PERSON_TYPE_NJ =", value, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjNotEqualTo(String value) {
			addCriterion("PERSON_TYPE_NJ <>", value, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjGreaterThan(String value) {
			addCriterion("PERSON_TYPE_NJ >", value, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjGreaterThanOrEqualTo(String value) {
			addCriterion("PERSON_TYPE_NJ >=", value, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjLessThan(String value) {
			addCriterion("PERSON_TYPE_NJ <", value, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjLessThanOrEqualTo(String value) {
			addCriterion("PERSON_TYPE_NJ <=", value, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjLike(String value) {
			addCriterion("PERSON_TYPE_NJ like", value, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjNotLike(String value) {
			addCriterion("PERSON_TYPE_NJ not like", value, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjIn(List<String> values) {
			addCriterion("PERSON_TYPE_NJ in", values, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjNotIn(List<String> values) {
			addCriterion("PERSON_TYPE_NJ not in", values, "personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjBetween(String value1, String value2) {
			addCriterion("PERSON_TYPE_NJ between", value1, value2,
					"personTypeNj");
			return this;
		}

		public Criteria andPersonTypeNjNotBetween(String value1, String value2) {
			addCriterion("PERSON_TYPE_NJ not between", value1, value2,
					"personTypeNj");
			return this;
		}

		public Criteria andScaleNjIsNull() {
			addCriterion("SCALE_NJ is null");
			return this;
		}

		public Criteria andScaleNjIsNotNull() {
			addCriterion("SCALE_NJ is not null");
			return this;
		}

		public Criteria andScaleNjEqualTo(BigDecimal value) {
			addCriterion("SCALE_NJ =", value, "scaleNj");
			return this;
		}

		public Criteria andScaleNjNotEqualTo(BigDecimal value) {
			addCriterion("SCALE_NJ <>", value, "scaleNj");
			return this;
		}

		public Criteria andScaleNjGreaterThan(BigDecimal value) {
			addCriterion("SCALE_NJ >", value, "scaleNj");
			return this;
		}

		public Criteria andScaleNjGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("SCALE_NJ >=", value, "scaleNj");
			return this;
		}

		public Criteria andScaleNjLessThan(BigDecimal value) {
			addCriterion("SCALE_NJ <", value, "scaleNj");
			return this;
		}

		public Criteria andScaleNjLessThanOrEqualTo(BigDecimal value) {
			addCriterion("SCALE_NJ <=", value, "scaleNj");
			return this;
		}

		public Criteria andScaleNjIn(List<BigDecimal> values) {
			addCriterion("SCALE_NJ in", values, "scaleNj");
			return this;
		}

		public Criteria andScaleNjNotIn(List<BigDecimal> values) {
			addCriterion("SCALE_NJ not in", values, "scaleNj");
			return this;
		}

		public Criteria andScaleNjBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("SCALE_NJ between", value1, value2, "scaleNj");
			return this;
		}

		public Criteria andScaleNjNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("SCALE_NJ not between", value1, value2, "scaleNj");
			return this;
		}

		public Criteria andNScaleIsNull() {
			addCriterion("N_SCALE is null");
			return this;
		}

		public Criteria andNScaleIsNotNull() {
			addCriterion("N_SCALE is not null");
			return this;
		}

		public Criteria andNScaleEqualTo(BigDecimal value) {
			addCriterion("N_SCALE =", value, "nScale");
			return this;
		}

		public Criteria andNScaleNotEqualTo(BigDecimal value) {
			addCriterion("N_SCALE <>", value, "nScale");
			return this;
		}

		public Criteria andNScaleGreaterThan(BigDecimal value) {
			addCriterion("N_SCALE >", value, "nScale");
			return this;
		}

		public Criteria andNScaleGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("N_SCALE >=", value, "nScale");
			return this;
		}

		public Criteria andNScaleLessThan(BigDecimal value) {
			addCriterion("N_SCALE <", value, "nScale");
			return this;
		}

		public Criteria andNScaleLessThanOrEqualTo(BigDecimal value) {
			addCriterion("N_SCALE <=", value, "nScale");
			return this;
		}

		public Criteria andNScaleIn(List<BigDecimal> values) {
			addCriterion("N_SCALE in", values, "nScale");
			return this;
		}

		public Criteria andNScaleNotIn(List<BigDecimal> values) {
			addCriterion("N_SCALE not in", values, "nScale");
			return this;
		}

		public Criteria andNScaleBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("N_SCALE between", value1, value2, "nScale");
			return this;
		}

		public Criteria andNScaleNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("N_SCALE not between", value1, value2, "nScale");
			return this;
		}
	}
}