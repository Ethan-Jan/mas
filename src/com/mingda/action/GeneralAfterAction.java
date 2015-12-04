package com.mingda.action;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.mingda.dto.DeptDTO;
import com.mingda.dto.DiagnoseTypeDTO;
import com.mingda.dto.DictDTO;
import com.mingda.dto.JzYearDTO;
import com.mingda.dto.OrgEnabledDTO;
import com.mingda.dto.OrgSetDTO;
import com.mingda.dto.OrganizationDTO;
import com.mingda.dto.OutIcdDTO;
import com.mingda.dto.TempDTO;
import com.mingda.dto.UserDTO;
import com.mingda.service.AuthorityService;
import com.mingda.service.SystemDataService;
import com.mingda.service.TempService;
import com.mingda.webclient.YljzService;
import com.mingda.webclient.model.AfterDTO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GeneralAfterAction extends ActionSupport {
	
	static final Logger log = Logger.getLogger(TempAction.class);
	private static final long serialVersionUID = 1L;
	
	private SystemDataService systemDataService;
	private YljzService yljzService;
	private TempService tempService;
	private String result;
	private TempDTO tempDTO;
	private List<TempDTO> tempmembers;
	private List<OrganizationDTO> orgs;
	private List<DictDTO> nations;
	private String r;
	private List<DeptDTO> depts;
	private List<DiagnoseTypeDTO> diagnosetypes;
	private List<OutIcdDTO> outicds;
	private OrgSetDTO orgSetDTO;
	private List<TempDTO> payviews;
	private String cur_page;
	private String value;
	private String operational;
	private String term;
	private String app;
	private String oid;
	private String toolsmenu;
	private String assistype;
	private AfterDTO afterDTO;
	private String orgid;
	private AuthorityService authorityService;
	private String opertime1;
	private String opertime2;
	private String opertime3;
	private String opertime4;
	private String impl;
	private String ds;
	
	@SuppressWarnings("rawtypes")
	public String querytempmemberinit() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		String org = "";
		if(organizationId.length()>6){
			org = organizationId.substring(0, 6);
		}else{
			org = organizationId;
		}
		OrgEnabledDTO oe = authorityService.queryEnabled(org);
		if(oe.getTempSts()==1){
			if (organizationId.length() == 8) {
				return SUCCESS;
			} else {
				result = "�˹���������ֵ�ʹ�ã�";
				return "result";
			}
		}else{
			result = "δ���������ߣ�";
			return "result";
		}
	}
	
	// ��ʱ�����������ѯ
	@SuppressWarnings("rawtypes")
	public String querytempmember() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		tempDTO.setOrganizationId(organizationId);
		tempmembers = tempService.findTempmember(tempDTO);
		if (null != tempmembers && tempmembers.size() > 0) {
			return SUCCESS;
		} else {
			orgs = systemDataService.findOrgChilds(organizationId);
			setNations(systemDataService.findNations());
			return "createtempperson";
		}
	}
	
	public String createtempperson() {
		tempDTO = tempService.saveTempPerson(tempDTO);
		tempmembers = new ArrayList<TempDTO>();
		tempmembers.add(tempDTO);
		return SUCCESS;
	}
	
	@SuppressWarnings("rawtypes")
	public String afterapplyinitnew() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		tempDTO.setOrganizationId(organizationId);
		tempDTO.setBizType("ma");
		Boolean flag = false;
		if (tempDTO.getApproveId() == null) {
			flag = true;
		} else {
			r = tempService.findValBiz(tempDTO);

			if ("0".equals(r)) {
				flag = false;
			} else {
				flag = true;
			}
		}

		if (flag == true) {
			tempDTO = tempService.findGeneralAftermeberinfo(tempDTO);
			// ����ҽԺ�����б�
			if (organizationId.length() > 6) {
				organizationId = organizationId.substring(0, 6);
			}
			depts = systemDataService.findDeptsByOrg(organizationId);
			if (null != depts && depts.size() > 0) {
				DeptDTO element = new DeptDTO();
				if (null == tempDTO.getApproveId()) {
				} else {
					element.setHospitalId((int) tempDTO.getHospitalId());
				}
			} else {
				DeptDTO element = new DeptDTO();
				element.setHospitalId(-1);
				element.setName("��");
				depts.add(0, element);
			}
			// סԺ�ش󼲲�����
			diagnosetypes = tempService.findDiagnoseTypesByOrg(organizationId);
			if (null != diagnosetypes && diagnosetypes.size() > 0) {
				DiagnoseTypeDTO element = new DiagnoseTypeDTO();
				if (null == tempDTO.getApproveId()) {
				} else {
					element.setDiagnoseTypeId(tempDTO.getDiagnoseTypeId());
				}
			} else {
				DiagnoseTypeDTO element = new DiagnoseTypeDTO();
				element.setDiagnoseTypeId(0);
				element.setDiagnoseTypeName("��");
				diagnosetypes.add(0, element);
			}
			// ��������󲡲���
			outicds = tempService.findOuticdsByOrg(organizationId);
			if (null != outicds && outicds.size() > 0) {
				OutIcdDTO element = new OutIcdDTO();
				if (null == tempDTO.getApproveId()) {
				} else {
					element.setIcdId(tempDTO.getIcdId());
				}
			} else {
				OutIcdDTO element = new OutIcdDTO();
				element.setIcdId(0);
				element.setName("��");
				outicds.add(0, element);
			}
			// �Ƿ��зǶ���ҽԺ
			orgSetDTO = tempService.getOrgSet(organizationId);
			return SUCCESS;
		} else {
			payviews = tempService.findPayviews(tempDTO);
			result = "������Ϣ�������޸ģ�";
			return "result";
		}

	}
	
	@SuppressWarnings("rawtypes")
	public String viewafterapplys() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		tempmembers = tempService.findGeneralAfterapplys(tempDTO);
		tempDTO.setOrg(organizationId.substring(0, 6));
		return SUCCESS;
	}
	
	public String viewafterapply() {
		UserDTO user = (UserDTO) ActionContext.getContext().getSession()
				.get("user");
		String organizationId = user.getOrganizationId();
		orgid = organizationId.substring(0, 6);
		tempDTO = tempService.findGeneralAftermeberinfo(tempDTO);
		tempDTO.setOrg(orgid);
		return SUCCESS;
	}

	/**
	 * ������ѯ��ʼ��
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public String queryafterapprovedoneinit() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		String org = "";
		if(organizationId.length()>6){
			org = organizationId.substring(0, 6);
		}else{
			org = organizationId;
		}
		OrgEnabledDTO oe = authorityService.queryEnabled(org);
		if(oe.getTempSts()==1){
			if (6 == organizationId.length()) {
				if (2 == organizationId.length()) {
					orgs = systemDataService.findOrganizationExt(organizationId);
				} else {
					orgs = systemDataService.findOrgParentAndChilds(organizationId);
				}
				return SUCCESS;
			}else{
				result = "���ؼ�ʹ��Ȩ�ޣ�";
				return "result";
			}
		}else{
			result = "δ���������ߣ�";
			return "result";
		}
		
	}
	
	/**
	 * ������ѯ
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String queryafterapprovedone() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		String sql = "";
		if (null == cur_page || "".equals(cur_page)) {

			String var = value;
			String jwhere = "";
			if (!"".equals(var)) {
				if ("=".equals(operational)) {
					var = " = '" + var + "'";
				} else if ("like".equals(operational)) {
					var = "like  '%" + var + "%'";
				} else {
					var = "";
				}
				if ("SSN".equals(term)) {
				} else if ("FAMILYNO".equals(term)) {
					jwhere = jwhere + " and family_no  " + var;
				} else if ("MEMBERNAME".equals(term)) {
					jwhere = jwhere + " and  name  " + var;
				} else if ("PAPERID".equals(term)) {
					jwhere = jwhere + " and  id_card " + var;
				} else {
				}
			}
			if (app == null || "".equals(app)) {
			} else {
				jwhere = jwhere + " and biz_status = '" + app + "'";
			}
			if (assistype == null || "".equals(assistype)) {
			} else {
				jwhere = jwhere + " and assist_type = '" + assistype + "'";
			}
			if (oid == null || "".equals(oid)) {
				jwhere = jwhere + " and  family_no like '" + organizationId
						+ "%' ";
			} else {
				jwhere = jwhere + " and  family_no like '" + oid + "%' ";
			}
			sql = "select biz_id, hospital_name, assist_type, jz.organization_id, member_id, member_type, "
					+ "decode(assist_type,'1','����','2','סԺ',null) as assist_type_text, "
					+ "personstate, assist_type_m, "
					+ "family_no as familyno, family_address, name as membername, sex, id_card as paperid , begin_time, diagnose_name, end_time, assist_time, "
					+ "pay_total, pay_medicare, pay_outmedicare, pay_assist, biz_status, oper_time, jz.assist_typex, "
					+ "org1.orgname as org1, "
					+ "org2.orgname as org2, "
					+ "org3.orgname as org3  from jz_medicalafter jz"
					+ " left join manager_org org1 on org1.depth = 3 and substr(jz.family_no,0,6)=org1.organization_id "
					+ " left join manager_org org2 on org2.depth = 4 and substr(jz.family_no,0,8)=org2.organization_id "
					+ " left join manager_org org3 on org3.depth = 5 and substr(jz.family_no,0,10)=org3.organization_id "
					+ "where 1=1 and jz.person_typeex in ('3','4') " + jwhere + "  order by oper_time desc  ";
			session.put("sql", sql);
			cur_page = "1";
			HashMap title = new HashMap();
			title.put("FAMILYNO,val", "��ͥ���");
			title.put("MEMBERNAME,val", "����");
			title.put("PAPERID,val", "���֤��");
			title.put("DIAGNOSE_NAME,val", "��������");
			title.put("PAY_TOTAL,val", "�ܷ���");
			title.put("PAY_MEDICARE,val", "ͳ��");
			title.put("PAY_ASSIST,val", "ҽ�ƾ���");
			title.put("PAY_OUTMEDICARE,val", "Ŀ¼�����");
			title.put("HOSPITAL_NAME,val", "����ҽԺ");
			title.put("ASSIST_TYPE_TEXT,val", "��������");
			title.put("ORG1,val", "����");
			title.put("ORG2,val", "����");
			title.put("ORG3,val", "����/�ֵ�");
			session.put("title", title);
		} else {
			sql = (String) session.get("sql");
		}
		tempmembers = tempService.findAfterapprovedone(sql, new BigDecimal(
				cur_page).intValue(), "page/temp/queryafterapprovedone.action");
		setToolsmenu(tempService.getToolsmenu());
		// ��ȡ����
		if (6 == organizationId.length() || 8 == organizationId.length()) {
			if (2 == organizationId.length()) {
				orgs = systemDataService.findOrganizationExt(organizationId);
			} else {
				orgs = systemDataService.findOrgParentAndChilds(organizationId);
			}
		}
		return SUCCESS;
	}
	
	@SuppressWarnings("rawtypes")
	public String afterapply() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String orgid = user.getOrganizationId();
		tempDTO.setOrganizationId(orgid);
		tempDTO.setOrg(orgid.substring(0, 6));
		TempDTO temp = tempService.iscalcline(tempDTO);
		if ("0".equals(temp.getResult())) {
			result = "���Ͻ���ڷⶥ�ߣ���������д������!<br/>�ۼ��ܾ�����" + temp.getTotlePay()
					+ "Ԫ;<br/>סԺ�ܾ�����" + temp.getZyPay() + "Ԫ;<br/>������ܾ�����"
					+ temp.getMzPay() + "Ԫ;<br/>�ⶥ�ߣ�" + temp.getTopLine()
					+ "Ԫ;";
			return "result";
		} else {
			if(orgid.length()==8){
				tempDTO.setBizStatus("-1");
			}
			tempDTO = tempService.saveAfterApplyInfo(tempDTO);
		}
		return SUCCESS;

	}
	
	/**
	 *������ͬ��
	 * @return
	 */
	public String afteryn() {
		tempDTO = tempService.saveAfteryn(tempDTO);
		result = "����ɹ�";
		return SUCCESS;
	}
	
	//����GetAssistMoneyAfter�����������
	@SuppressWarnings({ "rawtypes" })
	public String calcaftermoneyauto() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String assisttype = tempDTO.getAssistTypeM() + tempDTO.getAssistTypex()
				+ "";
		String organizationId = user.getOrganizationId();
		if (null != organizationId && !"".equals(organizationId)) {
			organizationId = organizationId.substring(0, 6);
		}
		JSONObject json = new JSONObject();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		afterDTO = new AfterDTO();
		afterDTO.setOrgCode(organizationId);
		afterDTO.setHospital_ID(new Long(tempDTO.getHospitalId()));
		afterDTO.setMedicareType(tempDTO.getMedicareType());
		afterDTO.setMemberType(tempDTO.getMemberType());
		afterDTO.setMemberID(tempDTO.getMemberId());
		afterDTO.setMedicareType(tempDTO.getMedicareType());
		afterDTO.setBizType(new Integer(tempDTO.getAssistype()));
		afterDTO.setSpecBiz(-1);
		afterDTO.setBegin_Time(sdf.format(tempDTO.getBegintime()));
		afterDTO.setEnd_Time(sdf.format(tempDTO.getEndtime()));
		afterDTO.setDiagnose_Type_ID(new Integer(tempDTO
				.getDiagnoseTypeId()));
		afterDTO.setIcd_ID(0);//ԭ�����������
		afterDTO.setPay_Total(tempDTO.getPayTotal());
		afterDTO.setPay_Medicare(tempDTO.getPayMedicare());
		afterDTO.setPay_OutMedicare(tempDTO.getPayOutmedicare());
		afterDTO.setPay_Sybx(tempDTO.getInsurance());
		afterDTO.setPay_Dbbx(tempDTO.getPayCIAssist());
		afterDTO.setHospital_Level(-1);
		afterDTO.setHospital_Local(-1);
		afterDTO.setHospital_Type(Integer.valueOf(tempDTO.getHospitaltype()));
		int businessyear = this.getBusinessYear(organizationId,tempDTO.getEndtime());
		System.out.println("����ҵ����ȣ�"+businessyear);
		afterDTO.setBusinessyear(businessyear+"");
		afterDTO.setIdNumber(tempDTO.getPaperid());
		afterDTO.setFin_Time(sdf.format(tempDTO.getFintime()));
		afterDTO.setPerson_Type(Integer.valueOf(tempDTO.getPersonTypeex()));
		if(tempDTO.getMedicareFlag()){
			afterDTO.setMedicareFlag(1);
		}else{
			afterDTO.setMedicareFlag(0);
		}
		afterDTO = yljzService.getAssistMoneyAfter(afterDTO);
		
		if ("1".equals(afterDTO.getReturnFlag())) {
			json.put("m", afterDTO.getAssistMoney());
			json.put("info", afterDTO.getMessage());
			json.put("in", afterDTO.getAssistSumIn());
			json.put("out", afterDTO.getAssistSumOut());
			json.put("ci", afterDTO.getAssistCIA());
			json.put("sum", afterDTO.getAssistSum());
			json.put("calcmsg", afterDTO.getCalcMsg());
			json.put("businessyear", businessyear);
			json.put("biztypeex",afterDTO.getBizTypeEx());
		} else {
			json.put("info", afterDTO.getMessage());
		}
		result = json.toString();
		return SUCCESS;
	}
	
	/*
	 * ��Ժʱ��������ʱ������һ��ʱ������ҵ�����Ϊ����ȣ�
	 * ��Ժʱ��Ϊ��һ�꣨û�п�����ҵ�񣩣�����ʱ���ǿ����ҵ��ʱ������ҵ�����Ϊ
	 *		���С��jz_year���趨ʱ�䣬���Գ�Ժʱ������Ϊ׼��
	 *		�������jz_year���趨ʱ�䣬��������ʱ������Ϊ׼��
	 */
	private int getBusinessYear(String orgid,Date endtime){
		GregorianCalendar g = new GregorianCalendar();
		int year = g.get(Calendar.YEAR);// ��ȡ���
		Calendar c = Calendar.getInstance();
        c.setTime(endtime);
        int inyear = c.get(Calendar.YEAR);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
		String sysdate = sdf.format(date);
		if(year==inyear){
		}else{
			if((year-1)==inyear){
				JzYearDTO jzYearDTO = new JzYearDTO();
				jzYearDTO.setOrganizationId(orgid);
				String businessdate = tempService.getBusinessYear(jzYearDTO);
				int i = this.compare_date(sysdate, businessdate);
				if(i==1){
				}else{
					year = year - 1;
				}
			}else{
				year = 0;
			}
		}
		return year;
	}
	private int compare_date(String DATE1, String DATE2) {
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        try {
            Date dt1 = sdf.parse(DATE1);
            Date dt2 = sdf.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                //System.out.println("dt1 ��dt2ǰ");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                //System.out.println("dt1��dt2��");
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }
	
	@SuppressWarnings("rawtypes")
	public String queryafterapproveinit() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		String org = "";
		if(organizationId.length()>6){
			org = organizationId.substring(0, 6);
		}else{
			org = organizationId;
		}
		OrgEnabledDTO oe = authorityService.queryEnabled(org);
		if(oe.getTempSts()==1){
			if (6 == organizationId.length() || 8 == organizationId.length()) {
				if (2 == organizationId.length()) {
					orgs = systemDataService.findOrganizationExt(organizationId);
				} else {
					orgs = systemDataService.findOrgParentAndChilds(organizationId);
				}
				return SUCCESS;
	
			} else {
				result = "�˹���Ϊ���ء��ֵ�ʹ�ã�";
				return "result";
			}
		}else{
			result = "δ���������ߣ�";
			return "result";
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String queryafterapprove() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		String sql = "";
		if (null == cur_page || "".equals(cur_page)) {

			String var = value;
			String jwhere = "";
			if (!"".equals(var)) {
				if ("=".equals(operational)) {
					var = " = '" + var + "'";
				} else if ("like".equals(operational)) {
					var = "like  '%" + var + "%'";
				} else {
					var = "";
				}
				if ("SSN".equals(term)) {
					jwhere = jwhere + " and  mem.SSN  " + var;
				} else if ("FAMILYNO".equals(term)) {
					jwhere = jwhere + " and mem.FAMILYNO  " + var;
				} else if ("MEMBERNAME".equals(term)) {
					jwhere = jwhere + " and  mem.MEMBERNAME  " + var;
				} else if ("PAPERID".equals(term)) {
					jwhere = jwhere + " and  mem.PAPERID " + var;
				} else {
				}
			}
			if (oid == null || "".equals(oid)) {
				jwhere = jwhere + " and  mem.familyno like '" + organizationId
						+ "%' ";
			} else {
				jwhere = jwhere + " and  mem.familyno like '" + oid + "%' ";
			}
			if (null == app || "".equals(app)) {

			} else if ("1".equals(app)) {
				jwhere = jwhere + " and  a.member_type='1' ";
			} else if ("2".equals(app)) {
				jwhere = jwhere + " and  a.member_type='2' ";
			}
			String jwhere1 = "";
			if ((opertime1.equals("") || null == opertime1)
					&& (opertime2.equals("") || null == opertime2)) {
			} else if (opertime1.equals("") || null == opertime1) {
				jwhere1 = jwhere1 + " and t.oper_time > TO_DATE('"
						+ opertime2.substring(0, 10)
						+ " 23:59:59', 'yyyy-MM-dd hh24:mi:ss')";

			} else if (opertime2.equals("") || null == opertime2) {
				jwhere1 = jwhere1 + "and t.oper_time < TO_DATE('"
						+ opertime1.substring(0, 10)
						+ " 00:00:00', 'yyyy-MM-dd hh24:mi:ss') ";

			} else {
				jwhere1 = jwhere1 + " and t.oper_time BETWEEN TO_DATE('"
						+ opertime1.substring(0, 10)
						+ " 00:00:00', 'yyyy-MM-dd hh24:mi:ss') AND TO_DATE('"
						+ opertime2.substring(0, 10)
						+ " 23:59:59', 'yyyy-MM-dd hh24:mi:ss')";
			}
			if (null == assistype || "".equals(assistype)) {

			} else {
				jwhere1 = jwhere1 + " and t.assist_type = '" + assistype + "'";
			}

			sql = "select mem.membername, mem.paperid, mem.familyno,  a.member_id, "
					+ " a.member_type,  cs, pay_total,  pay_medicare, pay_outmedicare, "
					+ " pay_assist , pay_ciassist, mem.address, mem.address as rpraddress,  a.diagnose_name, a.hospital_name, mem.personstate, mem.assist_type, mem.assist_typex, mem.orgname1, mem.orgname2 "
					+ " from "
					+ " (select a.*,org1.orgname as orgname1 ,org2.orgname as orgname2 from temp_person a "
					+ " left join manager_org org1 "
					+ " on org1.depth = 4 "
					+ " and org1.organization_id = substr(a.familyno, 1, 8) "
					+ " left join manager_org org2 "
					+ " on org2.depth = 5 "
					+ " and org2.organization_id = substr(a.familyno, 1, 10))mem, "
					+ " (select t.member_id, t.member_type,  count(*) as cs, "
					+ " sum(nvl(t.pay_total, 0)) as pay_total, "
					+ " sum(nvl(t.pay_medicare, 0)) as pay_medicare, "
					+ " sum(nvl(t.pay_outmedicare, 0)) as pay_outmedicare, "
					+ " sum(nvl(t.pay_assist, 0)) as pay_assist ,"
					+ " sum(nvl(t.pay_ciassist,0)) as pay_ciassist, "
					+ " max(t.diagnose_name) as diagnose_name,  max(t.hospital_name) as hospital_name "
					+ " from jz_medicalafter t where t.biz_status='1' "
					+ " and t.person_typeex in (3,4) "
					+ jwhere1
					+ " group by (t.member_id, t.member_type)) a "
					+ " where mem.member_id = a.member_id and mem.member_type = a.member_type "
					+ jwhere + " order by mem.familyno";
			session.put("sql", sql);
			HashMap title = new HashMap();
			title.put("FAMILYNO,val", "��ͥ���");
			title.put("MEMBERNAME,val", "����");
			title.put("PAPERID,val", "���֤��");
			title.put("PAY_TOTAL,val", "�ܷ���");
			title.put("PAY_ASSIST,val", "������");
			title.put("PAY_CIASSIST,val", "�󲡱���");
			title.put("PAY_MEDICARE,val", "ͳ��");
			title.put("PAY_OUTMEDICARE,val", "Ŀ¼�����");
			title.put("ADDRESS,val", "��ͥ��ַ");
			title.put("RPRADDRESS,val", "�������ڵ�");
			title.put("ORGNAME1", "�ֵ�/����");
			title.put("ORGNAME2", "����/��");
			title.put("DIAGNOSE_NAME,val", "��������");
			title.put("HOSPITAL_NAME,val", "ҽԺ����");
			session.put("title", title);
			cur_page = "1";
		} else {
			sql = (String) session.get("sql");
		}
		tempmembers = tempService.findAfterapprove(sql,
				new BigDecimal(cur_page).intValue(),
				"page/temp/queryafterapprove.action");
		setToolsmenu(tempService.getToolsmenu());
		// ��ȡ����
		if (6 == organizationId.length() || 8 == organizationId.length()) {
			if (2 == organizationId.length()) {
				orgs = systemDataService.findOrganizationExt(organizationId);
			} else {
				orgs = systemDataService.findOrgParentAndChilds(organizationId);
			}
		}
		return SUCCESS;
	}
	
	@SuppressWarnings("rawtypes")
	public String queryaftermembersgsinit() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		String org = "";
		if(organizationId.length()>6){
			org = organizationId.substring(0, 6);
		}else{
			org = organizationId;
		}
		OrgEnabledDTO oe = authorityService.queryEnabled(org);
		if(oe.getTempSts()==1){
			if (6 == organizationId.length() || 8 == organizationId.length()) {
				if (2 == organizationId.length()) {
					orgs = systemDataService.findOrganizationExt(organizationId);
				} else {
					orgs = systemDataService.findOrgParentAndChilds(organizationId);
				}
			}
			return SUCCESS;
		}else{
			result = "δ���������ߣ�";
			return "result";
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String queryaftermembersgs() {
		Map session = ActionContext.getContext().getSession();
		UserDTO user = (UserDTO) session.get("user");
		String organizationId = user.getOrganizationId();
		String sql = "";
		if (null == cur_page || "".equals(cur_page)) {

			String var = value;
			String jwhere = "";
			if (!"".equals(var)) {
				if ("=".equals(operational)) {
					var = " = '" + var + "'";
				} else if ("like".equals(operational)) {
					var = "like  '%" + var + "%'";
				} else {
					var = "";
				}
				if ("SSN".equals(term)) {
				} else if ("FAMILYNO".equals(term)) {
					jwhere = jwhere + " and family_no  " + var;
				} else if ("MEMBERNAME".equals(term)) {
					jwhere = jwhere + " and  name  " + var;
				} else if ("PAPERID".equals(term)) {
					jwhere = jwhere + " and  id_card " + var;
				} else {
				}
			}
			if ((opertime1.equals("") || null == opertime1)
					&& (opertime2.equals("") || null == opertime2)) {
			} else if (opertime1.equals("") || null == opertime1) {
				jwhere = jwhere + " and jz.assist_time > TO_DATE('"
						+ opertime2.substring(0, 10)
						+ " 23:59:59', 'yyyy-MM-dd hh24:mi:ss')";

			} else if (opertime2.equals("") || null == opertime2) {
				jwhere = jwhere + "and jz.assist_time < TO_DATE('"
						+ opertime1.substring(0, 10)
						+ " 00:00:00', 'yyyy-MM-dd hh24:mi:ss') ";

			} else {
				jwhere = jwhere + " and jz.assist_time BETWEEN TO_DATE('"
						+ opertime1.substring(0, 10)
						+ " 00:00:00', 'yyyy-MM-dd hh24:mi:ss') AND TO_DATE('"
						+ opertime2.substring(0, 10)
						+ " 23:59:59', 'yyyy-MM-dd hh24:mi:ss')";
			}
			if ((opertime3.equals("") || null == opertime3)
					&& (opertime4.equals("") || null == opertime4)) {
			} else if (opertime3.equals("") || null == opertime3) {
				jwhere = jwhere + " and jz.oper_time > TO_DATE('"
						+ opertime4.substring(0, 10)
						+ " 23:59:59', 'yyyy-MM-dd hh24:mi:ss')";

			} else if (opertime4.equals("") || null == opertime4) {
				jwhere = jwhere + "and jz.oper_time < TO_DATE('"
						+ opertime3.substring(0, 10)
						+ " 00:00:00', 'yyyy-MM-dd hh24:mi:ss') ";

			} else {
				jwhere = jwhere + " and jz.oper_time BETWEEN TO_DATE('"
						+ opertime3.substring(0, 10)
						+ " 00:00:00', 'yyyy-MM-dd hh24:mi:ss') AND TO_DATE('"
						+ opertime4.substring(0, 10)
						+ " 23:59:59', 'yyyy-MM-dd hh24:mi:ss')";
			}
			if ("".equals(impl)) {

			} else if ("1".equals(impl)) {
				jwhere = jwhere + " and (jz.implsts is null or jz.implsts='1')";
			} else if ("2".equals(impl)) {
				jwhere = jwhere + " and jz.implsts ='2'";
			}
			if (app == null || "".equals(app)) {
			} else {
				jwhere = jwhere + " and biz_status = '" + app + "'";
			}
			if (null == assistype || "".equals(assistype)) {

			} else {
				jwhere = jwhere + " and jz.assist_type = '" + assistype + "'";
			}
			if (null == ds || "".equals(ds)) {

			} else {
				jwhere = jwhere + " and jz.member_type = '" + ds + "'";
			}
			if (oid == null || "".equals(oid)) {
				jwhere = jwhere + " and  family_no like '" + organizationId
						+ "%' ";
			} else {
				jwhere = jwhere + " and  family_no like '" + oid + "%' ";
			}
			sql = "select biz_id, hospital_name, assist_type, jz.organization_id, member_id, member_type, "
					+ "personstate, assist_type_m, "
					+ "family_no as familyno, family_address, name as membername, sex, id_card as paperid , begin_time, diagnose_name, end_time, assist_time, "
					+ "pay_total, pay_medicare, pay_outmedicare, pay_assist, pay_ciassist, biz_status, oper_time, jz.assist_typex, "
					+ " decode(jz.biz_status,0,'��ͬ��',1,'ͬ��',-1,'������')  as bizStatusText, decode(jz.implsts,2,'�ѷ���','δ����') as implstsText, "
					+ " decode(jz.assist_type,'1','����','2','סԺ',null) as assist_type_text ,"
					+ " (decode(jz.member_type, '1', '����', '2', 'ũ��', null) || "
					+ " decode(substr(jz.assist_type_m, 1, 1), "
					+ " 1, "
					+ " '-�ڱ���', "
					+ " 2, "
					+ " '-�ڱ���', "
					+ " null) || "
					+ " decode(substr(jz.assist_type_m, 3, 1), 1, '-������Ա', null) || "
					+ " decode(substr(jz.assist_type_m, 4, 1), 1, '-�屣��', null) || "
					+ " decode(substr(jz.assist_type_m, 5, 1), 1, '-�Ÿ�����', null) || "
					+ " decode(substr(jz.assist_typex, 1, 1), 1, '-�¶�', null)) as meminfo,"
					+ "org1.orgname as org1, "
					+ "org2.orgname as org2, "
					+ "org3.orgname as org3  from jz_medicalafter jz"
					+ " left join manager_org org1 on org1.depth = 3 and substr(jz.family_no,0,6)=org1.organization_id "
					+ " left join manager_org org2 on org2.depth = 4 and substr(jz.family_no,0,8)=org2.organization_id "
					+ " left join manager_org org3 on org3.depth = 5 and substr(jz.family_no,0,10)=org3.organization_id "
					+ "where 1=1  and jz.person_typeex in (3,4) " + jwhere + "  order by oper_time desc  ";
			session.put("sql", sql);
			cur_page = "1";
			HashMap title = new HashMap();
			title.put("FAMILYNO,val", "��ͥ���");
			title.put("MEMBERNAME,val", "����");
			title.put("PAPERID,val", "���֤��");
			title.put("MEMINFO,val", "������");
			title.put("DIAGNOSE_NAME,val", "��������");
			title.put("PAY_TOTAL,val", "�ܷ���");
			title.put("PAY_MEDICARE,val", "ͳ��");
			title.put("PAY_CIASSIST,val", "�󲡱��շ���");
			title.put("PAY_ASSIST,val", "ҽ�ƾ���");
			title.put("PAY_OUTMEDICARE,val", "Ŀ¼�����");
			title.put("HOSPITAL_NAME,val", "����ҽԺ");
			title.put("ORG1,val", "����");
			title.put("ORG2,val", "����");
			title.put("ORG3,val", "����/�ֵ�");
			title.put("ASSIST_TIME,val", "����ʱ��");
			title.put("OPER_TIME", "����ʱ��");
			title.put("BIZSTATUSTEXT,val", "����״̬");
			title.put("ASSIST_TYPE_TEXT,val", "��������");
			title.put("IMPLSTSTEXT,val", "����״̬");
			session.put("title", title);
		} else {
			sql = (String) session.get("sql");
		}
		tempmembers = tempService.findAfterapprovedone(sql, new BigDecimal(
				cur_page).intValue(), "page/temp/queryaftermembersgs.action");
		setToolsmenu(tempService.getToolsmenu());
		// ��ȡ����
		if (6 == organizationId.length() || 8 == organizationId.length()) {
			if (2 == organizationId.length()) {
				orgs = systemDataService.findOrganizationExt(organizationId);
			} else {
				orgs = systemDataService.findOrgParentAndChilds(organizationId);
			}
		}
		return SUCCESS;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public SystemDataService getSystemDataService() {
		return systemDataService;
	}

	public void setSystemDataService(SystemDataService systemDataService) {
		this.systemDataService = systemDataService;
	}

	public YljzService getYljzService() {
		return yljzService;
	}

	public void setYljzService(YljzService yljzService) {
		this.yljzService = yljzService;
	}

	public TempService getTempService() {
		return tempService;
	}

	public void setTempService(TempService tempService) {
		this.tempService = tempService;
	}

	public TempDTO getTempDTO() {
		return tempDTO;
	}

	public void setTempDTO(TempDTO tempDTO) {
		this.tempDTO = tempDTO;
	}

	public List<TempDTO> getTempmembers() {
		return tempmembers;
	}

	public void setTempmembers(List<TempDTO> tempmembers) {
		this.tempmembers = tempmembers;
	}

	public List<OrganizationDTO> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<OrganizationDTO> orgs) {
		this.orgs = orgs;
	}

	public List<DictDTO> getNations() {
		return nations;
	}

	public void setNations(List<DictDTO> nations) {
		this.nations = nations;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public List<DeptDTO> getDepts() {
		return depts;
	}

	public void setDepts(List<DeptDTO> depts) {
		this.depts = depts;
	}

	public List<DiagnoseTypeDTO> getDiagnosetypes() {
		return diagnosetypes;
	}

	public void setDiagnosetypes(List<DiagnoseTypeDTO> diagnosetypes) {
		this.diagnosetypes = diagnosetypes;
	}

	public List<OutIcdDTO> getOuticds() {
		return outicds;
	}

	public void setOuticds(List<OutIcdDTO> outicds) {
		this.outicds = outicds;
	}

	public OrgSetDTO getOrgSetDTO() {
		return orgSetDTO;
	}

	public void setOrgSetDTO(OrgSetDTO orgSetDTO) {
		this.orgSetDTO = orgSetDTO;
	}

	public List<TempDTO> getPayviews() {
		return payviews;
	}

	public void setPayviews(List<TempDTO> payviews) {
		this.payviews = payviews;
	}

	public String getCur_page() {
		return cur_page;
	}

	public void setCur_page(String cur_page) {
		this.cur_page = cur_page;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getOperational() {
		return operational;
	}

	public void setOperational(String operational) {
		this.operational = operational;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getToolsmenu() {
		return toolsmenu;
	}

	public void setToolsmenu(String toolsmenu) {
		this.toolsmenu = toolsmenu;
	}

	public String getAssistype() {
		return assistype;
	}

	public void setAssistype(String assistype) {
		this.assistype = assistype;
	}

	public AfterDTO getAfterDTO() {
		return afterDTO;
	}

	public void setAfterDTO(AfterDTO afterDTO) {
		this.afterDTO = afterDTO;
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public AuthorityService getAuthorityService() {
		return authorityService;
	}

	public void setAuthorityService(AuthorityService authorityService) {
		this.authorityService = authorityService;
	}

	public String getOpertime1() {
		return opertime1;
	}

	public void setOpertime1(String opertime1) {
		this.opertime1 = opertime1;
	}

	public String getOpertime2() {
		return opertime2;
	}

	public void setOpertime2(String opertime2) {
		this.opertime2 = opertime2;
	}

	public String getOpertime3() {
		return opertime3;
	}

	public void setOpertime3(String opertime3) {
		this.opertime3 = opertime3;
	}

	public String getOpertime4() {
		return opertime4;
	}

	public void setOpertime4(String opertime4) {
		this.opertime4 = opertime4;
	}

	public String getImpl() {
		return impl;
	}

	public void setImpl(String impl) {
		this.impl = impl;
	}

	public String getDs() {
		return ds;
	}

	public void setDs(String ds) {
		this.ds = ds;
	}
}
