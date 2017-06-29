<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<title>更新内容確認画面</title>

<style>
.col {
	float: left;
}

.col-clear {
	clear: both;
}

#arrow {
	margin-top: 60px;
}
</style>
</head>
<body>
	<p>
		<font color="red"> <c:if test="${not empty msg}">
				<p>${msg}</p>
			</c:if>
		</font>

	</p>
	<p>これでよろしいですか？</p>

	<form:form action="Supdate" modelAttribute="Supdate" method="post">


		<fieldset class="col">
			<legend>変更前</legend>
			<div>
				<label>日付</label><form:input  value="${date}" path="date" disabled="true"/>
			</div>
			<div>
				<label>場所</label><form:input value="${event}" path="event" disabled="true"/>
			</div>

		</fieldset>

		<div id="arrow" class="col">⇒</div>

		<fieldset class="col label-110">
			<legend>変更後</legend>
			<div>
				<label>日付</label><form:input path="newdate" value="${newdate}" disabled="true"/>
				<form:hidden path="newdate"/>
			</div>
			<div>
				<label>場所</label><form:input path="newevent" value="${newevent}" disabled="true"/>
				 <form:hidden path="newevent"/>
			</div>

		</fieldset>

		<div class="col-clear">
			<input type="submit" name="button" value="更新"> <input
				type="submit" name="button" value="戻る"
				onclick="location.href='updateInput'; return false;">
		</div>
	</form:form>
	<div>
		<a href="menu">メニューに戻る</a>
	</div>
</body>
</html>