<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>�а� ���̺� �˾�</title>
<style type="text/css">
	.required {color:red;}
	table {width:400px;}
	table th {width:120px; text-align:left;}
	input[type="text"] {width:300px;}
</style>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		
		var mode = "${mode}";
		if (mode == "insert"){
			$("#insertData").attr('disabled', false);
			$("#updateData").attr('disabled', true);
			$("#deleteData").attr('disabled', true);
		}else if (mode == "update"){
			$("#insertData").attr('disabled', true);
			$("#updateData").attr('disabled', false);
			$("#deleteData").attr('disabled', false);			
		}
		
		$("#insertData").click(function(){
			if(!validateForm()) return;
			if (confirm('����� �����ұ��?')){
				$("#deptForm").attr("action", "insertDepartment.h");					
				$("#deptForm").submit();
			}
		});
		
		$("#updateData").click(function(){
			if(!validateForm()) return;
			if (confirm('������ �����ұ��?')){
				$("#deptForm").attr("action", "updateDepartment.h");			
				$("#deptForm").submit();
			}
		});
		
		$("#deleteData").click(function(){
			//if(!validateForm()) return;
			if (confirm('������ �����ұ��?')){
				$("#deptForm").attr("action", "deleteDepartment.h");	
				$("#deptForm").submit();
			}
		});
		
		$("#closeWindow").click(function(){
			window.close();
		});
	});
	
	function validateForm() {
		 if($("#deptid").val().replace(/\s/g,"") == "") {
			 alert('�а��ڵ带 �Է����ּ���.');
			 return false;
		 }
		 if($("#deptname").val().replace(/\s/g,"") == "") {
			 alert('�а����� �Է����ּ���.');
			 return false;
		 }
		 return true;
	}

</script>
</head>
<body>
<p></p>
<div>
<form id="deptForm" name="deptForm" method="GET">
<table board="1">
<thead>
	<tr>
		<td colspan="2" align="center">
			<h4>�а� ���̺� �˾�â [Spring]</h4>
		</td>
	</tr>
</thead>
<tbody>	
	<tr>
		<th><span class="required">*</span>�а��ڵ�</th>
		<td>
			<input type="text" id="deptid" name="deptid" value="${DeptVO.deptid}">
		</td>
	</tr>
	<tr>
		<th><span class="required">*</span>�а���</th>
		<td>
			<input type="text" id="deptname" name="deptname" value="${DeptVO.deptname}">
		</td>
	</tr>
	<tr>
		<th><span class="required">*</span>��ȭ��ȣ</th>
		<td>
			<input type="text" id="depttel" name="depttel" value="${DeptVO.depttel}">
		</td>
	</tr>	
</tbody>
</table>
</form>
</div>
<div>
<p></p>
<table boarder="0">
	<tr align="center">
		<td><input type="button" id="insertData" value="���" /></td>
		<td><input type="button" id="updateData" value="����" /></td>
		<td><input type="button" id="deleteData" value="����" /></td>
		<td><input type="button" id="closeWindow" value="�ݱ�" /></td>						
	</tr>
</table>
</div>
</body>
</html>