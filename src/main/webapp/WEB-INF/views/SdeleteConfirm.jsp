<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>削除確認画面</title>

</head>
<body>
	<p>これでよろしいですか？</p>

	<form:form action="Sdelete" modelAttribute="Sdelete" method="post">
		<fieldset>
			<div>
				<label>日付</label>
				<form:input path="date" value="${date}" disabled="true"/>
				<form:hidden path="date" />

			</div>
			<div>
				<label>場所</label>
				<form:input path="event" value="${event}" disabled="true"/>
				<form:hidden path="event" />
			</div>

		</fieldset>
		<div>
			<input type="submit" name="button" value="削除"> <input
				type="submit" name="button" value="戻る"
				onclick="location.href='Sdelete'; return false;">
		</div>
	</form:form>
	<div>
		<a href="menu">メニューに戻る</a>
	</div>
</body>
</html>