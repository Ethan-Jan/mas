package com.mingda.dao;

import com.mingda.model.JzBiz;
import com.mingda.model.JzBizExample;
import java.util.List;

public interface JzBizDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    int countByExample(JzBizExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    int deleteByExample(JzBizExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    int deleteByPrimaryKey(Integer bizId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    Integer insert(JzBiz record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    Integer insertSelective(JzBiz record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    List<JzBiz> selectByExample(JzBizExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    JzBiz selectByPrimaryKey(Integer bizId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    int updateByExampleSelective(JzBiz record, JzBizExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    int updateByExample(JzBiz record, JzBizExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    int updateByPrimaryKeySelective(JzBiz record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_BIZ
     *
     * @ibatorgenerated Wed Nov 25 16:04:04 CST 2015
     */
    int updateByPrimaryKey(JzBiz record);
}