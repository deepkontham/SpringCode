package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.model.GreetingMsg;
import com.ciq.model.Student;

public class Client {

	//bean factory and Application context
	public static void main(String[] args) {
		
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	GreetingMsg m=(GreetingMsg) context.getBean("message");
	m.msg();
	Student em=(Student) context.getBean("employee");
	System.out.println(em);
	
	
	
}
}