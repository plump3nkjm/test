<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>登録画面</title>

</head>
<body>
	<p>
		<font color="red"> <c:if test="${not empty msg}">
				<p>${msg}</p>
			</c:if>
		</font>

	</p>
	<p>
		登録情報を入力してください<br> <span class="required"></span>は必須です
	</p>

	<form:form action="register" modelAttribute="register" method="post">
		<fieldset class="label-60">
			<div>
				<label class="required">日付</label>
				<form:input path="date" />
			</div>

			<div>
				<label class="required">場所</label>
				<form:input path="event" />
			</div>
		</fieldset>
		<input type="submit" value="確認">
	</form:form>
	<div>
		<a href="menu">メニューに戻る</a>
	</div>
</body>
</html>