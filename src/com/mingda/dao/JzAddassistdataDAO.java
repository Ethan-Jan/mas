package com.mingda.dao;

import com.mingda.model.JzAddassistdata;
import com.mingda.model.JzAddassistdataExample;
import java.util.List;

public interface JzAddassistdataDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    int countByExample(JzAddassistdataExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    int deleteByExample(JzAddassistdataExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    int deleteByPrimaryKey(Integer bizId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    Integer insert(JzAddassistdata record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    Integer insertSelective(JzAddassistdata record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    List<JzAddassistdata> selectByExample(JzAddassistdataExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    JzAddassistdata selectByPrimaryKey(Integer bizId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    int updateByExampleSelective(JzAddassistdata record, JzAddassistdataExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    int updateByExample(JzAddassistdata record, JzAddassistdataExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    int updateByPrimaryKeySelective(JzAddassistdata record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.JZ_ADDASSISTDATA
     *
     * @ibatorgenerated Thu Jul 21 15:18:53 CST 2011
     */
    int updateByPrimaryKey(JzAddassistdata record);
}