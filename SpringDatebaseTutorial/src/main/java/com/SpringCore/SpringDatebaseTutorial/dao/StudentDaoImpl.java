package com.SpringCore.SpringDatebaseTutorial.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringCore.SpringDatebaseTutorial.Entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// insert query

		String query = "insert into employee values (?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	@Override
	public int change(Student student) {
		//updating data
		String query="update employee set PersonName=? , City=? where PersonId=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
