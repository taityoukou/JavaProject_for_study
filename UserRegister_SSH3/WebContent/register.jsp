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
	<h1 align="center">�� ӭ</h1>
	<h3 align="left">�û�ע��</h3>
	<form action="user.action" method="post" onsubmit="return check(this);">
		�� ��: <input type="text" name="username" /><br> 
		�� ��: <input type="password" name="password" /><br> 
		ȷ ��: <input type="password" name="password2" /><br> 
		<input type="submit" value="�ύ" />
	</form>
	
	<script type="text/javascript">
		//form�ύǰ����֤��
		function check(obj) {
			if (obj.password.value != obj.password2.value) {
				alert("������������벻һ��");
				return false;
			} else {
				return true;//��д�˷���ֵҲ�У���ʱ��ֱ���ύ��
			}
		}
	</script>
	<br><br><br><br>
	<h4>�������ʹ����Struts+Hibernate��ʵ�����зֲ���ƣ�</h4>
	<h4>��ʾ�㣬���Ʋ㣬Dao�㣨���ݷ��ʲ�,��Hibernateʵ�֣���ҵ��㣨UserMangaer�ȣ������ݿ�	</h4>
</body>
</html>