<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="css/nivo-slider.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="css/imgStyle.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="themes/default/default.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="themes/light/light.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="themes/dark/dark.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="themes/bar/bar.css" type="text/css"
	media="screen" />
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<title>LadyMe</title>
</head>
<c:if test="${empty goodPage}">
<c:redirect url="SendController?action=getGoodPage&page=1"/>
</c:if>
<body id=body_main>
	<div id=div_head>
		<a href=index.jsp class=guide_ahref><div id=div_guide>首页</div></a> <a
			href=index.jsp class=guide_ahref><div id=div_guide>公司新闻</div></a> <a
			href=index.jsp class=guide_ahref><div id=div_guide>行业新闻</div></a> <a
			href=index.jsp class=guide_ahref><div id=div_guide_now>供求信息</div></a>
		<a href=index.jsp class=guide_ahref><div id=div_guide>联系我们</div></a> <a
			href=index.jsp class=guide_ahref><div id=div_guide_right>
				<img src="img/userIco/default.png"
					style="width: 36px; height: 36px; float: left; margin-left: 4px; margin-top: 2px;" />${user.name}
			</div></a> <a href=UserController?action=logout class=guide_ahref><div
				id=div_guide_right>注销</div></a> <a href=personal.jsp class=guide_ahref><div
				id=div_guide_right>会员中心</div></a>
	</div>
	<div id="wrapper">
		<div class="slider-wrapper theme-default">
			<div id="slider" class="nivoSlider">
				<img src="img/bank002.jpg" id=img_band alt="" data-transition="fade" />
				<img src="img/bank003.jpg" id=img_band alt="" data-transition="fade" />
				<img src="img/bank004.jpg" id=img_band alt="" data-transition="fade" />
			</div>
		</div>
	</div>
<div id=div_info>
    		<div style="width:2%;height:38px;float:left;background:#3169ee"></div>
    		<font class=font_title style="text-align:left;">货源中心</font>
    		<font style="color:#aaa;">Center of Supply</font>
    		<hr noshade size=1 align=center width=100% color="#3169ee">
    		<table style="width:100%">
    		<tr>
    			<td style="width:25%;text-align: center;">始发地</td>
    			<td style="width:25%;text-align: center;">目的地</td>
    			<td style="width:20%;text-align: center;">货物类型</td>
    			<td style="width:15%;text-align: center;">发布时间</td>
    			<td style="width:15%;text-align: center;">操作</td>
    		</tr>
    		
    		<c:forEach items="${goodPage}" var="iS">
    		<tr>
   				<td style="text-align: center;">${iS.origin_place}</td>
    			<td style="text-align: center;">${iS.destination}</td>
    			<td style="text-align: center;">${iS.good_type}</td>
    			<td style="text-align: center;">${iS.time}</td>
    			<td style="text-align: center;"><a href="SendController?action=getGood&id=${iS.id}">查看详情</a></td>
   			</tr>
    		</c:forEach>
    		</table>
    	</div>
	<div id=bottom>
		<div
			style="margin: 0 auto; width: 60%; font-size: 14px; text-align: center;">
			Copyright © 2012-2015 <img src="img/LOGO.png"
				style="width: 14px; height: 14px;" /> 二蛋货运有限公司. All rights
			reserved.沪ICP备10005645 <a id=contect href="#">联系我们</a>
		</div>
	</div>

</body>
</html>