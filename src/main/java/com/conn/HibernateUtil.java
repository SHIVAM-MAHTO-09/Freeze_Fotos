package com.conn;

import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;
import javax.servlet.http.Cookie;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.entity.Booking;
import com.entity.User;
 

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();

			Properties properties = new Properties();

			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/freezefotos");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "161855209");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.SHOW_SQL, true);	

			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Booking.class);
			configuration.addAnnotatedClass(User.class);
			 
  
			org.hibernate.service.ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		}
		return sessionFactory;
	}
}
