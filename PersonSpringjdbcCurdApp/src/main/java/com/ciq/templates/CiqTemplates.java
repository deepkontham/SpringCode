package com.ciq.templates;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

import com.mchange.v2.c3p0.DriverManagerDataSource;

public class CiqTemplates {
	 
private BasicDataSource managersource;


	public void setManagersource(BasicDataSource managersource) {
	this.managersource = managersource;
}


	public int Update(String query,Object [] params) {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=managersource.getConnection();
			ps=con.prepareStatement(query);
			int i=1;
			for (Object object : params) {
				ps.setObject(i, object);
				i++;
				
				
			}
			return ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(ps!=null&& con!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return 0;
		
		
	}

}
