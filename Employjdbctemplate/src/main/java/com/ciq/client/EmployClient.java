package com.ciq.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.Employimpl;
import com.ciq.pojo.Employee;

public class EmployClient {
	public static void main(String[] args) {
		List<Employee> em=new ArrayList<Employee>();
		
		 em.add(new Employee(4, "deep", 98765.00));
		em.add(new Employee(5, "ranjith", 34567.00));
		em.add(new Employee(6, "jithu", 45672.00));
        em.add(new Employee(7, "swamy", 72345.00));
        Employee em1=new Employee(3, "chinnu", 345677.00);

		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		Employimpl impl=(Employimpl) con.getBean("Dao");
//		for (Employee employee : em) {
//			impl.save(employee);
//			
//		}
		//impl.delete(2);
		impl.update(em1);
	}

}
