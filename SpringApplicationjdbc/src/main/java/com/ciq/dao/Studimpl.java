package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;

import com.ciq.pojo.Student;

public class Studimpl implements StudentDao {

	private static BasicDataSource basicDataSource;

	public void setBasicDataSource(BasicDataSource basicDataSource) {
		this.basicDataSource = basicDataSource;
	}

	public int save(Student student) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = basicDataSource.getConnection();
			ps = con.prepareStatement("insert into studentcurd values(?,?,?)");
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getSalary());
			int result = ps.executeUpdate();

			System.out.println("Student saved"+result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.close();
				ps.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return 0;

	}

	public void delete(int id) {
		Connection con=null;
		PreparedStatement ps=null;
		 try {
			con=basicDataSource.getConnection();
			ps=con.prepareStatement("delete from  studentcurd where id=?");
			ps.setInt(1, id);
			
			int i = ps.executeUpdate();
			System.out.println("student deleted"+i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		
		
		
	}

	public void upadate(Student student) {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=basicDataSource.getConnection();
			ps=con.prepareStatement("update studentcurd set Name=?,salary=? where id=?");
			ps.setString(1,student.getName());
			ps.setDouble(2, student.getSalary());
			ps.setInt(3, student.getId());
			int i = ps.executeUpdate();
			System.out.println("Student updated"+i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public List<Student> getAllstudents() {
		List<Student>list=new ArrayList<Student>();
		
		Connection con=null;
		PreparedStatement ps=null;
		 try {
			con=basicDataSource.getConnection();
			ps=con.prepareStatement("select * from studentcurd");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student s=new Student();
			  s.setId(rs.getInt(1));
			  s.setName(rs.getString(2));
			  s.setSalary(rs.getDouble(3));
			 list.add(s);
			 System.out.println("Data retrived");
			  
			  
			  
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return list;
	}

//	public static void main(String[] args) throws SQLException {
//		System.out.println(basicDataSource.getConnection());
//	}

}
