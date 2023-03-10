package com.ciq.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.ciq.bean.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void Student_select(int id) {
		SimpleJdbcCall simple = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Student_select");
		MapSqlParameterSource named = new MapSqlParameterSource();
		named.addValue("S_id", id);
		Map<String, Object> result = simple.execute(named);
		System.out.println(result);

	}

	public void Student_insert(Student student) {
		SimpleJdbcCall simple = new SimpleJdbcCall(jdbcTemplate).withProcedureName("Student_insert");
		MapSqlParameterSource nam = new MapSqlParameterSource();

		nam.addValue("S_id", student.getId());
		nam.addValue("S_name", student.getName());
		nam.addValue("S_salary", student.getSalary());
		Map<String, Object> ne = simple.execute(nam);
		System.out.println("save student");

	}

	public void Student_delete(int id) {
		SimpleJdbcCall delete=new SimpleJdbcCall(jdbcTemplate).withProcedureName("Student_delete");
		MapSqlParameterSource nam=new MapSqlParameterSource();
		nam.addValue("S_id", id);
		Map<String, Object> de=delete.execute(nam);
		System.out.println("deleted student");

	}

	public void Student_update(Student student) {
		SimpleJdbcCall update=new SimpleJdbcCall(jdbcTemplate).withProcedureName("Student_update");
		MapSqlParameterSource nam=new MapSqlParameterSource();
		nam.addValue("S_id", student.getId());
		nam.addValue("S_name", student.getName());
		nam.addValue("S_salary", student.getSalary());
		Map<String, Object> ne = update.execute(nam);
		System.out.println("updated student");
		
	}
	

}
