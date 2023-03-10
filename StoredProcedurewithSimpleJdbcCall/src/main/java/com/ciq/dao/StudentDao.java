package com.ciq.dao;

import com.ciq.bean.Student;

public interface StudentDao {
	void Student_select(int id );
	void Student_insert(Student student);
	void  Student_delete(int id);
	void Student_update(Student student);

	
	

}
