package com.ciq.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Empolyee;
@Repository("dao")
public class Employeeimpl implements EmployeeDao {
	
 //  private 	JdbcTemplate jdbcTemplate;


	public void save(Empolyee employe) {
		System.out.println(employe);
		System.out.println("employee dao");
		
//		String insert="inser into Employeecode values(?,?,?)";
//		Object[]emps= {employe.getId(),employe.getName(),employe.getSalary()};
//		
//		 int i = jdbcTemplate.update(insert, emps);
//		 System.out.println(i+"successfully inserted");
//		 return i;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public void update(Empolyee empolyee) {
		// TODO Auto-generated method stub

	}

	public List<Empolyee> getEmpolyees() {
		// TODO Auto-generated method stub
		return null;
	}

}
