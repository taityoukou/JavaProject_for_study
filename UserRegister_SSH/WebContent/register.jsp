<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>User Register</title>
</head>
<body>
	<h1 align="center">欢 迎</h1>
	<h3 align="left">用户注册</h3>
	<form action="registerDeal.jsp" method="post">
		姓       名: <input type="text" name="username" /><br> 
		密       码: <input type="text" name="password" /><br> 
		确       认: <input type="password" name="password2" /><br> 
		<input type="submit" value="提交" />
	</form>
</body>
</html>