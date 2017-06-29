<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<title>検索結果画面</title>

</head>
<body>
	<table border="1">
		<tr>
			<th>日付</th>
			<th>場所</th>


		</tr>
		<c:forEach var="user" items="${event}">
			<tr>
				<td>${fn:escapeXml(user.date)}</td>
				<td>${fn:escapeXml(user.event)}</td>

			</tr>
		</c:forEach>
	</table>
	<div>
		<a href="menu">メニューに戻る</a>
	</div>
</body>
</html>