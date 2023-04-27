package com.main.registration.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
	
	public static int save(String email, String username, String password, String mobileNo, String totalQual,
            String gender, String totalTech, String country, String totalAddrs, String review) {
        int rowCount = 0;
        try(Connection connection = TestConn.createConnection();) {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO login VALUES(?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, mobileNo);
            preparedStatement.setString(5, totalQual);
            preparedStatement.setString(6, gender);
            preparedStatement.setString(7, totalTech);
            preparedStatement.setString(8, country);
            preparedStatement.setString(9, totalAddrs);
            preparedStatement.setString(10, review);
            rowCount = preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }

}
