<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>用户注册页面</title>
    </head>
    <body>
        <center>
            请输入注册信息...
            <hr>
            <s:form action="register1.action" method="post">
                <table border="1">
                    <tr>
                        <td>
                            <s:textfield name="userName" label="姓名" size="16"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <s:password name="userPassword" label="密码" size="18"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <s:textfield name="userAge" label="年龄" size="16"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <s:textfield name="userTelephone" label="电话" size="16"/> 
                        </td>
                    </tr>
                    <tr>
                        <td><s:submit value="提交"/></td>
                    </tr>
                </table>
            </s:form>
        </center>
    </body>
</html>
