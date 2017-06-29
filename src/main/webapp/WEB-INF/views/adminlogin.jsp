<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

   <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link href="/CSS/commons.css" rel="stylesheet">
<title>管理者ログイン画面</title>

</head>
<body>
	 <p>
		<font color="red"> <c:if test="${not empty msg}">
				<p>${msg}</p>
			</c:if>
		</font>

	</p>
 <form:form action="adminlogin" modelAttribute="login" method="post">
		<fieldset>
			<div>
				<label>ID</label><form:input  path="aid" />
			</div>
			<div>
				<label>PASS</label><form:password path="apass" />
			</div>
		</fieldset>
		<input type="submit" value="ログイン">
	</form:form>
	<div>
		<a href="index">TOP画面へ</a>
	</div>
</body>
</html>
