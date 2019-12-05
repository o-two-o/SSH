<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<style type="text/css">
a {
	text-decoration: none;
}
</style>
<title>用户登录</title>
</head>
<body>
	<s:form action="loginAction" method="post" name="loginForm">
		<s:textfield name="username" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:submit value="登录"></s:submit>
		<s:a href="/EXP2/3/regist.jsp">注册</s:a>
	</s:form>
</body>
</html>