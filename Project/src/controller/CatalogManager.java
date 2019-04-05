package controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtil.HibernateUtil;
import model.PhoneNumber;
import model.User;

public class CatalogManager {
	
	
	public static void addUser(String name, PhoneNumber number) {
		Session session = HibernateUtil.getSessionFactor().openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			User user = new User(name, number);
			session.save(user);
			System.out.println(user+"\nsuccessfully added!");
			trans.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			System.out.println("Error by adding a new user");
			if(trans != null)
				trans.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void addUser(User user) {
		Session session = HibernateUtil.getSessionFactor().openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			//User user = new User(name, number);
			session.save(user);
			System.out.println(user+"\nsuccessfully added!");
			trans.commit();
		} catch (HibernateException e) {
			// TODO: handle exception
			System.out.println("Error by adding a new user");
			if(trans != null)
				trans.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
