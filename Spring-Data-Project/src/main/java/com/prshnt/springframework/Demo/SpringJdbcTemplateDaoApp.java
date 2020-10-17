package com.prshnt.springframework.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prshnt.springframework.dao.PersonSpringjdbcTemplateImpl;
import com.prshnt.springframework.model.Persons;

public class SpringJdbcTemplateDaoApp {
	
	public static void main(String[] args) {
		
		ApplicationContext apctxt = new ClassPathXmlApplicationContext("springApplication.xml");
		PersonSpringjdbcTemplateImpl personSpringjdbcTemplateImpl = apctxt.getBean("personSpringjdbcTemplateImpl", PersonSpringjdbcTemplateImpl.class);
		//System.out.println(personSpringjdbcTemplateImpl.countPersons());
		Persons person =personSpringjdbcTemplateImpl.getPersonById(2);
		System.out.println(person);
		
	}

}
