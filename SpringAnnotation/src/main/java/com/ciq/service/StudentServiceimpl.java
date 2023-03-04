package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.StudentDaoimplt;
import com.ciq.pojo.Student;
@Service
public class StudentServiceimpl implements StudentService{
	
	@Autowired
	private StudentDaoimplt Daoimpl;

	

	public void setDaoimpl(StudentDaoimplt daoimpl) {
		Daoimpl = daoimpl;
	}



	public void save(Student student) {
    System.out.println("Student service implementation");
    Daoimpl.save(student);
	}



	
	

	

}
