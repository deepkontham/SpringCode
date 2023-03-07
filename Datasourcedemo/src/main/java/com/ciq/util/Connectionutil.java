package com.ciq.util;

import java.beans.PropertyVetoException;
import java.sql.SQLException;


import com.zaxxer.hikari.HikariDataSource;

public class Connectionutil {

	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/spring_db";
	private static String user="root";
	private static String pwd="deep123";
	 
	
	
	public static void main(String[] args) throws PropertyVetoException, SQLException {
//	   BasicDataSource basic=new BasicDataSource();
//	   basic.setDriverClassName(driver);
//	   basic.setUrl(url);
//	   basic.setUsername(user);
//	   basic.setPassword(pwd);
//	   System.out.println(basic);
	   
//	   ComboPooledDataSource combo=new ComboPooledDataSource();
//	   combo.setDriverClass(driver);
//	   combo.setJdbcUrl(url);
//	   combo.setUser(user);
//	   combo.setPassword(pwd);
//	   System.out.println(combo);
//	   
	   HikariDataSource hi=new HikariDataSource();
	   hi.setDriverClassName(driver);
	   hi.setJdbcUrl(url);
	   hi.setUsername(user);
	   hi.setPassword(pwd);
	   hi.getConnection();
	   System.out.println(hi);
	  
	}

	

}
