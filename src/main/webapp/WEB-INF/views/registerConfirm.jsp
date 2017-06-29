<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>登録確認画面</title>

</head>
<body>
	<p>
		<font color="red"> <c:if test="${not empty msg}">
				<p>${msg}</p>
			</c:if>
		</font>

	</p>
	<p>これでよろしいですか？</p>

	<form:form action="registerConfirm" modelAttribute="register"
		method="post">
		<fieldset class="label-110">
			<div>
				<label>日付</label>
				<form:input path="Cdate" value="${date}" disabled="true" />
				<form:hidden path="event" />
			</div>

			<div>
				<label>場所</label>
				<form:input path="Cevent" value="${event}" disabled="true" />
				<form:hidden path="event" />
			</div>
		</fieldset>
		<div>
			<input type="submit" name="button" value="登録"> <input
				type="submit" name="button" value="戻る"
				onclick="location.href='insert'; return false;">
		</div>
	</form:form>
	<div>
		<a href="menu">メニューに戻る</a>
	</div>
</body>
</html>