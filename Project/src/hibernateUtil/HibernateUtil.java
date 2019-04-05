package hibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = buildSessionFactor();

	private static SessionFactory buildSessionFactor() {
		// TODO Auto-generated method stub
		try {
			if(sessionFactory == null) {
				sessionFactory = new Configuration()
						.configure()
						.buildSessionFactory();
				System.out.println("Session Factory successfully builded!");
			}
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			System.out.println("Error while creating a new Session Factory");
			e.printStackTrace();
		}
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactor() {return sessionFactory;}
}
