package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Person;

@Repository
public class Persondaoimp implements PersonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(Person person) {
		String insert="insert into persons values(?,?,?)";
		Object[]per= {person.getId(),person.getName(),person.getCity()};
		int i = jdbcTemplate.update(insert, per);
		
		System.out.println(i+"inserted successfully");
		
		return i;
	}

	public int delete(int id) {
		String delete="delete from persons where id=?";
		Object []es= {id};
		int i=jdbcTemplate.update(delete, es);
		System.out.println(i);
		return i;
	}
	public int update(Person person) {
		 String update="update persons set name=?,city=? where id=? "	;
		    Object []ep= {person.getName(),person.getCity(),person.getId(),};
		    int result=jdbcTemplate.update(update, ep);
		    System.out.println(result);
			return result;
	}

	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}
