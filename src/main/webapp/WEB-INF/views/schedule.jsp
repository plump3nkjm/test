<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="CSS/band.css">
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.1/css/bootstrap-datepicker.min.css">
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


	<header>

		<h1>schedule</h1>
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
	<div class="container">
	<div align="center">

		<h1>取り置きフォーム</h1>
	</div>

	<!-- datepicker -->


		<div class="form-group">

			<form:form action="list2" modelAttribute="SSselect" method="post">
				<label for="day1">日付を選択してください。</label>
				<p>
				<font color="red" size="7"> <c:if test="${not empty msg}">
						<div style="float:right;">${msg}</div>
					</c:if>
				</font>

			</p>
				<form:input class="form-control datepicker1" path="date"
					placeholder="日付" />

				<input type="submit" value="検索" class="button">
			</form:form>
			<form:form action="schedule">
			<input type="submit" value="リセット" class="button">
			</form:form>

			<!-- スケジュールテーブル表示 -->
			<c:if test="${not empty event}">
				<table border="1" class="table">

					<tr>
						<th>日付</th>
						<th>場所</th>


					</tr>
					<c:forEach var="user" items="${event}">
						<tr>
							<td>${user.date}</td>
							<td>${user.event}</td>

						</tr>
					</c:forEach>
				</table>
			</c:if>



		</div>




	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<!-- Datepicker for Bootstrap -->
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.1/js/bootstrap-datepicker.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.1/locales/bootstrap-datepicker.ja.min.js"></script>

	<script>
		/* $('.datepicker1').datepicker('setDaysOfWeekHighlighted','daysOfWeekHighlighted(2017/06/17)'); */
		$('.datepicker1').datepicker({

			format : "m/d",
			language : "ja",
			autoclose : true,
			orientation : 'bottom left',
			clearBtn : true,

			todayHighlight : true,
			//日付表示前に行う処理
			beforeShowDay: function(date) {
			      var myDate = new Object();
			      if (date.getDay()==0) {
			        myDate.enabled = true;
			        myDate.classes = 'class-sunday';
			        myDate.tooltip  = '日曜日';
			      } else if (date.getDay() == 6) {
			        myDate.enabled = true;
			        myDate.classes = 'class-saturday';
			        myDate.tooltip  = '土曜日';
			      } else {
			        myDate.enabled = true;
			        myDate.classes = 'class-weekday';
			        myDate.tooltip  = '平日';
			      }
			      return myDate;
			    }

		});
	</script>
	<!-- datepicker end -->

	<div id="result"></div>


	<div align="center"></div>
	<article>
		<div align="center">
			<form:form action="reserve" modelAttribute="reserve" method="post">
				<p>
					<label>お名前</label><br>
					<form:input path="name" placeholder="しじみちゃん"  />
					<br> <br><label>日にち</label><br>
					<form:input path="date" placeholder="1/1"  />
					<br> <br><label>場所</label><br>
					<form:input path="event" placeholder="高井戸"  />
					<br> <br><label>枚数</label><br>
					<form:input path="ticket" placeholder="1"  />
					<br> <input type="submit" value="予約" class="button">

				</p>
			</form:form>

		</div>

	</article>
	</div>
</body>

</html>