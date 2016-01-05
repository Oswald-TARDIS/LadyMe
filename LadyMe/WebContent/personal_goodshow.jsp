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
	<a href=index.jsp class=guide_ahref><div id=div_guide_now style="float:right;">会员中心</div></a>
</div>
<div id=whole>
<div id=left>
 <a href=""><div id=tou>我的物流</div></a>
<a href="sendgoods.jsp"><div id=tou_li>我要发货</div></a>
<a href="personal_goodshow.jsp"><div id=tou_li_now  >已发布货源</div></a>
<a href="#"><div id=tou_li >待确认订单</div></a>
<a href="#"><div id=tou_li >进行中订单</div></a>
<a href="#"><div id=tou_li >历史订单</div></a>
<a href="#"><div id=tou >个人设置</div></a>
<a href="personal.jsp"><div id=tou_li>会员认证</div></a>
<a href="personal_password.jsp"><div id=tou_li >密码修改</div></a>
<a href="#"><div id=tou_li >我的消息</div></a>
<a href="#"><div id=tou_li >我的收藏</div></a>
<a href="#"><div id=tou_li >积分兑换</div></a>
<a href="#"><div id=tou_li >我的消息</div></a>   
</div>
<div id=div_x></div>
<form action="SendController?action=queryall" method="post">
<!-- right -->
<div id=right>
  <div id="user_rbt"><font style="padding-right: 10px;">我的发货</font></div>
  <c:forEach items="${queryall}" var="qy">
  <div id=right_rp>
  <table width="866" border="0" cellspacing="0" cellpadding="0" class="user_ta">
  <tr>
    <td width="128" height="45" align="right"><span>*</span>装货地址：</td>
    <td height="45" colspan="4" >${qy.origin_place}</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right"><span>*</span>卸货地址：</td>
   <td height="45" colspan="4">${qy.destination}</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right"><span>*</span>收货电话：</td>
    <td height="45" colspan="3">${qy.phone}</td>
    <td width="186" height="45">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right">&nbsp;</td>
    <td width="204" height="45">&nbsp;</td>
    <td height="45" colspan="2">&nbsp;</td>
    <td width="186" height="45">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right"><span>*</span>货物类型：</td>
    <td height="45" colspan="2">${qy.good_type}</td>
    <td height="45" align="right"><a href=""><img src="user_img/user1.jpg" alt="" /></a></td>
    <td width="186" height="45"><a href=""></a></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right"><span>*</span>重量：</td>
    <td >${qy.good_weight}</td>
    <td width="116" height="45" align="left"><strong>吨</strong></td>
  </tr>
  <tr>
    <td width="128" height="45" align="right">所需车型：</td>
    <td width="204" height="45">${qy.car_type}</td>
    </tr>
  <tr>
    <td height="45" colspan="2" align="right">所需车长(单位米)：</td>
    <td width="186" height="45">${qy.car_length}</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="111" align="right">货物照片：</td>
    <td width="204" height="111" style="padding-left:20px;"><img src="img/pic_0.jpg" /></td>
    <td height="111" colspan="2"><strong>点击上传图片</strong></td>
    <td width="186" height="111">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right">意愿价：</td>
    <td width="204" height="45">${qy.price}</td>
    <td height="45" colspan="2"><strong>元</strong></td>
  </tr>
  <tr>
    <td width="128" height="92" align="right">留言：</td>
    <td height="92" colspan="4">{$qy.message}</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="92" align="right">时间</td>
    <td height="92" colspan="4">{$qy.time}</td>
    <td width="141">&nbsp;</td>
  </tr>

  <tr>
    <td width="128" height="45">&nbsp;</td>
    <td width="204" height="45">&nbsp;</td>
    <td height="45" colspan="2">&nbsp;</td>
    <td width="186" height="45">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  </table>
  </div>
  </c:forEach>
  </div>
  </form>
  
</div>
</body>
</html>