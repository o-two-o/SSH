<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="test.TestBean"%>
<%@ page import="PO.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.NumberFormat"%>
<jsp:useBean id="test" class="test.TestBean" />
<html>
  <head>
    <title>Hibernate5的一对多双向关联关系映射</title>
  </head>
  
  <body>
  	<h2>Hibernate5的一对多双向关联关系映射</h2>
	<hr>
	<%
		test.addCustomer();
		Integer id = new Integer(1);
		Customer customer = test.loadCustomer(id);
		test.addOrders(customer);
		test.addOrders(customer);
		test.addOrders(customer);

		//根据指定的客户，得到该客户的所有订单	
		NumberFormat  nf = NumberFormat.getCurrencyInstance();			
		out.println("<br>客户"+customer.getCname()+"的所有订单:");					
		Iterator it = customer.getOrders().iterator();
		Orders order = null;
		while (it.hasNext()){
			order = (Orders)it.next();
			out.println("<br>订单号："+order.getOrderno());
			out.println("<br>订单金额："+nf.format(order.getMoney()));			
		}
		
		//根据指定的订单，得到其所属的客户
		order = test.loadOrders(new Integer(1));
		customer = order.getCustomer();
		out.println("<br>");		
		out.println("<br>订单号为"+order.getOrderno().trim()+"的所属客户为："+customer.getCname());
	%>
  </body>
</html>