<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<title>新規登録</title>

</head>
<body>
	<p>
		<font color="red"> <c:if test="${not empty msg}">
				<p>${msg}</p>
			</c:if>
		</font>

	</p>
	<p>
		<font color="red"> <c:if test="${not empty msg2}">
				<p>${msg2}</p>
			</c:if>
		</font>

	</p>
	<p>
		<font color="red"> <c:if test="${not empty msg3}">
				<p>${msg3}</p>
			</c:if>
		</font>

	</p>
	<p>
		<font color="red"> <c:if test="${not empty msg4}">
				<p>${msg4}</p>
			</c:if>
		</font>

	</p>
	<p>
		<font color="red"> <c:if test="${not empty msg5}">
				<p>${msg5}</p>
			</c:if>
		</font>

	</p>
	<p>
		<font color="blue"> <c:if test="${not empty user}">
				<p>${user}</p>
			</c:if>
		</font>

	</p>
	<p>
		登録情報を入力してください<br> <span class="required"></span>は必須です
	</p>

	<form:form action="newregister" modelAttribute="new" method="post">
		<fieldset class="label-60">
			<div>
				<label class="required">お名前</label>
				<form:input path="name" />
			</div>
			<div>
				<label class="required">希望ID</label>
				<form:input path="id" /><form:errors path = "id" cssStyle = "color: red"/>
			</div>
			<div>
				<label class="required">パスワード</label>
				<form:password path="pass" />
			</div>
			<div>
				<label class="required">パスワード(再入力用)</label>
				<form:password path="repass" />
			</div>
		</fieldset>
		<input type="submit" value="登録">
	</form:form>
	<div>
		<a href="index">ログインに戻る</a>
	</div>
</body>
</html>