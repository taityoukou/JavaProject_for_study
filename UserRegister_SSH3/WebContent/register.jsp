<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<% request.setCharacterEncoding("GB18030"); %>
<% response.setCharacterEncoding("GB18030"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>User Register</title>

</head>
<body>
	<h1 align="center">欢 迎</h1>
	<h3 align="left">用户注册</h3>
	<form action="user.action" method="post" onsubmit="return check(this);">
		姓 名: <input type="text" name="username" /><br> 
		密 码: <input type="password" name="password" /><br> 
		确 认: <input type="password" name="password2" /><br> 
		<input type="submit" value="提交" />
	</form>
	
	<script type="text/javascript">
		//form提交前，验证：
		function check(obj) {
			if (obj.password.value != obj.password2.value) {
				alert("两次输入的密码不一致");
				return false;
			} else {
				return true;//不写此返回值也行，此时就直接提交了
			}
		}
	</script>
	<br><br><br><br>
	<h4>这个例子使用了Struts+Hibernate。实现下列分层设计：</h4>
	<h4>表示层，控制层，Dao层（数据访问层,用Hibernate实现），业务层（UserMangaer等），数据库	</h4>
</body>
</html>