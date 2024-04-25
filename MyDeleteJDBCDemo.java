package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDeleteJDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293","root","root");

		 Statement stmt = con.createStatement();
		 
		 stmt.executeUpdate("Delete FROM emp WHERE empid=3" );
		 System.out.println("Deleted");
	      con.close();

	}

}
