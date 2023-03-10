package com.ciq.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.Studentdaoimpl;
import com.ciq.pojo.Student;
@Service
public class Studentserviceimpl implements StudentService {
	@Autowired
	private Studentdaoimpl studentdaoimpl;

	public int save(Student student) {
		return studentdaoimpl.save(student);
	}

	public int delete(int id) {
		return studentdaoimpl.delete(id);
	}

	public int update(Student student) {
		return studentdaoimpl.update(student);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentdaoimpl.getStudents();
	}

	public ArrayList<Student> allStudents() {
		return null;
	}

}
