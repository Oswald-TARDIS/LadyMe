<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>车主认证</h3>
   <form action="UserController?action=Cprove" method="post"name="">
   <input type="hidden" name=id value="${user.ID}">
性别：<input type="text" name="sex" value=""/><br>
照片：<input type="text" name="photo" value=""/><br>
身份证照片：<input type="text" name="IDphoto" value=""/><br>
身份证号码：<input type="text" name="IDnumber" value=""/><br>
联系电话：<input type="text" name="phone" value=""/><br>
地址：<input type="text" name="origin_place" value=""/><br>
车型：<input type="text" name="car_type" value=""/><br>
车牌：<input type="text" name="plate_num" value=""/><br>
载重：<input type="text" name="load_weight" value=""/><br>
车长：<input type="text" name="car_length" value=""/><br>
驾驶证：<input type="text" name="DriverLicense" value=""/><br>
行车证：<input type="text" name="DrivingLicense" value=""/><br>
   <input type="submit" value="认证"/>
   <input type="reset" value="重置"/>
   
   </form>
</body>
</html>