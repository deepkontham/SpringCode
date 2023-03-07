package com.ciq.service;

import com.ciq.dao.StudentDaoimplt;
import com.ciq.pojo.Student;

public class StudentServiceimpl implements StudentService{
	
	private StudentDaoimplt Daoimpl;

	

	public void setDaoimpl(StudentDaoimplt daoimpl) {
		Daoimpl = daoimpl;
	}



	public void save(Student student) {
    System.out.println("Student service implementation");
    Daoimpl.save(student);
	}



	public void delete(Student student) {
		
		
	}
	

	

}
