package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Booking;
 

public class Bookingdao {

	private SessionFactory sessionFactory;
	
	public Bookingdao(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	
	public boolean savebooking(Booking booking) {
		boolean f = false;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int i = (Integer) session.save(booking);
		if(i>1) {
			f=true;
		}
		
		tx.commit();
		session.close();
		return f;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
