<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α��� �Է� ȭ��</title>
<style type="text/css">
	div{
		font: 12px "����";
	}
</style>
</head>
<body>
<div align="center" class="body">
<h3>�α��� �Է� ȭ��</h3>
<form:form commandName="userVO" method="POST" action="loginData.h">
<table width="250" border="1">
	<tr>
		<th>�� �� �� </th>
		<td><form:input path="m_uid" /></td>
	</tr>
	<tr>
		<th>��й�ȣ </th>
		<td><form:password path="m_pwd" /></td>
	</tr>
	<tr>						
		<td colspan="2" align="center">
		<input type="submit" value="�α���" />
	</td>
	</tr>
</table>
</form:form>
</div>
</body>
</html>