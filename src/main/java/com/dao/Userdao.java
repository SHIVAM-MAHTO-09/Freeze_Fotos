package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.User;

public class Userdao {
	private SessionFactory sessionFactory;

	public Userdao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean saveuser(User user) {
		boolean f = false;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int i = (Integer) session.save(user);
		if(i>1) {
			f=true;
		}
		
		tx.commit();
		session.close();
		return f;

	}
	
	
	public User login(String email, String password) {
		
		User loginuser=null;
		Session session = sessionFactory.openSession();
		Query q=session.createQuery("from User where email=:em and password=:ps");
		q.setParameter("em" , email);
		q.setParameter("ps", password);
		loginuser=(User) q.uniqueResult();
		return loginuser;
		
	}

	
	 
}
