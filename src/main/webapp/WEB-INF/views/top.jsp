<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<title>256HP</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#menu li").hover(function() {
			$("ul", this).show();
		}, function() {
			$("ul", this).hide();
		});
	});
</script>
</head>
<link rel="stylesheet" href="/CSS/band.css">
<body class=top background="/images/live2.jpg">







	<header>
		<h1>256 HPdemo</h1>
	</header>

	<div class="menubar">
		<ul id="menu">
			<li><a href="top">HOME</a></li>
			<li><a href="#">Member</a>
				<ul class="sub">
					<li><a href="member">メンバー一覧</a></li>

				</ul></li>
			<li><a href="#">Schedule</a>
				<ul class="sub">
					<li><a href="schedule">スケジュール</a></li>

				</ul></li>
				<li><a href="logout2">ログアウト</a></li>
		</ul>
	</div>



	<br><br><br><br>


<h1 style="padding-left:125px">NEWS!</h1>
<div class="box11" style="float:left;">

	<p>…今週どうやら給料日らしい<br><br><br><br><br><br></p>
</div>

<br><br><br><br><br>
<div style="float:right;" class="youtube">
<h1 style="padding-left:175px">VIDEO</h1>
		<iframe class="frame" width="560" height="315"
			src="https://www.youtube.com/embed/kFKyTYAGfpU" frameborder="0"
			allowfullscreen></iframe>

	</div>
</body>

</html>