package com.prshnt.springframework.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prshnt.springframework.dao.PersonSpringDaoImpl;
import com.prshnt.springframework.model.Persons;

public class SptingJdbcDaoApp {
	
	
public static void main(String[] args) {
	
	ApplicationContext appctxt = new ClassPathXmlApplicationContext("springApplication.xml");
	PersonSpringDaoImpl personSpringDaoImpl = appctxt.getBean("personSpringDaoImpl" ,PersonSpringDaoImpl.class);
		Persons person =personSpringDaoImpl.findPersonById(2);
		System.out.println(person);
	}
	
	


}
