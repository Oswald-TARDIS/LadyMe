<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/login.css">
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="js/script.js" ></script>
<title>LadyMe</title>
</head>
<body>
<div class=div_login>
	<form action="UserController?action=logIn" id="contact" method="post">

		<!-- Logo, title and informative content -->

		<h1 id="title">登陆</h1>
		<!-- Form fields wrapper -->
		<div id="wrapper" class="clearfix">

			<!-- Name -->
			<input type="text" class="has_icon" name="id" placeholder="ID/用户名" required>
			<div class="icon-user"></div>

			<!-- Email -->
			<input type="password"  class="has_icon" name="passwd" placeholder="密码" required>
			<div class="icon-passwd"></div> 
			 <!-- code -->
			<table style="position: relative;right: 3px;"><tr> 
			<td><input type="text" class="has_icon" name="code" placeholder="输入验证码"/></td>
			<td><img style="position: relative;bottom:7px;" src="number.jsp"/></td></tr>
			</table>
			<!-- Submit -->
			<table>
			<tr><td><input type="radio"   name="type" value="司机" ></td><td><font style="font-size: 13px;position: relative; bottom: 9px;">车主</font></td>
			<td><input type="radio"   name="type" value="货主" checked></td><td><font style="font-size: 13px;position: relative; bottom: 9px; ">货主</font></td>
			</table>
			<button id="submit" type="submit" >
				<i class="icon-chat"></i> 登陆
			</button>

		</div>

	</form>

</div>
</body>
</html>