package com.mingda.dao.impl;

import com.mingda.dao.TempPersonDAO;
import com.mingda.model.TempPerson;
import com.mingda.model.TempPersonExample;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TempPersonDAOImpl extends SqlMapClientDaoSupport implements TempPersonDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public TempPersonDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public int countByExample(TempPersonExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("TEMP_PERSON.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public int deleteByExample(TempPersonExample example) {
        int rows = getSqlMapClientTemplate().delete("TEMP_PERSON.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public int deleteByPrimaryKey(BigDecimal memberId) {
        TempPerson key = new TempPerson();
        key.setMemberId(memberId);
        int rows = getSqlMapClientTemplate().delete("TEMP_PERSON.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public BigDecimal insert(TempPerson record) {
        Object newKey = getSqlMapClientTemplate().insert("TEMP_PERSON.ibatorgenerated_insert", record);
        return (BigDecimal) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public BigDecimal insertSelective(TempPerson record) {
        Object newKey = getSqlMapClientTemplate().insert("TEMP_PERSON.ibatorgenerated_insertSelective", record);
        return (BigDecimal) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    @SuppressWarnings("unchecked")
    public List<TempPerson> selectByExample(TempPersonExample example) {
        List<TempPerson> list = getSqlMapClientTemplate().queryForList("TEMP_PERSON.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public TempPerson selectByPrimaryKey(BigDecimal memberId) {
        TempPerson key = new TempPerson();
        key.setMemberId(memberId);
        TempPerson record = (TempPerson) getSqlMapClientTemplate().queryForObject("TEMP_PERSON.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public int updateByExampleSelective(TempPerson record, TempPersonExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("TEMP_PERSON.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public int updateByExample(TempPerson record, TempPersonExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("TEMP_PERSON.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public int updateByPrimaryKeySelective(TempPerson record) {
        int rows = getSqlMapClientTemplate().update("TEMP_PERSON.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    public int updateByPrimaryKey(TempPerson record) {
        int rows = getSqlMapClientTemplate().update("TEMP_PERSON.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.TEMP_PERSON
     *
     * @ibatorgenerated Thu Dec 03 13:04:20 CST 2015
     */
    private static class UpdateByExampleParms extends TempPersonExample {
        private Object record;

        public UpdateByExampleParms(Object record, TempPersonExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}