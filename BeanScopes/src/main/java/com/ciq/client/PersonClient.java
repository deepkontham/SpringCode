package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.singleton.Person;

public class PersonClient {
	
	public static void main(String[] args) {
		
		ApplicationContext co=new ClassPathXmlApplicationContext("spring.xml");
		  Person p=(Person) co.getBean("person");
		  p.setId(123);
		  p.setName("pradeep");
		  p.persondetails();
		  
		 Person p1=(Person) co.getBean("person");
		 p1.persondetails();
	}

}
