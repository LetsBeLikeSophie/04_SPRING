<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.board.vo.BoardVO" %> 
<%@ page import="java.util.List" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD SELECT</title>
<style type="text/css">
	div {
			margin: 50px 0px 0px 100px;
		}
	.mem{ text-align: center;}
</style>
<!-- nhn 웹에디터  -->
<script type="text/javascript" src="/testSpring3/common/webedit/dist/js/service/HuskyEZCreator.js" charset="UTF-8"></script>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		
		// 비밀번호 확인
		$(document).on("click", "#pwbtn", function(){
			alert("pwbtn >>> : ");

			let idcheckURL = "boardIdCheck.h";
			let method = "POST";
			let dataParam = {
				sbnum: $("#sbnum").val(),
				sbpw: $("#sbpw").val(),
			};
			//dataParam = $("#boardUpdateForm").serialize();
			alert("dataParam >>> : " + dataParam);
			
			$.ajax({
				url: idcheckURL,
				type: method,
				data: JSON.stringify(dataParam),
	            contentType: "application/json;",
	            dataType: "json",
				success: whenSuccess,
				error: whenError
			});
			
			function whenSuccess(e){
				alert("e >>> : " + e);				
			}
			function whenError(){
				
			}
		});
	
		var oEditors = {};
		$(function(){
			nhn.husky.EZCreator.createInIFrame({
				oAppRef : oEditors,
				elPlaceHolder : "sbcontent", // textarea id 				
				sSkinURI : "/testSpring3/common/webedit/dist/SmartEditor2Skin.html", // SmartEditor2Skin.html 에디터 스킨 				
				fCreator : "createSEditor2"
			});
		});
		//  U
		$(document).on("click", "#U", function(){
			//alert("U >>> : ");	
			oEditors.getById["sbcontent"].exec("UPDATE_CONTENTS_FIELD", []);
			$("#boardUpdateForm").attr({ "method":"POST"
				                        ,"action":"boardUpdate.h"}).submit();
		});
		//  D
		$(document).on("click", "#D", function(){
			//alert("D >>> : ");
			oEditors.getById["sbcontent"].exec("UPDATE_CONTENTS_FIELD", []);
			$("#boardUpdateForm").attr({ "method":"POST"
				                        ,"action":"boardDelete.h"}).submit();
		});
	});
</script>	
</head>
<body>
BOARD SELECT
<hr>
<% request.setCharacterEncoding("UTF-8");%> 
<%
	Object obj = request.getAttribute("listS");
	List<BoardVO> list = (List)obj;
	BoardVO bvo = null;
	if (list.size() == 1) {
		bvo = list.get(0);
	};
%>
<div>
<form name="boardUpdateForm" id="boardUpdateForm">
<table border=1>
<tr>
<td colspan="2" align="center">게시판 글수정하기</td>
</tr>
<tr>
<td class="mem">글번호</td>
<td><input type="text" name="sbnum" id="sbnum" value="<%= bvo.getSbnum() %>" readonly/></td>
</tr>

<tr>
<td class="mem">제목</td>
<td>
<input type="text" name="sbsubject" id="sbsubject" value="<%= bvo.getSbsubject() %>" style="width:100px"  readonly/>
</td>
</tr>
<tr>
<td class="mem">이름</td>
<td><input type="text" name="sbname" id="sbname" value="<%=  bvo.getSbname() %>" readonly/></td>
</tr>

</tr>	 
<tr>
<td class="mem">소개글</td>
<td>
<textarea name="sbcontent" id="sbcontent" rows="5" cols="50"><%= bvo.getSbcontent() %>					
</textarea>
</td>
</tr>
<tr>
<td class="mem">사진</td>
<td> 
<img src="/testSpring3/imgupload/sm_<%= bvo.getSbfile() %>" border="1" width="40" height="50" alt="image">
</td>
</tr>
</tr>
<td class="mem">등록일</td>
<td> 
<input type="text" name="sbinsertdate" id="sbinsertdate" value="<%= bvo.getSbinsertdate() %>" readonly />		      
</td>
</tr>	 
<td class="mem">수정일</td>
<td> 
<input type="text" name="sbupdatedate" id="sbupdatedate" value="<%= bvo.getSbupdatedate() %>" readonly />		      
</td>
</tr>
<tr>
<td class="mem">패스워드</td>
<td>
<input type="text" name="sbpw" id="sbpw"  />
<button type="button" id="pwbtn">비밀번호</button>

</td>	 	 
<tr>
<td colspan="2" align="right"> 		
<button type="button" id="U">수정</button>
<button type="button" id="D">삭제</button>
</td>				
</tr>
</table>
</form>
</div>
</body>
</html>