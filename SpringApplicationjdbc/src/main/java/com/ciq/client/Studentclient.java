package com.ciq.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.Studimpl;
import com.ciq.pojo.Student;

public class Studentclient {
	public static void main(String[] args) {
		
   List<Student> l=new ArrayList<Student>();
   Student s=new Student(2,"swamy",43323.00);
	//l.add(new Student(1, "pradeep",23456.00);
	l.add(new Student(2, "ranjith",213336.00));
	l.add(new Student(3, "jithu",28756.00));
	l.add(new Student(4, "vamshi",234326.00));
	//l.add(s);
	
	
	

	   
	ApplicationContext co=new ClassPathXmlApplicationContext("spring.xml");
	Studimpl impl=(Studimpl)co.getBean("Dao");
//	for (Student student : l) {
//		impl.save(student);
	
		
	//}
 //  System.out.println(impl);
	//Deleted 
	//impl.delete(5);
	
	//Update
	//impl.upadate(s);
	
	//retrive
	System.out.println(impl.getAllstudents());
	
	
	


} 
}
