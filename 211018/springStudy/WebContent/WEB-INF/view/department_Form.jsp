<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>�а� ���̺�</title>
<style type="text/css">
	.required{ color: red;}
</style>
<script type="text/javascript">
	function insertData(){
		if(!validateForm()) 
			return;
		
		if (confirm('����� �����Ͻðڽ��ϰ�?')){
			deptForm.action = "/springStudy/department_insert.h";
			deptForm.submit();
		}
	}
	
	function validateForm(){
		if (deptForm.deptid.value.replace(/\s/g, "") == ""){
			alert('�а��ڵ带 �Է����ּ���.');
			return false;
		}
		if (deptForm.deptname.value.replace(/\s/g, "") == ""){
			alert('�а��� �Է����ּ���.');
			return false;
		}
		return true;
	}

</script>
</head>
<body>
<div>
<form id="deptForm" name="deptForm" method="POST">
<table border="1">
<thead>
	<tr>
		<td colspan="2" align="center">
		<h4>�а� ���̺� [Spring]</h4>
		</td>
	</tr>
</thead>
<tbody>
	<tr>
		<th width="100">
			<span class="required">*</span>�а��ڵ�
		</th>
		<td width="300">
			<input type="text" id="deptid" name="deptid" size="52" />
		</td>
	</tr>
	<tr>
		<th width="100">
			<span class="required">*</span>�а���
		</th>
		<td width="300">
			<input type="text" id="deptname" name="deptname" size="52" />
		</td>
	</tr>
	<tr>
		<th width="100">
			<span class="required">*</span>��ȭ��ȣ
		</th>
		<td width="300">
			<input type="text" id="depttel" name="depttel" size="52" />
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="button" id="Insert" value="���" onclick="insertData()" />
		</td>
	</tr>				
</tbody>
</table>
</form>
</div>

</body>
</html>