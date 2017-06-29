<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>更新内容入力画面</title>

</head>
<body>
	<p>
		１箇所以上の項目を変更してください<br> ※日付は変更できません
	</p>

	<form:form action="SupdateConfirm" modelAttribute="Supdate" method="post">
		<fieldset>
			<div>
				<label>日付</label><form:input path="ndate" value= "${date}" disabled="true"/>
				<form:hidden path="date"/>
			</div>
			<div>
				<label>場所</label><form:input path="nevent" value="${event}"/>
			</div>

		</fieldset>
		<div>
			<input type="submit" name="button" value="確認"> <input
				type="submit" name="button" value="戻る"
				onclick="location.href='update'; return false;">
		</div>
	</form:form>
	<div>
		<p>
			<font color="red"> <c:if test="${not empty msg}">
					<p>${msg}</p>
				</c:if>
			</font>

		</p>
		<a href="menu">メニューに戻る</a>
	</div>
</body>
</html>
