package com.servletexamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {
	Connection createDBConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		// Getting the connection
		String mysqlUrl = "jdbc:mysql://localhost:3306/mani";
		Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
		System.out.println("Connection established......");
		return con;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TestDB tdb = new TestDB();
		Connection c = tdb.createDBConnection();
		System.out.println("Connection made: " + c);
	}
}
