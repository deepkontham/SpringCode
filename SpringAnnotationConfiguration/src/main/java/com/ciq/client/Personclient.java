package com.ciq.client;

import java.util.ArrayList;

import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.PersonController;
import com.ciq.pojo.Person;

public class Personclient {
	public static void main(String[] args) {
		
 List<Person> p=new ArrayList<Person>();
 
	 p.add(new Person(1, "swamy","hyd"));
	 p.add(new Person(2, "ranjith","hyd"));
	 p.add(new Person(3, "deep","hyd"));
	 p.add(new Person(5, "vamshi","hyd"));
	 Person p1=new Person(3,"pradeep","rdm");
	 

	ApplicationContext con=new ClassPathXmlApplicationContext("annotation.xml");
	 PersonController persController =(PersonController) con.getBean("persons");
//	 for (Person person : p) {
//		 persController.save(person);
//		 
//		 
//	}
	 //persController.delete(4);
	// persController.update(p1);
	 //RetriveAll persons with RoWMapper
//	 ArrayList<Person> allPersons = persController.allPersons();
//	 for (Person person : allPersons) {
//		 System.out.println(person);
//		
//	}
//	 Person getbyid = persController.getbyid(3);
//	 System.out.println(getbyid);
	 
//	 Person getbyname = persController.getbyname("vamshi");
//	 System.out.println(getbyname );
	 
	 //Resultset extractor
//	 List<Person> persons = persController.getPersons();
//	 for (Person person : persons) {
//		 System.out.println(person);
//		
//	}
	 //resultset getby id
//	 Person getbyids = persController.getbyids(3);
//	 System.out.println(getbyids);
//	 
	 //resultset getby name
	 Person getbynames = persController.getbynames("vamshi");
	 System.out.println(getbynames);
	 
	}
	 
	
	 
	}
	

