package test;

import java.util.*;
import PO.*;
import DAO.*;

public class TestBean {
	ManyManyDAO dao = new ManyManyDAO();
	
	public void addItem(String itemno,String itemname){
		Items item = new Items();
		item.setItemno(itemno);
		item.setItemname(itemname);
		dao.addItems(item);
	}
	
	public void addOrder(String orderno,Double money,Set items){
		Orders order = new Orders();
		order.setOrderno(orderno);
		order.setMoney(money);
		order.setItems(items);
		dao.addOrders(order);
	}
	
	 
	public Items loadItems(Integer id){
		return dao.loadItems(id);
	}	
	
	public Orders loadOrders(Integer id){
		return dao.loadOrders(id);
	}	
}
