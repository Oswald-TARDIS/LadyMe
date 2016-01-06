<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/imgStyle.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/default/default.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/light/light.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/dark/dark.css" type="text/css" media="screen" />
<link rel="stylesheet" href="themes/bar/bar.css" type="text/css" media="screen" />
<script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="js/script.js" ></script>
<title>LadyMe</title>
</head>
<body id=body_main>
<c:if test="${empty coNews||empty inNews}">
<c:redirect url="NewsController?action=query"/>
</c:if>
<c:if test="${empty infoSupply||empty infoVehicles}">
<c:redirect url="SendController?action=query"/>
</c:if>
<c:if test="${user!=null}">
<div id=div_head>
	<a href=index.jsp class=guide_ahref><div id=div_guide_now>首页</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>公司新闻</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>行业新闻</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>供求信息</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>联系我们</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_right>
		<img src="img/userIco/default.png" style="width:36px;height: 36px;float:left;margin-left:4px;margin-top:2px;"/>${user.name}
	</div></a>
	<a href=UserController?action=logout class=guide_ahref><div id=div_guide_right>注销</div></a>
	<a href=personal.jsp class=guide_ahref><div id=div_guide_right>会员中心</div></a>
</div>
</c:if>
<c:if test="${user==null}">
<div id=div_head></div>
<div id=div_usign>
	<center><div id=showBut onclick="showUsign()"><img src="img/down.png" style="width:20px;height:20px;position:absolute;z-index:1" /></div></center>
	<center><div style="font-size: 30px;color:#3169ee;">赶快加入二蛋货运网!</div></center>
	<center><table>
	<tr><td><a href="register.jsp"><div id=div_register>注册</div></a></td><td><a href="login.jsp"><div id=div_login>登录</div></a></td></tr>
	</table></center>
	<center><div id=hideBut onclick="offUsign()"><img src="img/up.png" style="width:20px;height:20px;position:absolute;z-index:1" /></div></center>
</div>
</c:if>
<div id=cover>
	<div id="wrapper">
        <div class="slider-wrapper theme-default">
            <div id="slider" class="nivoSlider">
                <img src="img/bank002.jpg" id=img_band alt="" data-transition="fade" />
                <img src="img/bank003.jpg" id=img_band alt="" data-transition="fade" />
                <img src="img/bank004.jpg" id=img_band alt="" data-transition="fade" />
            </div>
        </div>
    </div>
    <div id=div_content>
    <div id=left style="float:left;width:69%;margin-left:1%">
    	<div id=div_info>
    		<div style="width:2%;height:38px;float:left;background:#3169ee"></div>
    		<font class=font_title style="text-align:left;">货源中心</font>
    		<font style="color:#aaa;">Center of Supply</font>
    		<a href="showgoods.jsp" style="color:#444;"><font style="color:#aaa;float:right;position: relative;top:14px;font-size:10px;">More</font>
    		<font style="float:right; font-size:15px;text-align:right;position: relative;top:11px;">更多</font></a>
    		<hr noshade size=1 align=center width=100% color="#3169ee">
    		<table style="width:100%">
    		<tr>
    			<td style="width:25%;text-align: center;">始发地</td>
    			<td style="width:25%;text-align: center;">目的地</td>
    			<td style="width:20%;text-align: center;">货物类型</td>
    			<td style="width:15%;text-align: center;">发布时间</td>
    			<td style="width:15%;text-align: center;">操作</td>
    		</tr>
    		
    		<c:forEach items="${infoSupply}" var="iS">
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
    	<div id=div_info style="position: relative;bottom: 1px;">
    		<div style="width:2%;height:38px;float:left;background:#ec9640"></div>
    		<font class=font_title style="text-align:left;">车源中心</font>
    		<font style="color:#aaa;">Center of Vehicle</font>
    		<a href="showvehicle.jsp" style="color:#444;"><font style="color:#aaa;float:right;position: relative;top:14px;font-size:10px;">More</font>
    		<font style="float:right; font-size:15px;text-align:right;position: relative;top:11px;">更多</font></a>
    		<hr noshade size=1 align=center width=100% color="#ec9640">
    		<table style="width:100%">
    		<tr>
    			<td style="width:25%;text-align: center;">始发地</td>
    			<td style="width:25%;text-align: center;">目的地</td>
    			<td style="width:15%;text-align: center;">车牌号</td>
    			<td style="width:15%;text-align: center;">承重/吨</td>
    			<td style="width:10%;text-align: center;">车长/米</td>		
    			<td style="width:10%;text-align: center;">操作</td>
    		</tr>
    		<c:forEach items="${infoVehicles}" var="iV">
    		<tr>
   				<td style="text-align: center;">${iV.origin_place}</td>
    			<td style="text-align: center;">${iV.destination}</td>
    			<td style="text-align: center;">${iV.plate_num}</td>
    			<td style="text-align: center;">${iV.load_weight}</td>
    			<td style="text-align: center;">${iV.car_length}</td>		
    			<td style="text-align: center;"><a href="SendController?action=getVehicle&id=${iV.id}">查看详情</a></td>
   			</tr>
    		</c:forEach>
    		</table>
    	</div>
    </div>
    
    <div id=right style="float:left;width:29%">
    <div id=div_news>
    	<font class=font_title style="text-align:left;">公司新闻</font>
    	<font style="color:#aaa;">News of Company</font>
    	<font style="color:#aaa;float:right;position: relative;top:14px;font-size:10px;">More</font>
    	<font style="float:right; font-size:15px;text-align:right;position: relative;top:11px;">更多</font>
    	<hr noshade size=1 align=center width=100% color="#3169ee">
    	<c:forEach items="${coNews}" var="coN">
    		<div id=div_news_title>
    			<a href="newsController?action=coN&id=${coN.id}" id=a_news>
    				<font style="text-align:left;float:left;width:70%;height:22px;overflow: hidden;" id=a_news><c:out value="${coN.title}"/></font>
    				<font style="text-align:right;float:right;width:30%;height:22px;overflow: hidden;" id=a_news><c:out value="${coN.time}"/></font>
    			</a>
    		</div>
    	</c:forEach>
    </div>
    <div id=div_news style="position: relative;bottom: 1px;">
    	<font class=font_title style="color:text-align:left;">行业新闻</font>
    	<font style="color:#aaa;">News of Industry</font>
    	<font style="color:#aaa;float:right;position: relative;top:14px;font-size:10px;">More</font>
    	<font style="float:right; font-size:15px;text-align:right;position: relative;top:11px;">更多</font>
		<hr noshade size=1 align=center width=100% color="#ec9640">
		<c:forEach items="${inNews}" var="inN">
			<div id=div_news_title>
    			<a href="newsController?action=coN&id=${inN.id}" id=a_news>
    				<font style="text-align:left;float:left;width:70%;height:22px;overflow:hidden;" id=a_news><c:out value="${inN.title}"/></font>
    				<font style="text-align:right;float:right;width:30%;height:22px;overflow:hidden;" id=a_news>1-11</font>
    			</a>
    		</div>
    	</c:forEach>
    </div>
    </div>
    </div>
    <div id=bottom>
    	<div style="margin:0 auto;width:60%;font-size:14px;text-align: center;">
    	Copyright © 2012-2015 <img src="img/LOGO.png" style="width: 14px;height: 14px;"/> 二蛋货运有限公司. All rights reserved.沪ICP备10005645
    	<a id=contect href="#">联系我们</a>
    	</div>
    </div>
</div>
</body>
</html>