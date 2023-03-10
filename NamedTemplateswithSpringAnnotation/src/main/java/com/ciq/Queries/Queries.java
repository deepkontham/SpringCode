package com.ciq.Queries;

public interface Queries {
	public static String INSERT_QUERY = "INSERT INTO Students VALUES(:id,:name,:fees)";
	public static String UPDATE_QUERY = "UPDATE Students SET name=:name, salary=:fees  WHERE id=:id";
	public static String DELETE_QUERY = "DELETE  FROM Students   WHERE id=id";
	public static String Retrive_All = "select * FROM Students(:id,:name,:fees)";


}
