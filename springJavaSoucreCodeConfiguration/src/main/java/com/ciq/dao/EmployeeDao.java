package com.ciq.dao;

import java.util.List;

import com.ciq.pojo.Empolyee;

public interface EmployeeDao {
	void save(Empolyee employe);
	 void delete(int id);
	 void update(Empolyee empolyee);
	 List<Empolyee> getEmpolyees();
	
	
	

}
