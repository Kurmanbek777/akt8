package com.journaldev.jsf.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {

	public static Connection getConnection() {
		try {
			Class.forName("org.postgres.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/123", "postgres", "root");
			return con;
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Database.getConnection() Error -->"
					+ ex.getMessage());
			return null;
		}
	}

	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException ex) {
		}
	}
}