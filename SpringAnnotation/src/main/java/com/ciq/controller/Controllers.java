package com.ciq.controller;

import org.springframework.stereotype.Controller;

import com.ciq.pojo.Student;
import com.ciq.service.StudentServiceimpl;

@Controller("studcontroller")
public class Controllers {
	private StudentServiceimpl serviceimpl;
	
	public void setServiceimpl(StudentServiceimpl serviceimpl) {
		this.serviceimpl = serviceimpl;
	}
	

	
	public void save(Student student) {
		System.out.println("Employee controller");
	//	serviceimpl.save(student);
	}


	

	
}
