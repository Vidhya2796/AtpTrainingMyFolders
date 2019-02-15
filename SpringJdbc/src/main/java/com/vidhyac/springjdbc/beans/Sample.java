package com.vidhyac.springjdbc.beans;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class Sample {
	//private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	/*public void setDataSource(DataSource dataSource) 
	   {
	      this.dataSource = dataSource;
	      this.jdbcTemplate = new JdbcTemplate(dataSource);
	   }*/


	/*public DataSource getDataSource() {
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
	}*/
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createTable(){
		String createStmt="create table empVidhya(empId number(20))";
		jdbcTemplate.execute(createStmt);
	}
	
	
}
