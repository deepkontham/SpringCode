package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.prototype.Student;

public class Studentclient {
	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("spring.xml");
		Student s1=(Student) co.getBean("prototype");
		s1.setId(222);
		s1.setName("deep");
		s1.studentdetails();
		Student s2=(Student) co.getBean("prototype");
		s2.studentdetails();
				
		
	}

}
