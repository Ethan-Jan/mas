package com.mingda.dao.impl;

import com.mingda.dao.SanwufileDAO;
import com.mingda.model.Sanwufile;
import com.mingda.model.SanwufileExample;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class SanwufileDAOImpl extends SqlMapClientDaoSupport implements SanwufileDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	public SanwufileDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	public int countByExample(SanwufileExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"SANWUFILE.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	public int deleteByExample(SanwufileExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"SANWUFILE.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	public BigDecimal insert(Sanwufile record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"SANWUFILE.ibatorgenerated_insert", record);
		return (BigDecimal) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	public BigDecimal insertSelective(Sanwufile record) {
		Object newKey = getSqlMapClientTemplate().insert(
				"SANWUFILE.ibatorgenerated_insertSelective", record);
		return (BigDecimal) newKey;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	@SuppressWarnings("unchecked")
	public List<Sanwufile> selectByExample(SanwufileExample example) {
		List<Sanwufile> list = getSqlMapClientTemplate().queryForList(
				"SANWUFILE.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	public int updateByExampleSelective(Sanwufile record,
			SanwufileExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"SANWUFILE.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	public int updateByExample(Sanwufile record, SanwufileExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"SANWUFILE.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table MEDICAL.SANWUFILE
	 * @ibatorgenerated  Thu May 23 08:05:10 CST 2013
	 */
	private static class UpdateByExampleParms extends SanwufileExample {
		private Object record;

		public UpdateByExampleParms(Object record, SanwufileExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}