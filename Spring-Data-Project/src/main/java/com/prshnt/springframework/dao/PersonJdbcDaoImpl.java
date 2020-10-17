package com.prshnt.springframework.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prshnt.springframework.model.Persons;

public class PersonJdbcDaoImpl {
	
	Connection conn =null;

	public Persons getPersonById(int id) {
		Persons person =null;
		PreparedStatement ps=null;
		ResultSet rs =null;
		String query = "select * from PERSONS where id=?";
		conn =getConnection();
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				person = new Persons(id,rs.getString("NAME"),rs.getInt("AGE"),rs.getString("PHONE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return person;
	}
	
	
	public Connection getConnection() {
		try {
		String driver ="org.apache.derby.jdbc.ClientDriver";
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mydb");
		}catch(Exception e) {
			System.out.println(e);
		}
		return conn;
		
	}
}
