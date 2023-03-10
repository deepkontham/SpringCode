package com.ciq.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.pojo.Person;
import com.ciq.service.Serviceimpl;

@Controller("persons")
public class PersonController {
	@Autowired
	private Serviceimpl serviceimpl;
	
	
	


	public int save(Person person) {
		
		return serviceimpl.save(person);
		
	}
public int delete(int id) {
		
		return serviceimpl.delete(id);
		
	}
public int update(Person person) {
	
	return serviceimpl.update(person);
	
}
public ArrayList<Person> allPersons(){
	return serviceimpl.allperssons();
	
}
public Person getbyid(int id) {
	return serviceimpl.getbyid(id);
}
public Person getbyname(String name) {
	return serviceimpl.getbyname(name);
}
public List<Person> getPersons() {
	// TODO Auto-generated method stub
	return serviceimpl.getPersons();
	
	
}
public Person getbyids(int id) {
	return serviceimpl.getbyids(id);
}

public Person getbynames(String name) {
	return serviceimpl.getbynames(name);
} 

}
