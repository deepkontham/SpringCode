package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.Employimpl;
import com.ciq.pojo.Employee;

public class EmployClient {
	public static void main(String[] args) {
		Employee em=new Employee(2, "jithu", 43223.00);
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		Employimpl impl=(Employimpl) con.getBean("Dao");
		impl.save(em);
	}

}
