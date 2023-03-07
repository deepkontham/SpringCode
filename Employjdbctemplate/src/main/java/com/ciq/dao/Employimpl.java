package com.ciq.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


import com.ciq.pojo.Employee;

public class Employimpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int save(Employee employee) {
		String insert="insert into employee values(?,?,?)";
		
		Object[] employ= {employee.getId(),employee.getName(),employee.getSalary()};
		int results=jdbcTemplate.update(insert, employ);
		System.out.println(results);
		return results;
		
		

	}



	public int update(Employee employee) {
    String update="update employee set name=?,salary=? where id=? "	;
    Object []ep= {employee.getName(),employee.getSalary(),employee.getId(),};
    int result=jdbcTemplate.update(update, ep);
    System.out.println(result);
	return result;
    
	}



	public void delete(int id) {
		String delete="delete from employee where id=?";
		Object []es= {id};
		int i=jdbcTemplate.update(delete, es);
		System.out.println(i);
		
	}



	public List<Employee> getallemp() {
		String insert="select *from employee(?,?,?)";
		
		

		return null;
	}

}
