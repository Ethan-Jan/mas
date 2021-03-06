<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="page/css/table-style.css" type="text/css"></link>
<title>五保户查询</title>
</head>
<body>
<TABLE width="100%" border=0 cellspacing="2" bgcolor="#FCFDFF"
	align="center">
	<TR>
		<TD vAlign=top align=center>
		<TABLE width="100%" border=1 cellspacing="0" bordercolor="#CBDCEE">
			<tr id="searchTable">
				<td>
				<table width="100%" class="areaBorder">
					<tr>
						<td><s:form action="queryguarantee"
							method="post" theme="simple">
							<table width="99%" border="0" align="center">
								<tr>
									<td align="left">选择机构：<s:select name="oid" list="orgs"
										listKey="organizationId" listValue="orgname"></s:select>&nbsp;&nbsp;查询条件：
									<s:select value="term" name="term"
										list="#{'':'全部','SSN':'五保户证号','FAMILYNO':'家庭编号','MEMBERNAME':'姓名','PAPERID':'身份证号'}"
										label="查询条件：" listKey="key" listValue="value">
									</s:select> &nbsp;&nbsp;操作符： <s:select value="operational"
										name="operational" list="#{'=':'等于','like':'相似于'}"
										label="操作符：" listKey="key" listValue="value">
									</s:select>&nbsp;&nbsp;查询值： <s:textfield name="value"></s:textfield>&nbsp;&nbsp;
									人员状态：<s:select value="a4" name="a4"
										list="#{'':'全部','1':'五保户','0':'非五保户'}"
										label="人员状态：" listKey="key" listValue="value"></s:select>&nbsp;&nbsp;
									<s:submit value="查询"></s:submit></td>
								</tr>
							</table>
						</s:form></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>
				<table align="center" width="100%" class="t2" border="0"
					cellpadding="0" cellspacing="0">
					<tr>
						<th>家庭编号</th>
						<th>姓名</th>
						<th>身份证号</th>
						<th>五保户证号</th>
						<th>身份类别</th>
						<th>供养方式</th>
						<th>所属</th>
						<th>操作</th>
					</tr>
					<s:iterator value="guarantees">
						<tr>
							<td><s:property value="familyno"></s:property></td>
							<td><s:property value="membername"></s:property></td>
							<td><s:property value="paperid"></s:property></td>
							<td><s:property value="ssn"></s:property></td>
							<td><s:property value="health" /></td>
							<td>
							<s:if test="type==1">
							<s:if test="gongyang==2">
							五保户：集中供养
							</s:if> <s:elseif test="gongyang==1">
							五保户：分散供养
							</s:elseif>
							</s:if>
							<s:else>
							非五保户
							</s:else></td>
							<td><s:property value="xianshi"></s:property>
							<s:property value="xiangzheng"></s:property>
							<s:property value="orgname"></s:property></td>
							<td>
							<a href="page/guarantee/editguaranteeinit.action?memberId=<s:property value="memberId"/>&ds=<s:property value="ds"/>&type=edit" target="_blank">修改</a>&nbsp;&nbsp;
							<%-- <a href="page/guarantee/editguaranteeinit.action?memberId=<s:property value="memberId"/>&ds=<s:property value="ds"/>&type=del" target="_blank">删除</a> --%>
							</td>
						</tr>
					</s:iterator>
				</table>
				</td>
			</tr>
		</TABLE>
		</TD>
	</TR>
	<tr>
		<td>
		<div align="center"><s:property value="toolsmenu" escape="fasle" /></div>
		</td>
	</tr>
</TABLE>
</body>
</html>