<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>文件上传成功</title>
    </head>
    <body>
        <h3>文件上传成功</h3>
        <hr/>
        文件标题:<s:property value="+ title"/><br/>
        <s:property value="uploadFileName"/><br>
	<!--save是在程序目录下创建的文件夹，用来保存上传的文件。上传后文件将被保存在Tomcat/webapps/ch03/save目录下；在开发工具中使用时需在ch/web/建一个文件夹sava，参考图3-26。-->
        <img src="<s:property value="'../save/'+uploadFileName"/>"><br/>
    </body>
</html>
