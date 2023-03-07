package com.ciq.service;

import java.util.List;

import com.ciq.pojo.Person;

public interface PersonService {
	int save(Person person);
	int delete(int id);
	int update(Person person);
	List<Person> getPersons();
	

}
