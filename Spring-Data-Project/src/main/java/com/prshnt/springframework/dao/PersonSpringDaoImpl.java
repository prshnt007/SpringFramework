package com.prshnt.springframework.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prshnt.springframework.model.Persons;

@Component
public class PersonSpringDaoImpl {
	@Autowired
	DataSource datasource;
	
	public Persons findPersonById(int id) {
		Persons person=null;
		try {
		Connection conn = datasource.getConnection();
		String query = "Select * from PERSONS where id =?";
		PreparedStatement ps =conn.prepareStatement(query);
		ps.setInt(1, id);;
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			person = new Persons(id,rs.getString("NAME"),rs.getInt("AGE"),rs.getString("PHONE"));
		}
		ps.close();
		rs.close();
		}catch(Exception e) {
			throw new RuntimeException();
		}
		return person;
		
	}

}
