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
	<img src="img/userIco/default.png" style="width:36px;height: 36px;float:left;margin-left:4px;margin-top:1px;"/>${user.name}
	</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_now style="float:right;">会员中心</div></a>
</div>
<div id=whole>
<div id=left>
 <a href=""><div id=tou>我的物流</div></a>
<a href="sendgoods.jsp"><div id=tou_li  >我要发货</div></a>
<a href="#"><div id=tou_li >待确认订单</div></a>
<a href="#"><div id=tou_li >进行中订单</div></a>
<a href="#"><div id=tou_li >历史订单</div></a>
<a href="#"><div id=tou >个人设置</div></a>
<a href="#"><div id=tou_li_now >会员认证</div></a>
<a href="personal_password.jsp"><div id=tou_li >密码修改</div></a>
<a href="#"><div id=tou_li >我的消息</div></a>
<a href="#"><div id=tou_li >我的收藏</div></a>
<a href="#"><div id=tou_li >积分兑换</div></a>
<a href="#"><div id=tou_li >我的消息</div></a>   
</div>
<div id=div_x></div>
<!-- right -->
<div id=right>
<div id=user_rbt><font style="padding-right:10px;">会员认证</font></div>
<div id=right_rp>
 <table width="873" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="167" rowspan="4" align="center"><img src="user_img/pic1.jpg" style="border:1px solid #e1e1e1; padding:5px; height:126px; width:126px;" /></td>
    <td width="338" height="35" style="font-size:20px; font-weight:bold;">您的基础信息：</td>
    <td width="368" height="35">&nbsp;</td>
    </tr>
  <tr>
    <td height="35">手机号码：15676898776</td>
    <td width="368" height="35">交易笔数：16次</td>
    </tr>
  <tr>
    <td height="35">用户等级：<img src="img/xin.png" style="vertical-align:middle;" /></td>
    <td height="35">好评率：98%</td>
    </tr>
  <tr>
    <td height="35">信用积分：56分</td>
    <td height="35">&nbsp;</td>
    </tr>
  <tr>
    <td align="center"><a href="" style="background:#999; color:#fff; padding:5px 10px;">编辑头像</a></td>
    <td height="35">&nbsp;</td>
    <td height="35">&nbsp;</td>
  </tr>
     </table>
<div class="user_td">
<span class="us_td_1">个人认证：</span>
<span class="us_td_2"><img src="user_img/pic3.jpg" />认证成功可获得更多信用积分！</span>
</div>
     
  <table width="866" border="0" cellspacing="0" cellpadding="0" class="user_ta">
  <tr>
    <td width="128"  height="45" align="right"><span>*</span>姓名：</td>
    <td width="204"  height="45" align="left"><input type="text" name="textfield" id="textfield" class="u4" /></td>
    <td width="207" height="45" align="left">&nbsp;</td>
    <td width="186"  height="45" align="left">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right">身份证号：</td>
    <td height="45" colspan="3"><input type="text" name="textfield" id="textfield" class="u2" /></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="111" align="right">身份证照：</td>
    <td width="204" height="111" style="padding-left:20px;"><img src="img/pic_0.jpg" /></td>
    <td height="111"><strong>点击上传图片</strong></td>
    <td width="186" height="111">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="41" align="right">&nbsp;</td>
    <td height="41" colspan="3"><span>&nbsp;&nbsp;&nbsp;&nbsp;<font style="color:red;">温馨提示：认证成功后，信息不可随意更改，如需更改，请联系客服。</font></span></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45">&nbsp;</td>
    <td height="45" colspan="2"><input type="button" value="立刻认证" class="btn_1" /></td>
    <td width="186" height="45">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45">&nbsp;</td>
    <td width="204" height="45">&nbsp;</td>
    <td height="45">&nbsp;</td>
    <td width="186" height="45">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  </table>   </div>
</div>

</body>
</html>