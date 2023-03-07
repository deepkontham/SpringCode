package com.ciq.dao;

import com.ciq.pojo.Employee;
import com.ciq.templates.CiqTemplates;

public class Employimpl implements EmployeeDao {
	
	private CiqTemplates ciqTemplates;
	

	public void setCiqTemplates(CiqTemplates ciqTemplates) {
		this.ciqTemplates = ciqTemplates;
	}


	public int save(Employee employee) {
		String insert="insert into employee values(?,?,?)";
		
		Object[] employ= {employee.getId(),employee.getName(),employee.getSalary()};
		int results=ciqTemplates.Update(insert, employ);
		System.out.println(results);
		return results;
		
		

	}


	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
