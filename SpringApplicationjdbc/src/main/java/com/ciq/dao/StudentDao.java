package com.ciq.dao;


import java.util.List;

import com.ciq.pojo.Student;

public interface StudentDao {
	 
	
	int save(Student student);
	void delete(int id);
	void upadate(Student student);
	List<Student> getAllstudents();
	
	

}
