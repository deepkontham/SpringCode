package com.ciq.client;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ciq.pojo.Person;

public class PersonResultsetExtracter implements ResultSetExtractor<Person> {

	public Person extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		Person p=new Person();
		while(rs.next()) {
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setCity(rs.getString("city"));
			
		}
		return p;
	}
	

}
