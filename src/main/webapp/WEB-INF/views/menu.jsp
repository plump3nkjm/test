<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<title>メニュー画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>

	<p>${adminname}さん、こんにちは</p>

	<p>
		<a href="Sselect">スケジュール検索</a>
	</p>
	<p>
		<a href="register">スケジュール登録</a>
	</p>
	<p>
		<a href="Supdate">スケジュール更新</a>
	</p>
	<p>
		<a href="Sdelete">スケジュール削除</a>
	</p>
	<p>
		<a href="Sreserve">予約状況</a>
	</p>
	<form action="logout" method="post">
		<input type="submit" value="ログアウト">
	</form>

</body>
</html>