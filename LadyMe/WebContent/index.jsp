<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>LadyMe</title>
<script src="js/script.js" ></script>
</head>
<body>
<div id=div_head>
	<a href=index.jsp class=guide_ahref><div id=div_guide_now>首页</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>导航二</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>导航三</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>导航四</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_right>
		<img src="" style="width:25px;height: 25px;float:left;margin-left:10px;margin-top:3px;"/>用户名
	</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_right>会员中心</div></a>
</div>
<div id=div_usign>
	<center><div id=su onclick="showUsign()">展开</div></center>
	<center><div style="font-size: 30px;color:#3169ee;">赶快加入二蛋货运网!</div></center>
	<center><table>
	<tr><td><div id=div_register>注册</div></td><td><div id=div_login>登录</div></td></tr>
	</table></center>
	<center><div style="font-size:20px;color:#3169ee;position: relative;top:20px;" onclick="offUsign()">收起</div></center>
</div>
<div id=cover>
	<div id=div_band>
		<img src="img/001.jpg" alt="" id=img_band/>
	</div>
	<div>
		
	</div>
</div>
</body>
</html>