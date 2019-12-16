<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="test.TestBean"%>
<%@ page import="PO.*"%>
<%@ page import="java.util.*"%>

<html>
  <head>
    <title>Hibernate5的多对多双向关联关系映射</title>
  </head>
  
  <body>
  	<h2>Hibernate5的多对多双向关联关系映射</h2>
	<hr>
        <jsp:useBean id="test" class="test.TestBean" />
	<%
		//新增三个商品
		test.addItem("001","A商品");	
		test.addItem("002","B商品");	
		test.addItem("003","C商品");					
		//选购其中的两个商品
		Set items = new HashSet();
		items.add(test.loadItems(new Integer(1)));
		items.add(test.loadItems(new Integer(2)));
		//将选购的商品产生一张订单
		test.addOrder("A00001",new Double(2100.5),items);
				
		//选购其中的两个商品
		Set items1 = new HashSet();
		items1.add(test.loadItems(new Integer(2)));
		items1.add(test.loadItems(new Integer(3)));		
		//将选购的商品产生另一张订单
		test.addOrder("A00002",new Double(3680),items1);
		
		//装载两张订单
		Orders order1 = test.loadOrders(new Integer(1));
		Orders order2 = test.loadOrders(new Integer(2));		
		out.println("<br>订单“"+order1.getOrderno().trim()+"”中的商品清单为:");					
		Iterator it = order1.getItems().iterator();
		Items item = null;
		while (it.hasNext()){
			item = (Items)it.next();
			out.println("<br>商品编号："+item.getItemno().trim());
			out.println("<br>商品名称："+item.getItemname().trim());			
		}
		out.println("<br>订单“"+order2.getOrderno().trim()+"”中的商品清单为:");					
		it = order2.getItems().iterator();
		item = null;
		while (it.hasNext()){
			item = (Items)it.next();
			out.println("<br>商品编号："+item.getItemno().trim());
			out.println("<br>商品名称："+item.getItemname().trim());			
		}
		
		//装载两个商品
		Items item1 = test.loadItems(new Integer(1));
		Items item2 = test.loadItems(new Integer(2));
		out.println("<br>商品“"+item1.getItemname().trim()+"”所在的订单为:");					
		it = item1.getOrders().iterator();
		order1 = null;
		while (it.hasNext()){
			order1 = (Orders)it.next();
			out.println("<br>订单编号："+order1.getOrderno().trim());
		}
		out.println("<br>商品“"+item2.getItemname().trim()+"”所在的订单为:");					
		it = item2.getOrders().iterator();
		order2 = null;
		while (it.hasNext()){
			order2 = (Orders)it.next();
			out.println("<br>订单编号："+order2.getOrderno().trim());
		}								
	%>
  </body>
</html>