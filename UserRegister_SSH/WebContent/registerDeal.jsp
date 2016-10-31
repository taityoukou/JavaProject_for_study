<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<%@ page import="com.anson.service.*" %>
<%@ page import="com.anson.model.*" %>

<%
User user = new User();
UserManager um = new UserManager();

user.setUsername(request.getParameter("username"));
user.setUsername(request.getParameter("password"));

if (um.isExist(user)) {
	response.sendRedirect("registerFail.jsp");
	return;
}else{
	um.add(user);
	response.sendRedirect("registerSuccess.jsp");
}

%>