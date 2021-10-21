<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Spring Hello</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	// alert("ready >>> : ");
	
	// GET 방식
	$(document).on("click", "#getbtn", function(){
		alert("getbtn >>> : 진입 ");
		
		$("#methodForm").attr({
			"action":"helloWorld_get.hbe",
			"method":"GET",
			"enctype":"application/x-www-form-urlencoded"
		}).submit();
	});
	
	// POST 방식
	$(document).on("click", "#postbtn", function(){		
		alert("postbtn >>> : 진입 ");
		
		$("#methodForm").attr({
			"action":"helloWorld_post.hbe",
			"method":"POST",
			"enctype":"application/x-www-form-urlencoded"
		}).submit();
	});
})

</script>
</head>
<body>
<h3>Spring Hello</h3>
<hr>
<a href="helloWorld_Controller_find.hbe">HelloWorld 실행</a><br>
<a href="helloWorld_get.hbe">HelloWorld GET Method 실행</a><br>
<a href="helloWorld_post.hbe">HelloWorld POST Method 실행</a><br>
<form name="methodForm" id="methodForm">
	<button type="button" id="getbtn">GET</button>
	<button type="button" id="postbtn">POST</button>
</form>
</body>
</html>