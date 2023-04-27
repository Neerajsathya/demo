package com.main.registration.servlets;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConn {
	public static Connection createConnection() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","mani","mani");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
