<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

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
<link rel="stylesheet" href="CSS/band.css">
<body class=member background="images/live3.jpg">






	<header>
		<h1>Member</h1>
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

	<div>

		<br>
		<br>
		<br> <img src="images/hikaru.jpg" width="256" height="256"
			align="left" alt="hikarugt91"><a
			href="https://twitter.com/hikarugt91" class="twitter"> <i
			class="fa fa-twitter" aria-hidden="false"></i>Twitter
		</a>
		<div class="font">池田光(Vo/Gt)イケメンだけどこども。</div>
	</div>
	<br clear=left>

	<div>
		<img src="images/pai.jpg" width="256" height="256" align="left"
			alt="RASH_JIN"><a href="https://twitter.com/RASH_JIN"
			class="twitter"><i
			class="fa fa-twitter" aria-hidden="false"></i>Twitter</a>
		<div class="font">草野仁(Gt)ギターは上手いけどクズ。</div>
	</div>
	<br clear=left>

	<div>
		<img src="images/honjo.jpg" width="256" height="256" align="left"
			alt="xurabu"> <a href="https://twitter.com/xurabu"
			class="twitter"><i
			class="fa fa-twitter" aria-hidden="false"></i>Twitter</a>
		<div class="font">本庄拓也(Ba)ベースが上手いゴリラ。</div>
	</div>
	<br clear=left>
	<div>
		<img src="images/nkjm.jpeg" width="256" height="256" align="left"
			alt="plump3_nkjm"> <a href="https://twitter.com/plump3_nkjm"
			class="twitter"><i
			class="fa fa-twitter" aria-hidden="false"></i>Twitter</a>
		<div class="font">中嶋将大(Dr)毛深い。</div>
	</div>
	<br clear=left>


</body>

</html>