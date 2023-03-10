package com.ciq.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.StudentController;
import com.ciq.pojo.Student;

public class Studentclient {
	public static void main(String[] args) {
		Student st = new Student(2, "ranjith", 23454.00);
		Student st1 = new Student(3, "jithu", 43212.00);
		Student st2 = new Student(4, "deep", 26543.00);
		Student st3 = new Student(5, "vamsh", 22.00);
		 Student[]s= {st,st1,st2,st3};
		//	Student s1 = new Student(4, "pradeep", 226545.00);

		

		ApplicationContext co = new ClassPathXmlApplicationContext("namedteplate.xml");
		StudentController controller = co.getBean("Dao", StudentController.class);
//		 for (Student student : s) {
//			System.out.println(controller.save(student));
//		}
		//controller.save(st4);
		
         //Update
//		controller.update(s1);
		//delete
		//controller.delete(5);
		//retrive
		List<Student> students = controller.getStudents();
		for (Student student : students) {
			System.out.println(student);
		}

	}

}
