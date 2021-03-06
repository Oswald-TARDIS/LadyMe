<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style2.css">
<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/imgStyle.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/personal.css" type="text/css" />
<link rel="stylesheet" href="themes/default/default.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/light/light.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/dark/dark.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/bar/bar.css" type="text/css" media="screen" />
 
<title>LadyMe</title>
</head>
<body id=body_main>

<div id=div_head>
	<a href=index.jsp class=guide_ahref><div id=div_guide>首页</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>公司新闻</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>行业新闻</div></a>
	<a href=SendController?action=getGoodPage&page=1 class=guide_ahref><div id=div_guide>货源信息</div></a>
	<a href=SendController?action=getVehiclePage&page=1 class=guide_ahref><div id=div_guide>车源信息</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>联系我们</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_right>
	<img src="img/userIco/default.png" style="width:36px;height: 36px;float:left;margin-left:4px;margin-top:2px;"/>${user.name}
	</div></a>
	<a href=UserController?action=logout class=guide_ahref><div id=div_guide_right>注销</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_now style="float:right;">会员中心</div></a>
</div>
<c:if test="${empty selectRunningQueryed}">
<c:redirect url="OrderController?action=selectRunning"/>
</c:if>
<c:set var="selectRunningQueryed" scope="session" /> 
<div id=whole>
<div id=left>
 <a href=""><div id=tou>我的物流</div></a>
 <c:if test="${user.type==0}">
   <a href="sendgoods.jsp"><div id=tou_li  >我要发货</div></a>
   <a href="SendController?action=queryall"><div id=tou_li>已发布货源</div></a>
</c:if>
<c:if test="${user.type==1}">
   <a href="sendvehicle.jsp"><div id=tou_li  >我要发车</div></a>
   <a href="SendController?action=queryallV"><div id=tou_li >已发布车源</div></a>
</c:if>
<a href="OrderController?action=selectUncofirm"><div id=tou_li>待确认订单</div></a>
<a href="OrderController?action=selectRunning"><div id=tou_li_now>进行中订单</div></a>
<a href="OrderController?action=selectDone"><div id=tou_li  >历史订单</div></a>
<a href="#"><div id=tou >个人设置</div></a>
<a href="personal.jsp"><div id=tou_li>会员认证</div></a>
<a href="#"><div id=tou_li>密码修改</div></a>
<a href="#"><div id=tou_li >我的消息</div></a>
<a href="#"><div id=tou_li >我的收藏</div></a>
<a href="#"><div id=tou_li >积分兑换</div></a>  
</div>
<div id=div_x></div>
<!-- right -->
<div id=right>
    <div id="user_rbt"><font style="padding-right: 10px;">进行中订单</font></div>
     <div>
    		<c:if test="${user.type==0}">
    		<table style="width:100%">
    		<tr>
    			<td style="width:25%;text-align: center;">订单号</td>
    			<td style="width:25%;text-align: center;">运货车主ID</td>
    			<td style="width:15%;text-align: center;">运货车主电话</td>
    			<td style="width:15%;text-align: center;">起始地</td>
    			<td style="width:10%;text-align: center;">卸货地</td>		
    			<td style="width:10%;text-align: center;">订单时间</td>
    		</tr>
    		<c:forEach items="${selectRunning}" var="iV">
    		<tr>
   				<td style="text-align: center;">${iV.id}</td>
    			<td style="text-align: center;">${iV.cid}</td>
    			<td style="text-align: center;">${iV.cphone}</td>
    			<td style="text-align: center;">${iV.origin_place}</td>
    			<td style="text-align: center;">${iV.destination}</td>
    			<td style="text-align: center;">${iV.time}</td>		
    			<td style="text-align: center;">正在运送</td>
   			</tr>
    		</c:forEach>
    		<c:forEach items="${selectArrive}" var="iV">
    		<tr>
   				<td style="text-align: center;">${iV.id}</td>
    			<td style="text-align: center;">${iV.cid}</td>
    			<td style="text-align: center;">${iV.cphone}</td>
    			<td style="text-align: center;">${iV.origin_place}</td>
    			<td style="text-align: center;">${iV.destination}</td>
    			<td style="text-align: center;">${iV.time}</td>
    			<td style="text-align: center;">
    			<a href="OrderController?action=changeFlag&flag=3&id=${iV.id}">
    			<input type="button" value="确认到货"></a></td>
   			</tr>
    		</c:forEach>
    		</table>
    	</c:if>
    	<c:if test="${user.type==1}">
    		<table style="width:100%">
    		<tr>
    			<td style="width:25%;text-align: center;">订单号</td>
    			<td style="width:25%;text-align: center;">货主ID</td>
    			<td style="width:15%;text-align: center;">货主电话</td>
    			<td style="width:15%;text-align: center;">起始地</td>
    			<td style="width:10%;text-align: center;">卸货地</td>		
    			<td style="width:10%;text-align: center;">订单时间</td>
    		</tr>
    		<c:forEach items="${selectRunning}" var="iV">
    		<tr>
   				<td style="text-align: center;">${iV.id}</td>
    			<td style="text-align: center;">${iV.hid}</td>
    			<td style="text-align: center;">${iV.hphone}</td>
    			<td style="text-align: center;">${iV.origin_place}</td>
    			<td style="text-align: center;">${iV.destination}</td>
    			<td style="text-align: center;">${iV.time}</td>		
    			<td style="text-align: center;">正在运送</td>
    			<td style="text-align: center;">
				<a href="OrderController?action=changeFlag&flag=2&id=${iV.id}">
				<input type="button" value="我已经运到货了"></a></td>
   			</tr>
    		</c:forEach>
    		<c:forEach items="${selectArrive}" var="iV">
    		<tr>
   				<td style="text-align: center;">${iV.id}</td>
    			<td style="text-align: center;">${iV.hid}</td>
    			<td style="text-align: center;">${iV.hphone}</td>
    			<td style="text-align: center;">${iV.origin_place}</td>
    			<td style="text-align: center;">${iV.destination}</td>
    			<td style="text-align: center;">${iV.time}</td>		
				<td style="text-align: center;">
				<input type="button" value="等待对方确认收货"></td>
   			</tr>
    		</c:forEach>
    		</table>
    	</c:if>
    	</div>
    </div>
  </div>
 
</body>
</html>