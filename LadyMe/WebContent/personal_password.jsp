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
	<a href=index.jsp class=guide_ahref><div id=div_guide>供求信息</div></a>
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
   <a href="SendController?action=queryall"><div id=tou_li>已发布货源</div></a>
</c:if>
<c:if test="${user.type==1}">
   <a href="sendvehicle.jsp"><div id=tou_li  >我要发车</div></a>
   <a href="SendController?action=queryallV"><div id=tou_li >已发布车源</div></a>
</c:if>
<a href="#"><div id=tou_li >待确认订单</div></a>
<a href="#"><div id=tou_li >进行中订单</div></a>
<a href="#"><div id=tou_li >历史订单</div></a>
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
    <P style="height:50px; line-height:50px; font-size:20px; padding-left:10%;">为了您的账户安全，请牢记您的账号密码！</P>
  <table class="user_ta">
  <tr>
    <td width="128"  height="45" align="right"><span>*</span>旧密码：</td>
    <td  height="45" align="left"><input type="password" name="passwd" id="textfield" class="u3" /></td>
    <td width="186"  height="45" align="left">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td  height="45" align="right"><span>*</span>新密码：</td>
    <td  height="45" align="left"><input  type="password" name="passwd2" id="textfield" class="u3" /></td>
    <td width="186" height="45">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td  height="45" align="right"><span>*</span>确认新密码：</td>
    <td  height="45" align="left"><input  type="password" name="textfield" id="textfield" class="u3" /></td>
    <td height="45">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45">&nbsp;</td>
    <td height="45"><input type="button" value="立刻认证" class="btn_1" /></td>
    <td width="186" height="45">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  </table>   
     
     
     
    </div>
  </div>
</div>

</body>
</html>