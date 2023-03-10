package com.ciq.service;

import java.util.ArrayList;
import java.util.List;

import com.ciq.pojo.Student;

public interface StudentService {
	int save(Student student);
	int delete(int id);
	int update(Student student);
	List<Student> getStudents();
	ArrayList<Student> allStudents();

}
