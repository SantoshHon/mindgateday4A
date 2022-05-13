package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		int resultCount = 0;
		String sqlQuery = "";
		Connection connection;
		Statement statement;
		ResultSet resultSet;
		PreparedStatement preparedStatement;
//		System.out.println("Insert Example");
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, pass);
//			statement=connection.createStatement();
//			sqlQuery="INSERT INTO employee_details(name,salary)values('sagar yamgar',3000)";
//			resultCount=statement.executeUpdate(sqlQuery);
//			connection.close();
//			if(resultCount>0)
//			{
//				System.out.println("Record insert sucessfully");
//			}
//			else
//			{
//				System.out.println("Failed ");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, pass);
//			statement=connection.createStatement();
//			sqlQuery="UPDATE employee_details SET name='santosh hon', salary=30000 WHERE employee_id=12";
//		resultCount	=statement.executeUpdate(sqlQuery);
//		connection.close();
//		if(resultCount>0)
//		{
//			System.out.println("Update sucesssful");
//		}
//		else
//		{
//			System.out.println("update Failed");
//		}
//			
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Insert Example   ");
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, pass);
//			statement = connection.createStatement();
//			sqlQuery = "DELETE employee_details WHERE employee_id=8";
//			resultCount = statement.executeUpdate(sqlQuery);
//			connection.close();
//			if (resultCount > 0) {
//				System.out.println("Delete sucesssful");
//			} else {
//				System.out.println("delete Failed");
//			}
//
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

//		System.out.println("GET all ");
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, pass);
//			statement = connection.createStatement();
//			sqlQuery = "SELECT * FROM employee_details";
//			resultSet = statement.executeQuery(sqlQuery);
//			
//			while (resultSet.next()) {
//				System.out.print(resultSet.getInt("employee_id")+" | ");
//				System.out.print(resultSet.getString("name")+" | ");
//				System.out.println(resultSet.getInt("salary")+" | ");
//				
//				System.out.println("-".repeat(50));
//			}
//			connection.close();
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}
//		
//System.out.println("insert ");

//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, pass);
//			sqlQuery="INSERT INTO employee_details(name,salary)values(?,?)";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "rahul");
//			preparedStatement.setDouble(2, 45566);
//			resultCount=preparedStatement.executeUpdate();
//			connection.close();
//			if(resultCount>0)
//			{
//				System.out.println("Record insert sucessfully");
//			}
//			else
//			{
//				System.out.println("Failed ");
//			}
//		}
//		catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

//		System.out.println("update");
//
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, pass);
//
//			sqlQuery = "UPDATE employee_details SET name=?, salary=? WHERE employee_id=?";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "somya");
//			preparedStatement.setDouble(2, 20000);
//			preparedStatement.setInt(3, 13);
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount > 0) {
//				System.out.println("Update sucesssful");
//			} else {
//				System.out.println("update Failed");
//			}
//
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

//		System.out.println("delete");
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, pass);
//
//			sqlQuery = "DELETE employee_details WHERE employee_id=?";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setInt(1, 11);
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount > 0) {
//				System.out.println("Delete sucesssful");
//			} else {
//				System.out.println("delete Failed");
//			}
//
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

		
//		System.out.println("GET all ");
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, pass);
//			sqlQuery = "SELECT * FROM employee_details";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			resultSet = preparedStatement.executeQuery();
//					
//			
//			while (resultSet.next()) {
//				System.out.print(resultSet.getInt("employee_id")+" | ");
//				System.out.print(resultSet.getString("name")+" | ");
//				System.out.println(resultSet.getInt("salary")+" | ");
//				
//				System.out.println("-".repeat(50));
//			}
//			connection.close();
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}
//		
		
	
	}
}
