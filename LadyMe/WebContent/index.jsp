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
<c:if test="${user!=null}">
<div id=div_head>
	<a href=index.jsp class=guide_ahref><div id=div_guide_now>首页</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>公司新闻</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>行业新闻</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>供求信息</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide>联系我们</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_right>
		<img src="img/userIco/default.png" style="width:40px;height: 40px;float:left;margin-left:5px;margin-top:3px;"/>${user.name }
	</div></a>
	<a href=index.jsp class=guide_ahref><div id=div_guide_right>会员中心</div></a>
</div>
</c:if>
<c:if test="${user==null}">
<div id=div_usign>
	<center><div id=showBut onclick="showUsign()"><img src="img/down.png" style="width:20px;height:20px;position:absolute;z-index:1" /></div></center>
	<center><div style="font-size: 30px;color:#3169ee;">赶快加入二蛋货运网!</div></center>
	<center><table>
	<tr><td><div id=div_register>注册</div></td><td><div id=div_login>登录</div></td></tr>
	</table></center>
	<center><div id=hideBut onclick="offUsign()"><img src="img/up.png" style="width:20px;height:20px;position:absolute;z-index:1" /></div></center>
</div>
</c:if>
<div id=cover>
	<div id="wrapper">
        <div class="slider-wrapper theme-default">
            <div id="slider" class="nivoSlider">
                <img src="img/bank001.jpg" id=img_band alt=""  />
                <img src="img/bank002.jpg" id=img_band alt="" title="This is an example of a caption" />
                <img src="img/bank003.jpg" id=img_band alt="" data-transition="slideInLeft"/>
                <img src="img/bank004.jpg" id=img_band alt=""  />
            </div>
        </div>
    </div>
    <div id=div_news>
    <div id=div_news_left>
    	<font class=font_title style="color: #3169ee;text-align:left;">公司新闻</font>
    	<font style="color: #3169ee;float:right; font-size: 15px;position: relative;top:15px;">更多</font>
    	<hr noshade size=5 align=center width=100%>
    	<c:forEach items="${coNews}" var="coN">
    			<a href="newsController?action=coN&id=${coN.id}"><font id=font_news_title><c:out value="${coN.title}"/></font></a><br>
    	</c:forEach>
    </div>
    <div id=div_news_right>
    	<font class=font_title style="color: #ec9640;text-align:left;">行业新闻</font>
    	<font style="color: #ec9640;float:right; font-size: 15px;position: relative;top:15px;">更多</font>
		<hr noshade size=5 align=center width=100%>
		<c:forEach items="${inNews}" var="inN">
    			<a href="newsController?action=inN&id=${inN.id}"><font id=font_news_title><c:out value="${inN.title}"/></font></a><br>
    	</c:forEach>
    </div>
    </div>
    <div id=div_logis>
    	<div id=>
    		
    	</div>
    	
    	<div id=>
    		
    	</div>
    	
    	<div id=>
    		
    	</div>
    </div>
    <div id=bottom>
    	<p>联系我们</p>
    </div>
</div>
</body>
</html>