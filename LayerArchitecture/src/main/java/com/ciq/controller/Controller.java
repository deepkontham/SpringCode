package com.ciq.controller;

import com.ciq.pojo.Student;
import com.ciq.service.StudentServiceimpl;

public class Controller {
	private StudentServiceimpl serviceimpl;
	
	public void setServiceimpl(StudentServiceimpl serviceimpl) {
		this.serviceimpl = serviceimpl;
	}
	

	
	public void save(Student student) {
		System.out.println("Employee controller");
		serviceimpl.save(student);
	}


	

	
}
