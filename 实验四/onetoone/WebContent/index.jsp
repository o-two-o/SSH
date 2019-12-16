<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="test.TestBean"%>
<%@ page import="PO.*"%>
<html>
  <head>
    <title>Hibernate5的一对一关联关系映射</title>
  </head>
  <body>
  	<h2>Hibernate5的一对一关联关系映射</h2>
	<hr>
        <jsp:useBean id="test" class="test.TestBean" />
	<%
		test.addCompany();
                out.println("添加一个公司");
		test.addClient();	
                out.println("添加一个客户");
		Integer id = new Integer(1);
		Company company = test.loadCompany(id);
                out.println("加载id为1的公司");
		Login login = company.getLogin();
                out.println("获取公司的登陆账号");
		Client client = test.loadClient(id);
                out.println("获取id为1的客户");
		Address address = client.getAddress();
                out.println("获取该客户地址");
		out.println("<br>company.getCompanyname()="+company.getCompanyname());
		out.println("<br>company.getLinkman()="+company.getLinkman());
		out.println("<br>company.getTelephone()="+company.getTelephone());
		out.println("<br>login.getLoginname()="+login.getLoginname());
		out.println("<br>login.getLoginpwd()="+login.getLoginpwd());
		out.println("<br>");	
		out.println("<br>client.getClientname()="+client.getClientname());
		out.println("<br>client.getPhone()="+client.getPhone());
		out.println("<br>client.getEmail()="+client.getEmail());		
		out.println("<br>address.getProvince()="+address.getProvince());
		out.println("<br>address.getCity()="+address.getCity());
		out.println("<br>address.getStreet()="+address.getStreet());
		out.println("<br>address.getZipcode()="+address.getZipcode());
	%>
  </body>
</html>