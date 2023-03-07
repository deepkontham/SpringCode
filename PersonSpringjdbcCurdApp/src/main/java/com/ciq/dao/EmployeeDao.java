package com.ciq.dao;

import com.ciq.pojo.Employee;

public interface EmployeeDao {
	int save(Employee employee);
	int delete(int id);
	

}
