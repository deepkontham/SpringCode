package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Student;
import com.ciq.dao.StudentDaoImpl;

public class StudentClient {
	public static void main(String[] args) {
		Student s=new Student(9, "prashanth", 34565.00);
		ApplicationContext co=new ClassPathXmlApplicationContext("spring.xml");
		StudentDaoImpl impl = (StudentDaoImpl) co.getBean("Dao");
	//	impl.Student_select(3);
		//impl.Student_insert(s);
	//	impl.Student_delete(4);
		impl.Student_update(s);
		
	}

}
