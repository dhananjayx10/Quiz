package com.team.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class ConnectionTest {
	Connection connection = null;

	public Connection getConnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
public void UserInput(int id, String firstname, String lastname, String mobileno, String email, String username,
			String password) {
		PreparedStatement prs = null;

		Connection con = null;
ConnectionTest connectionTest = new ConnectionTest();
		con = connectionTest.getConnectionDetails();
		try {
			prs = con.prepareStatement(
					"insert into user.studentinfo(id,name,lastname,email,mobileno,username,password)values(?,?,?,?,?,?,?)");
			prs.setLong(1, id);
			prs.setString(2, firstname);
			prs.setString(3, lastname);
			prs.setString(4, email);
			prs.setString(5, mobileno);
			prs.setString(6, username);
			prs.setString(7, password);
			int i = prs.executeUpdate();
			System.out.println("Record is inserted successfully!" + i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}