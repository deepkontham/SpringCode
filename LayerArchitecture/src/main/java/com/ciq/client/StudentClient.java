package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.Controller;
import com.ciq.pojo.Address;
import com.ciq.pojo.Student;

public class StudentClient {

	public static void main(String[] args) {
		
	Address address =new Address("rdm", "telangana", 5504.00);
    Student s=new Student(1, "pradeep", address);
    
    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    Controller s1=(Controller) context.getBean("controller");
    //System.out.println(s1);
    s1.save(s);
	}

} 
 