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
	<img src="img/userIco/default.png" style="width:40px;height: 40px;float:left;margin-left:5px;margin-top:3px;"/>${user.name}
	</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_now style="float:right;">会员中心</div></a>
</div>
<div id=whole>
<div id=left>
 <a href=""><div id=tou>我的物流</div></a>
<a href="sendgoods.jsp"><div id=tou_li_now >我要发货</div></a>
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
<!-- right -->
<div id=right>
  <div id="user_rbt"><font style="padding-right: 10px;">我要发货</font></div>
  <div id=right_rp>
  <table width="866" border="0" cellspacing="0" cellpadding="0" class="user_ta">
  <tr>
    <td width="128"  height="45" align="right"><span>*</span>始发地：</td>
    <td width="204"  height="45" align="left"><select name="select" id="select" class="u1">
      <option>河南省</option>
    </select></td>
    <td height="45" colspan="2" align="left"><select name="select" id="select" class="u1">
      <option>请选择</option>
    </select></td>
    <td width="186"  height="45" align="left"><select name="select" id="select" class="u1">
      <option>请选择</option>
    </select></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right">装货地址：</td>
    <td height="45" colspan="4"><input type="text" name="textfield" id="textfield" class="u2" /></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right"><span>*</span>目的地：</td>
    <td width="204" height="45"><select name="select2" id="select2" class="u1">
      <option>河南省</option>
    </select></td>
    <td height="45" colspan="2"><select name="select3" id="select3" class="u1">
      <option>请选择</option>
    </select></td>
    <td width="186" height="45"><select name="select4" id="select4" class="u1">
      <option>请选择</option>
    </select></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right">卸货地址：</td>
    <td height="45" colspan="4"><input name="textfield2" type="text" class="u2" id="textfield2" value="请填写" /></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right"><span>*</span>收货电话：</td>
    <td height="45" colspan="3"><input name="textfield3" type="text" class="u3" id="textfield3" value="请填写" /></td>
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
    <td height="45" colspan="2"><input name="textfield4" type="text" class="u3" id="textfield4" value="请填写" /></td>
    <td height="45" align="right"><a href=""><img src="user_img/user1.jpg" alt="" /></a></td>
    <td width="186" height="45"><a href=""></a></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45" align="right"><span>*</span>重量：</td>
    <td width="204" height="45"><input name="textfield5" type="text" class="u4" id="textfield5" value="请填写" /></td>
    <td width="116" height="45" align="left"><strong>吨</strong></td>
    <td width="91" align="right">体积：</td>
    <td width="186" height="45"><input name="textfield6" type="text" class="u4" id="textfield6" value="请填写" /></td>
    <td width="141"><strong>m（请任选一项）</strong></td>
  </tr>
  <tr>
    <td width="128" height="45" align="right">所需车型：</td>
    <td width="204" height="45"><select name="select6" id="select6" class="u1">
      <option>请选择</option>
    </select></td>
    <td height="45" colspan="2" align="right">所需车长：</td>
    <td width="186" height="45"><select name="select5" id="select5" class="u1">
      <option>请选择</option>
    </select></td>
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
    <td width="204" height="45"><input name="textfield7" type="text" class="u4" id="textfield7" value="请填写" /></td>
    <td height="45" colspan="2"><strong>元</strong></td>
    <td width="186" height="45">&nbsp;</td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="92" align="right">留言：</td>
    <td height="92" colspan="4"><textarea name="textarea" id="textarea" cols="45" rows="5"  class="u5"></textarea></td>
    <td width="141">&nbsp;</td>
  </tr>
  <tr>
    <td width="128" height="45">&nbsp;</td>
    <td height="45" colspan="3"><input type="button" value="立刻发布" class="btn_1" /></td>
    <td width="186" height="45">&nbsp;</td>
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
  
  
  </div>
  
</div>
</body>
</html>