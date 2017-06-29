<!DOCTYPE html>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.1/css/bootstrap-datepicker.min.css">
<title>予約状況</title>
<link rel="stylesheet" href="CSS/band.css">
</head>
<body>

	  <p>
		<font color="red"> <c:if test="${not empty msg}">
				<p>${msg}</p>
			</c:if>
		</font>

	</p>
	<!-- datepicker -->
	<div class="container">

		<div class="form-group">

 <form:form action="reserved" modelAttribute="reserved" method="post">
		<fieldset>
			<div>

			</div>

		</fieldset>
		<form:input class="form-control datepicker1" path="date"
					placeholder="日付" />
		<input type="submit" value="検索">
	</form:form>
	<div>
		<a href="index">TOP画面へ</a>
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
</div>
</div>


</body>
</html>