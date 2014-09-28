package com.mingda.dao;

import com.mingda.model.ChronicItem;
import com.mingda.model.ChronicItemExample;
import java.util.List;

public interface ChronicItemDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    int countByExample(ChronicItemExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    int deleteByExample(ChronicItemExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    void insert(ChronicItem record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    void insertSelective(ChronicItem record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    List<ChronicItem> selectByExample(ChronicItemExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    int updateByExampleSelective(ChronicItem record, ChronicItemExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CHRONIC_ITEM
     *
     * @ibatorgenerated Tue Nov 16 13:27:00 CST 2010
     */
    int updateByExample(ChronicItem record, ChronicItemExample example);
}