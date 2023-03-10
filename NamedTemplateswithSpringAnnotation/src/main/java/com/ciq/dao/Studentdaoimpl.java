package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.ciq.Queries.Queries;
import com.ciq.pojo.Student;

@Repository
public class Studentdaoimpl implements StudentDao {
	@Autowired
	private NamedParameterJdbcTemplate namedParameter;

	public void setNamedParameter(NamedParameterJdbcTemplate namedParameter) {
		this.namedParameter = namedParameter;
	}

	public int save(Student student) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", student.getId());
		map.put("name", student.getName());
		map.put("fees", student.getFees());
		System.out.println("Student inserted");
		return namedParameter.update(Queries.INSERT_QUERY, map);

	}

	public int delete(int id) {
		SqlParameterSource param=new BeanPropertySqlParameterSource(id);
		
		return namedParameter.update(Queries.DELETE_QUERY, param);
		
	}

	public int update(Student student) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(student);
		return namedParameter.update(Queries.UPDATE_QUERY, paramSource);

	}

	public List<Student> getStudents() {
//		  List<Student> st = namedParameter.query(Queries.Retrive_All, new ResultSetExtractor<Student>(Student.class) {
//
//			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
//				
//				return null;
//			}
//		});
		  
		  
		return null;
	}

	public ArrayList<Student> allStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
