<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="test.TestBean"%>
<%@ page import="PO.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.NumberFormat"%>
<jsp:useBean id="test" class="test.TestBean" />
<html>
  <head>
    <title>Hibernate5��һ�Զ�˫�������ϵӳ��</title>
  </head>
  
  <body>
  	<h2>Hibernate5��һ�Զ�˫�������ϵӳ��</h2>
	<hr>
	<%
		test.addCustomer();
		Integer id = new Integer(1);
		Customer customer = test.loadCustomer(id);
		test.addOrders(customer);
		test.addOrders(customer);
		test.addOrders(customer);

		//����ָ���Ŀͻ����õ��ÿͻ������ж���	
		NumberFormat  nf = NumberFormat.getCurrencyInstance();			
		out.println("<br>�ͻ�"+customer.getCname()+"�����ж���:");					
		Iterator it = customer.getOrders().iterator();
		Orders order = null;
		while (it.hasNext()){
			order = (Orders)it.next();
			out.println("<br>�����ţ�"+order.getOrderno());
			out.println("<br>������"+nf.format(order.getMoney()));			
		}
		
		//����ָ���Ķ������õ��������Ŀͻ�
		order = test.loadOrders(new Integer(1));
		customer = order.getCustomer();
		out.println("<br>");		
		out.println("<br>������Ϊ"+order.getOrderno().trim()+"�������ͻ�Ϊ��"+customer.getCname());
	%>
  </body>
</html>