package com.prshnt.springframework.Demo;

import com.prshnt.springframework.dao.PersonJdbcDaoImpl;
import com.prshnt.springframework.model.Persons;

public class JdbcDaoApp {
	
	public static void main(String[] args) {
		
		Persons person = new PersonJdbcDaoImpl().getPersonById(1);
		System.out.println(person);
	}

}
