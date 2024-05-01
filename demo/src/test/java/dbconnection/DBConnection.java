package dbconnection;

import java.sql.*;

public class DBConnection {
	static Connection conn=null;
	public static Connection getConnection() {
     try
     {
    	 
    	 Class.forName("oracle.jdbc.driver.OracleDriver");
    	System.out.println("driver regsitered");
    	  conn= DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-TPMPBNR3:1521:XE", "HR", "hr");
    	 System.out.println("Connection created");
    	
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
     }
	return conn;
	
		
	}
	
	public static void main(String args[])
	{
		DBConnection.getConnection();
	}
   


}
