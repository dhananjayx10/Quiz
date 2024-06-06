package com.team.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnector {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/Qzdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "toor";

    public static void saveResult(int score, String grade) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            String sql = "INSERT INTO results (score, grade) VALUES (?, ?)"; // Don't include id, it's auto-increment
            statement = connection.prepareStatement(sql);
            statement.setInt(1, score);
            statement.setString(2, String.valueOf(grade));

            statement.executeUpdate();
            System.out.println("Result saved successfully!");
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
