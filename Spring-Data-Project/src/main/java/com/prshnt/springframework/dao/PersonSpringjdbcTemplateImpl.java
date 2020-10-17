package com.prshnt.springframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.prshnt.springframework.model.Persons;

@Component
public class PersonSpringjdbcTemplateImpl {
	@Autowired
	DataSource dataSource;
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public Persons getPersonById(int id) {
		String sql = "SELECT * FROM PERSONS where id =?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, new Mapper());	
	}
	
	/*
	 * public int countPersons() { String sql = "SELECT COUNT(*) FROM PERSONS";
	 * jdbcTemplate.setDataSource(dataSource); return
	 * jdbcTemplate.queryForObject(sql, new Mapper()); }
	 */
	
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
private static final class Mapper implements RowMapper<Persons>{
 
	public Persons mapRow(ResultSet rs, int rowNum) throws SQLException {
		Persons person =new Persons(rs.getInt("ID"),rs.getString("NAME"),rs.getInt("AGE"),rs.getString("PHONE"));
		return person;
	}
	
}
	
	

}
