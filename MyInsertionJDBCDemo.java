package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyInsertionJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
	// step1. reigister the driver
		
		Class.forName("com.mysql.jdbc.Driver");
	
		// step2. establish connection to mysql
		
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293","root","root");
      
      // step3. creating statement
      
      Statement stmt = con.createStatement();
      
      stmt.executeUpdate("insert into emp values(3,'Neha','Developer ','IT ',50000)");
      System.out.println("Employee add hua");
      con.close();
	}

}
