package com.capgemini.connectionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	//private static final DataBaseConnection db = new DataBaseConnection();
	private static Connection conn;
	public static Connection getConnection()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
		} 
		catch (ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		
		return conn;	
	}
		
	

}
