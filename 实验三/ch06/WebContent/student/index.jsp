<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="基于SH学生信息管理-起始页"/></title>
    </head>
    <body bgcolor="#CCCCFF">
        <%response.setCharacterEncoding("UTF-8");%>
        <div align="center">
            <br/><br/><br/><br/><br/>
            <font color="black" size="6">基于Struts2+Hibernate5的学生信息管理系统实例，可对学生信息进行增、删、改、查！</font>
            <br/><br/><br/>
            <s:a href="lookMessageAction.action" method="post"><font color="blue" size="6">点此进入</font></s:a>
        <div>
    </body>
</html>
