<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<html>
<head>
<meta charset="EUC-KR">
<title>�α��� Ȯ�� ȭ��</title>
<style type="text/css">
	div{
		font: 12px "����";
	}
</style>
</head>
<body>
<div align="center" class="body">
<h3>�α���  �Է� ������</h3>
<form:form commnadName="userVO" method="POST">
<table width="250" border="1">
	<tr>
		<th>�� �� �� </th>
		<td align="center">${userVO.m_uid}</td>
	</tr>
	<tr>
		<th>��й�ȣ </th>
		<td align="center">${userVO.m_pwd}</td>
	</tr>					
</table>
</form:form>
</div>
</body>
</html>