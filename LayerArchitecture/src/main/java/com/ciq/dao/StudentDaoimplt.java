package com.ciq.dao;

import com.ciq.pojo.Student;

public class StudentDaoimplt implements StudentDao{

	public void save(Student student) {
    System.out.println("Student Dao controller  " +student);		
	}



}
