package com.mingda.dao;

import com.mingda.model.Jizhong;
import com.mingda.model.JizhongExample;
import java.util.List;

public interface JizhongDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JIZHONG
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	int countByExample(JizhongExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JIZHONG
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	int deleteByExample(JizhongExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JIZHONG
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	void insert(Jizhong record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JIZHONG
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	void insertSelective(Jizhong record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JIZHONG
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	List<Jizhong> selectByExample(JizhongExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JIZHONG
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	int updateByExampleSelective(Jizhong record, JizhongExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table MEDICAL.JIZHONG
	 * @ibatorgenerated  Wed May 25 16:23:00 CST 2011
	 */
	int updateByExample(Jizhong record, JizhongExample example);
}