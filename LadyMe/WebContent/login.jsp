<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/login.css">
<title>LadyMe</title>
</head>
<body>
<div class=div_login>
	<form action="UserController?action=logIn&type=司机" id="contact" method="post">

		<!-- Logo, title and informative content -->

		<h1 id="title">登陆</h1>
		<!-- Form fields wrapper -->
		<div id="wrapper" class="clearfix">
			<!-- Name -->
			<input type="text" class="has_icon" name="name" placeholder="用户名" required>
			<div class="icon-user"></div>

			<!-- Email -->
			<input type="password"  class="has_icon" name="passwd" placeholder="密码" required>
			<div class="icon-passwd"></div> 
			<!-- Submit -->
			<button id="submit" type="submit" >
				<i class="icon-chat"></i> 登陆
			</button>

		</div>

	</form>

</div>
</body>
</html>