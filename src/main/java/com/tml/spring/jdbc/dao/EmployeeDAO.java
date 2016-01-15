package com.tml.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;


public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insert(Employee employee){
		 
		String sql = "INSERT INTO EMPLOYEE " +
			"(ID, NAME, LOCATION) VALUES (?, ?, ?)";
 
		jdbcTemplate.update(sql, new Object[] { employee.getId(),
				employee.getName(), employee.getLocation() 
		});
	}
	
	
}
