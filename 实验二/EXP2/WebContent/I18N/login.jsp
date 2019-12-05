<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <!-- 使用text标签输出国际化消息 -->
        <title><s:text name="loginTitle"/></title>
    </head>

    <body>
        <s:form action="checkLogin" method="post">
            <!--表单元素的key值与资源文件的key对应-->
            <s:textfield name="userName" size="20" key="loginName"/>
            <s:password name="userPassWord" size="20" key="loginPassword"/>
            <s:submit key="loginSubmit"/>
            
	</s:form>
    </body>
</html>

