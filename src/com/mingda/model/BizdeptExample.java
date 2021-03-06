package com.mingda.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BizdeptExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	public BizdeptExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	protected BizdeptExample(BizdeptExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table JL_YLJZ.BIZDEPT
	 * @ibatorgenerated  Thu Sep 30 14:40:19 CST 2010
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

		public Criteria andHospitalIdIsNull() {
			addCriterion("HOSPITAL_ID is null");
			return this;
		}

		public Criteria andHospitalIdIsNotNull() {
			addCriterion("HOSPITAL_ID is not null");
			return this;
		}

		public Criteria andHospitalIdEqualTo(Integer value) {
			addCriterion("HOSPITAL_ID =", value, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdNotEqualTo(Integer value) {
			addCriterion("HOSPITAL_ID <>", value, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdGreaterThan(Integer value) {
			addCriterion("HOSPITAL_ID >", value, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("HOSPITAL_ID >=", value, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdLessThan(Integer value) {
			addCriterion("HOSPITAL_ID <", value, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdLessThanOrEqualTo(Integer value) {
			addCriterion("HOSPITAL_ID <=", value, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdIn(List<Integer> values) {
			addCriterion("HOSPITAL_ID in", values, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdNotIn(List<Integer> values) {
			addCriterion("HOSPITAL_ID not in", values, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdBetween(Integer value1, Integer value2) {
			addCriterion("HOSPITAL_ID between", value1, value2, "hospitalId");
			return this;
		}

		public Criteria andHospitalIdNotBetween(Integer value1, Integer value2) {
			addCriterion("HOSPITAL_ID not between", value1, value2,
					"hospitalId");
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

		public Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("NAME >=", value, "name");
			return this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "name");
			return this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return this;
		}

		public Criteria andDeptTypeIsNull() {
			addCriterion("DEPT_TYPE is null");
			return this;
		}

		public Criteria andDeptTypeIsNotNull() {
			addCriterion("DEPT_TYPE is not null");
			return this;
		}

		public Criteria andDeptTypeEqualTo(String value) {
			addCriterion("DEPT_TYPE =", value, "deptType");
			return this;
		}

		public Criteria andDeptTypeNotEqualTo(String value) {
			addCriterion("DEPT_TYPE <>", value, "deptType");
			return this;
		}

		public Criteria andDeptTypeGreaterThan(String value) {
			addCriterion("DEPT_TYPE >", value, "deptType");
			return this;
		}

		public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
			addCriterion("DEPT_TYPE >=", value, "deptType");
			return this;
		}

		public Criteria andDeptTypeLessThan(String value) {
			addCriterion("DEPT_TYPE <", value, "deptType");
			return this;
		}

		public Criteria andDeptTypeLessThanOrEqualTo(String value) {
			addCriterion("DEPT_TYPE <=", value, "deptType");
			return this;
		}

		public Criteria andDeptTypeLike(String value) {
			addCriterion("DEPT_TYPE like", value, "deptType");
			return this;
		}

		public Criteria andDeptTypeNotLike(String value) {
			addCriterion("DEPT_TYPE not like", value, "deptType");
			return this;
		}

		public Criteria andDeptTypeIn(List<String> values) {
			addCriterion("DEPT_TYPE in", values, "deptType");
			return this;
		}

		public Criteria andDeptTypeNotIn(List<String> values) {
			addCriterion("DEPT_TYPE not in", values, "deptType");
			return this;
		}

		public Criteria andDeptTypeBetween(String value1, String value2) {
			addCriterion("DEPT_TYPE between", value1, value2, "deptType");
			return this;
		}

		public Criteria andDeptTypeNotBetween(String value1, String value2) {
			addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
			return this;
		}

		public Criteria andDeptLevelIsNull() {
			addCriterion("DEPT_LEVEL is null");
			return this;
		}

		public Criteria andDeptLevelIsNotNull() {
			addCriterion("DEPT_LEVEL is not null");
			return this;
		}

		public Criteria andDeptLevelEqualTo(String value) {
			addCriterion("DEPT_LEVEL =", value, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelNotEqualTo(String value) {
			addCriterion("DEPT_LEVEL <>", value, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelGreaterThan(String value) {
			addCriterion("DEPT_LEVEL >", value, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelGreaterThanOrEqualTo(String value) {
			addCriterion("DEPT_LEVEL >=", value, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelLessThan(String value) {
			addCriterion("DEPT_LEVEL <", value, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelLessThanOrEqualTo(String value) {
			addCriterion("DEPT_LEVEL <=", value, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelLike(String value) {
			addCriterion("DEPT_LEVEL like", value, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelNotLike(String value) {
			addCriterion("DEPT_LEVEL not like", value, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelIn(List<String> values) {
			addCriterion("DEPT_LEVEL in", values, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelNotIn(List<String> values) {
			addCriterion("DEPT_LEVEL not in", values, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelBetween(String value1, String value2) {
			addCriterion("DEPT_LEVEL between", value1, value2, "deptLevel");
			return this;
		}

		public Criteria andDeptLevelNotBetween(String value1, String value2) {
			addCriterion("DEPT_LEVEL not between", value1, value2, "deptLevel");
			return this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("STATUS is null");
			return this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("STATUS is not null");
			return this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("STATUS =", value, "status");
			return this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("STATUS <>", value, "status");
			return this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("STATUS >", value, "status");
			return this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("STATUS >=", value, "status");
			return this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("STATUS <", value, "status");
			return this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("STATUS <=", value, "status");
			return this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("STATUS like", value, "status");
			return this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("STATUS not like", value, "status");
			return this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("STATUS in", values, "status");
			return this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("STATUS not in", values, "status");
			return this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("STATUS between", value1, value2, "status");
			return this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("STATUS not between", value1, value2, "status");
			return this;
		}
	}
}