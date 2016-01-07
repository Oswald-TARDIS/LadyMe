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
<c:if test="${empty infoGoodQueryed}">
	<c:redirect url="SendController?action=getGood&id=1" />
</c:if>
<body id=body_main>
	<div id=div_head>
	<a href=index.jsp class=guide_ahref><div id=div_guide>首页</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>公司新闻</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>行业新闻</div></a>
	<a href=SendController?action=getGoodPage&page=1 class=guide_ahref><div id=div_guide_now>货源信息</div></a>
	<a href=SendController?action=getVehiclePage&page=1 class=guide_ahref><div id=div_guide>车源信息</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>联系我们</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_right>
		<img src="img/userIco/default.png" style="width:36px;height: 36px;float:left;margin-left:4px;margin-top:2px;"/>${user.name}
	</div></a>
	<a href=UserController?action=logout class=guide_ahref><div id=div_guide_right>注销</div></a>
	<a href=personal.jsp class=guide_ahref><div id=div_guide_right>会员中心</div></a>
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
	<div id=div_info style="height: 100%;">
		<div style="width: 2%; height: 38px; float: left; background: #3169ee"></div>
		<font class=font_title style="text-align: left;">货源中心</font> <font
			style="color: #aaa;">Center of Supply</font>
		<hr noshade size=1 align=center width=100% color="#3169ee">
		<table width="866" border="0" cellspacing="0" cellpadding="0"
			class="user_ta" style="margin: 0 auto;">
			<tr>
				<td width="128" height="45" align="right">发货人ID：</td>
				<td height="45" colspan="4">${infoGood.userID}</td>
			</tr>
			<tr>
				<td width="128" height="45" align="right">装货地址：</td>
				<td height="45" colspan="4">${infoGood.origin_place}</td>
			</tr>
			<tr>
				<td width="128" height="45" align="right">卸货地址：</td>
				<td height="45" colspan="4">${infoGood.destination}</td>
			</tr>
			<tr>
				<td width="128" height="45" align="right">收货电话：</td>
				<td height="45" colspan="3">${infoGood.phone}</td>
				<td width="186" height="45">&nbsp;</td>
				<td width="141">&nbsp;</td>
			</tr>

			<tr>
				<td width="128" height="45" align="right">货物类型：</td>
				<td height="45" colspan="2">${infoGood.good_type}</td>
				<td width="141">&nbsp;</td>
			</tr>
			<tr>
				<td width="128" height="45" align="right">重量：</td>
				<td>${infoGood.good_weight}</td>
				<td width="116" height="45" align="left"><strong>吨</strong></td>
			</tr>
			<tr>
				<td width="128" height="45" align="right">所需车型：</td>
				<td width="204" height="45">${infoGood.car_type}</td>
			</tr>
			<tr>
				<td height="45" colspan="1" align="right">所需车长：</td>
				<td>${infoGood.car_length}</td>
				<td>&nbsp;米</td>
			</tr>
			<tr>
				<td width="128" height="111" align="right">货物照片：</td>
				<td width="204" height="111" style="padding-left: 20px;"><img
					src="img/pic_0.jpg" /></td>
				<td width="186" height="111">&nbsp;</td>
				<td width="141">&nbsp;</td>
			</tr>
			<tr>
				<td width="128" height="45" align="right">意愿价：</td>
				<td width="204" height="45">${infoGood.price}</td>
				<td height="45" colspan="2"><strong>元</strong></td>
			</tr>
			<tr>
				<td width="128" height="92" align="right">留言：</td>
				<td height="92" colspan="4">${infoGood.message}</td>
				<td width="141">&nbsp;</td>
			</tr>
			<tr>
				<td width="128" height="92" align="right">货源发布时间</td>
				<td height="92" colspan="4">${infoGood.time}</td>
				<td width="141">&nbsp;</td>
			</tr>
			
			<tr>
				<td></td>
				<c:if test="${user.type==1}">
				<td width="141" colspan="4"><a href="OrderController?action=createOrderG"><input type="button" onclick="" value="我要运货"></a></td>
				</c:if>
			</tr>
			<tr>
				<td colspan="5"><hr noshade size=3 align=center width=100%
						color="#3169ee"></td>
			</tr>
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