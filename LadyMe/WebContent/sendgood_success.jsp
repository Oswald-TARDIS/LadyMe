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
<div id=whole>
<div id=left>
 <a href=""><div id=tou>我的物流</div></a>
 <c:if test="${user.type==0}">
   <a href="sendgoods.jsp"><div id=tou_li  >我要发货</div></a>
   <a href="SendController?action=queryall"><div id=tou_li_now  >已发布货源</div></a>
</c:if>
<c:if test="${user.type==1}">
   <a href="sendvehicle.jsp"><div id=tou_li  >我要发车</div></a>
   <a href="SendController?action=queryallV"><div id=tou_li_now  >已发布车源</div></a>
</c:if>
<a href="OrderController?action=selectUncofirm"><div id=tou_li>待确认订单</div></a>
<a href="OrderController?action=selectRunning"><div id=tou_li>进行中订单</div></a>
<a href="OrderController?action=selectDone"><div id=tou_li  >历史订单</div></a>
<a href="#"><div id=tou >个人设置</div></a>
<a href="personal.jsp"><div id=tou_li>会员认证</div></a>
<a href="#"><div id=tou_li_now >密码修改</div></a>
<a href="#"><div id=tou_li >我的消息</div></a>
<a href="#"><div id=tou_li >我的收藏</div></a>
<a href="#"><div id=tou_li >积分兑换</div></a>
 
</div>
<div id=div_x></div>
<!-- right -->
<div id=right>
    <div id="user_rbt"><font style="padding-right: 10px;">密码修改</font></div>
     <div id=right_r>
        <P class="us_t1"><img src="img/tu1.png" />&nbsp;<font style="font-size: 30px;">发布货源成功！</font></P>
    </div>
  </div>
</div>

</body>
</html>