package com.anudip.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class CRUDMainOperations implements CRUDOperation  {

	@Override
	public void create() {
		
		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293", "root", "root");
	            Statement stmt = con.createStatement();
	            stmt.execute("CREATE TABLE employee (id INT, name VARCHAR(20), desg VARCHAR(20), dept VARCHAR(20), sal INT)");
	            System.out.println("Table created successfully...");
	            con.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }

		
	}
	
	@Override
	public void insert() {
	
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293", "root", "root");
	            Statement stmt = con.createStatement();
	           
	            Scanner ss= new Scanner(System.in);
	            System.out.println("Enter id");
	            int id=ss.nextInt();
	            System.out.println("Enter name");
	            String name=ss.next();
	            System.out.println("Enter desgination");
	            String desg=ss.next();
	            System.out.println("Enter department");
	            String dept=ss.next();
	            System.out.println("Enter salary");
	            int sal=ss.nextInt();
	            
	            stmt.executeUpdate("INSERT INTO employee(id, name, desg, dept, sal) VALUES (" + id + ", '" + name + "', '" + desg + "', '" + dept + "', " + sal + ")");
	            
	            System.out.println("Data inserted successfully..");
	            con.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
		
	}
	@Override
	public void upadte() {
		
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293", "root", "root");
	            Statement stmt = con.createStatement();
	           
	            Scanner sc= new Scanner(System.in);
	            System.out.println("Enter the id whose details you want to update");
	            int requiredId = sc.nextInt();
	            
		        System.out.println("1: update name and department");
		        System.out.println("3: update designation and salary ");
		        
		        sc.nextLine(); 
		        
		        System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
		        
		        switch (choice) 
                {
                    case 1:

                        System.out.print("Enter new name : ");
                        String newName = sc.next();
                        System.out.print("Enter new department");
                        String newDepartment = sc.next();

                        String updateQuery1 = "UPDATE employee SET name = '" + newName + "', dept = '" + newDepartment + "' WHERE id = " + requiredId;
                        stmt.executeUpdate(updateQuery1);
                        System.out.println("Record updated successfully.");
                        
                        break;
                        
                    case 2:
                    	System.out.print("Enter new Designation : ");
                        String newDesignation = sc.nextLine();
                        System.out.print("Enter new Salary ");
                        String newSalary = sc.nextLine();

                        String updateQuery2 = "UPDATE employee SET desg = '" + newDesignation + "', sal = " + newSalary + " WHERE id = " + requiredId;
                        stmt.executeUpdate(updateQuery2);
                        System.out.println("Record updated successfully.");
                    	break;
               

                    default:
                        System.out.println("Invalid choice for update. Please try again.");
                 
                        
                }
		        con.close();
	            
	            
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
		
		
	}


	@Override
	public void delete() 
	{
	

		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293", "root", "root");
	            Statement stmt = con.createStatement();
	           
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter the id of the employee you want to delete: ");
	            int idToDelete = sc.nextInt();

	            String deleteQuery = "DELETE FROM employee WHERE id = " + idToDelete;
	            int rowsAffected = stmt.executeUpdate(deleteQuery);

	            if (rowsAffected > 0) {
	                System.out.println("Record deleted successfully.");
	            } else {
	                System.out.println("Failed.");
	            }

	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }

	}

	@Override
	public void read() {
		
		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293", "root", "root");
	            Statement stmt = con.createStatement();
	           
	            ResultSet rs=stmt.executeQuery("select * from employee");
	            System.out.println("Employee details");
	            
	            while(rs.next())
	   		 {
	   			int id=rs.getInt("id");
	   			String name=rs.getString("name");
	   			String desg=rs.getString("desg");
	   			String dept=rs.getString("dept");
	   			int sal=rs.getInt("sal");
	   			 
	   			 System.out.println(id+" "+name+" "+desg+" "+dept+" "+sal);
	   		 }

	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }

		
	}

}

public class CRUDMain {

	public static void main(String[] args) 
	{
		CRUDMainOperations cp = new CRUDMainOperations();
		
		Scanner sc= new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("MENU");
	        System.out.println("1: create");
	        System.out.println("2: insert ");
	        System.out.println("3: update ");
	        System.out.println("4: Delete ");
	        System.out.println("5: Read");
	        System.out.println("6: Exit program");
	        System.out.print("Enter your choice : ");
		    
	        int op = sc.nextInt();
		 
		switch(op){    
	    //case statements within the switch block  
	    case 1: cp.create() ;  
	    break;    
	    case 2: cp.insert();  
	    break;    
	    case 3: cp.upadte();
	    break;    
	    case 4: cp.delete(); 
	    break;    
	    case 5: cp.read();  
	    break;     
	}

}
	}
}
