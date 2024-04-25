package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293", "root", "root");
		int id; String name, desig, dept;
		int sal;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please fill Employee Details");
		System.out.println("Enter The Id");
		id= sc.nextInt();
		System.out.println("Enter The name");
		name= sc.next();
		System.out.println("Enter The Department");
		desig= sc.next();
		System.out.println("Enter The Designation");
		dept= sc.next();
		System.out.println("Enter The Salary");
		sal= sc.nextInt();
		
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, desig);
		pstmt.setString(4, dept);
		pstmt.setInt(5, sal);
		
		int i=pstmt.executeUpdate();
		con.close();
		System.out.println(i + "dekha add hua na");
	}

}