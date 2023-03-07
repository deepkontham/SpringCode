package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.Employeconfig;
import com.ciq.dao.Employeeimpl;
import com.ciq.pojo.Empolyee;

public class EmployeeClient {
	public static void main(String[] args) {
		Empolyee em=new Empolyee(1, "pradeep", 34567.99);
		ApplicationContext con=new AnnotationConfigApplicationContext(Employeconfig.class);
		Employeeimpl imp = (Employeeimpl) con.getBean("dao");
		imp.save(em);
		
		
	}

}
