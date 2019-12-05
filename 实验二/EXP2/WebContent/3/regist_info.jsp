<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	用户名:
	<s:property value="username" />
	<br> 密码：
	<s:property value="password" />
	<br> 年龄:
	<s:property value="age" />
	<br> 性别:
	<s:property value="sex" />
	<br>
</body>
</html>