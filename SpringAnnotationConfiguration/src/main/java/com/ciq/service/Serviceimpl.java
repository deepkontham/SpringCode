package com.ciq.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.stereotype.Service;

import com.ciq.dao.Persondaoimp;
import com.ciq.pojo.Person;

@Service 
public class Serviceimpl implements PersonService{
	
	@Autowired
	private Persondaoimp persondaoimp;
	 
	
	
	public void setPersondaoimp(Persondaoimp persondaoimp) {
		this.persondaoimp = persondaoimp;
	}

	public int save(Person person) {
		return persondaoimp.save(person);
	}

	public int delete(int id) {
		return persondaoimp.delete(id);
		// TODO Auto-generated method stub

	}

	public int update(Person person) {
		return persondaoimp.update(person);
		// TODO Auto-generated method stub

	}

	public ArrayList<Person> allperssons() {
		
		return persondaoimp.allperssons();
	}

	public Person getbyid(int id) {
		return persondaoimp.getbyid(id);
	}

	public Person getbyname(String name) {
		return persondaoimp.getbyname(name);
	}

	public Person getbyids(int id) {
		return persondaoimp.getbyids(id);
	}

	public Person getbynames(String name) {
		return persondaoimp.getbynames(name);
	} 

	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return (ArrayList<Person>) persondaoimp.getPersons();
	}
	


}
