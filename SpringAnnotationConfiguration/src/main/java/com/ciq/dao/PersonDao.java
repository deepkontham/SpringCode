package com.ciq.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciq.pojo.Person;

public interface PersonDao {
	int save(Person person);
	int delete(int id);
	int update(Person person);
	List<Person> getPersons();
	ArrayList<Person> allperssons();
	Person getbyid(int id);
	Person getbyname(String name);

	Person getbyids(int id);
	Person getbynames(String name);

	

}