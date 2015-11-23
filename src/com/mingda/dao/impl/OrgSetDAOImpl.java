package com.mingda.dao.impl;

import com.mingda.dao.OrgSetDAO;
import com.mingda.model.OrgSet;
import com.mingda.model.OrgSetExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class OrgSetDAOImpl extends SqlMapClientDaoSupport implements OrgSetDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public OrgSetDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public int countByExample(OrgSetExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("ORG_SET.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public int deleteByExample(OrgSetExample example) {
        int rows = getSqlMapClientTemplate().delete("ORG_SET.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public int deleteByPrimaryKey(String organizationId) {
        OrgSet key = new OrgSet();
        key.setOrganizationId(organizationId);
        int rows = getSqlMapClientTemplate().delete("ORG_SET.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public void insert(OrgSet record) {
        getSqlMapClientTemplate().insert("ORG_SET.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public void insertSelective(OrgSet record) {
        getSqlMapClientTemplate().insert("ORG_SET.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    @SuppressWarnings("unchecked")
    public List<OrgSet> selectByExample(OrgSetExample example) {
        List<OrgSet> list = getSqlMapClientTemplate().queryForList("ORG_SET.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public OrgSet selectByPrimaryKey(String organizationId) {
        OrgSet key = new OrgSet();
        key.setOrganizationId(organizationId);
        OrgSet record = (OrgSet) getSqlMapClientTemplate().queryForObject("ORG_SET.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public int updateByExampleSelective(OrgSet record, OrgSetExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("ORG_SET.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public int updateByExample(OrgSet record, OrgSetExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("ORG_SET.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public int updateByPrimaryKeySelective(OrgSet record) {
        int rows = getSqlMapClientTemplate().update("ORG_SET.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    public int updateByPrimaryKey(OrgSet record) {
        int rows = getSqlMapClientTemplate().update("ORG_SET.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.ORG_SET
     *
     * @ibatorgenerated Mon Nov 23 09:42:36 CST 2015
     */
    private static class UpdateByExampleParms extends OrgSetExample {
        private Object record;

        public UpdateByExampleParms(Object record, OrgSetExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}