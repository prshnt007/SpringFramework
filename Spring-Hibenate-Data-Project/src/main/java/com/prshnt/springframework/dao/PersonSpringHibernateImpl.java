package com.prshnt.springframework.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prshnt.springframework.model.Persons;

@Component
public class PersonSpringHibernateImpl {
	@Autowired
	SessionFactory sessionFactory;
	
	
	public Persons getPersonById(int id) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Persons person = session.get(Persons.class, id);
		session.getTransaction().commit();
		session.close();
		return person;
	}
	
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
