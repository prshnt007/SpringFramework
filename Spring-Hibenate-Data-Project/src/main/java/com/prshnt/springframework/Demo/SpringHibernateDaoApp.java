package com.prshnt.springframework.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prshnt.springframework.dao.PersonSpringHibernateImpl;
import com.prshnt.springframework.model.Persons;

public class SpringHibernateDaoApp {
	
	
public static void main(String[] args) {
	
	ApplicationContext appctxt = new ClassPathXmlApplicationContext("springApplication.xml");
	PersonSpringHibernateImpl personSpringHibernateImpl = appctxt.getBean("personSpringHibernateImpl" ,PersonSpringHibernateImpl.class);
		Persons person =personSpringHibernateImpl.getPersonById(2);
		System.out.println(person);
	}
	
	


}
