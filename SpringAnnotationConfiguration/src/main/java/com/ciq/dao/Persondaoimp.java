package com.ciq.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.client.PersonResultsetExtracter;
import com.ciq.client.PersonRowmapper;
import com.ciq.pojo.Person;

@Repository
public class Persondaoimp implements PersonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(Person person) {
		String insert = "insert into persons values(?,?,?)";
		Object[] per = { person.getId(), person.getName(), person.getCity() };
		int i = jdbcTemplate.update(insert, per);

		System.out.println(i + "inserted successfully");

		return i;
	}

	public int delete(int id) {
		String delete = "delete from persons where id=?";
		Object[] es = { id };
		int i = jdbcTemplate.update(delete, es);
		System.out.println(i);
		return i;
	}

	public int update(Person person) {
		String update = "update persons set name=?,city=? where id=? ";
		Object[] ep = { person.getName(), person.getCity(), person.getId(), };
		int result = jdbcTemplate.update(update, ep);
		System.out.println(result);
		return result;
	}

	

	public ArrayList<Person> allperssons() {
		return (ArrayList<Person>) jdbcTemplate.query("SELECT * FROM persons",new RowMapper<Person>() {

					public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
						Person p = new Person();
						p.setId(rs.getInt(1));
						p.setName(rs.getString(2));
						p.setCity(rs.getString(3));
						return p;

					}
				});

	}

	public Person getbyid(int id) {
		Person person = jdbcTemplate.queryForObject("select * from persons where id=?", new Object[] { id },
				new PersonRowmapper());
		return person;

	}

	public Person getbyname(String name) {
		Person person = jdbcTemplate.queryForObject("select *from persons where name=?", new Object[] { name },
				new PersonRowmapper());
		return person;
	}

	public List<Person> getPersons() {
		return (List<Person>) jdbcTemplate.query("SELECT * FROM persons", new ResultSetExtractor<List<Person>>() {

			public List<Person> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Person> pe=new ArrayList<Person>();
				while (rs.next()) {
					Person p = new Person();

					p.setId(rs.getInt(1));
					p.setName(rs.getString(2));
					p.setCity(rs.getString(3));
					pe.add(p);

				}
				return pe;
			}
		});

	}

	public Person getbyids(int id) {
		Person person = jdbcTemplate.query("Select *from persons where id=?", new Object[] {id}, new PersonResultsetExtracter());
		return person;
	}

	public Person getbynames(String name) {
		Person person = jdbcTemplate.query("Select *from persons where name=?", new Object[] {name}, new PersonResultsetExtracter());
		return person;
	}
	
	
}
