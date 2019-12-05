<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <!-- 使用text标签输出国际化消息 -->
        <title><s:text name="successPage"/></title>
    </head>

    <body>
        <hr>
       <s:text name="loginName"/>:<s:property value="userName"/><br>
       <s:text name="loginPassword"/>:<s:property value="userPassWord"/>
    </body>
</html>

