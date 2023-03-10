package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.pojo.Student;
import com.ciq.service.Studentserviceimpl;
@Controller("Dao")
public class StudentController {
	@Autowired
	private Studentserviceimpl studentserimpl;
	
	public int save(Student student) {
		return studentserimpl.save(student);
		
	}
	public int delete(int id) {
		return studentserimpl.delete(id);
	}

	public int update(Student student) {
		return studentserimpl.update(student);
	}
	public List<Student> getStudents() {
		return studentserimpl.getStudents();
	}


}
