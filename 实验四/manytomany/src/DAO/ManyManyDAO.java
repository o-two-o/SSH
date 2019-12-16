package DAO;

import addHibFile.HibernateSessionFactory;
import PO.*;
import org.hibernate.*;

public class ManyManyDAO {

	public void addOrders(Orders order) {
		Session session = HibernateSessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			session.save(order);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("addOrders方法异常！");
			ex.printStackTrace();			
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	public Orders loadOrders(Integer id) {
		Session session = HibernateSessionFactory.currentSession();
		Transaction ts = null;
		Orders order = null;
		try{
			ts = session.beginTransaction();
			order = (Orders)session.get(Orders.class,id);
			Hibernate.initialize(order.getItems());
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("loadOrders方法异常！");
			ex.printStackTrace();			
		}finally{
			HibernateSessionFactory.closeSession();
		}
		return order;
	}

	public void addItems(Items item) {
		Session session = HibernateSessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			session.save(item);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("addItems方法异常！");
			ex.printStackTrace();			
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	public Items loadItems(Integer id) {
		Session session = HibernateSessionFactory.currentSession();
		Transaction ts = null;
		Items item = null;
		try{
			ts = session.beginTransaction();
			item = (Items)session.get(Items.class,id);
			Hibernate.initialize(item.getOrders());
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("loadItems方法异常！");
			ex.printStackTrace();			
		}finally{
			HibernateSessionFactory.closeSession();
		}
		return item;
	}

}
