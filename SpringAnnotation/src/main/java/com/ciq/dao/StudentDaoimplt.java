package com.ciq.dao;

import org.springframework.stereotype.Repository;

import com.ciq.pojo.Student;

@Repository
public class StudentDaoimplt implements StudentDao{

	public void save(Student student) {
    System.out.println("Student Dao controller  ");		
	}



}
