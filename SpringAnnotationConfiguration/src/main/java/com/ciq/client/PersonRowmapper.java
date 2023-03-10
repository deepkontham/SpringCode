package com.ciq.client;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ciq.pojo.Person;

public class PersonRowmapper implements RowMapper<Person>{

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Person p=new Person();
		 p.setId(rs.getInt("id"));
		 p.setName(rs.getString("name"));
		 p.setCity(rs.getString("city"));
		 
		return p;
	}

}
